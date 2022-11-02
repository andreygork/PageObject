package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MoneyTransfer {
    private final SelenideElement heading = $("[data-test-id=dashboard]");
    private final SelenideElement amount = $("[data-test-id=amount] input");
    private final SelenideElement from = $("[data-test-id=from] input");
    private final SelenideElement to = $("[data-test-id=to]");
    private final SelenideElement transferButton = $("[data-test-id=action-transfer]");
    private final SelenideElement error = $("[data-test-id=error-notification]");
    private final SelenideElement cancel = $("[data-test-id=action-cancel]");

    public void moneyTransferVisible() {
        heading.shouldBe(visible);
    }

    public void setTransferAmount(int sum) {
        amount.setValue(String.valueOf(sum));
    }

    public void setFrom(String cardNumber) {
        from.setValue(String.valueOf(cardNumber));
    }

    public void doTransfer() {
        transferButton.click();
    }

    public void errorTransfer() {
        error.shouldBe(visible);
    }
}