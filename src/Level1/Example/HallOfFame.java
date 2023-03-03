package Level1.Example;

import java.util.Arrays;
import java.util.Collections;

public class HallOfFame {
    /**
     * '명예의 전당' 이라는 TV 프로긂에서 매일 1명의 가수가 노래를 부르고,점수가 부여가 된다. 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중
     * 상위 k 번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올린다. 이 프로그램에서 매일 '명예의 전당' 의 최하위 점수를 발표한다.
     * 예를 들어 k = 3이고 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200] 이라면, 명예의 전당에서 발표된 점수는

     * score 10 | 100 | 20 | 150 | 1 | 100 | 200

     * 명예의전당 10 | 100 | 100 | 150 | 150 | 150 | 200
     * (k=3) | 10 | 20 | 100 | 100 | 100 | 150
     * | | 10 | 20 | 20 | 100 | 100

     * 발표점수 10 | 10 | 10 | 20 | 20 | 100 | 100

     * 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를
     * return 하는 함수를 작성하라.
     */

    public static void hallOfFameIO() {
        int k = 4;
        int[] score = {0,300,40,300,20,70,150,50,500,1000};
        int[] answer = test(k, score);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static int[] test(int k, int[] score){

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            // score 를 i+1 까지 잘라 정렬하여 변수에 담기
            Integer[] arr1 = new Integer[i+1];
            for (int j = 0 ; j < i+1; j++) {
                arr1[j] = score[j];
            }
            Arrays.sort(arr1, Collections.reverseOrder());

            if (arr1.length < k) {
                int a = k;
                while (arr1.length != a) {
                    a--;
                }
                answer[i] = arr1[a-1];
            } else {
                answer[i] = arr1[k-1];
            }
        }
        return answer;
    }

}