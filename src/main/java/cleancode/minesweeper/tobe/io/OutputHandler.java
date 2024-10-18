package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;
import cleancode.minesweeper.tobe.GameException;

public interface OutputHandler {

    void showBoard(GameBoard board);

    void showGameStartComents();

    void showGameWinningComent();

    void showGameLosingComent();

    void showComentForSelectingCell();

    void showComentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);
}
