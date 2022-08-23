package com.company;
class myemploee{
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }

}
public class modifiers {
    public static void main(String[] args) {
    myemploee sahib = new myemploee();
    sahib.setName("Mehakpreet");
        System.out.println(sahib.getname());
sahib.setId(545);
        System.out.println(sahib.getId());
    }
}
