package com.abstract_factory_2.factory;
import com.abstract_factory_2.Notifications.Notification;
import com.abstract_factory_2.Notifications.TelegramNotification;

public class TelegramNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new TelegramNotification();
    }

}
