package example.interfaces.musicans;

public class Service {

    public void danceAll(Dancer[]dancers){
        for (int i = 0; i < dancers.length ; i++) {
            dancers[i].dance();
        }
    }

    public void singAll(Singer[]singers) {
        for (int i = 0; i < singers.length; i++) {
            singers[i].sing();
        }
    }

    public void greatingsAll(Musicans[]musicans) {
        for (int i = 0; i < musicans.length; i++) {
            musicans[i].greatings();
        }
    }




}
