package baseball.computer.domain;

import baseball.computer.Computer;
import baseball.user.EnterUserNumber;

import java.io.Console;
import java.util.List;
import java.util.Objects;

public class GameNumber {
  private final List<Integer> numberList;
  EnterUserNumber enterUserNumber = new EnterUserNumber();


  public GameNumber(List<Integer> numberList) {
    if(!validNumberSize(numberList) || !validNumberRange(numberList)) {
      this.numberList = numberList;
      return;
    }
    duplicate(numberList);
    this.numberList = numberList;
  }
  //중복 숫자 검증
  private void duplicate(List<Integer> numberList) {
    while (true) {
      if (numberList.size() == numberList.stream().distinct().count()) {
        //중복된 숫자가 없을 경우 게임 진행 코드
        break;
      } else {
        System.out.println("중복된 숫자가 있습니다. 다시 입력해주세요.");
        numberList.clear();
        enterUserNumber.enterUserNumber();
      }
    }
  }
  //0과 9 숫자 검증
  private boolean validNumberRange (List<Integer> numberList) {
    for (int i = 0; i < numberList.size(); i++) {
      if (numberList.get(i) < 0 || numberList.get(i) > 9) {
        System.out.println("0과 9 사이의 번호를 입력해 주세요");
        enterUserNumber.enterUserNumber();
        return false;
      }
    }
    return true;
  }
  // 입력값 길이 검증
  private boolean validNumberSize (List<Integer> numberList) {
    if(numberList.size() == 3) {
      return true;
    }
    System.out.println("3자리만 입력해주세요");
    enterUserNumber.enterUserNumber();
    return false;
  }
  // 컴퓨터 숫자, 사용자 입력값 비교
  public void compareNumber(List<Integer> numberList) {
    Computer computer = new Computer();
    int strike = 0;
    int ball = 0;

    List<Integer> computerNumber = computer.ComputerNumber(); // 컴퓨터 값

    while (true) {
      for (int i = 0; i < computerNumber.size(); i++) {
        for (int j = i + 1; j < numberList.size(); j++) {
          if(Objects.equals(computerNumber.get(i), numberList.get(j))) {
            strike++;
            break;
          } else if (Objects.equals(numberList.get(j), computerNumber.get(i))) {
            ball++;
            break;
          }
        }
      }
      if(strike == 0 && ball == 0) {
        System.out.println("낫싱");
      } else if(strike > 0 && ball > 0) {
        System.out.println(strike + "스트라이크" + ball + "볼");
      } else if(strike > 0 && ball == 0) {
        System.out.println(strike + "스트라이크");
      } else if(strike == 0 && ball > 0) {
        System.out.println(ball + "볼");
      }
      if(strike == 3) {
        System.out.println(strike + "개의 숫자를 모두 맞히셨습니다! 게임종료");
        break;
      }
    }
  }
}
