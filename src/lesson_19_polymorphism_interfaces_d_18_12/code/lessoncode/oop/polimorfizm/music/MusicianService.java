package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.music;

public class MusicianService {

    public void singAll(Singer[] musicians){
        for (int i = 0; i < musicians.length; i++) {
            musicians[i].sing();
        }
    }

    public void danceAll(Dancer[] musicians){
        for (int i = 0; i < musicians.length; i++) {
            musicians[i].dance();
        }
    }


}
