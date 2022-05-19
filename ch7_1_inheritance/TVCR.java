package ch7_1_inheritance;

class Tv1{
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}

class VCR{
    boolean power;
    int counter = 0;

    void power() { power = !power; }
    void play() {
        System.out.println("vcr play");
    }
    void stop() {
        System.out.println("vcr stop");
    }
    void rew() {
        System.out.println("vcr rew");
    }
    void ff() {
        System.out.println("vcr ff");
    }
}

public class TVCR extends Tv1 {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play(){
        vcr.play();
    }

    void stop(){
        vcr.stop();
    }

    void rew(){
        vcr.rew();
    }

    void ff(){
        vcr.ff();
    }
}
