package com.company;

class student {
    int id;
    int salary;
    String name;


    public void details() {
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My salary is : " + salary);
    }

//    public int getsalary(){
//            return salary;
//    }
}
// main class
public  class custom_class {
    public static void main(String[] args) {
        System.out.println("Hello Everyone");


       //custom class
             student sahib = new student(); // Instantiating a new employee object
        student mehak = new student(); // Instantiating a new employee object
        // setting Properties
            sahib.id = 54;
            sahib.name= "Mehakpreet";
            sahib.salary = 50000;

            mehak.id= 64;
            mehak.name = "sahibsingh";
            mehak.salary = 900000;

        sahib.details();
        mehak.details();

        //int salary = mehak.getsalary();
        //System.out.println(salary);
//        System.out.println(sahib.id);
//        System.out.println(sahib.name);


        }
    }

