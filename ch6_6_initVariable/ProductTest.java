package ch6_6_initVariable;

class Product{
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product(){};  //기본 생성자 생략가능!
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 시리얼넘버는 " + p1.serialNo);
        System.out.println("p2의 시리얼넘버는 " + p2.serialNo);
        System.out.println("p3의 시리얼넘버는 " + p3.serialNo);
    }
}
