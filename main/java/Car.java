public class Car {
    //для объекта машины:
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    //глобальные переменные всех типов:
    public static byte b = 100;
    public static Byte b1 = 127;
    public static short s = 30000;
    public static Short s1 = 31000;
    public static int i = 216;
    public static Integer i1 = 257;
    public static long l = 150000L;
    public static Long l1 = 5000L;

    public static float f = 5.16F;
    public static Float f1 = 3.14F;
    public static double d = 7.16;
    public static Double d1 = 5.5;

    public static char ch = 'k';
    public static Character ch1 = 'c';

    public static boolean ifTrue = true;
    public static Boolean boo1 = true;


    //сеттеры для переменных:

    public static void setB(byte b) {
        Car.b = b;
    }

    public static void setB1(Byte b1) {
        Car.b1 = b1;
    }

    public static void setS(short s) {
        Car.s = s;
    }

    public static void setS1(Short s1) {
        Car.s1 = s1;
    }

    public static void setI(int i) {
        Car.i = i;
    }

    public static void setI1(Integer i1) {
        Car.i1 = i1;
    }

    public static void setL(long l) {
        Car.l = l;
    }

    public static void setL1(Long l1) {
        Car.l1 = l1;
    }

    public static void setF(float f) {
        Car.f = f;
    }

    public static void setF1(Float f1) {
        Car.f1 = f1;
    }

    public static void setD(double d) {
        Car.d = d;
    }

    public static void setD1(Double d1) {
        Car.d1 = d1;
    }

    public static void setCh(char ch) {
        Car.ch = ch;
    }

    public static void setCh1(Character ch1) {
        Car.ch1 = ch1;
    }

    public static void setIfTrue(boolean ifTrue) {
        Car.ifTrue = ifTrue;
    }

    public static void setBoo1(Boolean boo1) {
        Car.boo1 = boo1;
    }


    //геттеры для переменных:
    public static byte getB() {
        return b;
    }

    public static Byte getB1() {
        return b1;
    }

    public static short getS() {
        return s;
    }

    public static Short getS1() {
        return s1;
    }

    public static int getI() {
        return i;
    }

    public static Integer getI1() {
        return i1;
    }

    public static long getL() {
        return l;
    }

    public static Long getL1() {
        return l1;
    }

    public static float getF() {
        return f;
    }

    public static Float getF1() {
        return f1;
    }

    public static double getD() {
        return d;
    }

    public static Double getD1() {
        return d1;
    }

    public static char getCh() {
        return ch;
    }

    public static Character getCh1() {
        return ch1;
    }

    public static boolean isIfTrue() {
        return ifTrue;
    }

    public static Boolean getBoo1() {
        return boo1;
    }
}
