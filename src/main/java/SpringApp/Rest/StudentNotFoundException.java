package SpringApp.Rest;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }


}
