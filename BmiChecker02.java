package day0305;

//사용자로부터 키와 몸무게를 입력 받아서 
//사용자의 bmi 수치를 소숫점 2번째 자리까지 출력하고
//사용자의 체형이 어디에 속하는지도 출력하세요
//bmi 공식: 몸무게(kg) / 키(m) / 키(m)
//체형기준
//~18.5 미만: 제처중
//~23 미만: 정상체중
//~25 미만: 과체중
//그외: 비만

// 기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.82m였습니다.
// 기네스북에 따르면 세상에서 가장 몸무게가 많이 나갔던 사람의 무게는 635킬로그램이었습니다.

// 키를 잘못 입력하면 추가적인 입력 없이 경고 메시지만 출력하시오.
// 몸무게를 잘못 결과 출력 대신 경고 메시지만 출력하시오. (쉬는시간 포함 45분까지)

import java.util.Scanner;

public class BmiChecker02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키를 m단위로 입력하세요.");
        System.out.print("> ");
        double height = sc.nextDouble();

        if (height > 0 && height <= 2.82) {
            // 올바른 키이므로 몸무게 입력을 받는다.

            System.out.println("몸무게를 kg단위로 입력하세요.");
            System.out.print("> ");
            double weight = sc.nextDouble();

            if (weight > 0 && weight <= 635) {
                // 올바른 키와 몸무게가 입력 되었으므로
                // BMI를 계산하여
                // BMI와 체형을 출력해준다.

                double bmi = weight / height / height;
                System.out.printf("BMI 수치: %.2f\n", bmi);

                if (bmi < 18.5) {
                    System.out.println("저체중");
                } else if (bmi < 23) {
                    System.out.println("정상체중");
                } else if (bmi < 25) {
                    System.out.println("과체중");
                } else {
                    System.out.println("비만");
                }
            } else {
                // 올바르지 않는 몸무게이므로 경고 메시지만 출력한다.
                System.out.println("몸무게를 잘못 입력하셨습니다. ");

            }
            sc.close();

        } else {
            // 올바르지 않은 키이므로 경고 메시지만 출력한다.
            System.out.println("키를 잘못 입력하셨습니다.");
        }
    }
}
