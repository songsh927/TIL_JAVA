package ch7_4_modifier;

final class Singleton{
    private static Singleton s = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(s==null)
            s = new Singleton();
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); => 에러!
        Singleton s = Singleton.getInstance();
    }
}
/*
객체 생성의 제한을 두어 인스턴스의 개수를 제한할 수 있다.
생성자가 private인 클래스는 다른 클래스의 조상 클래스가 될 수 없다.
자손 클래스의 인스턴스를 생성할 때 조상클래스의 생성자를 호출해야만 하는데,
생성자의 접근제어자가 private이므로 자손클래스에서 호출하는 것이 불가능하기 때문이다.
 */