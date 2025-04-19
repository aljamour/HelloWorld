package Uge11.ComparatorOpgaver.Opgave3;

import java.util.Comparator;

public class FriendCountryComparator implements Comparator<Friend> {

    @Override
    public int compare(Friend o1, Friend o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
