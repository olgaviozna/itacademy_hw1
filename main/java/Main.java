public class Main {

    //глобальные переменные:
    public static byte b_global = 85;
    public static Byte b1_global = 114;
    public static short s_global = 31300;
    public static Short s1_global = 29000;
    public static int i_global = 21692;
    public static Integer i1_global = 25700;
    public static long l_global = 153700L;
    public static Long l1_global = 52300L;

    public static float f_global = 3.85F;
    public static Float f1_global = 9.24F;
    public static double d_global = 3.16;
    public static Double d1_global = 4.8;

    public static char ch_global = 'f';
    public static Character ch1_global = 'm';

    public static boolean ifTrue_global = true;
    public static Boolean boo1_global = true;



    public static void main (String[] args) {
        //объект машина:
        Car car1 = new Car();
        car1.setName("Nissan");
        car1.setNumber(1472);

        //локальные переменные:
        byte b_local = 50;
        Byte b1_local = 120;
        short s_local = 30500;
        Short s1_local = 25000;
        int i_local = 159;
        Integer i1_local = 14520;
        long l_local = 150500L;
        Long l1_local = 7000L;

        float f_local = 7.5F;
        Float f1_local = 9.24F;
        double d_local = 2.16;
        Double d1_local = 8.5;

        char ch_local = 'e';
        Character ch1_local = 'x';

        boolean ifTrue_local = true;
        Boolean boo1_local = true;

        // i_local = b_local; значение переменной b_local присваивается переменной i_local
        // b_local = i_local; ошибка

        //вывод в консоль данных объекта машины:
        System.out.println(car1.getName());
        System.out.println(car1.getNumber());

        //вывод в консоль локальных переменных:
        System.out.println(b_local);
        System.out.println(b1_local);
        System.out.println(s_local);
        System.out.println(s1_local);
        System.out.println(i_local);
        System.out.println(i1_local);
        System.out.println(l_local);
        System.out.println(l1_local);
        System.out.println(f_local);
        System.out.println(f1_local);
        System.out.println(d_local);
        System.out.println(d1_local);
        System.out.println(ch_local);
        System.out.println(ch1_local);
        System.out.println(ifTrue_local);
        System.out.println(boo1_local);

        //вывод в консоль глобальных переменных:
        System.out.println(b_global);
        System.out.println(b1_global);
        System.out.println(s_global);
        System.out.println(s1_global);
        System.out.println(i_global);
        System.out.println(i1_global);
        System.out.println(l_global);
        System.out.println(l1_global);
        System.out.println(f_global);
        System.out.println(f1_global);
        System.out.println(d_global);
        System.out.println(d1_global);
        System.out.println(ch_global);
        System.out.println(ch1_global);
        System.out.println(ifTrue_global);
        System.out.println(boo1_global);

        //вывод в консоль глобальных переменных из другого Класса:
        System.out.println(Car.b);
        System.out.println(Car.b1);
        System.out.println(Car.s);
        System.out.println(Car.s1);
        System.out.println(Car.i);
        System.out.println(Car.i1);
        System.out.println(Car.l);
        System.out.println(Car.l1);
        System.out.println(Car.f);
        System.out.println(Car.f1);
        System.out.println(Car.d);
        System.out.println(Car.d1);
        System.out.println(Car.ch);
        System.out.println(Car.ch1);
        System.out.println(Car.ifTrue);
        System.out.println(Car.boo1);
        System.out.println("Homework1 is done! I hope, it's correct. Thank you!");
    }

}
