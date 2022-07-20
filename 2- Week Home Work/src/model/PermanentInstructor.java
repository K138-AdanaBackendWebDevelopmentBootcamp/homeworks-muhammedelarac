package model;
import java.util.List;
import javax.persistence.Entity;
@Entity
public class PermanentInstructor extends Instructor {

    private double  fixedSalary ;

    
    public PermanentInstructor() {
    }


    
    public PermanentInstructor(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }



    /**
     * @param name
     * @param phoneNumber
     * @param address
     * @param courseList
     * @param fixedSalary
     */
    public PermanentInstructor(String name, String phoneNumber, String address, List<Course> courseList,
            double fixedSalary) {
        super(name, phoneNumber, address, courseList);
        this.fixedSalary = fixedSalary;
    }



    /**
     * @return the fixedSalary
     */
    public double getFixedSalary() {
        return fixedSalary;
    }



    /**
     * @param fixedSalary the fixedSalary to set
     */
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "PermanentInstructor [fixedSalary=" + fixedSalary + "]";
    }



    


  




    
}
