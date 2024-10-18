package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel gameLevel = new Beginner();
        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        MineSweeper mineSweeper = new MineSweeper(gameLevel, inputHandler, outputHandler);
        mineSweeper.initialize();
        mineSweeper.run();
    }

    /*
     * 의존성 역전
     * DIP(Dependency Inversion Principle)
     *
     * 의존성 주입 -'제3자가 의존성을 주입해줌'
     * DI(Dependency Injection)
     *
     * 제어의 역전
     * IoC(Inversion of Control)
     *
     */
}
