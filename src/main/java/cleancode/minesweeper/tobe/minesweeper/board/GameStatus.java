package cleancode.minesweeper.tobe.minesweeper.board;

public enum GameStatus {

    IN_PROGRESS("게임중"),
    WIN("승리"),
    LOSE("패"),
    ;

    private final String description;

    GameStatus(String description) {
        this.description = description;
    }
}
