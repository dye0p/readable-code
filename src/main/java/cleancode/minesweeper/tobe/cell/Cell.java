package cleancode.minesweeper.tobe.cell;

public interface Cell {

    String FLAG_SIGN = "⚑";
    String UNCHECKED_SIGM = "□";

    boolean isLandMine();

    boolean hasLandMineCount();

    String getSign();

    void open();

    void flag();

    boolean isChecked();

    boolean isOpend();
}
