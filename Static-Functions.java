public class OOPSDisplayUC6 {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[7];

        // Build each row dynamically using helper methods
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}
