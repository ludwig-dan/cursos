import { useEffect, useState } from "react"
import BookCreate from "./components/BookCreate";
import BookList from "./components/BookList";
import axios from 'axios';

const App = () => {
    const [books, setBooks] = useState([]);
    let render = 0;
    const fetchBooks = async () => {
        const response = await axios.get('http://localhost:3001/books');
        setBooks(response.data)
        render = render + 1;
    }
    /*
        variável render é recriada a cada renderização com o valor 0
        setBooks é executado dentro de fetchBooks, atualiza o estado, react re-renderiza
        render é igual a 0 de novo
        valor não mudou, variáveis que não são estado não são rastreadas
        render tem o mesmo valor do primeiro render, não executa novamente
    */
    useEffect(()=>{
        console.log(`render => ${render}`)
    }, [render])

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

    useEffect(() => {
        fetchBooks();
    },[])
    /*
        primeiro argumento => uma função a ser executada
        segundo argumento => quando será executada
            sempre executa no primeiro render, independente do que foi passado 
            [] => executa após o primeiro render e depois nunca mais
            [algumaVariavel] => executa após o primeiro render e sempre que o valor da variável mudar
            vazio => executa após o primeiro render e após cada re-render
    */

    const teste = null;

    useEffect(()=>{
        console.log('primeiro render!')
    }, [teste]);

    useEffect(()=>{
        console.log('primeiro render ou books mudou!')
    }, [books]);

    useEffect(()=>{
        console.log('render ou re-render!')
    });


    return (
        <div className="app">
            <h1>Reading List</h1>
            <BookList books={books} onDelete={deleteBookById} onEdit={updateBookById}/>
            <BookCreate onCreate={createBook}/>
        </div>
    )
}

export default App