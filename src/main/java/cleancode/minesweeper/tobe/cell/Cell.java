package cleancode.minesweeper.tobe.cell;

public abstract class Cell {

    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGM = "□";

    protected boolean isFlaged;
    protected boolean isOpend;

    public abstract boolean isLandMine();

    public abstract boolean hasLandMineCount();

    public abstract String getSign();

    public void flag() {
        this.isFlaged = true;
    }

    public void open() {
        this.isOpend = true;
    }

    public boolean isChecked() {
        return isFlaged || isOpend;
    }

    public boolean isOpend() {
        return isOpend;
    }
}
