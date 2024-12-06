package cleancode.minesweeper.tobe.minesweeper.gamelevel;

public class Midle implements GameLevel {

    @Override
    public int getLowSize() {
        return 14;
    }

    @Override
    public int getColSize() {
        return 18;
    }

    @Override
    public int getLandMineCount() {
        return 40;
    }
}
