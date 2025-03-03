package com.abstract_factory_2.Notifications;

public class TelegramNotification implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("telegram message sent!");
    }

    @Override
    public void logMessage() {
        System.out.println("Logging telegram message.");
    }
}
