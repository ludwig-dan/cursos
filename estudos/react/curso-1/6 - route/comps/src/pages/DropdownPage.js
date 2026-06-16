import { useEffect, useState } from "react";
import Dropdown from "../components/Dropdown";
const DropdownPage = () => {
    const [selected, setSelected] = useState(null)
    
    useEffect(() => {
        console.log(selected)
    }, [selected])

    const options = [
        {label: 'RED', value: 'red'},
        {label: 'GREEN', value: 'green'},
        {label: 'BLUE', value: 'blue'}
    ]
    return(
        <div className="flex">
            <Dropdown options={options} value={selected} onChange={setSelected}/>
            <Dropdown options={options} value={selected} onChange={setSelected}/>
        </div>
    )
}

export default DropdownPage;