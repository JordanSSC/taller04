public class ConcreteReportFactory extends ReportFactory{
    @Override
    public Report createReport(String format){
        switch(format.toLowerCase()){
            case "pdf":
                return new PDFReport();
            // etc
            default:
                throw new IllegalArgumentException("incorrect format");
        }

    }
}