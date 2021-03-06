public class Counter {
    private int value;
    private int initValue;

    public Counter() {
        value = 0;
        initValue = 0;
    }

    public Counter(int value) {
        this.value = value;
        initValue = value;
    }

    public void add(int number) {
        value += number;
    }

    public void add() {
        value++;
    }

    public int get() {
        return value;
    }

    public void reset() {
        value = initValue;
    }

}