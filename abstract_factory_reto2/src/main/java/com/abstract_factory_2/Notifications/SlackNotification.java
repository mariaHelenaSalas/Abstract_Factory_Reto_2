package com.abstract_factory_2.Notifications;

public class SlackNotification implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Slack message sent!");
    }

    @Override
    public void logMessage() {
        System.out.println("Logging Slack message.");
    }
}
