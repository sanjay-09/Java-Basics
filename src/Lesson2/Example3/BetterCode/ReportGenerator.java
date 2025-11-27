package Lesson2.Example3.BetterCode;

import java.util.List;

public class ReportGenerator {
    public void reportGeneration(List<Report> reports){

        for(Report r:reports){
            r.generateReport();
        }

    }
}
