package lesson_14_tool_shop_06_12.my_university;

import java.util.Arrays;

public class Specialization {

    NessesaryKnowledge [] specialization = new NessesaryKnowledge[3];


    public Specialization(NessesaryKnowledge nessesaryKnowledge1, NessesaryKnowledge nessesaryKnowledge2, NessesaryKnowledge nessesaryKnowledge3) {
       specialization[0] = nessesaryKnowledge1;
       specialization[1] = nessesaryKnowledge1;
       specialization[2] = nessesaryKnowledge1;
    }

    public NessesaryKnowledge[] getSpecialization() {
        return specialization;
    }

    public void setSpecialization(NessesaryKnowledge[] specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "specialization=" + Arrays.toString(specialization) +
                '}';
    }
}
