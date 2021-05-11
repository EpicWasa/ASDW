package ua.epicwasa.sltexample.service.report;

import java.io.FileWriter;
import java.util.Date;
import ua.epicwasa.sltexample.entity.Tea;
import ua.epicwasa.sltexample.entity.TeaShop;

public class TxtTeaShopReportGenerator extends TeaShopReportGenerator {

    @Override
    protected String getHeader() {
        return "\t\tReport\t\t\n"+
                new Date().toString()+"\n"+
            "The teashop has the following stock:";
    }

    @Override
    protected String getBody(TeaShop content) {
        return "\n\n"+content.toString() + "\n\n";
    }

    @Override
    protected String getFooter() {
        return "Makieiev Maksym, 2018ge\t\tNational Technical University \"Kharkiv Polythechnical University\"";
    }

    @Override
    protected void save(String data, String filename) {
        try(FileWriter writer = new FileWriter(filename + ".txt")){

            writer.write(data);

        }catch (Exception e){
            System.out.println("Cant write to file "+ filename);
        }
    }
}
