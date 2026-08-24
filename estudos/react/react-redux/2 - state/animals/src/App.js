import './assets/css/App.css'
import { useState } from "react"
import AnimalShow from "./AnimalShow"

function getRandomAnimal() {
    const animals = ['bird', 'cat', 'cow', 'dog', 'gator', 'horse'];
    return animals[Math.floor(Math.random() * animals.length)]
}

const App = () => {
    const [animals, setAnimals] = useState([]);
    
    function handleClick() {
        /*
            []                  => cria um novo array
            ...animals          => "espalha a" os valores do array animals
                se animals fosse ['cat', 'dog'] => 'cat', 'dog', getRandomAnimal()
            getRandomAnimal()   =>  retorna uma string
                se retornar horse => 'cat', 'dog', horse

            ao final [...animals, getRandomAnimal()] é o mesmo que ['cat', 'dog', 'horse']
            
        */
        setAnimals([...animals, getRandomAnimal()])
    }

    const renderedAnimals = animals.map((value, index) => {
        return <AnimalShow type={value} key={index}/>
    });

    return(
        <div className='app'>
            <button onClick={handleClick}>Add animal</button>
            <div className='animal-list'>{renderedAnimals}</div>
        </div>
    )
}

export default App