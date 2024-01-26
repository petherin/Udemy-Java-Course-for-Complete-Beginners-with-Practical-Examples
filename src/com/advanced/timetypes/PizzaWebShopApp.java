package com.advanced.timetypes;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebShopApp {
    public static void main(String[] args) {
        LocalTime openingTime = LocalTime.of(11,0);
        LocalTime closingTime= LocalTime.of(22,0);
        System.out.println("The restaurant is open from "+ openingTime + " to " + closingTime + " every day.");

        LocalDate orderDate= LocalDate.now().minusDays(3);
        System.out.println("The pizza was ordered on " + orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("Submitted the order " + orderDateTime);

        LocalTime deliveryTime=LocalTime.of(1,10);
        System.out.println("Delivery time: " + deliveryTime);

        LocalDateTime estimatedDeliveryDateTime=orderDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.println("Estimated delivery time: " + estimatedDeliveryDateTime);

        LocalDateTime realDeliveryDateTime=orderDateTime.plusMinutes(90);
        System.out.println("The real delivery time was: " + realDeliveryDateTime);

        long differenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime, realDeliveryDateTime);
        System.out.println("Difference: " + differenceBetweenEstimatedAndReal + " minutes");

        if (estimatedDeliveryDateTime.isBefore(realDeliveryDateTime)){
            System.out.println("The pizza did not arrive in time");
        } else {
            System.out.println("The pizza arrived in time");
        }

        HijrahDate hijrahDate=  HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on Hijrah calendar I ordered my pizza on: " + hijrahDate);

        ZonedDateTime myLocalDateTime=orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        System.out.println("The time I ordered pizza was: " + myLocalDateTime + " in Budapest");
        ZonedDateTime tokyoDateTime=myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("The time I ordered pizza was: " + tokyoDateTime + " in Tokyo");

        for (String zoneID : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneID);}
    }
}
