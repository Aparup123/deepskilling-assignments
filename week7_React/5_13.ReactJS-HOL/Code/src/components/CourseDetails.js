export default function CourseDetails({ courses }) {
  return (
    <div>
        {
            courses.map((course) => {
                return (
                    <div key={course.id}>
                        <h2>{course.name}</h2>
                        <p>Date: {course.date}</p>
                    </div>
                )
            })
        }
    </div>
  )
}