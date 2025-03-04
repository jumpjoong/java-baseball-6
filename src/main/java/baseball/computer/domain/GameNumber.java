package baseball.computer.domain;


import baseball.computer.Computer;

import java.util.List;

public class GameNumber {
  private final List<Integer> numberList;
  Computer computer = new Computer();
  List<Integer> computerNumber = computer.ComputerNumber();

  public GameNumber(List<Integer> numberList) {
    validateInput(numberList);
    this.numberList = numberList;

  }

  private void validateInput(List<Integer> numberList) { //검증 후 에러 발생
    System.out.println(numberList);
      if (!isValidSize(numberList)) {
        throw new IllegalArgumentException("❌ 숫자 3개만 입력해주세요");
      } else if (!isValidRange(numberList)) {
        throw new IllegalArgumentException("❌ 3자리가 아닙니다");
      } else if (!duplicate(numberList)) {
        throw new IllegalArgumentException("❌ 중복된 숫자가 있습니다");
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
  }//스트라이크 볼
  public GameResult result() {
    int strike = 0;
    int ball = 0;

    for (int i = 0; i < numberList.size(); i++) {
      for (int j = 0; j < computerNumber.size(); j++) {
        if(numberList.get(i).equals(computerNumber.get(i))) {
          strike++;
          break;
        } else if (numberList.get(j).equals(computerNumber.get(i))) {
          ball++;
          break;
        }
      }
    }
    return new GameResult(strike, ball);
  }
}
