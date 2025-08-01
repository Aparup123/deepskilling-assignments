export default function OddPlayers({players}){
    const [first, , second, , third]=players;
    return <div>
        <li key={1}>First: {first.name}</li>
        <li key={2}>Second: {second.name}</li>
        <li key={3}>Third: {third.name}</li>
    </div>
}