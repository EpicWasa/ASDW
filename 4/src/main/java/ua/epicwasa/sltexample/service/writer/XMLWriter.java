package ua.epicwasa.sltexample.service.writer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

public class XMLWriter extends Writer {

    @Override
    public void write(Object o, String filename){
        XmlMapper xmlMapper = new XmlMapper();

        try {
            xmlMapper.writeValue(new File(filename+ ".xml"), o);
        }catch (Exception e){
            System.out.println(String.format("Can't write this object {}", o));
        }
    }

}
