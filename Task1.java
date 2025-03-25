import java.lang.*;


public class Task1 {

    public static void main(String []args ){
        System.out.println("        Integer to Byte");
        byte a = 65;
        int b = 122;
        a = (byte) b;

        System.out.println(a);
        System.out.println("         Byte to Integer");
        byte c = 127;
        int d = c;
        System.out.println(d);

        System.out.println("        Char to Integer");
        char e = 'A';
        int f = 10;

        f =  e;
        System.out.println(f);

        System.out.println("         Integer to char");
        int g = 66;
        char h = 'b';
        h = (char) g;
        System.out.println(h);

        System.out.println("         Short to long  ");
        
        long i =10000l;
        short j= 123;
        j = (short)i;
        System.out.println(j);

        System.out.println("        Long to short");

        short k =1234;
        long l =111111l;
        l =k;
        System.out.println(k);

        System.out.println("        Float to Integer");

        float m = 1.12f;
        int n = 10;

        n = (int)m;
        System.out.println(n);

        System.out.println( "       Integer to Float");

        int o = 10;
        float p;
        p = o;
        System.out.println(p);

        System.out.println("        Double to Integer ");

        double q = 21.1;
        int    r = (int)q;
        System.out.println(r); 

        System.out.println("        Integer to double ");

        int s = 11;
        double t = s;
        System.out.println(t);

       
        
        

    }
}