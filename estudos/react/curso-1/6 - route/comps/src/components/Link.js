import useNavigation from "../hooks/useNavigation";
import classNames from "classnames";

const Link = ({to, children, className, activeClassName}) => {
    const {navigate, currentPath} = useNavigation();
    const classes = classNames(
        'text-blue-500', 
        className,
        currentPath === to && activeClassName
    )

    const handleClick = (event) => {
        event.preventDefault() // desativa o comportamento padrão do <a />
        navigate(to);
    }
    return (
        <a onClick={handleClick} className={classes}>{children}</a>
    )
}

export default Link;