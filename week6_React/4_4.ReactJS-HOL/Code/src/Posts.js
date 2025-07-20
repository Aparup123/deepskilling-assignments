import { Component } from "react";
import { Post } from "./Post";

export class Posts extends Component{
    constructor(props){
        super(props)
        this.state={
            posts: []
        }
    }
    loadPosts(){
        const url="https://jsonplaceholder.typicode.com/posts"
        fetch(url)
        .then((response)=>response.json())
        .then((data)=>{
            let postObjects=data.map((post)=>new Post(post.id, post.title, post.body))
            this.setState({
                posts:postObjects
            })
        })
    }
    componentDidMount(){
        this.loadPosts()
    }
    componentDidCatch(error, info){
        alert("Error Occured: ", error)
    }

    render(){
        return <div className="posts">
            {   
                this.state.posts.map((post)=>{
                    return <div key={post.id} className="post">
                        <h2>{post.id}. {post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                })
            }
        </div>
    }
}