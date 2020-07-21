public class PickMiddle {
    public String solution(String s) {
        //글자의 길이
        int len = s.length();
        //길이가 홀수일때
        if(len % 2 !=0){
            return String.valueOf(s.charAt(len/2));
        }
        //짝수일때
        else{
            return String.valueOf(s.charAt(len/2-1)) + String.valueOf(s.charAt(len/2));

        }
    }

}
