package baseball;

public class PlayGame {
  public ComputerNumber computerNumber;
  public PlayerNumber playerNumber;

  public PlayGame() {
    computerNumber = new ComputerNumber();
    playerNumber = new PlayerNumber();

    computerNumber.pushNumber();
    play();
  }

  public void play() {
    int[] test = computerNumber.getComputerNumber();
    int ball = 0;
    int strike = 0;

      while(true) {
        playerNumber.enterNumber();
        int[] test2 = playerNumber.getPlayerNumber();


        for (int i = 0; i < test.length; i++) {
          for (int j = 0; j < test2.length; j++) {
            if(test2[i] == test[i]) {
              strike++;
            } else if (test2[j] == test[i]) {
              ball++;
              break;
            }
          }
        }
        if(strike == 0 && ball == 0) {
          System.out.println("낫싱");
        } else {
          System.out.println("스트라이크: " + strike + ", 볼: " + ball);
        }
        if(strike == 3) {
          System.out.println("컴퓨터 숫자: " + test[0] + ", " + test[1] + ", " + test[2] );
          System.out.println("플레이어 숫자: " + test2[0] + ", " + test2[1] + ", " + test2[2] );
          System.out.println("성공");
          break;
        }
      }
  }
}
