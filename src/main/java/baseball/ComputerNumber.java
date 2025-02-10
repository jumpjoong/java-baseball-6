package baseball;

public class ComputerNumber {
    int[] computerNumber = new int[3];

    public int randomNumber() {
        return (int) (Math.random() * 9);
    }

    public void pushNumber() {
    for (int i = 0; i < computerNumber.length; i++) {
        computerNumber[i] = randomNumber();
    }
    againNumber();
    }

    public void againNumber() { //하나라도 true일 시 컴퓨터 숫자 재배정
        if (computerNumber[0] == computerNumber[1] || computerNumber[1] == computerNumber[2] || computerNumber[2] == computerNumber[0]) {
            pushNumber();
        }
    }

    public int[] getComputerNumber() {
        return computerNumber;
    }

}
