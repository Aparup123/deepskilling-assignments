
export default function ListOfIndianPlayers({indianPlayers}){
    return <ul>
        {indianPlayers.map((player, index)=>{
            return<li key={index}>{player}</li>
        })}
    </ul>
}