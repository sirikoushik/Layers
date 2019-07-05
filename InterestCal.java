package com.ser;
import com.ui.*;
import java.util.*;
import com.bean.*;
import com.dao.*;
public class InterestCal implements ServiceInterface {
    
    
    public void Cal(employeeDetails seobj) {
        
        int salary=seobj.getEmpSalary();
       if(salary<10000) 
           seobj.setInterest("schemeA");
       else if(salary>10000 && salary<50000)
           seobj.setInterest("schemeB");
       else
           seobj.setInterest("schemeC");
       DaoInterface dobj=new StoreEmpDetails();
       dobj.employeeStorage(seobj);
       
    }

 

    public void storee(Map alobj) {
        Employee eobj=new Employee();
        eobj.displayMethod(alobj);
        
    }
public boolean validateName(String empName) {
        try {
            if(empName.matches("([A-Z][a-z]+)*"))
                    return true;
            else
                throw new Exception("Name is not valid");
        }catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean validateMobileNum(String mobileNum) {
        // TODO Auto-generated method stub
        try{
            if(mobileNum.matches("(\\+91(-)?|91(-)?|0(-)?)?((9)|(8)|(7))[0-9]{9}"))
                return true;
            else
                throw new Exception("Number is not valid");
        }catch(Exception e) {
            System.out.println(e);
            
        }
        return false;
    }

    @Override
    public boolean validateMail(String empMail) {
        // TODO Auto-generated method stub
        try{
            if(empMail.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"))
                return true;
            else
                throw new Exception("MailId is not valid");
        }catch(Exception e) {
            System.out.println(e);
            
        }
        return false;
    }

