package Hw_22;

import org.jetbrains.annotations.NotNull;
import java.io.*;

public class FileImpl implements FitnessTracker {
    private String fileName;

    @Override
    public int saveData(String fileName, Object... data) {

        try(BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(fileName,true))){
            for (Object datum : data) {
                bufferedWriter.write(datum.toString());
                bufferedWriter.newLine();
            }
            setFileName(fileName);
        }catch (IOException e){
            throw new RuntimeException("Not name File for write");
        }
        return data.length;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
