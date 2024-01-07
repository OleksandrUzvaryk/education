package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.repository;

public interface UserRepository {

    public void add(UserEntity entity);

    public void changeUserName(int userId, String newUserName);

    public UserEntity[] getDatabase();
}
