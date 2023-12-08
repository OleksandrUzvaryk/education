package lesson_13.garbage.Hometask_Storage.storage;

public class Kit {

    public  String nameOfKit;
    public  Equipment equipment;


    public Kit(String nameOfKit, Equipment equipment) {
        this.nameOfKit = nameOfKit;
        this.equipment = equipment;
    }

    public String getNameOfKit() {
        return nameOfKit;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setNameOfKit(String nameOfKit) {
        this.nameOfKit = nameOfKit;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Kit{" +
                "nameOfKit='" + nameOfKit + '\'' +
                ", equipment=" + equipment +
                '}';
    }
}
