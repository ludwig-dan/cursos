
// cria um componente React
const App = () => {
    // o react pode exibir varriáveis do conteúdo da tela
    // jsx é uma linguagem que o react vai converter para js e html puro
    let message = 'Bye there!'
    if(Math.random() > 0.5){
        message = 'Hello there!'
    }
    return <>
            {/*
                * algumas adaptações precisam ser feitas para usar atributos html no jsx
                ** os nomes serão camelCase (autofocus vira autoFocus)
                ** props e atributos que não são string devem ficar entre {}
                ** boolean true pode ser escrito somente com o nome do atributo (ex.: autoFocus no textare)
                ** class vira className
                ** inline style vira um objeto
            */}
        <input 
            type="number"
            min={5} 
            style={{border:'4px solid'}}
        />
        <br />
        <br />
        <textarea
            autoFocus 
        />
        <br />
        <br />
        {message}
    </>
}

// um arquivo só pode ter um export default
// import App from './App';
// pode ser renomeado
// import MyApp from './App'
export default App

// também é possível fazer exports nomeados
export const message = 'Hi';
// ou 
const mensagem = 'oi'
const teste = 'teste'
export {mensagem, teste}
// import App, {message, mensagem, teste as renomeada} from './App';
// para renomear precisa de um alias