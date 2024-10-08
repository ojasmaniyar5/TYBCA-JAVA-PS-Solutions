class InvalidData extends Exception {
    InvalidData(String msg) { super(msg); }
}

public class Slip9_B {
    static void validate(String pan, String mobile) throws InvalidData {
        if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]") || !mobile.matches("[789][0-9]{9}"))
            throw new InvalidData("Invalid Data");
        System.out.println("PAN: " + pan + ", Mobile: " + mobile);
    }

    public static void main(String[] args) {
        try { validate("ABCDE1234F", "9876543210"); }
        catch (InvalidData e) { System.out.println(e.getMessage()); }
    }
}
