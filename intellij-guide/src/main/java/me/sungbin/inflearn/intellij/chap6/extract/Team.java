package me.sungbin.inflearn.intellij.chap6.extract;

public class Team {
    public static class Team {
        private String name;

        private String code;

        public Team(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
}
