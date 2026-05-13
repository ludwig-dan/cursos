import { createContext, useState } from "react";
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

    const fetchBooks = async () => {
        const response = await axios.get('http://localhost:3001/books');
        setBooks(response.data)
    }

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