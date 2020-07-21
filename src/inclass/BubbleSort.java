package inclass;

public class BubbleSort {
    static int[] mylist = {14,33,27,35,10}; //{2,4,6,8,10,11,12,15,16,17};

    public static void main(String[] args) {
        System.out.println("before: " + printList(mylist));
        for(int j = 0; j < mylist.length-1; j++) {
            for(int i = 0; i < mylist.length-1; i++) {
                if(mylist[i] > mylist[i+1]) {
                    int k = mylist[i];
                    mylist[i] = mylist[i+1];
                    mylist[i+1] = k;
                }
            }
        }
        System.out.println("after: " + printList(mylist));
    }

    public static String printList(int[] src) {
        String out = "[";
        for(int i = 0; i < src.length; i++) {
            out += String.valueOf(src[i]);
            out += ", ";
        }
        out += "]";
        return out;
    }

}
