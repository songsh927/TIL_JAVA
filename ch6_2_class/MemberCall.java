package ch6_2_class;

public class MemberCall {

    int iv = 10;         //인스턴스 변수
    static int cv = 20;  //클래스 변수

    int iv2 = cv;                           //인스턴스변수는 클래스변수를 사용할 수 있음
    //static int cv2 = iv;                  //에러! 클래스변수는 인스턴스 변수를 사용할 수 없음
    static int cv2 = new MemberCall().iv;   //객체를 생성해야 사용가능

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv);           //에러! 클래서메서드에서 인스턴스변수는 사용불가능
        MemberCall c = new MemberCall();
        System.out.println(c.iv);           //객체를 생성후 인스턴스변수 참조가능
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);             //인스턴스 메소드에서는 인스턴스변수를 바로 사용가능
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1();                //에러! 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
        MemberCall c = new MemberCall();
        c.instanceMethod1();                //인스턴스를 생성한 후에 호출할 수 있음
    }

    void instanceMethod2(){                 //인스턴스메서드에서는 인스턴스메서드, 클래스메서드 모두 인스턴스 생성없이 호출가능
        staticMethod1();
        instanceMethod1();
    }

}
