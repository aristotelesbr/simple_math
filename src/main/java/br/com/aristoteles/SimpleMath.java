package br.com.aristoteles;

public class SimpleMath {
    public Double sum(double a, double b) {
        return a + b;
    }

    public Double subtraction(double a, double b) {
        return a - b;
    }

    public Double multiplication(double a, double b) {
        return a * b;
    }

    public Double division(double a, double b) {
        return a / b;
    }

    // Simple test runner for this example only to show how it works in the
    // console.
    public void Test(String message, Runnable block) {
        try {
            System.out.print("RUN tests: \n" + message + " ... ");
            block.run();
            System.out.println("PASS");
        } catch (Throwable e) {
            System.out.println("FAIL");
            System.out.println("Cause: " + e.getMessage());
        }
    }
}
