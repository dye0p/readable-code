package cleancode.minesweeper.tobe;

public class BoardIndexConverter {

    private static final char BASE_CAHR_FOR_COL = 'a';

    public int getSelectedColIndex(String cellInput) {
        char cellInputCol = cellInput.charAt(0);
        return convertColFrom(cellInputCol);
    }

    public int getSelectedRowIndex(String cellInput) {
        String cellInputRow = cellInput.substring(1);
        return converRowFrom(cellInputRow);
    }

    private int converRowFrom(String cellInputRow) {
        int rowIndex = Integer.parseInt(cellInputRow) - 1;
        if (rowIndex < 0) {
            throw new GameException("잘못된 입력 입니다.");
        }

        return rowIndex;
    }

    private int convertColFrom(char cellInputCol) {
        int colIndex = cellInputCol - BASE_CAHR_FOR_COL;
        if (colIndex < 0) {
            throw new GameException("잘못된 입력 입니다.");
        }

        return colIndex;
    }
}
