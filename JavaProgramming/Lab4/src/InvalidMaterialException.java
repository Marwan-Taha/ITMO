public class InvalidMaterialException extends Exception{
    public InvalidMaterialException(String message, RuntimeException runtimeException){
        super(message, runtimeException);
    }
}
