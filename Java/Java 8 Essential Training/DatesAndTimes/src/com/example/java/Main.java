package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        //Original API
        Date date = new Date();
        System.out.println(date);

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2009, 1, 28);
        gregorianCalendar.add(GregorianCalendar.DATE, 1);
        Date date1 = gregorianCalendar.getTime();
        System.out.println(date1);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(date1));

        //Java 8 API version
        LocalDateTime locale = LocalDateTime.now();
        System.out.println(locale);

        LocalDate localDate = LocalDate.of(2009, 1, 28);
        System.out.println(localDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(timeFormatter.format(localDate));

        DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(timeFormatter1.format(localDate));
    }
}
