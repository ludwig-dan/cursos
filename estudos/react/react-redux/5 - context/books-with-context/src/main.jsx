import React from "react"
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'
import {Provider} from "./context/books"

const el = document.getElementById('root')
const root = ReactDOM.createRoot(el);
root.render(

// Provider é o componente responsável por disponibilizar um valor
// para todos os componentes filhos dentro dele.
//
// Tudo que estiver dentro deste Provider pode acessar o valor (value)
// usando o hook useContext.
//
// Ele funciona como uma "fonte global" de dados,
// evitando precisar passar informações via props em vários níveis.
//
// Sempre que o valor do Provider muda, todos os componentes que
// consomem esse contexto são re-renderizados automaticamente.
    <Provider>
        <App />
    </Provider>
)