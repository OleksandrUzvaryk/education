package lesson_14_tool_shop_d_06_12.my_gift_store;

public class Gift {

    private int id;
    private String name;
    private int price;
    private boolean isSpecial;

    public Gift(int id, String name, int price, boolean isSpecial) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isSpecial = isSpecial;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isSpecial=" + isSpecial +
                '}';
    }
}
