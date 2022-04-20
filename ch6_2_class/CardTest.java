package ch6_2_class;

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1.kind = " + c1.kind + " c1.number = " + c1.number + " width = " + c1.width + " height " + c1.height);
        System.out.println("c2.kind = " + c2.kind + " c2.number = " + c2.number + " width = " + c2.width + " height " + c2.height);

    }
}
