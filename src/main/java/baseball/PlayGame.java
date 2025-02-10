package baseball;

public class PlayGame {
  public ComputerNumber computerNumber;
  public PlayerNumber playerNumber;

  public PlayGame() {
    computerNumber = new ComputerNumber();
    playerNumber = new PlayerNumber();

    computerNumber.pushNumber();
    playerNumber.enterNumber(computerNumber);
    play();
  }

  public void play() {
    int[] test = computerNumber.getComputerNumber();
    int[] test2 = playerNumber.getPlayerNumber();
    int ball = 0;
    int strike = 0;

      for (int i = 0; i < test.length; i++) {
        for (int j = 0; j < test2.length; j++) {
          if(test2[i] == test[i]) {
            strike++;
            break;
          } else if (test2[j] == test[i] ) {
            ball++;
            break;
          }
        }
      }
    System.out.println("스트라이크: " + strike);
    System.out.println("볼: " + ball);
  }
}
