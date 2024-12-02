package cleancode.minesweeper.tobe.cell;

public class NumberCell implements Cell {

    private final int nearByLandMineCount;
    private final CellState cellState = CellState.initialize();

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
    public CellSnapshot getSnapshot() {
        if (cellState.isOpend()) {
            return CellSnapshot.ofNumber(nearByLandMineCount);
        }

        if (cellState.isFlagged()) {
            return CellSnapshot.ofFalg();
        }
        return CellSnapshot.ofUnChecked();
    }

    @Override
    public void open() {
        cellState.open();
    }

    @Override
    public void flag() {
        cellState.flag();
    }

    @Override
    public boolean isChecked() {
        return cellState.isChecked();
    }

    @Override
    public boolean isOpend() {
        return cellState.isOpend();
    }
}
