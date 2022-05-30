package clubtester;

import java.util.ArrayList;

/**
 * Store details of club membership objects in a flexible-size collection.
 * @author Papanastasis Zacharias
 * @version 2.11.2015
 */
public class Club {
    public ArrayList<Membership> clubList; // A flexible-size collection storing the members
    
    /**
     * Constructor for objects of class Club
     */
    public Club() {
        clubList = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        clubList.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers(){
        return clubList.size();
    }
        
}
