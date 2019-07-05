
    
package com.ser;


import junit.framework.TestCase;


public class Junit extends TestCase{
    ServiceInterface a1=null;
     public void setUp() throws Exception{
         super.setUp();
         a1=new InterestCal();
     }
    public void tearDown() throws Exception{
        super.tearDown();
        a1=null;
    } 
       public void testScheme1() {
           String x=a1.checkIt(10000);
           assertEquals("schemeA",x);
       }
       
       public void testScheme2() {
           String x=a1.checkIt(50000);
               
           assertEquals("schemeB",x);
       }
       public void testScheme3() {
           String x=a1.checkIt(100000);
               
           assertEquals("schemeC",x);
       }
}
 




