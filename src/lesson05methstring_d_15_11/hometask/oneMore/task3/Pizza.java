package lesson05methstring_d_15_11.hometask.oneMore.task3;

public class Pizza {

    public double calloriesCalculate (double smallDiametr, double bigDiametr, double energy){

        double sumCallories1 = Math.PI * (smallDiametr/2) * (smallDiametr/2) * energy;
        double sumCallories2 = Math.PI * (bigDiametr/2) * (bigDiametr/2) * energy;
        double diferenceCallories =  (sumCallories2 - sumCallories1) ;
        return diferenceCallories;
    }

}
