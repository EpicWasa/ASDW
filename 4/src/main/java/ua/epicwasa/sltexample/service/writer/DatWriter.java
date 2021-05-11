package ua.epicwasa.sltexample.service.writer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DatWriter extends Writer {

    @Override
    public void write(Object o, String filename){

        try (FileOutputStream fout = new FileOutputStream(filename + ".dat");
             ObjectOutputStream objectOut = new ObjectOutputStream(fout)) {
            objectOut.writeObject(o);
        }catch (Exception e){
            System.out.println(String.format("Can't write this object {}", o));
        }
    }

}
