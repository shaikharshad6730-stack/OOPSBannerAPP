import java.util.HashMap;
import java.util.Map;

public class OOPSDisplayUC8 {

    // Centralized pattern storage using HashMap
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns once
    static {
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 7;

        StringBuilder[] bannerLines = new StringBuilder[height];

        // Initialize StringBuilders
        for (int i = 0; i < height; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner using HashMap lookup
        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {
                for (int i = 0; i < height; i++) {
                    bannerLines[i].append(pattern[i]).append("   ");
                }
            }
        }

        // Print final banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }
}
