package Level1.Example;

import java.util.Arrays;

public class SecretMap {
    /**
     * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
     * 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야한다.
     * 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
     *
     * 1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"("") 또는 "벽"("#") 두 종류로 이루어져 있다.
     * 2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도1과 지도2라고 하면, 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
     *    지도1과 지도2에서 모두 공백ㄱ인 부분은 전체 지도에서도 공백이다.
     * 3. 지도1과 지도2는 각각 정수 배열로 암호화되어있다.
     * 4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백부분을 0으로 부호화 했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
     *
     * 네오가 프로도의 비상금을 손에 넣을 수 있도록 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.
     *
     * 입력형식 : 입력으로 지도의 한 변 크기 n과 2개의 정수배열 arr1, arr2가 들어온다.
     *      1 <= n <= 16
     *      arr1, arr2는 길이 n인 정수배열로 주어진다.
     *      정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 <= x <= 2의 n제곱 -1 을 만족한다.
     *
     * 출력형식 : 원래의 비밀지도를 해독하여 '#', ''(공백) 으로 구성된 문자열 배열로 출력하라.
     */

    public void secretMapIO() {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] answer = test(n,arr1,arr2);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static String[] test(int n, int[] arr1, int[] arr2){

        String[] result = new String[n];

        for (int i=0 ; i<n ; i++) { // 배열의 길이만큼 루프
            String n1 = Integer.toBinaryString(arr1[i]);
            String n2 = Integer.toBinaryString(arr2[i]);
            String new1 = "";
            String new2 = "";

            for (int j = n; j > 0 ; j--) {
                if (n1.length() < j) {
                    new1 += "0";
                } else {
                    new1 += n1;
                    break;
                }
            }
            for (int j = n; j > 0 ; j--) {
                if (n2.length() < j) {
                    new2 += "0";
                } else {
                    new2 += n2;
                    break;
                }
            }
            // new1, new2에 각각의 2진수 문자열이 들어가 있음
            String oneLineBinary = "";
            for (int j = 0 ; j < n; j++) {
                if (new1.substring(j,j+1).equals("0") && new2.substring(j,j+1).equals("0")) {
                    oneLineBinary += " ";
                } else {
                    oneLineBinary += "#";
                }
            }
            result[i] = oneLineBinary;
        }
        return result;
    }
}
