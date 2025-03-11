package baseball.computer.controller;
import baseball.computer.Computer;
import baseball.computer.domain.GameNumber;
import baseball.computer.domain.GameResult;
import baseball.user.EnterUserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.computer.config.ErrorMsg.INPUT_WRONG_NUMBER;
import static baseball.computer.config.RuleMsg.*;

public class GameController {
  private final EnterUserNumber enterUserNumber = new EnterUserNumber();
  private final Computer computer = new Computer();
  private static final String restartKeyCode = "1";
  private static final String stopKeyCode = "2";
  GameResult gameResult;

  public GameController() {
    System.out.println(START_GAME_MSG.getMsg());
  }

  public void play() {
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

