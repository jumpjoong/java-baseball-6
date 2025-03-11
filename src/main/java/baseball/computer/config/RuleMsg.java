package baseball.computer.config;

public enum RuleMsg {
    START_GAME_MSG("숫자 야구 게임을 시작합니다."),
    END_GAME_MSG("게임을 종료합니다."),
    RESTART_GAME_MSG("3개의 숫자를 모두 맞히셨습니다! 게임 종료 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요"),
    INPUT_NUMBER_MSG("숫자를 입력해주세요 : ");

    private String msg;

    RuleMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
