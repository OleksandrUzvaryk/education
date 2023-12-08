package lesson_13.garbage.Hometask_Storage.storage;

public class App {
    public static void main(String[] args) {

        Equipment [] equipment = new Equipment[3];
        Kit [] kit = new Kit[2];

        for (int i = 0; i < equipment.length; i++) {
            equipment[i] = new Equipment("Saw" + i, "Hammer" + i);
        }
        for (int i = 0; i <kit.length; i++) {
            kit[i] = new Kit("Kit number " + i, equipment[i]);
            System.out.println(kit[i]);
        }



    }
}
