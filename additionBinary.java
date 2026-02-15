class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;   // last index of a
        int j = b.length() - 1;   // last index of b
        int carry = 0;            // initially carry is 0

        String result = "";

        // loop until both strings finish
        while (i >= 0 || j >= 0) {

            int digit1 = 0;
            int digit2 = 0;

            // get digit from a
            if (i >= 0) {
                digit1 = a.charAt(i) - '0';
                i--;
            }

            // get digit from b
            if (j >= 0) {
                digit2 = b.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;

            if (sum == 0) {
                result = "0" + result;
                carry = 0;
            }
            else if (sum == 1) {
                result = "1" + result;
                carry = 0;
            }
            else if (sum == 2) {
                result = "0" + result;
                carry = 1;
            }
            else {   // sum == 3
                result = "1" + result;
                carry = 1;
            }
        }

        // if carry left
        if (carry == 1) {
            result = "1" + result;
        }

        return result;
    }
}
