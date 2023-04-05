class Q21{
    public static void main(String[] args) {

        long l = 28;
    
        Long ln = new Long(l);
        byte B1 = ln.byteValue();
         System.out.println("long instance into byte = "+ B1);

         short sh = ln.shortValue();
         System.out.println("long instance into short = "+ sh);
         
         int j = ln.intValue();
         System.out.println("long instance into integer = "+ j);
         
         long l1 = ln.longValue();
         System.out.println("long instance into long = "+ l);

         float f = ln.floatValue();
         System.out.println("long instance into float = "+ f);

         double d = ln.doubleValue();
         System.out.println("long instance into double = "+ d);

    }
   


}
 
    