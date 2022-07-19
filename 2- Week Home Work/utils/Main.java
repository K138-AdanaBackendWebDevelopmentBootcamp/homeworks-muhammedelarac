
import Moodel.Course;
import Utils.HibernateUtil;
import controller.CourseController;
import model.VisitingResearcher;

import java.util.ArrayList;

import javax.persistence.EntityManager;

public class Main {
   public static void main(String[] args) {
    System.out.println(" starting");

    EntityManager em = HibernateUtil.buildSessionFactory();

    Course course = new Course();
    course.setCourseName("Math");
    course.setCourseCode("M101");
    course.setCreditScore(10);
    course.setStudents(null);
    course.setInstructor(null);

    model.Course course01 = new Course();
    course01.setCourseName("Math");
    course01.setCourseCode("M102");
    course01.setCreditScore(10);
    course01.setStudents(null);
    course01.setInstructor(null);

    List<Course> courseList = new ArrayList<>();
    courseList.add(corse);
    courseList.add(corse01);

    VisitingResearcher visitingResearcher = new VisitingResearcher ();
    visitingResearcher.setHourlySalary(10);
    visitingResearcher.setcourseList(courseList);
    visitingResearcher.setInstructorAddress(" address");
    visitingResearcher.setTelephoneNumper(" 5555555555");
    
    course01.setInstructor(visitingResearcher);
    course.setInstructor(visitingResearcher);
    
    

    CourseController courseController = new CourseController();
    courseController.saveCouse(course);
    courseController.saveCouse(course01);













    
    em.getTransaction().begin();
    em.persist(course);
    em.getTransaction().commit();

    em.clear();
    em.close();



   } 

    
}