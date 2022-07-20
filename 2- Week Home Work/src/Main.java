import model.Course;
import utils.HibernateUtil;
import controller.CourseController;
import model.VisitingResearcher;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Main {
   public static void main(String[] args) {
    System.out.println(" starting");

    EntityManager em = HibernateUtil.buildSessionFactory();

    Course course = new Course();
    course.setCourseName("Math");
    course.setCourseCode("M101");
    course.setCreditScore(10);
    course.setStudentList(null);
    course.setInstructor(null);

    model.Course course01 = new Course();
    course01.setCourseName("Math");
    course01.setCourseCode("M102");
    course01.setCreditScore(10);
    course01.setStudentList(null);
    course01.setInstructor(null);

    List<Course> courseList = new ArrayList<>();
    courseList.add(course);
    courseList.add(course01);

    VisitingResearcher visitingResearcher = new VisitingResearcher ();
    visitingResearcher.setHourlySalary(10);
    visitingResearcher.setCourseList(courseList);
    visitingResearcher.setAddress(" address");
    visitingResearcher.setPhoneNumber(" 5555555555");
    
    course01.setInstructor(visitingResearcher);
    course.setInstructor(visitingResearcher);
    
    

    CourseController courseController = new CourseController();
    courseController.saveCouse(course);
    courseController.saveCouse(course01);
  











    
   


   } 

    
}