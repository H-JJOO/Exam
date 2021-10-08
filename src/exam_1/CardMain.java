package exam_1;

public class CardMain {
    public static void main(String[] args) {
        String[] shape = new String[]{"spade", "heart", "diamond", "clover"};
        int t = 0;

        Card c1 = new Card("spade", "K");
        System.out.println(c1);
        Card c2 = new Card("heart", "2");
        System.out.println(c2);

        String[] cards = new String[t];

        for (int i = 0; i < shape.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String value = null;
                switch (z) {
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = "J";
                        break;
                    case 12:
                        value = "Q";
                        break;
                    case 13:
                        value = "K";
                        break;
                    default:
                        value = String.valueOf(z);
                }
                Card c = new Card(shape[i], value);


            }
        }
    }
}
