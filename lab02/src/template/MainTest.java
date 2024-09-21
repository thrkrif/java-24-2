package template;
import java.util.Arrays;

public class MainTest {

    // public void seek(int[] queue, int start, String algName) {
    //     System.out.println("queue=" + Arrays.toString(queue) + " start=" + start);
    //     SeekAlgorithm seekAlg = new SeekAlgorithm();
    //     System.out.println(algName + " 알고리즘으로 처리");
    //     if (algName.equals("SCAN")) {
    //         seekAlg.seekBySCAN(queue,  start);
    //     }
    //     else if (algName.equals("FCFS")) {
    //         seekAlg.seekByFCFS(queue,  start);
    //     }
    //     else if (algName.equals("SSTF")) {
    //         seekAlg.seekBySSTF(queue, start);
    //     }
    // }

    public MainTest() {
        int[] queue = { 70,  153,  24,  57,  140,  15,  115,  80, 85 };
        int start = 43;

        SeekStrategy[] seekStrategies  = {new FCSSSeekStrategy(), new SSTFSeekStrategy()};
        DiskScheduler scheduler = new DiskScheduler();

        for (SeekStrategy seekStrategy : seekStrategies) {
            scheduler.setSeekStrategy(seekStrategy);
            scheduler.executeSeek(queue,start);
        }

        // // seek
        // String[] algorithmNames = {"SCAN", "FCFS", "SSTF", "SCAN"};
        // for (String algName : algorithmNames) {
        //     seek(queue, start, algName);
        // }

        // System.out.println();
        
        // // seek another example
        // queue = new int[] { 98, 183, 37, 122, 14, 124, 65, 67 };
        // start = 53;
        // algorithmNames = new String[] {"SSTF", "FCFS", "SCAN"};
        // for (String algName : algorithmNames) {
        //     seek(queue, start, algName);
        // }
    }
}
