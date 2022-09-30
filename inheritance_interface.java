interface sample{
    void meth1();
    void meth2();
}
interface childSample extends sample{
    void meth3();
    void meth4();
}
class MySampleClass implements childSample{
    @Override
    public void meth1() {
        System.out.println("meth1 Saran");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 Paras");
    }

    @Override
    public void meth3(){
    System.out.println("meth3 Karan");
}

    @Override
    public void meth4() {
        System.out.println("meth4 Shamppy");
    }
}
public class inheritance_interface {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();

    }
}
