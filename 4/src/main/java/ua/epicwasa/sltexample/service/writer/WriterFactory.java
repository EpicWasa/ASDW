package ua.epicwasa.sltexample.service.writer;

import ua.epicwasa.sltexample.service.FileType;

public class WriterFactory {

    public Writer getWriter(FileType filetype) {
        Writer writer = null;
        if (filetype.equals(FileType.XML)) {
            writer = new XMLWriter();
        } else if (filetype.equals(FileType.TXT)) {
            writer = new TxtWriter();
        }else if (filetype.equals(FileType.DAT)) {
            writer = new DatWriter();
        }
        return writer;
    }

}
