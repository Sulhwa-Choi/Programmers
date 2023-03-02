package Level1.Example;

import java.util.Arrays;

public class PlusNumber {

    /**
     * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어진다.
     * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록
     * solution 함수를 완성한다.
     *
     * 제한사항
     * 1 <= numbers의 길이 <= 9
     * 0 <= numbers의 모든원소 <= 9
     * numbers의 모든 원소를 서로 다르다.
     */

    public void plusNumberIO() {
        int[] numbers = {1,2,6,8,9};
        int answer = test(numbers);
        System.out.println("answer: " + answer);
    }
    public static int test(int[] numbers){
        int sum = 0;
        for (int i = 1 ; i <= 9 ; i++) {
            sum += i;
        }
        for (int i = 0 ; i < numbers.length; i++) {
            sum = sum - numbers[i];
        }
        return sum;
    }
}
