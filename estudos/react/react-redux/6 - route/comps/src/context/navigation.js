import { createContext, useEffect, useState } from "react";

const NavigationContext = createContext();

const NavigationProvider = ({children}) => {
    const [currentPath, setCurrentPath] = useState(window.location.pathname);
    
    useEffect(() => {
        const handler = () => {
            console.log(window.location.pathname); 
            setCurrentPath(window.location.pathname);
        }
        /*
            popstate => evento disparado pelo navegador quando usuário clica nas setas de navegação,
                desde que a url tenha sido acessado por um pushState
            window.history.pushState => muda a url sem causar um refresh da página
                quando o usuário navega pelas setas do browser por esse cenário a página não sofre refresh
        */
        window.addEventListener('popstate', handler)
    }, [])

    const navigate = (to) => {
        window.history.pushState({}, '', to)
        setCurrentPath(to)
    }
    
    return (
        <NavigationContext.Provider value={{currentPath, navigate}}>
            {children}
        </NavigationContext.Provider>
    );
} 

export { NavigationProvider };
export default NavigationContext