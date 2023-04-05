class Q6
{
public static void main(String[] args) 
    {
        boolean b = true;
        String str = String.valueOf(b);
        System.out.println("boolean value into String = "+str);

        Boolean B = new Boolean ("true");
        System.out.println("boolean value into Boolean instance = "+B);

        String str1 = "Cdac";
        boolean B1 = Boolean.valueOf(str1);
        System.out.println("String value into boolean value = "+str1);

        String str2 = "Cdac Mumbai";
        Boolean B2 = new Boolean(str2);
        System.out.println("String value into Boolean instance = "+str2);

    }
}