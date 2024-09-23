package cleancode.minesweeper.tobe;

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String UNCHECKED_SIGM = "□";
    private static final String EMPTY_SIGN = "■";

    private int nearByLandMineCount;
    private boolean isLandMine;
    private boolean isFlaged;
    private boolean isOpend;

    private Cell(int nearByLandMineCount, boolean isLandMine, boolean isFlaged, boolean isOpend) {
        this.nearByLandMineCount = nearByLandMineCount;
        this.isLandMine = isLandMine;
        this.isFlaged = isFlaged;
        this.isOpend = isOpend;
    }

    public static Cell of(int nearByLandMineCount, boolean isLandMine, boolean isFlaged, boolean isOpend) {
        return new Cell(nearByLandMineCount, isLandMine, isFlaged, isOpend);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public void turnOnLandMine() {
        this.isLandMine = true;
    }

    public void updateNearByLandMineCount(int count) {
        this.nearByLandMineCount = count;
    }

    public void flag() {
        this.isFlaged = true;
    }

    public void open() {
        this.isOpend = true;
    }

    public boolean isChecked() {
        return isFlaged || isOpend;
    }

    public boolean isLandMine() {
        return isLandMine;
    }

    public boolean isOpend() {
        return isOpend;
    }

    public boolean hasLandMineCount() {
        return this.nearByLandMineCount != 0;
    }

    public String getSign() {
        if (isOpend) {
            if (isLandMine) {
                return LAND_MINE_SIGN;
            }
            if (hasLandMineCount()) {
                return String.valueOf(nearByLandMineCount);
            }
            return EMPTY_SIGN;
        }

        if (isFlaged) {
            return FLAG_SIGN;
        }

        return UNCHECKED_SIGM;
    }

}
