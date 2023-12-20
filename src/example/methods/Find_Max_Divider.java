package example.methods;

public class Find_Max_Divider {

    public int getDraw(int balance){
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {
                return i;}
        }
        return 1;
    }




}
