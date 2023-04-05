class Q8{
    public static void main(String[] args) {

        byte b = 123; // byte value
        String str = Byte.toString(b); // String value
        System.out.println("byte value into String = "+ str );
        

        byte B = 123; // byte value
        byte b1 = new Byte(B); // String instance
        System.out.println("byte value into Byte instance. = "+ b1 );

        String str1 = "123";
        String str2 = new String(str1); // String instance
        byte b2 = new Byte(str2); // Byte instance

        System.out.println("String instance into Byte instance. = "+ b2 );
    }
}