package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweeper.MineSweeper;
import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.Advenced;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Advenced(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        MineSweeper mineSweeper = new MineSweeper(gameConfig);
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
