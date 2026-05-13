import { useEffect, useContext } from "react"
import BookCreate from "./components/BookCreate";
import BookList from "./components/BookList";
import BooksContext from "./context/books";

const App = () => {
    const { fetchBooks, books } = useContext(BooksContext);
    useEffect(() => {
        fetchBooks();
    },[])

    return (
        <div className="app">
            <h1>Reading List</h1>
            <BookList books={books}/>
            <BookCreate/>
        </div>
    )
}

export default App