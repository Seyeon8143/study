public class WaterMelon {
    public String waterMelon(int n) {
        //객체 생성
        StringBuffer sb = new StringBuffer();
        //루프 돌려서 append 메소드로 수와 박 추가
        for(int i=0; i<n; i++){
            //찍수면 수 홀수면 박
            sb.append(i%2==0? "수":"박");
        }
        //문자로 리턴
        return sb.toString();

    }
    public static void main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.waterMelon(3));
        System.out.println("n이 4인 경우: " + wm.waterMelon(4));

    }
}
