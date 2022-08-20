package com.company;

class employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
    name = n;
    }
}
public class class_multiple_properties_and_methods {
    public static void main(String[] args) {
     employee sahib = new employee();
     sahib.setname("Mehakpreeet");
     System.out.println(sahib.getname());
     sahib.salary = 50000;
     System.out.println(sahib.getsalary());


    }
}
