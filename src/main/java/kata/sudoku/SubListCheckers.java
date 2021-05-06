package kata.sudoku;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
public class SubListCheckers {

    /**
     * Fills inital 3 lists as these only require a grid check - list1 is set
     * Compares sublists of 3x3 grid of elements are distinct from 1-9
     * If any sublist contain elements from the other then shuffle listB & listC and re-check
     *
     * Pattern:
     * 1-2, 1-3, 2-3
     * 4-5, 4-6, 5-6
     * 7-8. 7-9, 8-9
     */
    public void populateFirst3ListsGrids3x3(List<Integer> listA, List<Integer> listB, List<Integer> listC) {
        while (CollectionUtils.containsAny(listA.subList(0,3),listB.subList(0,3))
                || (CollectionUtils.containsAny(listA.subList(3,6),listB.subList(3,6))
                || (CollectionUtils.containsAny(listA.subList(6,9),listB.subList(6,9))))) {
            Collections.shuffle(listB);
        }
        while (CollectionUtils.containsAny(listA.subList(0,3),listC.subList(0,3))
                || (CollectionUtils.containsAny(listA.subList(3,6),listC.subList(3,6))
                || (CollectionUtils.containsAny(listA.subList(6,9),listC.subList(6,9))

                || (CollectionUtils.containsAny(listB.subList(0,3),listC.subList(0,3))
                || (CollectionUtils.containsAny(listB.subList(3,6),listC.subList(3,6))
                || (CollectionUtils.containsAny(listB.subList(6,9),listC.subList(6,9)))))))) {
            Collections.shuffle(listC);
        }
    }

    /**
     * Compares sublists of 2 lists - comparing listB against listA
     * If any sublist contain elements from the other then shuffle and re-check listB
     */
    public void subListCheckerCompareTwoLists(List<Integer> listB, List<Integer> listA) {
        while (CollectionUtils.containsAny(listB.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listB.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listB.subList(6, 9), listA.subList(6, 9))))) {
            Collections.shuffle(listB);
        }
    }

    /**
     * Compares sublists of 3 lists - comparing listC against lists A & B
     * If any sublist contain elements from the other then shuffle and re-check listC
     */
    public void subListCheckerCompareThreeLists(List<Integer> listC, List<Integer> listB, List<Integer> listA) {
        while (CollectionUtils.containsAny(listC.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listC.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listC.subList(6, 9), listA.subList(6, 9))
                || (CollectionUtils.containsAny(listB.subList(0, 3), listA.subList(0, 3))
                || (CollectionUtils.containsAny(listB.subList(3, 6), listA.subList(3, 6))
                || (CollectionUtils.containsAny(listB.subList(6, 9), listA.subList(6, 9)))))))) {
            Collections.shuffle(listC);
        }
    }
}
