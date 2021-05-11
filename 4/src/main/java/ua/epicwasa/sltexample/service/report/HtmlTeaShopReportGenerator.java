package ua.epicwasa.sltexample.service.report;

import java.io.FileWriter;
import java.util.Date;
import ua.epicwasa.sltexample.entity.Tea;
import ua.epicwasa.sltexample.entity.TeaShop;

public class HtmlTeaShopReportGenerator extends TeaShopReportGenerator {

    @Override
    protected String getHeader() {
        return generateHtmlHeader()
            + "<div style=\"text-align:center\">\n"
            + "<h1> Report </h1>\n"
            + "<p>" + new Date().toString()+"</p>\n"
            + "<p> The teashop has the following stock: </p>\n"
            +"</div>";
    }

    private String generateHtmlHeader(){
        return "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<title>Report</title>\n"
            + "</head>\n"
            + "<body>";
    }

    @Override
    protected String getBody(TeaShop content) {
        StringBuilder body = new StringBuilder();
        body.append(generateTableHeader());

        for (Tea t: content.getTeas()){
            body.append(generateTableRow(t));
        }
        body.append("</table>\n");

        return body.toString();
    }

    private String generateTableHeader(){
        return "<table style=\"width:100%;  border: 1px solid black\">\n"
            + "<tr>\n"
            + "    <th>Tea Name</th>\n"
            + "    <th>Tea Origin</th>\n"
            + "    <th>Sort Name</th>\n"
            + "  </tr>";
    }

    private String generateTableRow(Tea t){
        return "<tr>\n"
            + "    <td>" + t.getName() + "</td>\n"
            + "    <td>" + t.getOrigin() + "</td>\n"
            + "    <td>" + t.getTeaSort().getSortName() + "</td>\n"
            + "  </tr>";
    }

    @Override
    protected String getFooter() {
        return "<div style=\"text-align:center\">\n"
            +"<p> Makieiev Maksym, 2018ge National Technical University \"Kharkiv Polythechnical University\" </p> \n"
            +"</div>\n"
            + generateHtmlFooter();
    }

    private String generateHtmlFooter(){
        return "</body>\n" + "</html>";
    }

    @Override
    protected void save(String data, String filename) {
        try(FileWriter writer = new FileWriter(filename + ".html")){

            writer.write(data);

        }catch (Exception e){
            System.out.println("Cant write to file "+ filename);
        }
    }
}
