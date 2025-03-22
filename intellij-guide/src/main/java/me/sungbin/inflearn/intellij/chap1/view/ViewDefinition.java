package me.sungbin.inflearn.intellij.chap1.view;

public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "robert", "robert@gmail.com");
        emailSender.send("test@gmail.com");
    }
}
