// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
        if (n < 0) throw new IllegalArgumentException("n must not be negative");
        if (n > 16) throw new IllegalArgumentException("n must not be over than 16, caused return of negative numbers");

        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}