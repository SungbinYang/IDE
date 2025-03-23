package me.sungbin.inflearn.intellij.chap4;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

class StaticTest {

    @Test
    void name() {
        Calendar c = new GregorianCalendar(Locale.KOREAN);
    }
}