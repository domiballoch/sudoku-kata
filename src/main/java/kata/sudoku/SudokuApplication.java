package kata.sudoku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudokuApplication implements CommandLineRunner {

	@Autowired
	private SudokuLists sudokuLists;

	public static void main(String[] args) {
		SpringApplication.run(SudokuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sudokuLists.addListsToSuperList();
		sudokuLists.populateLists();
		sudokuLists.runMethods();
		sudokuLists.printLists();
	}
}
