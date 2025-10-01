import java.util.Random;

public class AsciiMatrixHello {

    public static void main(String[] args) throws InterruptedException {
        String message = "HELLO UTKARSH SIR";
        int width = 60; // width of the screen
        Random random = new Random();

        // Print 50 lines of animation
        for (int i = 0; i < 50; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < width; j++) {
                if (j >= (width - message.length()) / 2 && j < (width + message.length()) / 2 && i == 25) {
                    // Print the message in the middle
                    line.append(message.charAt(j - (width - message.length()) / 2));
                } else {
                    // Print random matrix-style characters
                    char c = (char) (33 + random.nextInt(94)); // printable ASCII
                    line.append(c);
                }
            }
            System.out.println(line);
            Thread.sleep(50); // delay for animation effect
        }

        System.out.println("\nAnimation Complete!");
    }
}

