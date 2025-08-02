
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CouseDetails from './components/CourseDetails';
function App() {
  const courses = [
    {
      id: 1,
      name: "Angular",
      date: "4/ 5/ 2021",
    },
    {
      id: 2,
      name: "React",
      date: "6/ 3/ 2021",
    },
  ]
  const books=[
    {
      id: 101,
      name: "Master React",
      price: 670
    },
    {
      id: 102,
      name: "Deep dive into Angular 11",
      price: 800
    },
    {
      id: 103,
      name: "Mongo Essentials",
      price: 450
    }
  ];
  const blogs = [
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React.",
    },
    {
      id: 2,
      title: "Installation",
      author: "Schewzdenier",
      content: "You can install React from npm.",
    },
  ]
  
  return (
    <div className="container">
      <div>
        <h1>Course Details</h1>
        <CouseDetails courses={courses}/>
      </div>
      <div className='border-side'>
        <h1>Book Details</h1>
        <BookDetails books={books}/>
      </div>
      <div>
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs}/>
      </div>
    </div>
  );
}

export default App;
