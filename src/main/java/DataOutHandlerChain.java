import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataOutHandlerChain {

    private List<DataOutHandler> handlers;

    public DataOutHandlerChain(DataOutHandler... handlers) {
        this.handlers = Arrays.asList(handlers);
    }

    public void allHandle(String data) {
        handlers.forEach(handler -> handler.handle(data));
    }
}
