package inclass;

public class BinarySearch {
    static int[] mylist = {2,4,6,8,10,11,12,15,16,17};

    public static void main(String[] args) {
        int n = mylist.length-1; //마지막 인덱스
        int x = 8; //찾는값
        int lowerBound = 0;
        int upperBound = n;
        while(true) {
            int midPoint = lowerBound + (upperBound - lowerBound)/2;

            if(mylist[midPoint] < x){
                lowerBound = midPoint + 1;
            }
            if(mylist[midPoint] > x){
                upperBound = midPoint -1;
            }
            if(mylist[midPoint] == x){
                System.out.println("x: " + x + " found at location midPoint: " + midPoint);
                break;
            }
        }
    }
}
