package baseball.user;

import baseball.computer.domain.GameNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class EnterUserNumber {
  List<Integer> numberList = new ArrayList<>();

  public GameNumber enterUserNumber (){
    String input = Console.readLine();
    numberList.clear();
    for (int i = 0; i < input.length(); i++) {
      numberList.add(input.charAt(i) - '0');
    }
    return new GameNumber(numberList);
  }
};
