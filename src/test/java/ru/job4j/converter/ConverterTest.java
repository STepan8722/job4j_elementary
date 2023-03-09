package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert350RblThen5Euro() {
        float in = 350;
        float expected = 5;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert6000RblThen100Dlr() {
        float in = 6000;
        float expected = 100;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}