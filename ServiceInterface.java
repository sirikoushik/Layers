
    
package com.ser;


import java.util.Map;


import com.bean.employeeDetails;


public interface ServiceInterface {
    public void Cal(employeeDetails seobj);
    
    public void storee(Map alobj);


    public boolean validateName(String empName);


    public boolean validateMobileNum(String mobileNum);


    public boolean validateMail(String empMail);
    public String checkIt(int salary);
    
}
 








