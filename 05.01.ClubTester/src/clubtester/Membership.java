package clubtester;

/**
 * Store details of a club membership.
 * @author Papanastasis Zacharias
 * @version 2.11.2015
 */
public class Membership {
    private String name; // The name of the member
    private int month; // The month in which the membership was taken out
    private int year; // The year in which the membership was taken out

    /**
     * Constructor for objects of class Membership.
     * @param name The name of the member
     * @param month The month in which they joined (1 ... 12)
     * @param year The year in which they joined
     */
    public Membership(String name, int month, int year){
        if(month < 1 || month > 12) 
            System.out.println(
                "Month " + month + " out of range. Must be in the range 1 ... 12");
            
        else {
            this.name = name;
            this.month = month;
            this.year = year;
        }
    }
    
    /**
     * Gets the name of a member.
     * @return The member's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the subscription month of a member.
     * @return The month in which the member joined
     *         A value in the range 1 ... 12
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Gets the subscription month of a member.
     * @return The year in which the member joined
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return A string representation of this membership
     */
    public String toString()
    {
        return "Member " + name +
               " joined in month " +
               month + " of " + year;
    }
    
}
