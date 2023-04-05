class Q29{
    public static void main(String[] args) {

        double d1 = 28.08;
    
        Double dl = new Double(d1);
        byte B1 = dl.byteValue();
         System.out.println("double instance into byte = "+ B1);

         short sh = dl.shortValue();
         System.out.println("double instance into short = "+ sh);
         
         int j = dl.intValue();
         System.out.println("double instance into integer = "+ j);
         
         long l1 = dl.longValue();
         System.out.println("double instance into long = "+ l1);

         float f = dl.floatValue();
         System.out.println("double instance into float = "+ f);

         double d = dl.doubleValue();
         System.out.println("double instance into double = "+ d);

    }
   


}