import { useEffect, useState } from "react"
import { GoChevronLeft, GoChevronDown } from "react-icons/go";

const Accordion = ({items}) => {
    const [expandedIndex, setExpandedIndex] = useState(-1);
    const renderedItems = items.map((item, key) => {
        const isExpanded = key === expandedIndex;
        const content = isExpanded && <div className="border-b p-5">{item.content}</div>;
        const icon = <span className="text-xl">{isExpanded ? <GoChevronDown /> : <GoChevronLeft />}</span>
        const handleClick = (key) => {
            /* 
                garante que estamos comparando o valor mais atual de expandedIndex, evitando problemas com atualizações assíncronas do React.
                Usar a função com "current" assegura que estamos trabalhando com o estado mais recente, especialmente quando múltiplos cliques ou renders acontecem rapidamente.
            */
            setExpandedIndex((current)=>{
                return key===current ? -1 : key
            })
        }
        return (
            <div key={key}>
                <div className="flex p-3 bg-gray-50 border-b items-center cursor-pointer justify-between" onClick={()=>handleClick(key)}>
                    {item.label}
                    {icon}
                </div>
                {content}
            </div>
        )
    })
    
    return (
        <div className="border-x border-t rounded">
            {renderedItems}
        </div>
    )
}

export default Accordion;