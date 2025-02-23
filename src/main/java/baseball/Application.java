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
    RandomNumber randomNumber = new RandomNumber();
    EnterUserNumber test = new EnterUserNumber();
    randomNumber.randomNumber();
    test.enterUserNumber();
    }
}
