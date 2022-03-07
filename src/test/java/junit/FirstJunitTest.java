package junit;

import org.junit.jupiter.api.*;

public class FirstJunitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Этот метод выполняется перед всеми тестами!");
    }

    @BeforeEach
    void before() {
        System.out.println("    Этот метод выполняется перед каждым тестом!");
    }

    @AfterEach
    void after() {
        System.out.println("    Этот метод выполняется после каждого теста!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Этот метод выполняется после всех тестов!");
    }

    @Test
    void textTest() {
        System.out.println("        Это первый тест!");
    }

    @Test
    void videoTest() {
        System.out.println("        Это второй тест!");
    }

}
