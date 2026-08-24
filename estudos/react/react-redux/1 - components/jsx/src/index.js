// Biblioteca principal do React, usada para criar componentes e usar JSX
// Em projetos React mais novos (com Vite, por exemplo), o React nem sempre precisa ser importado para usar JSX
import React from 'react';

// Responsável por renderizar os componentes React no DOM do navegador
import ReactDom from 'react-dom/client';

// importa componente
import App, {message, mensagem, teste as renomeada} from './App';


// Cria a "raiz" da aplicação React, associando o React a um nó específico do DOM.
// Esse método prepara o React para gerenciar atualizações da interface
// (re-renderizações, reconciliação e renderização concorrente)
// Dentro do elemento HTML com id="root".
const root = ReactDom.createRoot(document.getElementById('root'));

// renderiza o componente App dentro do Dom
root.render(<App />)