package util;

import java.util.Random;

public class Randomizator {
    private static final String[] JEEP_MODELS = {
            "BMW X5 ", "AUDI Q7 ", "VOLKSWAGEN TOUAREG ", "HONDA CR-V ", " TOYOTA RAV4", "SUZUKI GRAND VITARA"};

    private static final String[] BUS_NAMES = {
            "IKARUS ", "SOLARIS ", " FIAT 309 ", " Mercedes-Benz Travego M ", " Iveco Bus", "FORD TRANSIT"};

    private static final String[] GUNS = {
            "BOMBS", "CANNONS", "ROCKETS", "TORPEDO"};

    private static final String[] SHIPS_MILITARY_MODELS = {
            "FRIGATE", "ROMAN BIREM", "DESTROYER"};

    private static final String[] TRADE_SHIPS_MODELS = {
            "TRAWLER", "HOVERCRAFT", "FERRY"};

    private static final String[] AIRPLANE_MODELS = {
            "BOEING 787", "AIRBUS", "BOEING 797", "BOEING 777"};

    private static final String[] BOMBER_MODELS = {
            "Strategic Bombers", " Dive Bombers", "Fighter-Bombers", "Torpedo Bomber"};

    public static int random(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static String randomJeepModels() {
        return JEEP_MODELS[random(0, JEEP_MODELS.length - 1)];
    }

    public static String randomBusModels() {
        return BUS_NAMES[random(0, BUS_NAMES.length - 1)];
    }

    public static String randomGuns() {
        return GUNS[random(0, GUNS.length - 1)];
    }

    public static String randomMilitaryShips() {
        return SHIPS_MILITARY_MODELS[random(0, SHIPS_MILITARY_MODELS.length - 1)];
    }

    public static String randomTradeShips() {
        return TRADE_SHIPS_MODELS[random(0, TRADE_SHIPS_MODELS.length - 1)];
    }

    public static String randomAirplane() {
        return AIRPLANE_MODELS[random(0, AIRPLANE_MODELS.length - 1)];
    }

    public static String randomBomber() {
        return BOMBER_MODELS[random(0, BOMBER_MODELS.length - 1)];
    }
}
