package example.interfaces.musicans;

public class OperaSinger implements Singer{
    @Override
    public void sing() {
        System.out.println("Opera!");
    }
}
