package lesson_14_tool_shop_06_12.my_tool_shop;

public class Instrument {

    int nomerInstrument;
    String nameInstrument;
    String opisanieInstrument;
    double cenaInstrument;

    public Instrument(int nomerInstrument, String nameInstrument, String opisanieInstrument, double cenaInstrument) {
        this.nomerInstrument = nomerInstrument;
        this.nameInstrument = nameInstrument;
        this.opisanieInstrument = opisanieInstrument;
        this.cenaInstrument = cenaInstrument;
    }

    public int getNomerInstrument() {
        return nomerInstrument;
    }

    public String getNameInstrument() {
        return nameInstrument;
    }

    public String getOpisanieInstrument() {
        return opisanieInstrument;
    }

    public double getCenaInstrument() {
        return cenaInstrument;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "nomerInstrument=" + nomerInstrument +
                ", nameInstrument='" + nameInstrument + '\'' +
                ", opisanieInstrument='" + opisanieInstrument + '\'' +
                ", cenaInstrument=" + cenaInstrument +
                '}';
    }
}
