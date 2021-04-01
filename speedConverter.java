public class speedConverter{

    public static long toMilesPerHour(double kiloMeterPerHour){
        if(kiloMeterPerHour < 0){
            return -1;
        }
        return Math.round(kiloMeterPerHour / 1.6);
    }
    public static void printConversion(double kiloMeterPerHour){
        if(kiloMeterPerHour < 0){
            System.out.println("Invalid Number");
        }
        else{
            long milesPerHour = toMilesPerHour(kiloMeterPerHour);
            System.out.println(kiloMeterPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }
}