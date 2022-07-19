package model;

import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import java.util.ArrayList;
import java.util.List;
@Entity


public class Course {
    @Id
    @ GeneratedValue ( generator = " course" , strategy = GenerationType.SEQUENCE)
    @ SequenceGenerator ( name = " course" , sequenceName = " COURSE_SEQ_ID " )
    
    private String courseName ;
    private String courseCode;
    private int  creditScore ;
    private Long courseId ;

    /**
     * @return the courseId
     */
    public Long getCourseId() {
        return courseId;
    }


    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Student.class,cascade = CascadeType.ALL)

    private List<Student> studentList = new ArrayList<>();

    @ManyToOne ( fetch = FetchType.LAZY,  cascade = CascadeType.ALL, targetEntity = Instructor.class )
    @ JoinColumn ( nullable = false)
    private Instructor instructor;


    public Course() {
    }


    /**
     * @param courseName
     * @param courseCode
     * @param creditScore
     * @param studentList
     * @param instructor
     */
    public Course(String courseName, String courseCode, int creditScore, List<Student> studentList,
            Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.studentList = studentList;
        this.instructor = instructor;
    }





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

   
  
   
  

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "course [courseCode=" + courseCode + ", courseName=" + courseName + ", creditScore=" + creditScore + "]";
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        return Objects.hash(courseCode);
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
        return Objects.equals(courseCode, other.courseCode);
    }

    
}
