package hw_17;

import java.time.LocalDateTime;
import java.util.*;

public class FileLoggerConfiguration {
    //| LEVEL | INFO | DEBUG |
    //| INFO	  | X | |
    //| DEBUG | X | X |
    public static Map<Integer,String> loggingLevel= new HashMap<>();

    public  static int level;
    public static String fileNam="Log_"+LocalDateTime.now().getSecond()+".txt";
    public static final long MAXSIZEFILE = 1000;//60000000
    public  String formatWriterFile;

    public void setFormatWriterFile1(String nameMethods, String message){
    formatWriterFile =
            " Current time: ["+ LocalDateTime.now()+ "] Method ["+ nameMethods+ "] Message [" + message+"]";
    }
}
