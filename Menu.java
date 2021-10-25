import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);

    Menu(){
        mainMenu();
    }

    public void mainMenu(){
        int status = 0;
        System.out.println("Welcome to the Invoice App\n");
        while(status != 9) {
            System.out.println("" +
                    "Option 1: Company Profile\n" +
                    "Option 2: Add Client\n" +
                    "Option 9: Exit\n");
            status = scnr.nextInt();
            switch(status){
                case 1:
                    companyMenu();
                    break;
                case 2:
                default:
            }


        }
    }

    public void companyMenu(){
        int status = 0;
        String s = "";
        Company company = new Company();
        while(status != 9){
            System.out.println("" +
                    "Option 1: Edit Company Name\n" +
                    "Option 2: Edit Company Phone\n" +
                    "Option 9: Exit\n");
            status = scnr.nextInt();
            switch(status){
                case 1:
                    s = "";
                    System.out.println("Enter Company Name:\n");
                    s = scnr.nextLine();
                    company.setCompanyName(s);
                    break;
                case 2:
                    s = "";
                    System.out.println("Enter Company Phone:\n");
                    s = scnr.nextLine();
                    company.setPhone(s);
                    break;
                default:
                    System.out.println("Select a number corresponding to the menu");
            }
        }
    }





}
