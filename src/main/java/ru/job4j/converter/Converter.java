package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 350;
        float expected = 5;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("350 rubles are 5. Test result : " + passed);
        in = 6000;
        expected = 100;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("6000 rubles are 100. Test result : " + passed);
    }
}



