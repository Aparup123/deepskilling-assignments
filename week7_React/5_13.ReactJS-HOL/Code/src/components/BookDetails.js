export default function BookDetails({ books }) {
  return (
    <div>
        {   
            books.map((book) => {
                return (
                    <div key={book.id}>
                        <h2>{book.name}</h2>
                        <p>Price: ${book.price}</p>
                    </div>
                )
            })
        }
    </div>
  )
}