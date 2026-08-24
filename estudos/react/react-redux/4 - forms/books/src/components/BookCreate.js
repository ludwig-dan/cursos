import { useState } from "react"

const BookCreate = ({onCreate}) => {
    const [title, setTitle] = useState('')
    const handleChange = (event) => {
        setTitle(event.target.value)
    } 

    const handleSubmit = (event) => {
        event.preventDefault()
        setTitle('')
        onCreate(title)
    }

    return (
        <div className="book-create"> 
            <h3>Add a Book!</h3>
            <form onSubmit={handleSubmit}>
                <label>Title</label>
                <input
                    className="input" 
                    type="text" 
                    name="title" 
                    value={title}
                    onChange={handleChange}
                />
                <button className="button" type="submit">Submit</button>
            </form>
        </div>
    )
}

export default BookCreate