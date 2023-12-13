package lesson_16_11_12_2023.hometask_myphone;

public class Cases {

    private int number;
    private String colors;

    private String materials;


    public Cases(int number, String colors, String materials) {
        this.number = number;
        this.colors = colors;
        this.materials = materials;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Cases{" +
                "colors='" + colors + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }
}
