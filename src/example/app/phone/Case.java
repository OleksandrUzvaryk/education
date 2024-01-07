package example.app.phone;

public class Case {

    private  int number;

    private  String color;
    private String material;

    public Case(int number, String color, String material) {
        this.number = number;
        this.color = color;
        this.material = material;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Case{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
