import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //participant 와 completion 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        //completion 명단의 위치와 participant 위치를 비교
        for(int i=0; i<completion.length; i++){
            if(!completion[i].equals(participant[i])){
                return participant[i];
            }
        }
        //completion 명단이 끝났을때까지 return 값이 없으면 p의 맨끝값 리턴
        return participant[participant.length-1];
    }
}