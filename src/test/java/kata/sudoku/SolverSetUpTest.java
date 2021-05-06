package kata.sudoku;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SolverSetUpTest {

    @Autowired
    private SolverSetUp solverSetUp;

    @Test
    public void testSudoku() {
        solverSetUp.addListsToSuperList();
        solverSetUp.populateLists();
        solverSetUp.runMethods();
        solverSetUp.printLists();
    }
}
