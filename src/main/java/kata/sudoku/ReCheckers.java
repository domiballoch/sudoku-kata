package kata.sudoku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
public class ReCheckers {

    @Autowired
    SolverSetUp solverSetUp;

    @Autowired
    private VerticalCheckers verticalCheckers;

    /**
     * Re-checks the sublists of the list params
     * Similar to the sublist checkers but in a recursive loop with the vertical checkers
     * This is required so both checks can loop until both pass or one will mess up the other
     */
    public void recheckerList5(List<Integer> listB, List<Integer> listA) {
        if (CollectionUtils.containsAny(listB.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listB.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listB.subList(6, 9), listA.subList(6, 9))))) {
            Collections.shuffle(listB);
            verticalCheckers.verticalCheckerList5(solverSetUp.getList5(), solverSetUp.getList1(),
                    solverSetUp.getList2(), solverSetUp.getList3(), solverSetUp.getList4());
        }
    }

    public void recheckerList6(List<Integer> listC, List<Integer> listB, List<Integer> listA) {
        while (CollectionUtils.containsAny(listC.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listC.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listC.subList(6, 9), listA.subList(6, 9))
                || (CollectionUtils.containsAny(listC.subList(0, 3), listB.subList(0, 3))
                || (CollectionUtils.containsAny(listC.subList(3, 6), listB.subList(3, 6))
                || (CollectionUtils.containsAny(listC.subList(6, 9), listB.subList(6, 9)))))))) {
            Collections.shuffle(listC);
            verticalCheckers.verticalCheckerList6(solverSetUp.getList6(), solverSetUp.getList1(),
                    solverSetUp.getList2(), solverSetUp.getList3(), solverSetUp.getList4(), solverSetUp.getList5());
        }
    }

    public void recheckerList8(List<Integer> listB, List<Integer> listA) {
        if (CollectionUtils.containsAny(listB.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listB.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listB.subList(6, 9), listA.subList(6, 9))))) {
            Collections.shuffle(listB);
            verticalCheckers.verticalCheckerList8(solverSetUp.getList8(), solverSetUp.getList1(),
                    solverSetUp.getList2(), solverSetUp.getList3(), solverSetUp.getList4(), solverSetUp.getList5(),
                    solverSetUp.getList6(), solverSetUp.getList7());
        }
    }

    public void recheckerList9(List<Integer> listC, List<Integer> listB, List<Integer> listA) {
        while (CollectionUtils.containsAny(listC.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listC.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listC.subList(6, 9), listA.subList(6, 9))
                || (CollectionUtils.containsAny(listC.subList(0, 3), listB.subList(0, 3))
                || (CollectionUtils.containsAny(listC.subList(3, 6), listB.subList(3, 6))
                || (CollectionUtils.containsAny(listC.subList(6, 9), listB.subList(6, 9)))))))) {
            Collections.shuffle(listC);
            verticalCheckers.verticalCheckerList9(solverSetUp.getList9(), solverSetUp.getList1(),
                    solverSetUp.getList2(), solverSetUp.getList3(), solverSetUp.getList4(), solverSetUp.getList5(),
                    solverSetUp.getList6(), solverSetUp.getList7(), solverSetUp.getList8());
        }
    }
}
