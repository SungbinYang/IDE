package me.sungbin.inflearn.intellij.chap7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Test
    void 기본_디버깅() {
        Long id = productService.register(1L, "jpa");
        assertEquals(1L, id);
    }

    @Test
    void 조건으로_Break() {
        List<Book> books = List.of(
                new Book("1"),
                new Book("2"),
                new Book("3")
        );

        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    @Test
    void evaluate_사용하기() {
        productRepository.save(new Product(1000L, "책"));
        productRepository.save(new Product(2000L, "운동화"));
        productRepository.save(new Product(3000L, "냉장고"));

        Product product = productService.findByName("운동화");

        assertEquals(2000L, product.getAmount());
    }

    public static class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}