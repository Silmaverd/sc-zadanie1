public class Main {

    public static void main(String[] args) {
        DataOutHandlerChain handlerChain = new DataOutHandlerChain(
            new DbInserter(),
            new HttpSender(),
            new ConsolePrinter()
        );

        handlerChain.allHandle("Hello world!");
    }

}
