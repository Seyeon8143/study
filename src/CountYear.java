public class CountYear {
    public String solution(int a, int b) {
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weekdays = {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;
        //a월 까지 일수를 더한값을 days 에 저장
        for(int i = 0; i < a -1; i++) {
            days += months[i];
        }
        //days 에 b일수 만큼 더한후 일수 나누기 7한 나머지의 값을 인덱스로 잡음
        days += b;
        return weekdays[days%7];
    }
    public static void main(String[] args) {
        CountYear test = new CountYear();
        //int a = 5, b = 24;
        System.out.println(test.solution(10,10));
    }
}
