import { useState, useContext } from "react"
import BookEdit from "./BookEdit"
import BooksContext from "../context/books"

const BookShow = ({book}) => {
    const { deleteBookById, updateBookById } = useContext(BooksContext);
    const [showEdit, setShowEdit] = useState(false)
    
    const handleDelete = () => {
        deleteBookById(book.id)
    }

    const handleEdit = () => {
        setShowEdit(true);
    }

    const handleSubmit = (id, title) => {
        setShowEdit(false)
        updateBookById(id, title)
    }
    return (
        <div className="book-show">
            {!showEdit ? book.title : <BookEdit book={book} onSubmit={handleSubmit} />}
            <div className="actions">
                <button className="edit" onClick={handleEdit}>Edit</button>
                <button className="delete" onClick={handleDelete}>Delete</button>
            </div>
        </div>

    )
}

export default BookShow