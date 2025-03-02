package baseball;

import baseball.computer.Computer;
import baseball.computer.RandomNumber;
import baseball.computer.domain.GameNumber;
import baseball.user.EnterUserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        EnterUserNumber enterUserNumber = new EnterUserNumber();
        GameNumber gameNumber = enterUserNumber.enterUserNumber();  // ✅ `GameNumber` 객체 반환

        gameNumber.compareNumber();  // ✅ 게임 실행
    }
}
