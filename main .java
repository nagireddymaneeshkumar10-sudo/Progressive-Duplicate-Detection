package progressiveduplicatedetection;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Progressive Duplicate Detection");
        System.out.println("======================================");

        DuplicateDetector detector = new DuplicateDetector();
        detector.loadSampleData();
        detector.detectDuplicates();

    }
}
