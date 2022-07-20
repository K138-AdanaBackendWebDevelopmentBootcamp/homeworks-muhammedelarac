package service;

import java.util.List;
import javax.persistence.EntityManager;
import utils.HibernateUtil;
import model.Course;
import model.Instructor;
import model.Student;
import repository.CourseRepository;
import repository.CrudRepository;

public class CourseService implements CrudRepository<Course >, CourseRepository {

   

    EntityManager em = HibernateUtil.buildSessionFactory();
   

    @Override
    public void deletFromDatabase(Course course, Long id) {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            //TODO: handle exception
            em.getTransaction().rollback();
        }
        
    
    }



  


   

    @Override
    public Course finfById(Long id) {
        // TODO Auto-generated method stub

        em.getTransaction().begin();
        Course course = em.find(Course.class, id);


        return course;
    }



    @Override
    public List<Course> listall() {
        // TODO Auto-generated method stub

        em.getTransaction().begin();
        List<Course> coursesList = em.createQuery("fromCourse" ,Course.class).getResultList();
        


        return coursesList;
    }

   


    @Override
    public void updateOnDatabase(Course course, Long id) {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            //TODO: handle exception
            em.getTransaction().rollback();
        }

    }

    @Override
    public void deleteByCourseId(Long id) {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().commit();
            Course course =em.createQuery("from Course where coursId =: id" ,Course.class).setParameter("id", id).getSingleResult();
        em.getTransaction().commit();
            
        } catch (Exception e) {
            //TODO: handle exception
            e.getMessage();
            em.getTransaction().rollback();
        }
    }

    @Override
    public Instructor getInstructor(Course course) {
        // TODO Auto-generated method stub

        try {
               em.getTransaction().begin();
               Course foundCourse = em.find(Course.class, course.getCourseId());
               return foundCourse.getInstructor();
        } catch (Exception e) {
            //TODO: handle exception
         

            e.getMessage();
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public List<Student> getStudentList(Course course) {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            Course foundCourse = em.find(Course.class, course.getCourseId());
            return foundCourse.getStudentList();
     } catch (Exception e) {
         //TODO: handle exception
      

         e.getMessage();
         em.getTransaction().rollback();
         

         }
         return null;
     }

    
    @Override
    public void saveToDatabase(Course course) {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(course);
        } catch (Exception e) {
            //TODO: handle exception
            e.getMessage();
            em.getTransaction().rollback();

        }finally{
           // HibernateUtil.getEntityManager(em);


        }


        
    }





  




 @Override
   public void deletFromDatabase(Course coruse) {
        // TODO Auto-generated method stub
        
  }


  





    
}