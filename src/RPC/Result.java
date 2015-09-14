package RPC;

/**
 * Created by thaonzo on 14/09/2015.
 * Get the result of RPC battle
 */
public enum Result {
    WIN("Win"), LOST("Lost"), NUL("Nul");

    private final String result;

    Result(String res) {
        this.result = res;
    }

    public String GetResult() {
        return this.result;
    }
}
