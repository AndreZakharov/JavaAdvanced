package module2.task03.second.sweets;

public class Jellybean extends Sweets {

    private String taste;
    public Jellybean(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }
    public Jellybean(){

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", taste = " + taste;
    }
}
