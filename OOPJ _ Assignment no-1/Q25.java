class Q25{
    public static void main(String[] args) {

        float lf1 = 28.08f;
    
        Float lf = new Float(lf1);
        byte B1 = lf.byteValue();
         System.out.println("float instance into byte = "+ B1);

         short sh = lf.shortValue();
         System.out.println("float instance into short = "+ sh);
         
         int j = lf.intValue();
         System.out.println("float instance into integer = "+ j);
         
         long l1 = lf.longValue();
         System.out.println("float instance into long = "+ l1);

         float f = lf.floatValue();
         System.out.println("float instance into float = "+ f);

         double d = lf.doubleValue();
         System.out.println("float instance into double = "+ d);

    }
   


}
 
    