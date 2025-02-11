package baseball;

import java.util.Scanner;

public class PlayerNumber {
  int[] playerNumber = new int[3];

    public void enterNumber() {
      Scanner scanner = new Scanner(System.in);
      for (int i = 0; i < playerNumber.length; i++) {
        System.out.println((i+1) + "번째 숫자를 입력해 주세요 ");

        while (true) {
          if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num >= 0 && num < 10 ) {
              playerNumber[i] = num;
              break;
            } else {
              System.out.println("0과 10 사이의 숫자를 입력해주세요");
            }
          } else {
            System.out.println("숫자가 아닙니다. 숫자만 입력해주세요.");
            scanner.next();
          }
        }
      }
    }
  public int[] getPlayerNumber() {
    return playerNumber;
  };
}
