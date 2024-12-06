package cleancode.minesweeper.tobe.minesweeper.io.sign;

import cleancode.minesweeper.tobe.minesweeper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweeper.board.cell.CellSnapshotStatus;

public class UnCheckedCellSignProvider implements CellSignProvidable {

    private static final String UNCHECKED_SIGM = "□";

    @Override
    public boolean surpports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.UNCHECKED);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return UNCHECKED_SIGM;
    }
}
