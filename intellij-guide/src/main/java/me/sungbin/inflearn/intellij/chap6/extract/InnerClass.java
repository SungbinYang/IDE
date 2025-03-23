package me.sungbin.inflearn.intellij.chap6.extract;

public class InnerClass {

    public void moveInnerClass() {
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

}
