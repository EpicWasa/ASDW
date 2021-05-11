package ua.epicwasa.sltexample.service.report;

import ua.epicwasa.sltexample.entity.TeaShop;

public abstract class TeaShopReportGenerator {

    public void generateReport(TeaShop content, String reportName){
        save(getHeader() + getBody(content) + getFooter(), reportName);
    }

    protected abstract String getHeader();

    protected abstract String getBody(TeaShop content);

    protected abstract String getFooter();

    protected abstract void save(String data, String filename);

}
