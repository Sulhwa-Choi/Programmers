package Level1.Example;

public class FindMiddleCharacter {

    /**
     * 단어 str의 가운데 글자를 반환하는 메소드. 단어의 길이가 짝수라면 가운데 두 글자를 반환한다.
     * s는 길이가 1이상 100 이하의 String
     * */
    public void findMiddleCharacterIO() {
        String s = "가나다라마바사";
        String answer = test(s);
        System.out.println("answer: " + answer);
    }

    public static String test(String s) {
        if (s.length()%2 == 0) { // 짝수
            return s.substring(s.length()/2-1,s.length()/2+1);
        } else { // 홀수
            return s.substring(s.length()/2,s.length()/2+1);
        }
    }
}
