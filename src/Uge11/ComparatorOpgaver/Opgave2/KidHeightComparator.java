package Uge11.ComparatorOpgaver.Opgave2;

import java.util.Comparator;

public class KidHeightComparator implements Comparator<Kid> {

    @Override
    public int compare(Kid o1, Kid o2) {
        return Integer.compare(o1.getHeightInCm(), o2.getHeightInCm());
    }
}
