package util;

public abstract class Validator {

    private Validator() {
    }

    public static boolean isValidField(String txt) {
        return txt != null && txt.length() > 0 ;
    }

    public static boolean isValidInput(int num) {
        return num > 0 ;
    }

    public static boolean exceptionMessage() {
        throw new IllegalArgumentException("Invalid input!");
    }

}
