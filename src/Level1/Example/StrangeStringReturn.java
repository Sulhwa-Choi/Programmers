package Level1.Example;

public class StrangeStringReturn {

    /**
     * 길이가 n이고, "수박수박수박수박수..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하라.
     * ex) n = 4 -> "수박수박"을 리턴하고 3이면 "수박수"를 리턴
     *
     * 제한조건
     * n의 길이는 10,000 이하인 자연수
     */

    public String test(int n){
        String str = "";
        for (int i=1 ; i <= n; i++) {
            if (i%2==0) { // 짝수일 때
                str += "박";
            } else {
                str += "수";
            }
        }
        return str;
    }

    public String test2(int n) {
        String str = "";
        for (int i=1 ; i <= n/2; i++) {
            str += "수박";
        }
        if (n%2 == 1) { // n이 홀수일 때
            str += "수";
        }
        return str;
    }
}
