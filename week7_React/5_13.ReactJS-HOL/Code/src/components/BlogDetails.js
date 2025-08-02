export default function BlogDetails({ blogs }) {
  return (
    <div>
        {
            blogs.map((blog) => {
                return (
                    <div key={blog.id}>
                        <h2>{blog.title}</h2>
                        <p>Author: {blog.author}</p>
                        <p>{blog.content}</p>
                    </div>
                )
            })
        }
    </div>
  )
}