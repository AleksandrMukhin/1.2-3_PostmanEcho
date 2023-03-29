package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {
    @Test
    void shouldReturnPhrase(){
        // Given - When - Then //
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
               // .contentType("text/plain; charset=UTF-8")
                .body("Ежи появились на Земле около 58 миллионов лет назад") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Ежи появились на Земле около 58 миллионов лет назад"))
        ;
    }
}
