package baseball.computer.controller;
import baseball.computer.Computer;
import baseball.computer.domain.GameNumber;
import baseball.computer.domain.GameResult;
import baseball.user.EnterUserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class GameController {
  private final EnterUserNumber enterUserNumber = new EnterUserNumber();
  private final Computer computer = new Computer();
  GameResult gameResult;
  List<Integer> computerNumber = computer.computer();

  public void play() {
    System.out.println("숫자 야구 게임을 시작합니다.");
    do {
      GameNumber gameNumber = enterUserNumber.enterUserNumber();
      gameResult = gameNumber.result(computerNumber);
      gameResult.print();
    } while (!gameResult.isWin());
      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료 \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
      reStart();
  }

  private void reStart() {
    while (true) {  // ✅ 사용자가 1 또는 2를 입력할 때까지 반복
      String input = Console.readLine();

      if (input.equals("1")) {
        play();  // ✅ 게임 재시작
        break;
      } else if (input.equals("2")) {
        System.out.println("게임을 종료합니다.");
        break;
      } else {
        System.out.println("잘못된 입력입니다. 1(재시작) 또는 2(종료)를 입력해주세요.");
      }
    }
  }
}

