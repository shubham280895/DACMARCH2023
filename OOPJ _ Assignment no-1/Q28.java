class Q28{
    public static void main1(String[] args) {
        double d = 28.08;
        String str = Double.toString(d);
         System.out.println("Double value into String = "+str);
        
    }
    public static void main2(String[] args) {
        double d  = 28.08;
        double d1 = new Double(d);
         System.out.println("double value into double instance = "+d1);
        
    }
    public static void main3(String[] args) {
        String str = "2808";
        String str1 = new String(str);
        Double d = new Double(str1);
         System.out.println("String instance into double instance = "+d);
        
    }
    public static void main(String[] args) {
        double d = 28.08;
        String str = Long.toBinaryString(Double.doubleToLongBits(d));
         System.out.println("double value into binary string = "+str);
        
         String str1 = Long.toOctalString(Double.doubleToLongBits(d));
         System.out.println("double value into octal string = "+str1);

         String str2 = Double.toHexString(d);
         System.out.println("double value into Hexadecimal string = "+str2);

    }
}