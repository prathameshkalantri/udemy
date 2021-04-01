
public class leap {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0){
                return true;
            }
            else{
                System.out.println(false);
            }
            
        }
        return false;
        
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long minutesInYear = 60 * 24 * 365;
            long year = (minutes / minutesInYear);
            long  day = (minutes / 60 / 24) % 365;
        
            System.out.println(minutes + " min = " + year + "y and " + day + "d");
        }
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        switch(month){
            case 1:
            System.out.println("31");
            break;
            case 2:
            if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0){    
                System.out.println("29");
            } else {
                System.out.println("28");
            }
            break;
            case 3:
            System.out.println("31");
            break;
            case 4:
            System.out.println("30");
            break;
            case 5:
            System.out.println("31");
            break;
            case 6:
            System.out.println("30");
            break;
            case 7:
            System.out.println("31");
            break;
            case 8:
            System.out.println("31");
            break;
            case 9:
            System.out.println("30");
            break;
            case 10:
            System.out.println("31");
            break;
            case 11:
            System.out.println("30");
            break;
            case 12:
            System.out.println("31");
            break;
            default:
            System.out.println("invalid");

        }
        return 0;
    }
 
}