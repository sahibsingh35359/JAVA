  abstract class base1{   // this is abstract class    // object of abstract class is not created
        public base1(){
            System.out.println("HEy!! Iam a constructor of class base1");
        }
        public  void say(){
            System.out.println("Hello");
        }
        abstract public void greet();
        abstract public void greet2();
    }

    class child2 extends base1{ // this is concrete class // object of only concrete class is created

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

        @Override
        public void greet2() {
            System.out.println("Good Afternoon");
        }
    }
   abstract class child3 extends base1{   // we can inherit abstract class from the abstract parent class
    public void th(){
    System.out.println("HELLO EVERYONE");
   }
}


    public class Abstract_class {
        public static void main(String[] args) {

        }
    }
