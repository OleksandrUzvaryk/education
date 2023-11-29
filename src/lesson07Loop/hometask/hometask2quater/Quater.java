package lesson07Loop.hometask.hometask2quater;

public class Quater {

    public void findQuater (int x, int y){

        if ((x < 11) && (x > 0 ) && (y < 11) && (y > 0)){System.out.println("Ось х + у+");}
        else if ((x < 11) && (x > 0 ) && (y > -11) && (y < 0)) {System.out.println("Ось х + у-");}
        else if ((x > -11) && (x < 0 ) && (y > -11) && (y < 0)){System.out.println("Ось х- у-");}
        else if ((x > -11) && (x < 0 ) && (y < 11) && (y > 0)){System.out.println("Ось х- у+");}
        else if ((x > -11) && (x < 11) && (y == 0)){System.out.println("Ось X");}
        else if ((y > -11) && (y < 11) && (x == 0)){System.out.println("Ось Y");}
        else {System.out.println("Центр");}


    }}