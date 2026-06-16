import { createContext, useState, useCallback } from "react";
import axios from 'axios';

// Cria um Context
// Context é uma forma de compartilhar dados entre componentes
// SEM precisar passar props manualmente (prop drilling)
const BooksContext = createContext();

/*

Criamos um componente chamado Provider para encapsular toda a lógica
do contexto (estado + funções) em um único lugar.

Em vez de só passar um valor simples (como number ou string),
o Provider permite compartilhar um "pacote completo" de dados, como:
- estados (useState)
- funções para alterar esses estados

*/
const Provider = ( {children} ) => {
    const [books, setBooks] = useState([]);

    /*

        Em React, funções definidas dentro de um componente são recriadas
        a cada render. Portanto, a cada render do Provider, uma NOVA referência
        de fetchBooks é criada na memória.

        Ou seja:
            render 1 → fetchBooks = referência A
            render 2 → fetchBooks = referência B (≠ A)

        Dentro do App:
            useEffect(() => {
                fetchBooks();
            }, [fetchBooks])

        O React compara as dependências usando igualdade por referência (===).
        Como a função mudou de referência (A !== B), o React entende que houve
        mudança na dependência e executa novamente o useEffect.

        Fluxo gerado:
            render → nova função → useEffect detecta mudança →
            chama fetchBooks → setState → novo render → repete

        Isso cria um loop de renderizações.

        Como o useCallback resolve:

        O useCallback armazena em cache (memoiza) a função e retorna a MESMA
        referência entre renders, desde que as dependências não mudem.

        Exemplo:
            const fetchBooks = useCallback(fn, [])

        Como o array de dependências é [], a função é criada apenas uma vez:

            render 1 → fetchBooks = referência A
            render 2 → fetchBooks = referência A (mesma referência)

        Assim, quando o React compara no useEffect:

            fetchBooks === fetchBooks → true

        Portanto, o useEffect NÃO é executado novamente.

    */
    const fetchBooks = useCallback(async () => {
        const response = await axios.get('http://localhost:3001/books');
        setBooks(response.data)
    }, [])

    const createBook = async (title) => {
        const response = await axios.post('http://localhost:3001/books', {title})
        fetchBooks();
    }

    const deleteBookById = async (id) => {
        const response = await axios.delete(`http://localhost:3001/books/${id}`)
        fetchBooks();
    }

    const updateBookById = async (id, title) => {
        const response = await axios.put(`http://localhost:3001/books/${id}`, {title})
        fetchBooks();
    }

    const state = { books, fetchBooks, createBook, deleteBookById, updateBookById }

    return (
        <BooksContext.Provider value={state}>
            {children}
        </BooksContext.Provider>
    )
}

export { Provider };
export default BooksContext;