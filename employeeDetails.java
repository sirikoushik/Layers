 package BEAN;
import com.ser.InterestCal;
import junit.framework.TestCase;
public class employeeDetails {
    private int empId;
    private String empName;
    private int empSalary;
    private String interest;
    private String currDate;
    private String mobileNum;
    private String empMail;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    
    public String getInterest() {
        return interest;
    }
    public void setInterest(String interest) {
        this.interest = interest;
    }
    
    
    public String getCurrDate() {
        return currDate;
    }
    public void setCurrDate(String currDate) {
        this.currDate = currDate;
    }
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getEmpMail() {
        return empMail;
    }
    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }
    public employeeDetails(int empId, String empName, int empSalary, String interest, String currDate, String mobileNum, String empMail) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.interest = interest;
        this.currDate=currDate;
        this.mobileNum=mobileNum;
        this.empMail=empMail;
    }

 

    
    @Override
    public String toString() {
        return "employeeDetails [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", interest="
                + interest + ", currDate=" + currDate + ", mobileNum=" + mobileNum + ", empMail=" + empMail + "]";
    }

 


    
    

 

}
 