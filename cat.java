
public class cat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true && (temperature < 46 && temperature > 24)){
            return true;
        }
        else if(summer == false && (temperature < 46 && temperature > 24)){
            return true;
        }
        return false;
    }
}