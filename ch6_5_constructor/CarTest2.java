package ch6_5_constructor;

class Car2{
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", "auto", 4);
    }

    Car2(Car2 c){   //인스턴스 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(c1); //c1의 복사본 c2를 생성
        System.out.println("c1의 color = " + c1.color + "  gearType = " + c1.gearType + "  door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + "  gearType = " + c2.gearType + "  door = " + c2.door);

        c1.door = 100;
        System.out.println("c1의 color = " + c1.color + "  gearType = " + c1.gearType + "  door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + "  gearType = " + c2.gearType + "  door = " + c2.door);
        //서로 메모리의 다른영역에 생성되었기때문에 영향을 주지 않는다!

    }
}
