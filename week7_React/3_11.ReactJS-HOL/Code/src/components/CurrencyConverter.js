import { useState } from "react"

export default function CurrencyConverter() {
    const [amount, setAmount]=useState(0);
    const [currency, setCurrency]=useState("");

    const handleSubmit=(e)=>{
        e.preventDefault();
        if(currency==="Euro"){
            const euro=0.0100*amount;
            alert(`Converting to Euro. \nEuro Amount is: ${euro}`)
        }
    }

    return (
        <div style={{
            margin: "20px",
            }}
        >
            <h1>Currency Converter!!!</h1>
            <form 
                style={{
                    display:"inline-flex",
                    flexDirection: "column",
                    gap:"5px"
                }}
                onSubmit={handleSubmit}
            >
                <label htmlFor="amount">Amount</label>
                <input 
                    name="amount" 
                    type="number"
                    value={amount}
                    onChange={(e)=>setAmount(e.target.value)}
                 />
                <label htmlFor="currency">Currency</label>
                <textarea 
                    name="currency"
                    value={currency}
                    onChange={(e)=>setCurrency(e.target.value)}
                ></textarea>
                <button type="submit" >Submit</button>
            </form>
        </div>
    )
    
}