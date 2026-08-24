const Table = ({data, config}) => {
    return (
        <div>
            <table className="table-auto border-spacing-2">
                <thead>
                    <tr className="border-b-2">
                        {config.map((c, i) => {
                            return (<th key={i}>{c.label}</th>)
                        })}
                    </tr>
                </thead>
                <tbody>
                    {data.map((row,i) => {
                        return (
                            <tr key={i} className="border-b">
                                {config.map((column, i2) =>{
                                    return (
                                        <td className="p-2" key={i2}>{column.render(row)}</td>
                                    )
                                })}
                            </tr>
                        )
                    })}

                </tbody>
            </table>
        </div>
    )
}

export default Table;
