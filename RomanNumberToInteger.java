import java.util.Scanner;

class RomanNumberToInteger {

    public int getNumFromRoman(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        // code
        RomanNumberToInteger o = new RomanNumberToInteger();
        Scanner sc = new Scanner(System.in);

        int testCaseSize = sc.nextInt();

        for (int i = 0; i < testCaseSize; i++) {

            String inputNumbers = sc.next();
            int res = 0;
            int prev = 0;
            int curr = 0;
            for (int j = inputNumbers.length() - 1; j >= 0; j--) {
                curr = o.getNumFromRoman(inputNumbers.charAt(j));
                if (curr >= prev) {
                    res += curr;
                } else {
                    res -= curr;
                }
                prev = curr;
            }
            System.out.println(res);
        }
        sc.close();

    }
}