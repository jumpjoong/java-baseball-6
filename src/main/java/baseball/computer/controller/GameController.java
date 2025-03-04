package baseball.computer.controller;

import baseball.computer.domain.GameNumber;
import baseball.computer.domain.GameResult;
import baseball.user.EnterUserNumber;

public class GameController {
  private final EnterUserNumber enterUserNumber = new EnterUserNumber();
  GameResult gameResult;

  public void play() {
    do {
      GameNumber gameNumber = enterUserNumber.enterUserNumber();
      gameResult = gameNumber.result();
      gameResult.print();
    } while (!gameResult.isWin());

    System.out.println("게임 종료");
  }
}
