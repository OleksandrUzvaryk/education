package lesson_12_structure_app_d_01_12.code.lessoncode.students.onemore;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Address address;
    private Date birthday;

    public Person(int id, String name, Address address, Date birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
