package baseball;

import baseball.computer.Computer;
import baseball.computer.domain.GameNumber;
import baseball.user.EnterUserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<Integer> test = new ArrayList<>();
        String input = Console.readLine();
        for (int i = 0; i < input.length(); i++) {
            test.add(input.charAt(i) - '0');
        }
        new GameNumber(test);
    }
}
