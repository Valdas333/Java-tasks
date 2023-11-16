package SocialNetworkTask;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SocialSprendimas implements SocialNetwork {

    private ArrayList<Friend> myFriends= new ArrayList<>();
    @Override
    public void addFriend(Friend friend) {
        if (friend == null){
            throw new IllegalArgumentException();
        }
        if (!myFriends.contains(friend)){
            myFriends.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return myFriends.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        boolean friendIsFound = false;
        if (s == null || s1 == null){
            throw new IllegalArgumentException();
        }
        for (Friend friend : myFriends
        ) {
            if (friend.getFirstName().equals(s) && friend.getLastName().equals(s1)) {
                return friend;
            }
        }
        if (!friendIsFound){
            throw new FriendNotFoundException(s,s1);
        }
        return null;
    }

    @Override
    public Collection<Friend> findByCity(String s) {
        if (s == null){
            throw new IllegalArgumentException();
        }
//        ArrayList<Friend> friendsInCity = new ArrayList<>();
//        for (Friend friend: myFriends
//             ) {if (friend.getCity().equals(s)){
//                 friendsInCity.add(friend);
//        }
//        }
        return myFriends.stream().filter(friend -> friend.getCity().equals(s)).toList();
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        Comparator<Friend> compareByCityLastnameFirstname =
                Comparator.comparing(Friend::getCity).thenComparing(Friend::getLastName)
                        .thenComparing(Friend::getFirstName);
        List<Friend> orderedFriends= myFriends.stream().sorted(compareByCityLastnameFirstname)
                .toList();

        return orderedFriends;
    }
}
