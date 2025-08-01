import { Component } from "react";

export default class ScoreBelow70 extends Component{
    render(){
        const players = this.props.players;
        return <div>
            {
                players.filter((player)=>{
                    return player.score<70
                }).map((player)=>{
                    return <li>Mr. {player.name} <span> {player.score} </span></li>
                })
            }
        </div>
    }
}