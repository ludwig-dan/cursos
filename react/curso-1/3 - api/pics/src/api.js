import axios from 'axios';

const searchImages = async (term) => {
    const response = await axios.get('https://api.unsplash.com/search/photos', {
        headers:{
            Authorization: 'Client-ID CJ9H_Y4R4nukw3LKL-noLuD9N7qtK7o2pKilCVllV4w'
        }, 
        params: {
            query: term
        }
    })

    return response
}

export default searchImages