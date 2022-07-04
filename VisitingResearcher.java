import java.util.Objects;

public class VisitingResearcher extends Instructor {

    
  
    /**
     * @param name
     * @param phoneNumber
     * @param address
     */
    public VisitingResearcher(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
      
    }



    private double  hourlySalary ;

    
    /**
     * @return
     */
    public double getHourlySalary() {
        return hourlySalary;
    }

    /**
     * @param hourlySalary
     */
    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    
    
 
    
    /* (non-Javadoc)
     * @see Instructor#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(hourlySalary);
    }

    
    
    /* (non-Javadoc)
     * @see Instructor#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VisitingResearcher))
            return false;
        VisitingResearcher other = (VisitingResearcher) obj;
        return Double.doubleToLongBits(hourlySalary) == Double.doubleToLongBits(other.hourlySalary);
    }

   
    
    /* (non-Javadoc)
     * @see Instructor#toString()
     */
    @Override
    public String toString() {
        return "VisitingResearcher [hourlySalary=" + hourlySalary + "]";
    }
    

}
