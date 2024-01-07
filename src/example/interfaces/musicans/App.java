package example.interfaces.musicans;

public class App {
    public static void main(String[] args) {

        Service serv = new Service();


        Dancer []dancers = {new RockMusicans(), new PopMusicans(),
                new RockMusicans(), new PopMusicans(),new RockMusicans(), new PopMusicans()};
        //serv.danceAll(dancers);
        Singer [] singers = {new RockMusicans(), new PopMusicans(),
                new RockMusicans(), new PopMusicans(),new RockMusicans(), new PopMusicans()};
       //serv.singAll(singers);
        Musicans [] musicans = {new RockMusicans(), new PopMusicans(),
                new RockMusicans(), new PopMusicans(),new RockMusicans(), new PopMusicans()};
       /* serv.greatingsAll(musicans);
        serv.danceAll(musicans);
        serv.singAll(musicans);*/

        OperaSinger opera = new OperaSinger();
        opera.sing();

        DiscoDancer disco = new DiscoDancer();
        disco.dance();

    }
}
