public class FindKim {
    public String solution(String[] seoul) {
        int x = 0;
        //seoul array 의 element 들을 하나씩 비교
        for(int i =0; i < seoul.length; i++){

            //요소들중 Kim의 위치를 찾기
            if(seoul[i].equals("Kim")){
                x = i;

            }
        }
        return "김서방은 "+x+"에 있다";

    }
}
