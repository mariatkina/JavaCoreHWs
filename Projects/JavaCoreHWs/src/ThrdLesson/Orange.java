package ThrdLesson;

public class Orange extends Fruit{

    private int amount;

    public Orange(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public Orange(String name, float weight) {
        super(name, weight);

    }

    public int getAmount() {
        return amount;
    }
}
