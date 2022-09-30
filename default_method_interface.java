 interface mycamera{

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
 interface MyWifi{

    String[] getNetwork();
    void ConnectToNetwork(String network);
 }
 class cellphone {

     void callNumber(int phonenumber) {
         System.out.println("calling..." + phonenumber);
     }

     void pickCall() {
         System.out.println("connecting...");
     }
 }

class SmartPhone extends cellphone implements MyWifi,mycamera {
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

public class default_method_interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.recordng4kvideo();

        String[] sahib = sp.getNetwork();

        for( String item:sahib){
            System.out.println(item);
        }
    }
}
