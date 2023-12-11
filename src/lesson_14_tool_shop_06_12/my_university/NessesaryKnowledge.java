package lesson_14_tool_shop_06_12.my_university;

import java.util.Arrays;

public class NessesaryKnowledge {

    Subject [] nessaryKnowledge = new Subject[3];

    public NessesaryKnowledge (Subject subject1, Subject subject2, Subject subject3){
        nessaryKnowledge [0] = subject1;
        nessaryKnowledge [1] = subject2;
        nessaryKnowledge [2] = subject3;
    }

    public Subject[] getNessaryKnowledge() {
        return nessaryKnowledge;
    }

    @Override
    public String toString() {
        return "NessesaryKnowledge{" +
                "nessaryKnowledge=" + Arrays.toString(nessaryKnowledge) +
                '}';
    }
}
