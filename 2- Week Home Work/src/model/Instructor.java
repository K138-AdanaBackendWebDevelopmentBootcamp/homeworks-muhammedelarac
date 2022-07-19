package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
@Inheritance ( strategy = InheritanceType.JOINED)

public class Instructor {
    @Id
    @GeneratedValue(generator = "instructor " , strategy = GenerationType.SEQUENCE)
    @SequenceGenerator ( name = "instructor ",sequenceName = "  INSTRICTOR_SEQ_ID")
    
    private Long instructorId;
    private String name;
    private String phoneNumber ;
    private String address ;
    @OneToMany ( targetEntity = Course.class,fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Course> courseList = new ArrayList<>();
    

    public Instructor() {
    }


    /**
     * @param name
     * @param phoneNumber
     * @param address
     * @param courseList
     */
    public Instructor(String name, String phoneNumber, String address, List<Course> courseList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.courseList = courseList;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * @return the courseList
     */
    public List<Course> getCourseList() {
        return courseList;
    }


    /**
     * @param courseList the courseList to set
     */
    public void setCourseList(List<Course> courseList) {
       if (courseList.size() >0){
        this.courseList = courseList;

       }
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Instructor [address=" + address + ", courseList=" + courseList + ", name=" + name + ", phoneNumber="
                + phoneNumber + "]";
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Instructor))
            return false;
        Instructor other = (Instructor) obj;
        return Objects.equals(phoneNumber, other.phoneNumber);
    }

    
    

    
    
    
}
