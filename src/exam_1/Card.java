package exam_1;

public class Card {
    private String shape;
    private String value;

    public Card(String shape, String value) {
        this.shape = shape;
        this.value = value;
    }

    public String getShape() {
        return shape;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.shape, this.value);
    }
}
