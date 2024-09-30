package cleancode.minesweeper.tobe.cell;

public class NumberCell extends Cell2 {

    private final int nearByLandMineCount;

    public NumberCell(int nearByLandMineCount) {
        this.nearByLandMineCount = nearByLandMineCount;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public String getSign() {
        if (isOpend) {
            return String.valueOf(nearByLandMineCount);
        }
        if (isFlaged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGM;
    }
}
