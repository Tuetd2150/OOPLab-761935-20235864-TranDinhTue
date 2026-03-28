import java.util.Scanner;
public class 6_4_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the month (e.g., January, Jan., Jan, or 1): ");
                String monthInput = scanner.nextLine().trim().toLowerCase();
                switch (monthInput) {
                    case "january": case "jan.": case "jan": case "1": month = 1; break;
                    case "february": case "feb.": case "feb": case "2": month = 2; break;
                    case "march": case "mar.": case "mar": case "3": month = 3; break;
                    case "april": case "apr.": case "apr": case "4": month = 4; break;
                    case "may": case "5": month = 5; break;
                    case "june": case "jun.": case "jun": case "6": month = 6; break;
                    case "july": case "jul.": case "jul": case "7": month = 7; break;
                    case "august": case "aug.": case "aug": case "8": month = 8; break;
                    case "september": case "sep.": case "sep": case "9": month = 9; break;
                    case "october": case "oct.": case "oct": case "10": month = 10; break;
                    case "november": case "nov.": case "nov": case "11": month = 11; break;
                    case "december": case "dec.": case "dec": case "12": month = 12; break;
                    default: throw new IllegalArgumentException("Invalid month. Please enter a valid month.");
                }
                System.out.print("Enter the year (e.g., 1999): ");
                String yearInput = scanner.nextLine().trim();
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                    continue;
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        int daysInMonth;
        switch (month) {
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.println("Number of days in the month: " + daysInMonth);
        scanner.close();
    }
}