package ch6_2_class;

class MyMath2{
    long a,b;

    //인스턴스 변수 a,b 만 사용해서 작업하므로 매개변수가 필요없다.
    //a,b는 인스턴스 변수
    long add(){return a+b;}
    long subtract(){return a-b;}
    long multiply(){return a*b;}
    double divide(){return a/b;}

    //인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    //a,b는 지역변수
    static long add(long a, long b){ return a+b;}
    static long subtract(long a, long b){return a-b;}
    static long multiply(long a, long b){return a*b;}
    static double divide(double a, double b){ return a/b;}
}

public class MyMathTest2 {
    public static void main(String[] args) {
        //클래스매서드 호출 - 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(2L,3L));
        System.out.println(MyMath2.subtract(2L,3L));
        System.out.println(MyMath2.multiply(2L,3L));
        System.out.println(MyMath2.divide(3L,2L));
        System.out.println();

        MyMath2 mm = new MyMath2(); //인스턴스를 생성
        mm.a = 3L;
        mm.b = 2L;
        // 인스턴스매서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    }
}


