package day0305;
// Bmi Checker를

// 입력과 출력을 나눈 메뉴 버전으로 고치시오.


import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        boolean inputCheck = false;

        while (true) {
            System.out.println("1. [입력]  2. [출력]  3. 종료");
            System.out.print("> ");
            int userChoice = sc.nextInt();

            if (userChoice == 1) {
                System.out.println("키를 m단위로 입력하세요.");
                System.out.print("> ");
                height = sc.nextDouble();

                while (!(height > 0 && height <= 2.82)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("키를 m단위로 입력하세요.");
                    System.out.print("> ");
                    height = sc.nextDouble();
                }

                System.out.println("몸무게를 kg단위로 입력하세요.");
                System.out.print("> ");
                weight = sc.nextDouble();

                while (!(weight > 0 && weight <= 635)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("몸무게를 kg단위로 입력하세요.");
                    System.out.print("> ");
                    weight = sc.nextDouble();
                }

                inputCheck = true;

            } else if (userChoice == 2) {

                if (inputCheck) {

                    double bmi = weight / height / height;
                    System.out.printf("사용자의 BMI 수치는 [%.2f] \n", bmi);

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
                    System.out.println("아직 입력된 정보가 존재하지 않습니다");
                }
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

    }
}
