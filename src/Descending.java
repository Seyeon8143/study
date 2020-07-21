public class Descending {
    public String solution(String s) {
        //String을 char 로 바꿈
        char[] mylist = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            mylist[i] = s.charAt(i);
        }
        //스트링 안의 모든 char 비교해서 >> length - 1
        //왼쪽보다 오른쪽이 크면 swap
        for(int j =0; j<mylist.length-1; j++){
            for(int i =0; i <mylist.length-1; i++){
                if(mylist[i]<mylist[i+1]){
                    char k = mylist[i];
                    mylist[i] = mylist[i+1];
                    mylist[i+1] = k;
                }
            }
        }

        //length -1 만큼 반복
        return String.valueOf(mylist);
    }
    public static void main(String[] args){
        Descending rs = new Descending();
        System.out.println(rs.solution("Zbcdkfg"));
    }
}

