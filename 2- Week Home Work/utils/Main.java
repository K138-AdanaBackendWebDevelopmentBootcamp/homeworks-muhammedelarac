
import Moodel.Course;
import Utils.HibernateUtil;

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
    
    em.getTransaction().begin();
    em.persist(course);
    em.getTransaction().commit();

    em.clear();
    em.close();



   } 

    
}