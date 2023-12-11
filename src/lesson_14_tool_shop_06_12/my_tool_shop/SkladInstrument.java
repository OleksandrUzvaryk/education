package lesson_14_tool_shop_06_12.my_tool_shop;

public class SkladInstrument {

    Instrument [] instruments;

    public SkladInstrument() {
        instruments = new Instrument[6];
        instruments[0] = new Instrument(1,"Drell", "dly sten", 175);
        instruments[1] = new Instrument(2, "Lampa", "rrrr", 89);
        instruments[2] = new Instrument(3, "Rampa", "dddddd", 12);
        instruments[3] = new Instrument(4, "Zampa", "fffff", 23);
        instruments[4] = new Instrument(5, "Tampa", "nnnnn", 25);
        instruments[5] = new Instrument(6, "Vampa", "mmmmm", 99);
    }

    public Instrument[] getInstruments() {
        return instruments;
    }

    public void setInstruments(Instrument[] instruments) {
        this.instruments = instruments;
    }
}
