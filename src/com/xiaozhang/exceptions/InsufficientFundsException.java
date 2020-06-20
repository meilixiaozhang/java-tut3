package com.xiaozhang.exceptions;

// checked -> exception
// unchecked -> runtime exception
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
