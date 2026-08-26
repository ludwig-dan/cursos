import { useState } from 'react';
import Table from './Table';

const SortableTable = (props) => {
    const [sortOrder, setSortOrder] = useState(null);
    const [sortBy, setSortBy] = useState(null);
    const {config, data } = props;
    
    const handleClick = (label) => { 
        if(sortOrder === null){
            setSortOrder('asc');
            setSortBy(label);
        } else if (sortOrder === 'asc'){
            setSortOrder('desc');
            setSortBy(label);
        } else if(sortOrder === 'desc'){
            setSortOrder(null);
            setSortBy(null);
        }
    };

    const updatedConfig = config.map((column) => {
        if(!column.sortValue){
            return column;
        }

        return {
            ...column,
            header: () => <th onClick={() => handleClick(column.label)}>{column.label}</th>
        }
    });

    let sortedData = data;
    if(sortBy && sortOrder){
        const { sortValue } = config.find(column => column.label === sortBy);
        sortedData = [...data].sort((a,b) => {
            const valueA = sortValue(a);
            const valueB = sortValue(b);
            
            const reverseOrder = sortOrder === 'asc' ? 1 : -1;
            
            if(typeof valueA === 'string'){
                return valueA.localeCompare(valueB) * reverseOrder;
            } else {
                return (valueA - valueB) * reverseOrder;
            }
        })
    }
    return <Table {...props} data={sortedData} config={updatedConfig}/>
}

export default SortableTable;