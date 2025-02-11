package baseball;

import java.util.Scanner;

public class PlayerNumber {
  int[] playerNumber = new int[3];

    public void enterNumber() {
      System.out.println("3자리의 숫자를 입력해 주세요 ");
      Scanner scanner = new Scanner(System.in);
      while (true) {
        if (!scanner.hasNextInt()) {
          System.out.println("숫자만 입력해주세요.");
          scanner.next();
          continue;
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        String strNum = String.valueOf(num);  //배열길이 확인

        if(strNum.length() == 3){
          for (int i = 0; i < strNum.length(); i++) {
            playerNumber[i] = Character.getNumericValue(strNum.charAt(i)); //스트링으로 처리된 값을 인트로 변경
          }
          break;
        } else {
          System.out.println("3자리가 아닙니다 다시 입력해주세요");
        }
        }
      }


  public int[] getPlayerNumber() {
    return playerNumber;
  };
}
