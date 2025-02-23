package baseball.computer.domain;

import baseball.user.EnterUserNumber;

import java.util.List;

public class GameNumber {
  private final List<Integer> numberList;
  EnterUserNumber enterUserNumber = new EnterUserNumber();

  public GameNumber(List<Integer> numberList) {
    if(!validNumberRange(numberList)) {
      this.numberList = numberList;
      return;
    }
    duplicate(numberList);
    this.numberList = numberList;
  }

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

  private boolean validNumberRange (List<Integer> numberList) {
    for (int i = 0; i < numberList.size(); i++) {
      if (numberList.get(i) < 0 || numberList.get(i) > 9) {
        System.out.println("0과 9 사이의 번호를 입력해 주세요");
        numberList.clear();
        enterUserNumber.enterUserNumber();
        return false;
      }
    }
    return true;
  }
}
