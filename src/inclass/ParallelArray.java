package inclass;

public class ParallelArray {
    static int[] lockerNumbers = {1,2,3,4,5};
    static String[] lockerOwners = {"c", "d", "a", "e", "b"};

    public static void main(String[] args) {
        for(int i = 0; i < lockerNumbers.length; i++) {
            System.out.println(lockerNumbers[i] +"번 의 주인은 "+ lockerOwners[i]);
        }
    }
}
