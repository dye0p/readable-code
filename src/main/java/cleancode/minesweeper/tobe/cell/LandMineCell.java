package cleancode.minesweeper.tobe.cell;

public class LandMineCell extends Cell2 {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean isLandMine() {
        return true;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public String getSign() {
        if (isOpend) {
            return LAND_MINE_SIGN;
        }
        if (isFlaged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGM;
    }
}
