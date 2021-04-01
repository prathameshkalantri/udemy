
public class byteConverter {
    public static void printMegaByteAndKiloByte(int kiloByte){
        if(kiloByte < 0){
            System.out.println("Invalid Value");
        }
        else if(kiloByte > 0){
            int kbytes = kiloByte % 1024;
            int mbytes = Math.round(kiloByte / 1024);
            System.out.println(kiloByte + "KB = " + mbytes + "MB and "+ kbytes + "KB");

        }
    }

}