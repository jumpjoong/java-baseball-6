package baseball.domain;

import static baseball.config.RuleMsg.*;

public class GameResult {
  private final int strike;
  private final int ball;

    public GameResult(int strike, int ball) {
    this.strike = strike;
    this.ball = ball;
  }

  public void print () {
      int zero = 0;

      if(strike == zero && ball == zero) {
      System.out.println(NOTHING.getMsg());
    } else if (strike > zero && ball == zero) {
      System.out.println(strike + STRIKE.getMsg());
    } else if (strike == zero && ball > zero) {
      System.out.println(ball + BALL.getMsg());
    } else if (strike > zero && ball > zero) {
      System.out.println(strike + STRIKE.getMsg() + ball + STRIKE.getMsg());
    }
  }
  public boolean isWin() {
    return strike == 3;
  }
}
