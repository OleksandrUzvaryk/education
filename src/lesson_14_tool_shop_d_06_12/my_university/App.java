package lesson_14_tool_shop_d_06_12.my_university;

public class App {

    public static void main(String[] args) {

        SubjectList list = new SubjectList();

        NessesaryKnowledge nessesaryKnowledge1 = new NessesaryKnowledge(list.getSubjects()[0],list.getSubjects()[1],list.getSubjects()[2]);
        NessesaryKnowledge nessesaryKnowledge2 = new NessesaryKnowledge(list.getSubjects()[3],list.getSubjects()[4],list.getSubjects()[5]);
        NessesaryKnowledge nessesaryKnowledge3 = new NessesaryKnowledge(list.getSubjects()[6], list.getSubjects()[7],list.getSubjects()[8]);

        Specialization specialization = new Specialization(nessesaryKnowledge1, nessesaryKnowledge2, nessesaryKnowledge3);

        System.out.println(specialization);

        for (int i = 0; i < specialization.getSpecialization().length ; i++) {
            System.out.println("Specialization : " + i );

            NessesaryKnowledge mySubject = specialization.getSpecialization()[i];
            Subject subjectFromSpec1 = mySubject.getNessaryKnowledge()[0];
            Subject subjectFromSpec2 = mySubject.getNessaryKnowledge()[1];
            Subject subjectFromSpec3 = mySubject.getNessaryKnowledge()[2];

            System.out.println("First subject our specialisation :" );
            System.out.println("Name of subject " + subjectFromSpec1.getNameSubject());
            System.out.println("Amount of hour " + subjectFromSpec1.getAmountOfHour());
            System.out.println("Second name of Teacher - " + subjectFromSpec1.getSecondNameTeacher());
            System.out.println("Price of books  - " + subjectFromSpec1.getCostOfBooks());

            System.out.println("Second subject our specialisation :" );
            System.out.println("Name of subject " + subjectFromSpec2.getNameSubject());
            System.out.println("Amount of hour " + subjectFromSpec2.getAmountOfHour());
            System.out.println("Second name of Teacher - " + subjectFromSpec2.getSecondNameTeacher());
            System.out.println("Price of books  - " + subjectFromSpec2.getCostOfBooks());


            System.out.println("Third subject our specialisation :" );
            System.out.println("Name of subject " + subjectFromSpec3.getNameSubject());
            System.out.println("Amount of hour " + subjectFromSpec3.getAmountOfHour());
            System.out.println("Second name of Teacher - " + subjectFromSpec3.getSecondNameTeacher());
            System.out.println("Price of books  - " + subjectFromSpec3.getCostOfBooks());



        }



    }






}
