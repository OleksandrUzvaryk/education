package lesson_16_11_d_12_2023_phone.code.lessoncode.phone2version.phone;

public class PhoneCase {

    private String color;

    private String material;

    public PhoneCase(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public String toString() {
        return "Case{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
