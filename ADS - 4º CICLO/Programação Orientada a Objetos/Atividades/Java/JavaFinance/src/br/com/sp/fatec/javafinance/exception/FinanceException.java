package br.com.sp.fatec.javafinance.exception;

public class FinanceException extends Exception {
    public FinanceException(String message) {
        super(message);
    }
    public FinanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
