package baseball.user;

import baseball.computer.domain.GameNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class EnterUserNumber {
  List<Integer> numberList = new ArrayList<>();

  public void enterUserNumber (){
    String input = Console.readLine();
    for (int i = 0; i < input.length(); i++) {
      numberList.add(input.charAt(i) - '0');
    }
    System.out.println(numberList);
    new GameNumber(numberList);
  }
};
