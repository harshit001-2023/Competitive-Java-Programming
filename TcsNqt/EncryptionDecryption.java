package TcsNqt;

/*the coding question from the TCS NQT exam on 12th November required finding a specific key within an encrypted string
of characters and numbers to decrypt it.

Problem Breakdown
Goal: Identify a single character (the key) that was added to original character values to create an encoded message.
Input: An encrypted string (e.g., AYBTHC) and its corresponding encoded numeric values (e.g., 28 25 37 37 35 37).
Logic: The key's numeric value must fall within a specific range calculated by taking the maximum encoded value minus
26 and the minimum encoded value minus 1*/

import java.util.*;

public class EncryptionDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Example Input Based on Video:
// Encrypted string: AYBTHC
// Encrypted values: 28 25 37 37 35 37 (Note: Video values were approximations, logic holds)

        String encryptedString = sc.next(); // AYBTHC
        int n = encryptedString.length();
        int[] encryptedValues = new int[n];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

// Read values and find min/max
        for (int i = 0; i < n; i++) {
            encryptedValues[i] = sc.nextInt();
            if (encryptedValues[i] < minVal) minVal = encryptedValues[i];
            if (encryptedValues[i] > maxVal) maxVal = encryptedValues[i];
        }

// 1. Calculate the range for the key (10:03 - 10:36)
// Minimum possible key value is based on highest encrypted value minus 26 (max letter value)
        int lowerBound = Math.max(1, maxVal - 26);
// Maximum possible key value is based on lowest encrypted value minus 1 (min letter value)
        int upperBound = minVal - 1;

        char validKey = ' ';

// 2. Find the character in the encrypted string that fits the key range (13:03 - 13:46)
        for (int i = 0; i < n; i++) {
            char currentChar = encryptedString.charAt(i);
            int charValue = currentChar - 'A' + 1; // Assuming uppercase A=1, B=2...

            if (charValue >= lowerBound && charValue <= upperBound) {
                validKey = currentChar;
                break;
            }
        }

// 3. Decrypt the message (16:04 - 17:02)
        int keyValue = validKey - 'A' + 1;
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int originalCharVal = encryptedValues[i] - keyValue;
            decryptedMessage.append((char)(originalCharVal + 'A' - 1));
        }

        System.out.println("Key: " + validKey);
        System.out.println("Decrypted Message: " + decryptedMessage.toString());
    }
}
