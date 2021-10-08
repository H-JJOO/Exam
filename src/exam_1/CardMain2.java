package exam_1;

public class CardMain2 {
    public static void main(String[] args) {
        Card[] cards = new Card[52];

        String[] shape = new String[]{"spade", "heart", "diamond", "clover"};

        int idx = 0;

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
                cards[idx++] = c;
            }

            for (Card c : cards) {
                System.out.println(c);
            }

//            for (int i = 0; i < cards.length; i++) {
//                Card c = cards[i];
//                System.out.println(c);
//            }

        }
    }
}
