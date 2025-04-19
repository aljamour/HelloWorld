package Uge11.ComparatorOpgaver.Opgave3;

import java.util.Comparator;

public class FriendIdComparator implements Comparator<Friend> {

    @Override
    public int compare(Friend o1, Friend o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
