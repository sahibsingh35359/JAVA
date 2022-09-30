class base{
    public void display(){
        System.out.println("This is Super class");
    }
}
class derived extends base{
    public void display(){
        System.out.println("This is derived class");
    }
}
class child extends base{
    public void display(){
        System.out.println("This is child class");
    }
}
class dynamic_dispatch{
    public static void main(String[] args) {
        base b = new base();  // this is the main object
        b.display();
        derived d = new derived();
        d.display();
        child c = new child();
        c.display();

        System.out.println();
        System.out.println("THIS IS REFERENCED OBJECT");
        System.out.println();


        base m;  // this is referenced object
        m = b;  // giving reference
        m.display();
        m = d;
        m.display();
        m = c;
        m.display();
    }
}