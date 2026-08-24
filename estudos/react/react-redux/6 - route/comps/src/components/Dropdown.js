import { useEffect, useRef, useState } from "react";
import { GoChevronDown } from "react-icons/go"
import Panel from "./Panel";

const Dropdown = ({options, value, onChange}) => {
    const [isOpen, setIsOpen] = useState(false)
    const divEl = useRef();

    const handleOptionClick = (opt) => {
        setIsOpen(false)
        onChange(opt)
    }

    const renderedOptions = options.map((opt, key) => {
        return (
            <div key={key} onClick={() => handleOptionClick(opt)} className="hover:bg-sky-100 rounded cursor-pointer">
                {opt.label}
            </div>
        )
    });

    const handleClick = () => {
        setIsOpen(!isOpen);
    }

// O terceiro argumento 'true' faz o listener executar na fase de CAPTURING.
//
// Quando um evento acontece (ex: click), ele percorre o DOM em 3 fases:
// 1. Capturing (descendo: document → elemento alvo)
// 2. Target (elemento clicado)
// 3. Bubbling (subindo: elemento alvo → document)
//
// Importante: o evento SEMPRE passa pelas 3 fases.
// O que muda é em qual fase cada listener será executado.
//
// addEventListener(..., true)
// → executa na fase de CAPTURING (antes dos onClick normais)
//
// addEventListener(..., false) ou sem argumento
// → executa na fase de BUBBLING (padrão)
//
//
// Neste caso do dropdown, usamos 'true' para capturar o clique
// antes de qualquer outro onClick da aplicação,
// garantindo que conseguimos detectar corretamente cliques fora do componente
// sem sofrer interferência de outros handlers.
    useEffect(() => {
        const handler = (event) => {
            if(!divEl.current.contains(event.target)){
                setIsOpen(false);
            }
        }
        document.addEventListener('click', handler, true)
        return () => {
            document.removeEventListener('click', handler, true);
        }
    }, [])

    return (
        /*  cria uma referencia ao DOM usando o useRef */
        <div className="w-48 relative" ref={divEl}>
            {/*
                selected?.label => transforma em undefined se não existir 
                undefined || 'Select...' => retorna o primeiro valor true
                undefined é false, uma string válida é true
            */}
            <Panel className="flex justify-between items-center cursor-pointer" onClick={handleClick}>
                {value?.label || 'Select...'}
                <GoChevronDown />
            </Panel>
            {isOpen && (<Panel className="absolute top-full">{renderedOptions}</Panel>)}
        </div>
    )
}

export default Dropdown;