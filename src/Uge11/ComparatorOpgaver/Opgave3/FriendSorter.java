package Uge11.ComparatorOpgaver.Opgave3;

import java.util.ArrayList;
import java.util.List;

public class FriendSorter {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();
//        Friend friend1 = new Friend(...);
        friends.add(new Friend(1, "Junes", "50698219", "junes@gmail.com", "Palæstina"));
        friends.add(new Friend(2, "Mohammed", "69194599", "mohammed@gmail.com", "Somalien"));
        friends.add(new Friend(3, "Alan", "34542318", "alan@gmail.com", "Kurdistan"));
        friends.add(new Friend(4, "Aden", "53127563", "aden@gmail.com", "Pakistan"));

        printList(friends);
    }

    private static void printList(List<Friend> friendList) {
        for (Friend f : friendList) {
            System.out.println(f);
        }
    }
}
