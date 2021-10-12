package StayAbroad.Family;

import StayAbroad.Persistence.FamilyDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import sun.util.calendar.CalendarUtils;

public class FamilyService {

    private final FamilyDAO fDAO = new FamilyDAO();
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Integer op = 0;
    private List<Family> fFist1 = new ArrayList();
    private List<Family> fFist2 = new ArrayList();
    private List<Family> fFist3 = new ArrayList();

    public void menuFamily() throws Exception {
        do {
            System.out.println("Select the type of families you want to list:");
            System.out.println("1. At least a certain amount of children.\n2. Where their names end"
                    + " with a certain letter.\n3. Their email is of a certain type."
                    + "\n4. Show list of families.\n5. Add another family.\n0. Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Not a number!\n try again.");
                sc.next();
            }
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the amount of children to list:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Not a number!\ntry again");
                        sc.next();
                    }
                    String sql = "num_children >= " + sc.nextInt();
                    try {
                        createQuery(sql);
                        
                        System.out.println("Families that meet the requirements:");
                        for (Family family : fFist1) {
                            System.out.println(family);
                        }
                        TimeUnit.SECONDS.sleep(3);
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                case 0:
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals(0));
    }

    private String createQuery(String sql) throws Exception {
        try {
            fDAO.queryFamily(fFist1, sql);
        } catch (Exception e) {
            throw e;
        }
        return null;
    }
}
