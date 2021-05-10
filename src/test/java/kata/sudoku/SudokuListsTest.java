package kata.sudoku;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SudokuListsTest {

    @Autowired
    private SudokuLists sudokuLists;

    /**
     * Currently there are no asserts - this will run the program.
     */
    @Test
    public void testSudoku() {
        sudokuLists.addListsToSuperList();
        sudokuLists.populateLists();
        sudokuLists.runMethods();
        sudokuLists.printLists();
    }
}
