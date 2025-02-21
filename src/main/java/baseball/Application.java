package baseball;

import baseball.computer.Computer;
import baseball.user.EnterUserNumber;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Computer computer = new Computer();
        EnterUserNumber enterUserNumber = new EnterUserNumber();
        computer.test();
        enterUserNumber.enterUserNumber();
    }
}
