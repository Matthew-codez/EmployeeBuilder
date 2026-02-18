package org.example;

//make a builder for the employee class then do the employee factory

    public class Employee {
        private String empNumber;
        private String empName;
        private String empSurname;
        private String Address;
        private String job;
        private String email;

        public String getEmpNumber() {
            return empNumber;
        }
        public String getEmpName(){
            return empName;
        }
        public String getEmpSurname(){
            return empSurname;
        }

        public void setEmpNumber(String empNumber) {
            this.empNumber = empNumber;
        }
        public void setEmpName(String empName){
            this.empName = empName;
        }
        public void setEmpSurname(String empSurname){
            this.empSurname = empSurname;
        }

        @Override
        public String toString() {
            return "Employee"
                    + "\nID: " + empNumber
                    + "\nName: " + empName
                    + "\nSurname: " + empSurname;
        }
    }

