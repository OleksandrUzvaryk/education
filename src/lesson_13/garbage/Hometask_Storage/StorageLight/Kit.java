package lesson_13.garbage.Hometask_Storage.StorageLight;

public class Kit {

    String tools1;
    String tools2;

    public Kit (String tools1, String tools2){
        this.tools1 = tools1;
        this.tools2 = tools2;
    }

    public String getTools1() {
        return tools1;
    }

    public String getTools2() {
        return tools2;
    }

    @Override
    public String toString() {
        return "Kit{" +
                "tools1='" + tools1 + '\'' +
                ", tools2='" + tools2 + '\'' +
                '}';
    }
}
