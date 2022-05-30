package clubtester;

import java.util.Scanner;

/**
 * Testing the Club class.
 * @author Papanastasis Zacharias
 * @version 25.10.2012
 */
public class ClubTester {

    public static void main(String[] args) {
        Club Faces = new Club();
        
        Scanner input = new Scanner(System.in);
        String choice;
        
        do{
            choice = menuChoice();
            if (choice.equals("n")) {
                // Enter information for a new member...
                System.out.println("\nEnter informantion for a new member...");

                System.out.println("Give the member's name: ");
                String name = input.next();

                System.out.println("Give the month the member joined the club: ");
                int month = input.nextInt();
                
                System.out.println("Give the year the member joined the club: ");
                int year = input.nextInt();


                // Managing the member...
                Membership member = new Membership(name, month, year);
                Faces.join(member);

            }
        }while(!choice.equals("x"));
        
        // Print the information concerning the account
        System.out.println("\nThe are "+Faces.numberOfMembers()+
                        " members in the club.");
        for (int i=0; i<Faces.clubList.size(); i++)
            System.out.println(Faces.clubList.get(i).toString());
        
    }
    
    /**
     * Asks the user if he wants to procced using the program or exit
     * @return a String specifying the selection of the user
     */
    static String menuChoice() {

        Scanner input = new Scanner(System.in); // Scan input

		String choice;

        do {
            System.out.println("Press\n\t 'n' to give a new member,"+
				"\n\t 'x' to exit the program.");

			choice = input.nextLine();
		}
		while ((choice.equals("n") || choice.equals("x")) == false);

        return choice;
    }
}
