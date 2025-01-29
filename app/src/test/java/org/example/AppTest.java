package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    void testChallengeOutput() {
        // 1. Prepare input and expected output
        String input = "42\n100\n125\n";
        String expectedOutput = "42\n100\n125\n";

        // 2. Redirect System.in to simulate providing the input
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        // 3. Capture System.out in a ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // 4. Run the main method of your challenge solution (e.g., Solution.main)
        String[] args = {}; // or add arguments if required
        App.main(args);

        // 5. Verify the program’s output against the expected output
        // Strip trailing spaces/newlines if needed, but here it should match exactly
        Assertions.assertEquals(expectedOutput, outContent.toString(),
                "The output did not match the expected result.");
    }
}
