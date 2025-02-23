package baseball.user;

import baseball.computer.domain.GameNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class EnterUserNumber {
  List<Integer> numberList = new ArrayList<>();
  String input = Console.readLine();

  public void enterUserNumber (){
    if(input.matches("^[0-9]+")) { //숫자만 받는 정규식 게임 넘버에 input을 넘기면 match 가능할 듯
      for (int i = 0; i < input.length(); i++) {
        numberList.add(input.charAt(i) - '0');
      }
      new GameNumber(numberList);
    } else { // 저 함수를 어떻게 다시 실행 시키노 ㅅㅂ
      System.out.println("숫자가 아닌 값이 입력");
      enterUserNumber();
    }
  }
};
