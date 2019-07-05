 package com.ui;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import com.bean.*;
import com.ser.*;
public class Employee {
    public static int n;
     static Scanner sc= new Scanner(System.in);
     static Scanner sc1= new Scanner(System.in);
     static ServiceInterface sobj=new InterestCal();
   public static void main(String args[]){
       System.out.println("Enter n");
       n=sc.nextInt();
       String empName;
       String mobileNum;
       String empMail;
       for(int i=0;i<n;i++) {
           DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           Date date=new Date();
           String currDate=dateFormat.format(date);
       System.out.println("Enter EmpId:");
       int empId= sc.nextInt();
       while(true) {
       System.out.println("Enter EmpName:");
        empName=sc1.nextLine();
        boolean isValid=sobj.validateName(empName);
        if(isValid)
            break;
       }
       System.out.println("Enter EmpSalary:");
       int empSalary= sc.nextInt();
       String interest=null;
       while(true) {
           System.out.println("Enter Mobile Number:");
           mobileNum=sc.next();
           boolean isValid=sobj.validateMobileNum(mobileNum);
           if(isValid)
               break;
       }
       while(true) {
           System.out.println("Enter MailId:");
           empMail=sc.next();
           boolean isValid=sobj.validateMail(empMail);
           if(isValid)
               break;
       }
       employeeDetails bobj=new employeeDetails(empId,empName,empSalary,interest,currDate,mobileNum,empMail );
      
       sobj.Cal(bobj);
      
       }
      
   }
   public void displayMethod(Map alobj) {
       System.out.println("Enter employee id to be search");
       int searchEmpId=sc.nextInt();
       Set keys=alobj.keySet();
       Iterator i=keys.iterator();
       while(i.hasNext()) {
              employeeDetails sv = (employeeDetails) alobj.get(i.next());
              if(sv.getEmpId()==searchEmpId) {
                  System.out.println(sv);
                 
              }
       }    
   }
}