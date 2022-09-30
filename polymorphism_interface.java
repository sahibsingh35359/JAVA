interface MyCamera2{

    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("You are moron");
    }

    default  void recordng4kvideo(){
        greet();
        System.out.println("Recording in 4k..");
    }
}

interface MyWifi1 {

    String[] getNetwork();

    void ConnectToNetwork(String network);
}

class cellphone1{

    public void callNumber(int phonenumber) {
        System.out.println("calling..." + phonenumber);
    }

    public void pickCall() {
        System.out.println("connecting...");
    }
}
class Smart2 extends cellphone implements MyWifi1,MyCamera2 {
    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networklist = {"sahib", "shamppy", "Saran"};
        return networklist;
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

}

public class polymorphism_interface {
    public static void main(String[] args) {

     MyCamera2 cam1 = new Smart2(); // this is a camera ,use it as a smartphone because this object has condition
    // cam1.recordng4kvideo();

Smart2 s = new Smart2(); // this is allowed and has access to all the functions to
s.ConnectToNetwork("Saran");
s.getNetwork();
s.callNumber(78787);
s.pickCall();
String[] sahib1 = s.getNetwork();

    }
}
