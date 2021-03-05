package day0305;
// 사용자로부터 번호, 이름, 국어, 영어, 수학을 입력 받아

// 다음과 같은 양식으로 출력해주는 프로그램 

//번호: 0##번 이름: ###
//국어: 0##점 영어: 0##점 수학: 0##점
//총점: 0##점 평균: 0##.##점

// 단, 입력 기능과 출력 기능을 분리하여 
// 사용자가 입력을 선택했을 때에만 입력을 하게 되고
// 사용자가 출력을 선택했을 때에만 출력을 하게 하는 프로그램을 만드시오.
// 또한 사용자가 잘못된 점수를 입력했을 경우, 올바른 점수를 입력할 때까지 다시 입력을 받도록 하세요

// 생각해볼것: 변수의 선언위치.
// 심화문제: 만약 사용자가 아무런 정보를 입력 없이 출력을 누르면 
//         "아직 아무런 입력이 되지 않았습니다"
//         라는 메시지만 출력되게 프로그램을 작성하시오.

// 4시 30분까지

import java.util.Scanner;

public class GradeBook01 {

    public static void main(String[] args) {

        int id = 0;
        String name = new String();
        int kor = 0;
        int eng = 0;
        int math = 0;
        int sum = 0;     // sum과 avg는 출력시에만 사용하고 입력값을 받지 않기 때문에 
        double avg = 0;  // 여기서 선언과 초기화 할 필요가 없다. 

        Scanner sc = new Scanner(System.in);
        System.out.println("1. [성적입력]  2. [성적출력] 3. [종료]");
        System.out.print("> ");
        int userChoice = sc.nextInt();
        if (userChoice == 1) {
            System.out.println("번호를 입력하세요.");
            System.out.print("> ");
            id = sc.nextInt();

            System.out.println("이름을 입력하세요.");
            System.out.print("> ");
            name = sc.next();

            System.out.println("국어 점수를 입력하세요.");
            System.out.print("> ");
            kor = sc.nextInt();
         
            while (!(kor >= 0 && kor <= 100)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("국어 점수를 입력하세요.");
                System.out.print("> ");
                kor = sc.nextInt();
            }

            System.out.println("영어 점수를 입력하세요.");
            System.out.print("> ");
            eng = sc.nextInt();
          
            while (!(eng >= 0 && eng <= 100)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("영어 점수를 입력하세요.");
                System.out.print("> ");
                eng = sc.nextInt();
            }

            System.out.println("수학 점수를 입력하세요.");
            System.out.print("> ");
            math = sc.nextInt();
         
            while (!(math >= 0 && math <= 100)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("수학 점수를 입력하세요.");
                System.out.print("> ");
                math = sc.nextInt();
            }

            System.out.println("출력하시겠습니까? 1. 네 2. 아니오");
            System.out.print("> ");
            int output = sc.nextInt();

            if (output == 1) {
                sum = kor + eng + math;
                avg = (sum / 3.0);

                System.out.printf("번호: %03d번 이름: %s\n", id, name);
                System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, math);
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, avg);
            } else if (output == 2) {
                System.out.println("사용해주셔서 감사합니다. ");
            }

        } else if (userChoice == 2) {
            System.out.println("아직 아무런 입력이 되지 않았습니다");
        } else if (userChoice == 3) {
            System.out.println("사용해주셔서 감사합니다.");

        }

    }

}
