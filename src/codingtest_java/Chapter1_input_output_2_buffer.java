package codingtest_java;

import java.io.BufferedReader; // 입력을 위한 BufferedReader 클래스 import
import java.io.InputStreamReader; // 입력을 위한 InputStreamReader 클래스 import
import java.io.IOException; // 입출력 예외 처리를 위한 IOException import
import java.util.StringTokenizer; // 문자열 토큰화를 위한 StringTokenizer 클래스 import


public class Chapter1_input_output_2_buffer {

    public static void main(String[] args) throws IOException { // 프로그램의 시작점인 main 메서드 정의
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔 입력을 위한 BufferedReader 객체 생성

        String str = br.readLine(); // 콘솔에서 한 줄 입력을 받아와 str 변수에 저장
        StringTokenizer st = new StringTokenizer(str, " "); // 입력된 문자열을 공백을 기준으로 토큰화하여 StringTokenizer 객체 생성

        int a = Integer.parseInt(st.nextToken()); // 첫 번째 토큰을 정수로 변환하여 변수 a에 저장
        int b = Integer.parseInt(st.nextToken()); // 두 번째 토큰을 정수로 변환하여 변수 b에 저장

        System.out.println(a + b); // a와 b의 합을 콘솔에 출력
    }


}
