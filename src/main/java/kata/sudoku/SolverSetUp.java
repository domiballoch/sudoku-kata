package kata.sudoku;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Component
public class SolverSetUp {

    @Autowired
    private SubListCheckers subListCheckers;

    @Autowired
    private VerticalCheckers verticalCheckers;

    /**
     * SUDOKU SOLVER LOGIC
     * 1. Create 9 lists of 9 elements
     * 2. Add lists to a super list
     * 3. Populate lists with random numbers
     * 4. The first (list 1) is set as the constant - order the next two (lists 2-3) so 3x3 grids exist using sublists
     *
     * REPEATING LOGIC - for lists 4-6 & 7-9
     * 5. Vertical check the first list in the next group of 3 against the others
     * 6. Check and order the next list against the previous using sublists
     * 7. Vertical check the same list against the lists above it
     * 8. This bit is the key: re-check the list using sublists but use a recursive loop until they both pass
     *      vertically and horizontally
     * 9. Display all lists in a sudoku grid 9x9
     */

    private int num;
    private ArrayList<Integer> list1 = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();
    private ArrayList<Integer> list3 = new ArrayList<>();
    private ArrayList<Integer> list4 = new ArrayList<>();
    private ArrayList<Integer> list5 = new ArrayList<>();
    private ArrayList<Integer> list6 = new ArrayList<>();
    private ArrayList<Integer> list7 = new ArrayList<>();
    private ArrayList<Integer> list8 = new ArrayList<>();
    private ArrayList<Integer> list9 = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> superList = new ArrayList<>();

    /**
     * Adds all 9 lists to a super list of lists
     */
    public void addListsToSuperList() {
        superList.addAll(List.of(list1, list2, list3, list4, list5, list6, list7, list8, list9));
    }

    /**
     * Generates a random number from 1-9
     * @return int
     */
    public int random() {
        num = (int) ((Math.random() * 9) + 1);
        return num;
    }

    /**
     * Populates each list with a random number
     */
    public void populateLists() {
        for (List<Integer> list : superList) {
            random();
            while (list.size() < 9) {
                if (!list.contains(num)) {
                    list.add(num);
                } else {
                    random();
                }
            }
        }
    }

    /**
     * Prints all 9 lists, removing array brackets
     */
    public void printLists() {
        for (List<Integer> list : superList) {
            String cleanGrid = list.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "   ");
            System.out.println("\n" + cleanGrid);
        }
    }

    /**
     * Runs methods in order
     */
    public void runMethods() {
        subListCheckers.populateFirst3ListsGrids3x3(getList1(), getList2(), getList3());
        verticalCheckers.verticalCheckerList4(getList4(), getList1(), getList2(), getList3());
        subListCheckers.subListCheckerCompareTwoLists(getList5(), getList4());
        verticalCheckers.verticalCheckerList5(getList5(), getList1(), getList2(), getList3(), getList4());
        subListCheckers.subListCheckerCompareThreeLists(getList6(), getList5(), getList4());
        verticalCheckers.verticalCheckerList6(getList6(), getList1(), getList2(), getList3(), getList4(), getList5());
        verticalCheckers.verticalCheckerList7(getList7(), getList1(), getList2(), getList3(), getList4(), getList5(),
                getList6());
        subListCheckers.subListCheckerCompareTwoLists(getList8(), getList7());
        verticalCheckers.verticalCheckerList8(getList8(), getList1(), getList2(), getList3(), getList4(), getList5(),
                getList6(), getList7());
        subListCheckers.subListCheckerCompareThreeLists(getList9(), getList8(), getList7());
        verticalCheckers.verticalCheckerList9(getList9(), getList1(), getList2(), getList3(), getList4(), getList5(),
                getList6(), getList7(), getList8());
    }
}