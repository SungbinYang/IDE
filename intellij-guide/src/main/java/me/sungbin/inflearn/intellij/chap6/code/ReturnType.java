package me.sungbin.inflearn.intellij.chap6.code;

public class ReturnType {

    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }

    private Integer calculate() {
        return 1;
    }
}
