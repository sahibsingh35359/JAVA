package com.company;

    class abc {
        void add(int x, int y) {
            int g;
            g = x + y;
            System.out.println("The Value is " + g);
        }

        public static void main(String[] args) {
            abc sahib = new abc();
            xyz tear = new xyz();
            str sunny = new str();

            sahib.add(25, 25);
            int result = tear.subtract(25, 24);
            System.out.println("The value is :" + result);
            sunny.multiply();
        }
    }

    class xyz {
        int subtract(int x, int y) {
            int k;
            k = x - y;
            return (k);
        }

    }
    class str{
        void multiply(){
            int a = 5;
            int b = 6;
            int c = a*b;
            System.out.println("The value is :" +c);
        }
    }



