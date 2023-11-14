package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;


class ibankTest {

    @BeforeEach
    void setUp() {
        open("http://localhost:9999");
    }

    @Test
    void main() {
    }
}