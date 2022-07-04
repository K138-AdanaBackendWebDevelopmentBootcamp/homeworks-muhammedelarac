import java.util.Objects;

public class PermanentInstructor extends Instructor {
    public PermanentInstructor(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
        
    }




    private double  fixedSalary ;

  
    /**
     * @return
     */
    public double getFixedSalary() {
        return fixedSalary;
    }

    
    /**
     * @param fixedSalary
     */
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }


  
    
    /* (non-Javadoc)
     * @see Instructor#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(fixedSalary);
    }


 
    
    /* (non-Javadoc)
     * @see Instructor#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof PermanentInstructor))
            return false;
        PermanentInstructor other = (PermanentInstructor) obj;
        return Double.doubleToLongBits(fixedSalary) == Double.doubleToLongBits(other.fixedSalary);
    }


  
    
    /* (non-Javadoc)
     * @see Instructor#toString()
     */
    @Override
    public String toString() {
        return "PermanentInstructor [fixedSalary=" + fixedSalary + "]";
    }
}
