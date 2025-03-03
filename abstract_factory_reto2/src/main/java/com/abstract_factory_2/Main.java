package com.abstract_factory_2;

import java.util.Scanner;

import com.abstract_factory_2.Notifications.Notification;

import com.abstract_factory_2.factory.NotificationFactory;
import com.abstract_factory_2.factory.SlackNotificationFactory;
import com.abstract_factory_2.factory.TelegramNotificationFactory;
import com.abstract_factory_2.factory.WhatsAppNotificationFactory;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de notificación que desea enviar:");
        System.out.println("1. WhatsApp");
        System.out.println("2. Telegram");
        System.out.println("3. Slack");
        System.out.print("Ingrese el número de su elección: ");

        NotificationFactory notificationFactory = null;

        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        if (option == 1) {
            notificationFactory = new SlackNotificationFactory();
        } else if (option == 2) {
            notificationFactory = new WhatsAppNotificationFactory();
        } else if (option == 3) {
            notificationFactory = new TelegramNotificationFactory();
        } else {
            System.out.println("Opción no válida.");
            System.exit(0);
        }
        
        // Create a notification using the factory
        Notification notification = notificationFactory.createNotification();
        notification.sendMessage();
        
        scanner.close();
    }
}