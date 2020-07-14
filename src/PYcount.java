public class PYcount {
    boolean solution(String s) {
        //p와 y 의 개수
        int p = 0;
        int y = 0;
        //문자열 s 의 elment 를 가져와서 s문자열의 i 번째 캐릭터가 p이거나 P일때 카운트
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                p++;
            }
            if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                y++;
            }
        }
        //p와 y의 개수가 같으면 true 다르면 false
        if(p==y){
            return true;
        }
        else{
            return false;
        }
    }
}
