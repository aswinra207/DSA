class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        // Convert every character into its 8-bit ASCII binary representation
        for (char c : s.toCharArray()) {
            int ascii = (int) c;

            // Convert to binary string
            String bin = Integer.toBinaryString(ascii);
            
            // Pad with leading zeros to ensure exactly 8 bits
            while (bin.length() < 8) {
                bin = "0" + bin;
            }

            binary.append(bin);
        }

        // Two-pointer palindrome check
        int i = 0;
        int j = binary.length() - 1;

        while (i < j) {
            // In Java, use .charAt() to access characters at an index
            if (binary.charAt(i) != binary.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
