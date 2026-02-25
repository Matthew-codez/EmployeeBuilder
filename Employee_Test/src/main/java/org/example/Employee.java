package org.example;

//make a builder for the employee class then do the employee factory

    public class Employee {
        private String empNumber;
        private String empName;
        private String empSurname;
        private String address;
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
        public String getAddress(){
            return address;
        }


        private Employee (Builder builder) {

        }

        public static class Builder {
            private String empNumber;
            private String empName;
            private String empSurname;
            private String address;
            private String job;
            private String email;

            public void setEmpNumber(String empNumber) {
                this.empNumber = empNumber;
            }
            public void setEmpName(String empName){
                this.empName = empName;
            }
            public void setEmpSurname(String empSurname){
                this.empSurname = empSurname;
            }
            public Builder copy(Employee employee){
                this.empNumber = empNumber;
                this.empName = empName;
                this.empSurname = empSurname;
                this.address = address;
                this.job = job;
                this.email = email;
                return this;
            }
            public Employee build(){
                return new Employee(this);
            }
        }


    }

