package com.abstract_factory_2.Notifications;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("WhatsApp message sent!");
    }

    @Override
    public void logMessage() {
        System.out.println("Logging WhatsApp message.");
    }
}
