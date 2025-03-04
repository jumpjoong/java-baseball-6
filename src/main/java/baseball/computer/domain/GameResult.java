package baseball.computer.domain;

public class GameResult {
  private final int strike;
  private final int ball;

  public GameResult(int strike, int ball) {
    this.strike = strike;
    this.ball = ball;
  }

  public void print () {
    if(strike == 0 && ball == 0) {
      System.out.println("낫싱");
    } else if (strike > 0 && ball == 0) {
      System.out.println(strike + "스트라이크");
    } else if (strike == 0 && ball > 0) {
      System.out.println(ball + "볼");
    } else if (strike > 0 && ball > 0) {
      System.out.println(strike + "스트라이크, " + ball + "볼" );
    }
  }
  public boolean isWin() {
    return strike == 3;
  }
}
