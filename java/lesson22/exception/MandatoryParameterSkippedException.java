package lesson22.exception;

public class MandatoryParameterSkippedException extends RuntimeException {

    public MandatoryParameterSkippedException(String message) {
        super(message);
    }
}
