package lesson_13_structure_app_04_12.garbage.Hometask_Storage;

import java.util.Arrays;

public class SetTools {
    String[] tools = new String[2];



   public SetTools (String [] tools){
        this.tools = tools;
    }

  public String[] getTools(String equipment1, String equipment2) {
        return tools;
    }

    @Override
    public String toString() {
        return "SetTools{" +
                "tools=" + Arrays.toString(tools) +
                '}';
    }
}
