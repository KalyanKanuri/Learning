class Variables {
    public static void main (String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println(z);

        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b);
        System.out.println(c);

        // other data types of Integers are not used as there will be only change in space occupation
        // Int --> int, byte, short, long 
        
        double d = 1.1;
        double e = 2.2;
        double f = d + e;
        System.out.println(f);

        float g = 1.1f;
        float h = 2.2f;
        float i = g + h;
        System.out.println(i);

        char j = 'a';
        char k = 'b';
        char l = (char) (j + k);
        System.out.println(l);

        boolean m = true;
        boolean n = false;
        boolean o = m && n;
        System.out.println(o);
    }
}