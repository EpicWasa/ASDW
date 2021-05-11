package ua.epicwasa.sltexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ua.epicwasa.sltexample.entity.Tea;
import ua.epicwasa.sltexample.entity.TeaShop;
import ua.epicwasa.sltexample.repo.TeaRepo;
import ua.epicwasa.sltexample.service.FileType;
import ua.epicwasa.sltexample.service.report.HtmlTeaShopReportGenerator;
import ua.epicwasa.sltexample.service.report.TxtTeaShopReportGenerator;
import ua.epicwasa.sltexample.service.writer.Writer;
import ua.epicwasa.sltexample.service.writer.WriterFactory;

@SpringBootApplication
public class SltexampleApplication {

    @Autowired
    TeaRepo teaRepo;

    public static void main(String[] args) {
        SpringApplication.run(SltexampleApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {


            TeaRepo teaRepo = ctx.getBean(TeaRepo.class);
            WriterFactory writerFactory = new WriterFactory();
            Writer writer = writerFactory.getWriter(FileType.XML);

            Iterable<Tea> teaList = teaRepo.findAll();
            TeaShop teaShop = TeaShop.getInstance();
            teaShop.setTeas(teaList);

            writer.write(teaShop, "teashop");
            writerFactory.getWriter(FileType.TXT).write(teaShop, "teaShop");
            writerFactory.getWriter(FileType.DAT).write(teaShop, "teaShop");

            new TxtTeaShopReportGenerator().generateReport(teaShop, "txtReport");
            new HtmlTeaShopReportGenerator().generateReport(teaShop, "txtReport");

            TeaShop secondTeaShop = TeaShop.getInstance();
            secondTeaShop.setTeas(null);

            writer.write(teaShop, "teashop_modified");



            System.out.println(teaShop);
        };
    }

}
