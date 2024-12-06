package cleancode.minesweeper.tobe.minesweeper.io;

import cleancode.minesweeper.tobe.minesweeper.board.GameBoard;
import cleancode.minesweeper.tobe.minesweeper.exception.GameException;

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
