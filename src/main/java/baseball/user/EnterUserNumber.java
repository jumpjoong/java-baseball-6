package baseball.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterUserNumber {
  public void enterUserNumber() {
    List<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("3자리의 숫자를 입력해 주세요 ");
      if (!scanner.hasNextInt()) {
        System.out.println("숫자만 입력해주세요.");
        scanner.next();
        continue;
      }
      String num = scanner.nextLine();
      System.out.println(test);
//      List<String> test = new ArrayList<>(List.of(num));
      if (num.length() == 3) {
        for (int i = 0; i < num.length(); i++) {
//          System.out.print(number[i]);
//          System.out.println(number[0]);
//          list.add(number.); //위에를 해결해야 가능할 듯
        }
        System.out.println(list); // 리턴해서 비교하는 함수 만들기
        break;
      } else {
        System.out.println("3자리가 아닙니다 다시 입력해주세요");
      }
    }
  }
  public void duplicateUserNumber() {
  }
}
