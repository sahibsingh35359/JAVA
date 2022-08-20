package com.company;

    class abc {
      public void add(int x, int y) {
            int g;
            g = x + y;
            System.out.println("The Value is " + g);
        }

        public static void main(String[] args) {
            abc sahib = new abc();
            xyz saran = new xyz();
            str sunny = new str();

            sahib.add(25, 25);
            int result = saran.subtract(25, 24);
            System.out.println("The value is :" + result);
            sunny.multiply();
        }
    }

    class xyz {
        public int subtract(int x, int y) {
            int k;
            k = x - y;
            return (k);
        }

    }
    class str{
         public void multiply(){
            int a = 5;
            int b = 6;
            int c = a*b;
            System.out.println("The value is :" +c);
        }
    }



