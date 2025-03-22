package me.sungbin.inflearn.intellij.chap1.view;

public class ViewArguments {

    public void viewArguments() {
        EmailSender emailSender = new EmailSender(1L, "robert", "<EMAIL>");
        EmailSender.receive("<EMAIL>", "<EMAIL>");
    }
}
