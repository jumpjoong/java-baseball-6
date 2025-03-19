package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

import static baseball.config.RuleMsg.*;

public class EnterUserNumber {
  List<Integer> numberList = new ArrayList<>();

  public GameNumber enterUserNumber (){
    System.out.print(INPUT_NUMBER_MSG.getMsg());
    String input = Console.readLine();
    numberList.clear();
    for (int i = 0; i < input.length(); i++) {
      numberList.add(input.charAt(i) - '0');
    }
    return new GameNumber(numberList);
  }
};
