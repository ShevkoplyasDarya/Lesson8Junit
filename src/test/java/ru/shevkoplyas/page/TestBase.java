package ru.shevkoplyas.page;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

    }
}
