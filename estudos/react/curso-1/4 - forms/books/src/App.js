import { useEffect, useState } from "react"
import BookCreate from "./components/BookCreate";
import BookList from "./components/BookList";

const App = () => {
    const [books, setBooks] = useState([]);

    const createBook = (title) => {
        /* spread espalha os itens de um array, é necessário envolver em [] para criar um novo array */ 
        setBooks([...books, {title, id: Math.round(Math.random() * 9999)}])
    }

    const deleteBookById = (id) => {
        const newBooks = books.filter((book) => {
            return book.id !== id
        })
        setBooks(newBooks)
    }

    const updateBookById = (id, title) => {
        const newBooks = books.map((book) => {
            return book.id === id ? {...book, title} : book
        })

        setBooks(newBooks)
    }

    return (
        <div className="app">
            <h1>Reading List</h1>
            <BookList books={books} onDelete={deleteBookById} onEdit={updateBookById}/>
            <BookCreate onCreate={createBook}/>
        </div>
    )
}

export default App