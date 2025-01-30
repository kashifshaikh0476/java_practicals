// Arithmetic operations
class practical1 {
    public static void main(String args[]) {
    
        int num1 = 10;
        int num2 = 20;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2; 
        
        System.out.println("Sum is: " + add);
        System.out.println("Difference is: " + sub); 
        System.out.println("Product is: " + mul);
        System.out.println("Quotient is: " + div);
        System.out.println();

        // Relational operator
        boolean result1 = num1 > num2;
        boolean result2 = num1 < num2;
        boolean result3 = num1 == num2;
        boolean result4 = num1 != num2;
        System.out.println("num1 > num2: " + result1);
        System.out.println("num1 < num2: " + result2);
        System.out.println("num1 == num2: " + result3);
        System.out.println("num1 != num2: " + result4);
        System.out.println();

        // Logical operator
        boolean result5 = num1 > 5 && num2 > 5;
        boolean result6 = num1 > 5 || num2 > 5;
        System.out.println("num1 > 5 && num2 > 5: " + result5);
        System.out.println("num1 > 5 || num2 > 5: " + result6);
        System.out.println();

        // Bitwise operator
        int bitwiseA = 10; 
        int bitwiseB = 5;
        int result7 = bitwiseA & bitwiseB;
        int result8 = bitwiseA | bitwiseB;
        int result9 = bitwiseA ^ bitwiseB;
        int result10 = ~bitwiseA;
        System.out.println("bitwiseA & bitwiseB: " + result7);
        System.out.println("bitwiseA | bitwiseB: " + result8);
        System.out.println("bitwiseA ^ bitwiseB: " + result9);
        System.out.println("~bitwiseA: " + result10);
        System.out.println();

        // Conditional (ternary) operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Person is: " + result);
        System.out.println();

        // Assignment operator
        int x = 10;
        x += 5;
        x -= 3;
        x *= 2;
        x /= 4;
        x %= 3;
        System.out.println("Final value of x: " + x);
        System.out.println();

        // Unary operator
        int y = 5;
        int z = ++y;
        int w = y--;
        System.out.println("Pre-increment: " + z);
        System.out.println("Post-decrement: " + w);
    }
}
