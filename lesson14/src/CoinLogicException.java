public class CoinLogicException extends Exception{

    public CoinLogicException() {
        super();
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(Throwable cause) {
        super(cause);
    }

    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }
}
