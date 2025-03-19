package baseball.config;

public enum ErrorMsg {
    NUMBER_SIZE_ERROR("❌ 숫자 3개만 입력해주세요."),
    NUMBER_RANGE_ERROR("❌ 3자리가 아닙니다."),
    NUMBER_DUPLICATE_ERROR("❌ 중복된 숫자가 있습니다."),
    INPUT_WRONG_NUMBER("잘못된 입력 값입니다.");

    private final String msg;

    ErrorMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
