import { Component } from "react";

export default class ListOfPlayers extends Component{
  
    render(){
        const players=this.props.players;
        return <div>{
            players.map((player)=>{
                return <li key={player.id}>Mr. {player.name} <span> {player.score} </span></li>   
            })
        }</div>
    }
}