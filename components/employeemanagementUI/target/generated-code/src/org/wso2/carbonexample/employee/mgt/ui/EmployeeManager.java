

/**
 * EmployeeManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : May 09, 2014 (09:53:11 IST)
 */

    package org.wso2.carbonexample.employee.mgt.ui;

    /*
     *  EmployeeManager java interface
     */

    public interface EmployeeManager {
          

        /**
          * Auto generated method signature
          * 
                    * @param getEmployee0
                
         */

         
                     public org.wso2.carbonexample.employee.mgt.data.xsd.EmployeeRef[] getEmployee(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getEmployee0
            
          */
        public void startgetEmployee(

            

            final org.wso2.carbonexample.employee.mgt.ui.EmployeeManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbonexample.employee.mgt.ui.EmployeeManagerEmployeeExceptionException : 
         */
        public void  deleteEmployee(
         java.lang.String nicNumber4

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbonexample.employee.mgt.ui.EmployeeManagerEmployeeExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbonexample.employee.mgt.ui.EmployeeManagerEmployeeExceptionException : 
         */
        public void  addEmployee(
         org.wso2.carbonexample.employee.mgt.data.xsd.EmployeeRef employee6

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbonexample.employee.mgt.ui.EmployeeManagerEmployeeExceptionException;

        

        
       //
       }
    