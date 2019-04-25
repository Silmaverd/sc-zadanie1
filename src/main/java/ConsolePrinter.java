public class ConsolePrinter implements DataOutHandler {

    @Override
    public void handle(String data) {
        System.out.println(data);
    }
}
