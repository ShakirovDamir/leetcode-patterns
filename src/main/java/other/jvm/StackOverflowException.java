package other.jvm;

/*
https://www.youtube.com/watch?v=FTR-_QqcH-I
 */

public class StackOverflowException {
    public static void main(String[] args) {
        fire();
    }

    public static void fire() {
        fire();
    }
}

