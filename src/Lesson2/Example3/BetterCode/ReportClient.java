package Lesson2.Example3.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class ReportClient {
    static void main() {
     List<Report> r=new ArrayList<>();
     r.add(new WordReportType());
     r.add(new PDFReportType());

     ReportGenerator generator=new ReportGenerator();
     generator.reportGeneration(r);




    }
}


