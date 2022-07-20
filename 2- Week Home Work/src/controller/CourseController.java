package controller;
import java.util.List;
import model.Course;
import model.Instructor;
import model.Student;
import service.CourseService;

public class CourseController {
CourseService courseService = new CourseService();

public List<Course> listAllCourse(){

    return courseService.listall();
    
}
public Course findById(Long id){
    return courseService.finfById(id);
}
public void saveCouse(Course course) {
    courseService.saveToDatabase(course);
    
}
public void updateCourse(Course course,Long id) {
    courseService.updateOnDatabase(course,id);

    
}
public void deleteCourse(Course course) {
    courseService.deletFromDatabase(course);
    
}
public void deleteCourseId(Course course,Long id) {
    courseService.deletFromDatabase(course,id);
    
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