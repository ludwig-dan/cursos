import ReactDOM from 'react-dom'
import Button from './Button';
import { useEffect } from 'react';

const Modal = ({isOpen, setIsOpen, onClose, actionLabel, children}) => {
    useEffect(() => {
        if(isOpen){
            document.body.classList.add('overflow-hidden');
        } else {
            document.body.classList.remove('overflow-hidden');
        }
    },[isOpen]);

    const handleClose = () => {
        setIsOpen(false);
        onClose && onClose();
    }
    return (
        isOpen && ( ReactDOM.createPortal(
        <div>
            <div className="fixed inset-0 bg-gray-300 opacity-80" onClick={handleClose}></div>
            <div className="fixed inset-40 p-10 bg-white">
                <div className='flex flex-col justify-between h-full'>
                    {children}
                    <div className='flex justify-end'>
                        <Button primary>{actionLabel}</Button>
                    </div>
                </div>
            </div>
        </div>, document.querySelector('.modal-container')))
    )
}

export default Modal;