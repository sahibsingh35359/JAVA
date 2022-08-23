package com.company;
class mymainemployee{
    private int id;
    private String name;

    public mymainemployee(){
    id =545;
    name = "HELLO EVERYONE";
    }
    public mymainemployee(String myname,int myid){
        id = myid;
        name = myname;
    }


    public String getname(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
}
public class constructors {
    public static void main(String[] args) {
   // mymainemployee sahib = new mymainemployee("GO TO HELL",566);
    mymainemployee sahib = new mymainemployee();
//    sahib.setId(595);
//    sahib.setName("Welcome to all");
        System.out.println(sahib.getId());
        System.out.println(sahib.getname());
    }
}
