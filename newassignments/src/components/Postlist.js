 
import React , {Component} from 'react';
import axios from 'axios';
class Postlist extends Component
{
    
    constructor(props)
    {
        super(props)
        this.state = {
            posts:[]
        }
    }

    componentDidMount()
    {
        axios.get("https://jsonplaceholder.typicode.com/posts")
        .then(response =>{
            this.setState({posts:response.data})
            console.log(response);
            // this.setState(posts:response.data);

        })
        .catch(error =>{
            console.log(error);
        })
    }
     render()
     {
        const {posts}=this.state
        return(<div>
            list post data{
                posts.map(post=><div key={post.id}>{post.title}</div>)
            }
        </div>)
     }
    }

export default Postlist