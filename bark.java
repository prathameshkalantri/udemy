
public class bark {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            System.out.println("Invalid Value");
        }
        else if(barking == true && hourOfDay < 8){
            // System.out.println("true");
            return true;
        }
        else if(barking && hourOfDay > 22){
            System.out.println("true");
        }
        else if(!barking){
            System.out.println("dog is not barking");
        }
        else{
            System.out.println("false");
        }
        
        return false;
    }

}