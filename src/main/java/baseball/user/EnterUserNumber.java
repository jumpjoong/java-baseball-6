package baseball.user;

import baseball.computer.domain.GameNumber;
import camp.nextstep.edu.missionutils.Console;

import static  baseball.computer.config.RuleMsg.*;

import java.util.ArrayList;
import java.util.List;


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
