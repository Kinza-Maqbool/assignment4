

import java.util.Arrays;
import java.io.*; 

public class BinarySearchTime {

    private BinarySearchTime() { }

    
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}

    
   
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); 
      
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

       
        Arrays.sort(allowlist);

        
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearchTime.indexOf(allowlist, key) == -1)
                StdOut.println(key);

        }
          long end = System.currentTimeMillis(); 
        System.out.println("Total time taken: " + 
                                    (end - start) + "ms"); 
    }
}

