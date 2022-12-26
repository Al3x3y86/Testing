package com.example.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    final String email1 = "test1@sky.ru";
    final String email2 = "test2sky.ru";
    final String login1 = "Test1";
    final String login2 = "Test2";

    User user1;
    User user2;
    User user3;

    @BeforeEach
    public void setUp (){
        user1 = new User(login1, email1);
        user2 = new User(login2, email2);
        user3 = new User();
    }

    @Test
    @DisplayName("Создания объекта User с передачей в него двух параметров")
    void testUserWithParameters(){
        assertNotNull(user1.getLogin());
        assertNotNull(user1.getEmail());
    }

    @Test
    @DisplayName("Создания объекта без передачи в него параметров")
    void testUserWithoutParameters(){
        assertNull(user3.getLogin());
        assertNull(user3.getEmail());
    }

    @Test
    @DisplayName("Тест протестирует установлен ли корректный Email")
    void testEmail() {
        assertTrue(user1.checkEmail(user1.getEmail()));
    }

    @Test
    @DisplayName("Тест, который определяет, равны ли login и email (Они не должны быть равны)")
    void testParameterEquality(){
        assertNotEquals(user1.getEmail(), user1.getLogin());
    }
}
