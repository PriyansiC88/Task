public  class Q4 {
    public static void main(String[] args) {
        //a 
        int a = -5;
        int b = 8;
        int c = 6;
        int d = a+b*c;
        System.out.println("the output of -5 + 8 *6 is :" + d);

        //b 
        int e = 55;
        int f = 9;

        int g = (e+f)%f;
        System.out.println("the output of (55+9)%9 is: " + g);

        //c 
        int h = 20;
        int i = -3;
        int j = 5;
        int k = 8;
        
        int l = h + i*j/k;
        System.out.println("the output is : " + l);

        //d 
        int m = 5 + 15/3*2-8%3;
        System.out.println("the output is : " + m);
    }
}