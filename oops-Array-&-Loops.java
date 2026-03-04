public class OOPSDisplayUC4 {

    public static void main(String[] args) {

        // Store all banner lines in a String array
        String[] banner = {

            String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     "),
            String.join("", "*     * ", "*     * ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*       ", "     * "),
            String.join("", "*     * ", "*     * ", "*       ", "     * "),
            String.join("", " *****   ", " *****   ", "*       ", " *****  ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
