import java.util.ArrayList;

public class L1_Finding_Nemo{
    public static void main(String[] args) {
        // Test with different input sizes
        testPerformance(100);   // Small size
        testPerformance(1000);  // Medium size
        testPerformance(10000); 
        testPerformance(100000);
        testPerformance(1000000);// Large size
        testPerformance(10000000);
    }

    public static void testPerformance(int size) {
        ArrayList<String> fish = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            fish.add("fish" + i);
        }
        fish.add("nemo");  // Add "nemo" at the end for testing
        System.out.println("Testing with input size: " + size);
        findNemo2(fish);
    }

    public static void findNemo2(ArrayList<String> fish) {
        long t0 = System.nanoTime();
        for (int i = 0; i < fish.size(); i++) {
            if (fish.get(i).equals("nemo")) {
                System.out.println("Found NEMO!");
            }
        }
        long t1 = System.nanoTime();
        System.out.println("Call to find Nemo took " + (t1 - t0) / 1_000_000 + " milliseconds.");
    }
}


