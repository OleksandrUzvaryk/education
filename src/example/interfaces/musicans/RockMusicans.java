package example.interfaces.musicans;

public class RockMusicans implements Musicans {

    @Override
    public void greatings() {
        System.out.println("Woooooooo!!!");
    }

    @Override
    public void dance() {
        System.out.println("Rock dance");
    }

    @Override
    public void sing() {
        System.out.println("Rock sing");
    }
}
