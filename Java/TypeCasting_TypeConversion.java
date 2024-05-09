class TypeCastingTypeConversion {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before conversion: " + a);
        byte b = 5;
        // Type conversion (implicit conversion)
        a = b;
        System.out.println("after implicit conversion: " + a);
        // Type Casting (explicit conversion)
        b = (byte) a;
        System.out.println("after explicit conversion" + b);

        // Type Promotion
        // here byte range is 127 but the multiplication operation gives the result as 300 which is out of 
        // byte range, so Java can promote the type to int

        byte var1 = 10;
        byte var2 = 30;
        int result = var1 * var2;
        System.out.println("After promotion: " + result);
    }
}