package me.sungbin.inflearn.intellij.chap6.extract;

import java.util.List;

public class Method {

    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private static void loopAuthors(Book book) {
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    private static void print(String s) {
        if ("robert".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book {
        private String title;

        private long price;

        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
