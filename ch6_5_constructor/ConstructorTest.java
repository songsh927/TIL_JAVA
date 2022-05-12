package ch6_5_constructor;

class Data1{
    int value;
}

class Data2{
    int value;
    Data2(int x){
        value = x;
    }
    Data2(){
        value = 10;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(); //Data2 클래스에 매개변수가 없는 생성자를 생성해줘야함 아니면 에러!

        System.out.println(d2.value);
    }
}
