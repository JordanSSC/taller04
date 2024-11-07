public class Main{
    public static void main(String[] args) {
        ReportCreator reportCreator = ReportCreator.getInstance();
        // ACÁ VAN METODOS, TRABAJEN ESTO XD
        
        ReportFactory pdfFactory = new PDFReportFactory();
        Report pdfReport = pdfFactory.createReport();
        pdfReport.generateContent();

        ReportFactory excelFactory = new ExcelReportFactory();
        Report excelReport = excelFactory.createReport();
        excelReport.generateContent();

        ReportFactory wordFactory = new WordReportFactory();
        Report wordReport = wordFactory.createReport();
        wordReport.generateContent();
    }
}