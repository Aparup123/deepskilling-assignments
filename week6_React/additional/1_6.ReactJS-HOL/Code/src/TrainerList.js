import { useEffect, useState } from "react";
import trainerMock from "./trainermock";
import { Link } from "react-router-dom";

export default function TrainerList() {

    const [trainers, setTrainers]=useState([]);

    useEffect(()=>{
        setTrainers(trainerMock);
    }, [])

    return (
        <div>
            <h2>Trainer List</h2>
            <ul>
                {trainers.map(trainer => (
                    <li><Link key={trainer.trainerId} to={`/trainers/${trainer.trainerId}`}>
                        {trainer.name}
                    </Link></li>
                ))}
            </ul>
        </div>
    );
}