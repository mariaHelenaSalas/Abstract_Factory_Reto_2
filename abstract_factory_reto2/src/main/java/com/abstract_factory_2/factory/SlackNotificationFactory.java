package com.abstract_factory_2.factory;
import com.abstract_factory_2.Notifications.Notification;
import com.abstract_factory_2.Notifications.SlackNotification;

public class SlackNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }

}
