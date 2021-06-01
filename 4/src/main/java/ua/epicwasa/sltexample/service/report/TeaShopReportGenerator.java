package ua.epicwasa.sltexample.service.report;

import java.io.FileWriter;
import ua.epicwasa.sltexample.entity.TeaShop;

public abstract class TeaShopReportGenerator {

    public final void generateReport(TeaShop content, String reportFileName){
        save(getHeader() + getBody(content) + getFooter(), reportFileName);
    }

    protected abstract String getHeader();

    protected abstract String getBody(TeaShop content);

    protected abstract String getFooter();

    private static void save(String data, String filename){
        try(FileWriter writer = new FileWriter(filename)){

            writer.write(data);

        }catch (Exception e){
            System.out.println("Cant write to file "+ filename);
        }
    }
}
