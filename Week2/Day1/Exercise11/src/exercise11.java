public class exercise11 {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;
        System.out.println(a);

        int b = 100;
        b = b - 7;
        System.out.println(b);

        int c = 44;
        c = c * 2;
        System.out.println(c);

        int d = 125;
        d = d / 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int g1 = 350;
        int g2 = 200;
        if (2*g2 > g1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int h = 135798745;
        if (h % 11 ==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int i1 = 10;
        int i2 = 3;
        if (i1>i2*i2 & i2*i2*i2>i1){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int j = 1521;
        if (j % 3 == 0 || j % 5 ==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        String k = "Apple";
        k = k+k+k+k;
        System.out.println(k);


    }
}
