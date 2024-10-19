package cleancode.minesweeper.tobe.cell;

public class CellState {

    private boolean isFlaged;
    private boolean isOpend;

    public CellState(boolean isFlaged, boolean isOpend) {
        this.isFlaged = isFlaged;
        this.isOpend = isOpend;
    }

    public static CellState initialize() {
        return new CellState(false, false);
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

    public boolean isOpend() {
        return isOpend;
    }

    public boolean isFlagged() {
        return isFlaged;
    }
}
