package baseball.controller;
import baseball.domain.ComputerRandomNumber;
import baseball.domain.GameNumber;
import baseball.domain.GameResult;
import baseball.domain.EnterUserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.config.ErrorMsg.INPUT_WRONG_NUMBER;
import static baseball.config.RuleMsg.*;

public class GameController {
  private final EnterUserNumber enterUserNumber = new EnterUserNumber();
  private final ComputerRandomNumber computer = new ComputerRandomNumber();
  private static final String restartKeyCode = "1";
  private static final String stopKeyCode = "2";
  GameResult gameResult;

  public void play() {
    System.out.println(START_GAME_MSG.getMsg());
    List<Integer> computerNumber = computer.computer();

    do {
      GameNumber gameNumber = enterUserNumber.enterUserNumber();
      gameResult = gameNumber.result(computerNumber);
      gameResult.print();
    } while (!gameResult.isWin());
      System.out.println(RESTART_GAME_MSG.getMsg());
      reStart();
  }

  private void reStart() {
    while (true) {
      String input = Console.readLine();

      if (input.equals(restartKeyCode)) {
        play();
        break;
      } else if (input.equals(stopKeyCode)) {
        System.out.println(END_GAME_MSG.getMsg());
        break;
      } else {
        throw new IllegalArgumentException(INPUT_WRONG_NUMBER.getMsg());
      }
    }
  }
}

