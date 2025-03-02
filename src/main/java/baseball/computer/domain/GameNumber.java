package baseball.computer.domain;

import baseball.computer.Computer;
import baseball.user.EnterUserNumber;
import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameNumber {
  private final List<Integer> numberList;
  private final Computer computer;

  public GameNumber(List<Integer> numberList) {
    this.numberList = validateInput(numberList);
    this.computer = new Computer();
  }

  private List<Integer> validateInput(List<Integer> numberList) {
    EnterUserNumber enterUserNumber = new EnterUserNumber();

    while (true) {
      if (!isValidSize(numberList)) {
        System.out.println("❌ 숫자 3개만 입력해주세요");
      } else if (!isValidRange(numberList)) {
        System.out.println("❌ 0과 9 사이의 숫자만 입력해주세요.");
      } else if (!duplicate(numberList)) {
        System.out.println("❌ 중복된 숫자가 있습니다. 다시 입력해주세요.");
      } else {
        return numberList;
      }
      numberList = enterUserNumber.enterUserNumber().numberList;
    }
  }

  //중복 숫자 검증
  private boolean duplicate(List<Integer> numberList) {
    return numberList.size() == numberList.stream().distinct().count();
  }
  //0과 9 숫자 검증
  private boolean isValidRange(List<Integer> numberList) {
    return numberList.stream().allMatch(num -> num >= 0 && num <= 9);
  }
  // 입력값 길이 검증
  private boolean isValidSize(List<Integer> numberList) {
    return numberList.size() == 3;
  }
  //스트라이크 볼 관리
  public void compareNumber() {
    List<Integer> computerNumber = computer.ComputerNumber(); // 컴퓨터 값
    EnterUserNumber enterUserNumber = new EnterUserNumber();
    int strike;
    int ball;

    do {
      numberList = enterUserNumber.enterUserNumber().numberList;
      strike = 0;
      ball = 0;

      for (int i = 0; i < numberList.size(); i++) {
        for (int j = 0; j < computerNumber.size(); j++) {
          if (numberList.get(i).equals(computerNumber.get(i))) {
            strike++;
          } else if (numberList.get(j).equals(computerNumber.get(i))) {
            ball++;
          }
        }
      }
      if(strike == 0 && ball == 0) {
        System.out.println("낫싱");
      } else if (strike > 0 && ball == 0) {
        System.out.println(strike + "스트라이크");
      } else if (strike == 0 && ball > 0) {
        System.out.println(ball + "볼");
      } else if (strike > 0 && ball > 0) {
        System.out.println(strike + "스트라이크, " + ball + "볼" );
      }
    } while(strike <= 3); {
      System.out.println("정답입니다");
    }

  }
}
