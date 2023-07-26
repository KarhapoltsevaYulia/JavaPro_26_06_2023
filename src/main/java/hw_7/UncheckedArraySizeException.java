package hw_7;

import java.time.LocalDateTime;
import java.util.zip.DataFormatException;

public class UncheckedArraySizeException extends RuntimeException{
    String message;
    LocalDateTime localDateTime;

    public UncheckedArraySizeException(String message) {
        this.message = message;
        this.localDateTime = LocalDateTime.now();
    }

    public UncheckedArraySizeException(String message, String message1 ) {
        super(message);
        this.message = message1;
        this.localDateTime = LocalDateTime.now();
    }

    public UncheckedArraySizeException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
        this.localDateTime = LocalDateTime.now();
    }

    public UncheckedArraySizeException(Throwable cause, String message) {
        super(cause);
        this.message = message;
        this.localDateTime = LocalDateTime.now();
    }
}
