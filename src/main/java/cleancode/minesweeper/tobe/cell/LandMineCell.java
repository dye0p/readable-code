package cleancode.minesweeper.tobe.cell;

public class LandMineCell implements Cell {

    private final CellState cellState = CellState.initialize();

    @Override
    public boolean isLandMine() {
        return true;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public CellSnapshot getSnapshot() {
        if (cellState.isOpend()) {
            return CellSnapshot.ofLandMine();
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
