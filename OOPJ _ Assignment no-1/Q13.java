class Q13{
    public static void main1(String[] args) {

        short s = 2808;
        String str = Short.toString(s);
        System.out.println(" short value into String = "+str);
        
    }

    public static void main2(String[] args) {

        short s = 2808;
        short s1 = new Short(s);
        System.out.println(" short value into Short instance = "+ s1);
        
    }

    
    public static void main(String[] args) {

        String str = "2808";
        String str1 = new String(str);// instance of string
        short s = new Short(str1); // instance of short
        System.out.println(" short value into Short instance = "+ s);
        
    }







}