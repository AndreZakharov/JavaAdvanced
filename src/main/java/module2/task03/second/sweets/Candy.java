package module2.task03.second.sweets;

public class Candy extends Sweets{
    private String size;
    public Candy(String name, double weight, double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public Candy() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", size = " + size;
    }
}
