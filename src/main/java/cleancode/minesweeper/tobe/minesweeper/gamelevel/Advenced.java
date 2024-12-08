package cleancode.minesweeper.tobe.minesweeper.gamelevel;

public class Advenced implements GameLevel {

    @Override
    public int getLowSize() {
        return 120;
    }

    @Override
    public int getColSize() {
        return 124;
    }

    @Override
    public int getLandMineCount() {
        return 9;
    }
}
