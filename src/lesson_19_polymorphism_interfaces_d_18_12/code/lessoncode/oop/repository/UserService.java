package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.repository;

public class UserService {
    /*
    нам надо написать сервис, который будет работать с репозиторием и добавлять элементы в массив
     */

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createDatabase(){
        repository.add(new UserEntity(1,"Ruslan", "Bogomolov","123456789"));
    }
}
