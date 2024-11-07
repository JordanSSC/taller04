public class ReportCreator {
    private static ReportCreator instance;
    private ReportCreator(){};

    public static ReportCreator getInstance(){
        if(instance==null){
            instance = new ReportCreator();
        }
        return instance;
    }

    public void generateReport(){
    }

}
