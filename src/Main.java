public class Main {
    public static void main(String args[]) {
        System.out.println("オブザーバーパターン");

        NumberGenerator generator = new RandaomNumberGenerator();
        Observer degitObserver = new DegitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(degitObserver);
        generator.addObserver(graphObserver);

        generator.execute();




    }
}
