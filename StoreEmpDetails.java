
    
package com.dao;
import com.ser.*;
import com.ui.Employee;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.bean.*;
public class StoreEmpDetails implements DaoInterface {
   static int i=1;
   static Map alobj=new HashMap();
   public void employeeStorage(employeeDetails deobj) {
      
       
       alobj.put(i,deobj );
    i++;
    if(i==Employee.n+1) {
       ServiceInterface ilobj=new InterestCal();
       ilobj.storee(alobj);
    }       
   }
}
 




