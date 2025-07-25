import { Component } from "react";
export default class CountPeople extends Component{
    constructor(props){
        super(props)
        this.state={
            entrycount:0,
            exitcount:0
        }
    }

    updateEntry(){
        this.setState((prevState)=>{
            return {entrycount:prevState.entrycount+1}
        })
    }

    updateExit(){
        this.setState((prevState)=>{
            return {exitcount:prevState.exitcount+1}
        })
    }

    render(){
        return <div>
            <p>{this.state.entrycount} people entered!</p>
            <button onClick={()=>this.updateEntry()}>Login</button>
            <p>{this.state.exitcount} people left!!</p>
            <button onClick={this.updateExit.bind(this)}>Exit</button>
        </div>
    }
}