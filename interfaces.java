 interface bicycle{
     int a = 45;  // In interfaces properties are already final
    void applybrake(int decrement);
    void speedup(int increment);
 }

 interface BlowHorn{

     void blowhorn3kg();
     void blowhorn4kg();
 }
 class AvonCycle implements bicycle,BlowHorn{
     @Override
     public void applybrake(int decrement) {
         System.out.println("APPLYING BRAKE");
     }

     @Override
     public void speedup(int increment) {
         System.out.println("APPLYING SPEED UP");
     }

     @Override
     public void blowhorn3kg() {
         System.out.println("HELLO BNB");
     }

     @Override
     public void blowhorn4kg() {
         System.out.println("HEEE HEEE HEEE");
     }
 }
public class interfaces {
    public static void main(String[] args) {
        AvonCycle aa = new AvonCycle();
            aa.applybrake(9);// you can create properties in interface
            aa.speedup(5);


            System.out.println(aa.a);
        // aa.a = 54; // this is illegal // you cannot modify properties in interface because they are final
            aa.blowhorn3kg();
            aa.blowhorn4kg();
    }
}
