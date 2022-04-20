package ch6_2_class;

class MyMath{
    long add(long x, long y){
        return x + y;
    }

    long subtract(long x, long y){
        return x - y;
    }

    long multiply(long x, long y){
        return x*y;
    }

    double divide(double x, double y){
        return x/y;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long resultAdd = mm.add(3L,4L);
        long resultSub = mm.subtract(3L,4L);
        long resultMul = mm.multiply(3L, 4L);
        double resultDiv = mm.divide(6L,4L);

        System.out.println("resultAdd 3L 4L = " + resultAdd);
        System.out.println("resultSub 3L 4L = " + resultSub);
        System.out.println("resultMul 3L 4L = " + resultMul);
        System.out.println("resultDiv 6L 4L = " + resultDiv);
    }
}
