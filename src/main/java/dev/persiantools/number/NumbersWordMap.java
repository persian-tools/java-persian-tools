package dev.persiantools.number;

import java.util.HashMap;
import java.util.Map;

public class NumbersWordMap {

    private static volatile NumbersWordMap instance;
    private final Map<Long, String> words;

    public NumbersWordMap() {
        words = new HashMap<>();
    }

    public static NumbersWordMap getInstance() {
        if (instance == null) {
            synchronized (NumbersWordMap.class) {
                if (instance == null) {
                    instance = new NumbersWordMap();
                    instance.addWords();
                }
            }
        }
        return instance;
    }

    private void addWords() {
        words.put(1L, "یک");
        words.put(2L, "دو");
        words.put(3L, "سه");
        words.put(4L, "چهار");
        words.put(5L, "پنج");
        words.put(6L, "شش");
        words.put(7L, "هفت");
        words.put(8L, "هشت");
        words.put(9L, "نه");
        words.put(10L, "ده");
        words.put(11L, "یازده");
        words.put(12L, "دوازده");
        words.put(13L, "سیزده");
        words.put(14L, "چهارده");
        words.put(15L, "پانزده");
        words.put(16L, "شانزده");
        words.put(17L, "هفده");
        words.put(18L, "هجده");
        words.put(19L, "نوزده");
        words.put(20L, "بیست");
        words.put(30L, "سی");
        words.put(40L, "چهل");
        words.put(50L, "پنجاه");
        words.put(60L, "شصت");
        words.put(70L, "هفتاد");
        words.put(80L, "هشتاد");
        words.put(90L, "نود");
        words.put(100L, "صد");
        words.put(200L, "دویست");
        words.put(300L, "سیصد");
        words.put(400L, "چهار صد");
        words.put(500L, "پانصد");
        words.put(600L, "شش صد");
        words.put(700L, "هفت صد");
        words.put(800L, "هشت صد");
        words.put(900L, "نه صد");
        words.put(1000L, "هزار");
        words.put(1_000_000L, "میلیون");
        words.put(1_000_000_000L, "میلیارد");
        words.put(1_000_000_000_000L, "تریلیون");
        words.put(1_000_000_000_000_000L, "کوآدریلیون");
    }

    public String find(long key) {
        return this.words.get(key);
    }
}
