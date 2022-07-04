import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


public class Course {
    
    private String courseName ;
    private String courseCode;
    private int  creditScore ;

    private List<Student> studentList = new ArrayList<>();
    private Instructor instructor;

   
    /**
     * @return
     */
    public List<Student> getStudentList() {
        return studentList;
    }
  
    /**
     * @param studentList
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * @return
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * @param instructor
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * @return
     */
    public String getCourseName() {
        return courseName;
    }
   
    /**
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
   
    /**
     * @return
     */
    public String getCourseCode() {
        return courseCode;
    }
   
    /**
     * @param courseCode
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
  
    /**
     * @return
     */
    public int getCreditScore() {
        return creditScore;
    }
 
    /**
     * @param creditScore
     */
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

   
    /**
     * @param courseName
     * @param courseCode
     * @param creditScore
     */
    public Course(String courseName, String courseCode, int creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }

   
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(courseCode, courseName, creditScore);
    }

  
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Course))
            return false;
        Course other = (Course) obj;
        return Objects.equals(courseCode, other.courseCode) && Objects.equals(courseName, other.courseName)
                && creditScore == other.creditScore;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "course [courseCode=" + courseCode + ", courseName=" + courseName + ", creditScore=" + creditScore + "]";
    }

    
}
