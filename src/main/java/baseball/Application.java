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
    Computer computer = new Computer();
    EnterUserNumber test = new EnterUserNumber();
    computer.ComputerNumber();
    test.enterUserNumber();
    }
}
