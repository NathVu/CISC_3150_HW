import java.util.*;

public class UserIsADumbassException extends IllegalArgumentException{

    public UserIsADumbassException() {
        super("A number is missing");
    }
}
