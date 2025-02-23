package baseball.computer.domain;

import baseball.user.EnterUserNumber;

import java.util.ArrayList;
import java.util.List;

public class GameNumber {
  private final List<Integer> numberList;

  public GameNumber(List<Integer> numberList) {
    duplicate(numberList);
    this.numberList = numberList;
  }

  public void duplicate(List<Integer> numberList) {
    EnterUserNumber enterUserNumber = new EnterUserNumber();
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
}
