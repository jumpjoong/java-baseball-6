package baseball.computer;

import java.util.List;

public class Computer {
  public List<Integer> ComputerNumber () {
    RandomNumber randomNumber = new RandomNumber();

    return randomNumber.randomNumber();
  }
}
