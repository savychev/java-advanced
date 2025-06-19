package queue;

public class BurgerOrder implements Comparable<BurgerOrder>{
    private String name;
    private int num;

    public BurgerOrder(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int compareTo(BurgerOrder o) {
        return this.getNum() - o.getNum();
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
