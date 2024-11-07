public class ReportCreator {
    private static ReportCreator instance;
    private ReportFactory reportFactory;
    private ReportCreator(){
        reportFactory = new ConcreteReportFactory();
    };

    public static ReportCreator getInstance(){
        if(instance==null){
            instance = new ReportCreator();
        }
        return instance;
    }

    public void generateReport(String format){
        Report report = reportFactory.createReport(format);
        report.generate();
    }
    public void sendNot(){
        //
    }
}
