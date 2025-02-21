package baseball.computer.domain;

import java.util.ArrayList;
import java.util.List;

public class GameNumber {
  private final List<Integer> numberList;

  public GameNumber(List<Integer> numberList) {
    duplicate(numberList);
    this.numberList = numberList;
  }

  public void duplicate(List<Integer> numberList) {
    if (numberList.size() == numberList.stream().distinct().count()) {
      System.out.println("중복이 아님");
    } else {
      System.out.println("중복");
    }
  }
}
