package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends TestBase {

    @Test
    public void checkParagraphText() {

        TyposPage page = new TyposPage(driver);

        page.open();

        String text = page.getTypoParagraphText();

        // 1. Проверяем начало предложения
        Assert.assertTrue(text.contains("Sometimes you'll see a typo"),"Текст параграфа не содержит ожидаемое начало");

        // 2. Пример проверки полного текста с заменяемой опечаткой (если нужно протестировать баг):
        boolean isCorrectText = text.equals("Sometimes you'll see a typo, other times you won't.") ||
                text.equals("Sometimes you'll see a typo, other times you won,t.");

        Assert.assertTrue(isCorrectText, "Текст содержит неожиданные символы: " + text);
    }
}