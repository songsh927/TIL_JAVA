package ch6_2_class;

class Tv{
    // TV의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;
    
    // TV의 기능 (메서드)
    void power(){ power = !power;}      //TV를 켜거나 끄는 기능을 하는 메서드
    void channelUp(){ ++channel; }      //TV의 채널을 높이는 기능을 하는 메서드
    void channelDown(){ --channel; }    //TV의 채널을 낮추는 기능을 하는 메서드
}

public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("t.channel = " + t.channel);
    }
}
