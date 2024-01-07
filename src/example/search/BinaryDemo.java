package example.search;

public class BinaryDemo {
    public static void main(String[] args) {


        int [] array = {25,197,457,698,789,845,999};

        int searchNumber = -60558598;
        BinarySearch service = new BinarySearch();
        int result = service.binarySearch(array,searchNumber);
        System.out.println("Result of work methods is  " + result);
    }
}
