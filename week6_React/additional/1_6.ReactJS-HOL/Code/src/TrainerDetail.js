import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import trainerMock from "./trainermock";

export default function TrainerDetail(){
    const trainerId=useParams().trainerId
    const [trainer, setTrainer]=useState(null);
    useEffect(()=>{
        const t = trainerMock.find((trainerObjects)=>{return trainerObjects.trainerId===trainerId})
        setTrainer(t);
    }, [trainerId])

    if(!trainer){
        return <div>Loading....</div>
    }

    return <div>
        <h2>Trainer Details</h2>
        <h3>{trainer.name} ({trainer.technology})</h3>
        <p>{trainer.email}</p>
        <p>{trainer.phone}</p>
        <ul>
            {trainer.skills.map((skill, index)=>{
                return <li key={index}>
                    {skill}
                </li>
            })}
        </ul>
    </div>
}