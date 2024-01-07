package example.interfaces.musicans;

public class PopMusicans implements Musicans{

    @Override
    public void dance() {
        System.out.println("Pop dance");
    }

    @Override
    public void greatings() {
        System.out.println("Hiiiiii!");
    }

    @Override
    public void sing() {
        System.out.println("Pop sing");
    }
}
