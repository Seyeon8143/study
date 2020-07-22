public class WaterMelon {
    public String waterMelon(int n) {
    String answer = "";
    for(int i=0; i<n; i++){
        //짝수일때
        if(i%2==0){
            answer = answer +"수";
        }
        if(i%2!=0){
            answer = answer +"박";
        }
    }
    return answer;
}
    public static void main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.waterMelon(3));
        System.out.println("n이 4인 경우: " + wm.waterMelon(4));

    }
}
