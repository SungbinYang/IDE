package me.sungbin.inflearn.intellij.chap2.special;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {

    public void copyFocus() {
        List<String> members = new ArrayList<>();

        members.add(new Book().getCourse());
        members.add(new Book().getCourse());
        members.add(new Book().getCourse());
        members.add(new Book().getCourse());
        members.add(new Book().getCourse());
    }
}
