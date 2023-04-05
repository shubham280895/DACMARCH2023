class Q24{
    public static void main1(String[] args) {
        float lf = 28.08f;
        String str = Float.toString(lf);
         System.out.println("float value into String = "+str);
        
    }
    public static void main2(String[] args) {
        float lf = 28.08f;
        float lf1 = new Float(lf);
         System.out.println("float value into float instance = "+lf1);
        
    }
    public static void main3(String[] args) {
        String str = "2808";
        String str1 = new String(str);
        Float lf = new Float(str1);
         System.out.println("String instance into Float instance = "+lf);
        
    }
    public static void main(String[] args) {
        float lf = 28.08f;
        
         String str2 = Float.toHexString(lf);
         System.out.println("long value into Hexadecimal string = "+str2);


    }
}