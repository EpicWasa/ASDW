package ua.epicwasa.sltexample.service.writer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TxtWriter extends Writer {

    @Override
    public void write(Object o, String filename){
        try(FileOutputStream out = new FileOutputStream(
            filename+".txt");
            ObjectOutputStream obout = new ObjectOutputStream(out)) {

            obout.writeObject(o);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
