package controller;
import java.util.List;

import org.hibernate.loader.custom.CollectionReturn;

import model.Course;
import model.Instructor;
import model.Student;
import service.CourseService;

public class CourseController {
CourseService courseService = new CourseService();

public List<Course> listAllCourse(){

    return courseService.listall();
    
}
public Course findById(int id){
    return courseService.finfById(id);
}
public void saveCouse(Course course) {
    courseService.saveToDatabase(course);
    
}
public void updateCourse(Course course,int id) {
    courseService.updateOnDatabase(course,id);

    
}
public void deleteCourse(Course course) {
    courseService.deletFromDatabase(course);
    
}
public void deleteCourse(int id) {
    courseService.deletFromDatabase(id);
    
}
public void deleteByCourseId(Long id) {
    courseService.deleteByCourseId(id);
}
public Instructor getCourseInstructor ( Course course) {
    return courseService.getInstructor(course);
    
}
public  List<Student> getCourseStudentlist (Course course){
    return courseService.getStudentList(course);
}
    
}