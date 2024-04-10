package other.jvm;

import java.util.ArrayList;

/*
https://www.youtube.com/watch?v=FTR-_QqcH-I
 */

public class OutOfMemoryException {
    public static void main(String[] args) {
        var list = new ArrayList<byte[]>();

        while (true) {
            list.add(new byte[10 * 1024 * 1024]);
            System.out.printf("Free memory: %d Mb%n", Runtime.getRuntime().freeMemory() / (1024 * 1024));
        }
    }
}
