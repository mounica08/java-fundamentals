public class UnderstandPlatformIndependence {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    /**
     * This is the Java stack instruction set. If we have this instruction set we can run java programs
     * anywhere and these are not CPU instructions. This is just like converting into some intermediate
     * layer instead of direct CPU instructions which makes it platform independent
     *
     * MacBook-Air:Java Cookbook mounikakurapati$ javap -c UnderstandPlatformIndependence.class
     * Compiled from "UnderstandPlatformIndependence.java"
     * public class UnderstandPlatformIndependence {
     *   public UnderstandPlatformIndependence();
     *     Code:
     *          0: aload_0
     *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          4: return
     *
     *   public static void main(java.lang.String[]);
     *     Code:
     *          0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc           #13                 // String Hello and welcome!
     *          5: iconst_0
     *          6: anewarray     #2                  // class java/lang/Object
     *          9: invokevirtual #15                 // Method java/io/PrintStream.printf:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
     *         12: pop
     *         13: iconst_1
     *         14: istore_1
     *         15: iload_1
     *         16: iconst_5
     *         17: if_icmpgt     38
     *         20: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *         23: iload_1
     *         24: invokedynamic #21,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
     *         29: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *         32: iinc          1, 1
     *         35: goto          15
     *         38: return
     * }
     */

    /**
     * Sample CPU instructions which will be generated from .class to CPU level instructions
     * mov     x0, #0          ; sum = 0
     * mov     x1, #0          ; i = 0
     *
     * loop:
     *     add     x0, x0, x1
     *     add     x1, x1, #1
     *     cmp     x1, #1000000000
     *     blt     loop
     */


}