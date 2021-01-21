package eu.senla.task1;

public class Main {
    static byte aByte;
    static short aShort;
    static int aInt;
    static long aLong;
    static float aFloat;
    static double aDouble;
    static char aChar;
    static boolean aBoolean;

    static Byte ByteWrapper;
    static Short ShortWrapper;
    static Integer IntegerWrapper;
    static Long LongWrapper;
    static Float FloatWrapper;
    static Double DoubleWrapper;
    static Character CharWrapper;
    static Boolean BooleanWrapper;
    static String StringWrapper;

    public static void main(String[]args) {
        Number number = new Number();
        number.setAByte((byte)12);
        System.out.println(number.getAByte());

        number.setByteWrapper((byte)13);
        System.out.println(number.getByteWrapper());

        number.setABoolean(true);
        System.out.println(number.getBooleanWrapper()); //null

        number.setAChar('s');
        System.out.println(number.getAChar());

        number.setADouble(12.5);
        System.out.println(number.getADouble());

        number.setDoubleWrapper(135.4);
        System.out.println(number.getDoubleWrapper());

        number.setALong(123456789);
        System.out.println(number.getALong());

        int s = 12;
        Integer i = 100;
        Integer in = 100;
        System.out.println(i == in); //true if less than 127 - use ==

        Integer a = 200;
        Integer an = 200;
        System.out.println(a == an); //false because more than 127

        Integer b = 200;
        Integer bn = new Integer(200);
        System.out.println(b == bn); //false

        Integer bnm = 200;
        Integer abm = 200;
        System.out.println(bnm.equals(abm)); //true if more than 127 - use equals

        int d = 15;
        byte g = (byte) d;
        System.out.println(g);

        String name = "Julia";
        String username = "Julia";
        System.out.println(username == name); //true

        Character sm = 'К';
        Character sn = 'К';
        System.out.println(sm == sn); //false

        Boolean k = true;
        Boolean l = true;
        System.out.println(k == l); //true

        Integer o = 200;
        double p = Double.valueOf(o);
        System.out.println(p);

        String r = "200";
        double u = Double.parseDouble(r);
        System.out.println(u);
}

}



