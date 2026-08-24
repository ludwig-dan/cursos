import Link from "./Link"

const SideBar = () => {
    const links = [
        {label: 'Accordion', path: '/'},
        {label: 'Dropdown', path: '/dropdown'},
        {label: 'Button', path: '/buttons'},
        {label: 'Modal', path: '/modal'},
        {label: 'Table', path: '/table'}
    ]

    const renderedLinks = links.map(({label, path}) => {
        return <Link key={path} to={path} className='mb-3' activeClassName='font-bold border-l-4 border-blue-500 pl-2'>{label}</Link>
    })

    return (
        <div className="sticky top-0  flex flex-col align-start">{renderedLinks}</div>
    )
}

export default SideBar;