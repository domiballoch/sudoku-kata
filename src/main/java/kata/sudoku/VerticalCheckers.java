package kata.sudoku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class VerticalCheckers {

    @Autowired
    private ReCheckers reCheckers;

    /**
     * Runs vertical checks by streaming each element of one list against the others
     * If an element is equal then shuffle the list being evaluated, reset the counter and run the loop again
     *
     * Patterns:
     * 4(1,2,3)
     * 5(1,2,3,4)
     * 6(1,2,3,4,5)
     * 7(1,2,3,4,5,6)
     * 8(1,2,3,4,5,6,7)
     * 9(1,2,3,4,5,6,7,8)
     */
    protected void verticalCheckerList4(List<Integer> listD, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC) {
        int i=0;
        while(i<9){
            if (listD.get(i) == (listA.get(i))
                    || (listD.get(i) == (listB.get(i))
                    || (listD.get(i) == (listC.get(i))))) {
                Collections.shuffle(listD);
                i=0;
            } else {
                i++;
            }
        }
    }

    protected void verticalCheckerList5(List<Integer> listE, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC, List<Integer> listD) {
        int i=0;
        while(i<9) {
            if (listE.get(i) == (listA.get(i))
                    || (listE.get(i) == (listB.get(i))
                    || (listE.get(i) == (listC.get(i))
                    || (listE.get(i) == (listD.get(i)))))) {
                Collections.shuffle(listE);
                i = 0;
            } else {
                i++;
            }
        }
        reCheckers.recheckerList5(listE, listD);
    }

    protected void verticalCheckerList6(List<Integer> listF, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC, List<Integer> listD, List<Integer> listE) {
        int i=0;
        while(i<9) {
            if (listF.get(i) == (listA.get(i))
                    || (listF.get(i) == (listB.get(i))
                    || (listF.get(i) == (listC.get(i))
                    || (listF.get(i) == (listD.get(i))
                    || (listF.get(i) == (listE.get(i))))))) {
                Collections.shuffle(listF);
                i = 0;
            } else {
                i++;
            }
        }
        reCheckers.recheckerList6(listF, listE, listD);
    }

    protected void verticalCheckerList7(List<Integer> listG, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC, List<Integer> listD, List<Integer> listE,
                                     List<Integer> listF) {
        int i=0;
        while(i<9) {
            if (listG.get(i) == (listA.get(i))
                    || (listG.get(i) == (listB.get(i))
                    || (listG.get(i) == (listC.get(i))
                    || (listG.get(i) == (listD.get(i))
                    || (listG.get(i) == (listE.get(i))
                    || (listG.get(i) == (listF.get(i)))))))) {
                Collections.shuffle(listG);
                i = 0;
            } else {
                i++;
            }
        }
    }

    protected void verticalCheckerList8(List<Integer> listH, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC, List<Integer> listD, List<Integer> listE,
                                     List<Integer> listF, List<Integer> listG) {
        int i=0;
        while(i<9) {
            if (listH.get(i) == (listA.get(i))
                    || (listH.get(i) == (listB.get(i))
                    || (listH.get(i) == (listC.get(i))
                    || (listH.get(i) == (listD.get(i))
                    || (listH.get(i) == (listE.get(i))
                    || (listH.get(i) == (listF.get(i))
                    || (listH.get(i) == (listG.get(i))))))))) {
                Collections.shuffle(listH);
                i = 0;
            } else {
                i++;
            }
        }
        reCheckers.recheckerList8(listH, listG);
    }

    protected void verticalCheckerList9(List<Integer> listI, List<Integer> listA, List<Integer> listB,
                                     List<Integer> listC, List<Integer> listD, List<Integer> listE,
                                     List<Integer> listF, List<Integer> listG, List<Integer> listH) {
        int i=0;
        while(i<9) {
            if (listI.get(i) == (listA.get(i))
                    || (listI.get(i) == (listB.get(i))
                    || (listI.get(i) == (listC.get(i))
                    || (listI.get(i) == (listD.get(i))
                    || (listI.get(i) == (listE.get(i))
                    || (listI.get(i) == (listF.get(i))
                    || (listI.get(i) == (listG.get(i))
                    || (listI.get(i) == (listH.get(i)))))))))) {
                Collections.shuffle(listI);
                i = 0;
            } else {
                i++;
            }
        }
        reCheckers.recheckerList9(listI, listH, listG);
    }
}
