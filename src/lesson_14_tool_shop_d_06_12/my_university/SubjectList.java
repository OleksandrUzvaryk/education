package lesson_14_tool_shop_d_06_12.my_university;

public class SubjectList {


    Subject [] subjects ;


    public SubjectList (){
       subjects = new Subject[9];
       subjects[0] = new Subject("Mathematic", 350,"Bild", 35.76);
       subjects[1] = new Subject("Chemistry", 200,"Berg", 64.19);
       subjects[2] = new Subject("Physics", 450,"Kronberg", 16.0);
       subjects[3] = new Subject("Socialalogy", 190,"Iceman", 13.15);
       subjects[4] = new Subject("Biology", 240,"Fols", 76);
       subjects[5] = new Subject("Psychology", 312,"Certz", 9.75);
       subjects[6] = new Subject("Politic", 150,"Aisenhour", 78.56);
       subjects[7] = new Subject("Economic", 350,"Sewr", 41.74);
       subjects[8] = new Subject("Finance", 350,"Draiser", 35.76);

    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
