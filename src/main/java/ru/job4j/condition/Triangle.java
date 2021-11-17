package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac ? true : false;
    }

    public static void main(String[] args) {
       boolean rsl = Triangle.exist(2, 2, 2);
       System.out.println(rsl);
    }
}