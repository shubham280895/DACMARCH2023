class Q20{
    public static void main1(String[] args) {
        long l = 2808;
        String str = Long.toString(l);
         System.out.println("long value into String = "+str);
        
    }
    public static void main2(String[] args) {
        long l = 2808;
        Long l1 = new Long(l);
         System.out.println("long value into long instance = "+l1);
        
    }
    public static void main(String[] args) {
        String str = "2808";
        String str1 = new String(str);
        Long l = new Long(str1);
         System.out.println("String instance into long instance = "+l);
        
    }
    public static void main4(String[] args) {
        long l = 2808;
        String str = Long.toBinaryString(l);
         System.out.println("long value into binary string = "+str);
        
         String str1 = Long.toOctalString(l);
         System.out.println("long value into octal string = "+str1);

         String str2 = Long.toHexString(l);
         System.out.println("long value into Hexadecimal string = "+str2);


    }
}