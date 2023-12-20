package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    abstract double calculatorArea ();

    abstract double calculatorPerimetr ();

    @Override
    public String toString() {
        return "Shape{" +
                "title='" + title + '\'' +
                '}';
    }
}

