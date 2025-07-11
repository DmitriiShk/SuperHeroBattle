package com.superherobattle.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LoggerUtil {

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void log(String message) {
        System.out.println("[" + currentTime() + "] " + message);
    }

    public static void success(String message) {
        System.out.println(GREEN + "[" + currentTime() + "] " + message + RESET);
    }

    public static void error(String message) {
        System.out.println(RED + "[" + currentTime() + "] " + message + RESET);
    }

    public static void info(String message) {
        System.out.println(CYAN + "[" + currentTime() + "] " + message + RESET);
    }

    public static void warn(String message) {
        System.out.println(YELLOW + "[" + currentTime() + "] " + message + RESET);
    }

    private static String currentTime() {
        return LocalTime.now().format(formatter);
    }
}
