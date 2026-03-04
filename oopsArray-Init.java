public class OOPSDisplayUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {
                String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     "),
                String.join("", "*     * ", "*     * ", "*     * ", "*     "),
                String.join("", "*     * ", "*     * ", " *****   ", " ***** "),
                String.join("", "*     * ", "*     * ", "*       ", "     * "),
                String.join("", "*     * ", "*     * ", "*       ", "     * "),
                String.join("", " *****   ", " *****   ", "*       ", " *****  ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
