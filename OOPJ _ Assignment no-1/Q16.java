class Q16{
    public static void main1(String[] args) {
        int i = 2808;
        String str = Integer.toString(i);
         System.out.println("int value into String = "+str);
        
    }
    public static void main2(String[] args) {
        int i = 2808;
        int j = new Integer(i);
         System.out.println("int value into Integer instance = "+j);
        
    }
    public static void main3(String[] args) {
        String str = "2808";
        String str1 = new String(str);
        int i = new Integer(str1);
         System.out.println("String instance into Integer instance = "+i);
        
    }
    public static void main(String[] args) {
        int i = 2808;
        String str = Integer.toBinaryString(i);
         System.out.println("int value into binary string = "+str);
        
         String str1 = Integer.toOctalString(i);
         System.out.println("int value into octal string = "+str1);

         String str2 = Integer.toHexString(i);
         System.out.println("int value into Hexadecimal string = "+str2);


    }
}