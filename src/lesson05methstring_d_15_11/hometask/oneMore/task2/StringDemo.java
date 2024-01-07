package lesson05methstring_d_15_11.hometask.oneMore.task2;

public class StringDemo {
    public static void main(String[] args) {

        StringService stringService = new StringService();
        String firstWord = stringService.userInput("Put the word 1");
        String secondtWord = stringService.userInput("Put the word 2");

        int lengthWord1 = firstWord.length()/2;
        String firstPart = firstWord.substring(0, lengthWord1);

        int lengthWord2 = secondtWord.length()/2 + secondtWord.length()%2;
        String secondPart = secondtWord.substring(lengthWord2);

        String finalWord = firstPart + secondPart;
        System.out.println(finalWord);


    }

}
