import './assets/css/AnimalShow.css'
import { useState } from 'react';
import bird from './assets/images/bird.svg';
import cat from './assets/images/cat.svg';
import cow from './assets/images/cow.svg';
import dog from './assets/images/dog.svg';
import gator from './assets/images/gator.svg';
import heart from './assets/images/heart.svg';
import horse from './assets/images/horse.svg';

/* 
    quando a chave é o valor são iguais, pode ser passado apenas a chave
    const svgMap = { bird }; igual a {bird : bird}
        chave: bird, usada para acessar o objeto, só existe dentro dele
        valor: bird, svg importado no topo do arquivo
*/
const svgMap = { bird, cat, cow, dog, gator, horse};

const AnimalShow = ({type}) =>{
    const [like, setLike] = useState(0);
    const handleClick = () => {
        setLike(like + 1);
    }
    return (
        <div onClick={handleClick} className='animal-show'>
            <img src={svgMap[type]} alt={type} className='animal'/>
            {/*
                inline css como prop:
                    1º {} => indica que será escrito um código js
                    2ª {} => passa um objeto
            */}
            <img src={heart} alt={heart} style={{width: 10 + 10 * like}} className='heart'/>
        </div>
    )
} 

export default AnimalShow;