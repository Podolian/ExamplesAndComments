/**
 * This is simple example of Proxy design pattern.
 */

public class Proxy {

    static class RegularClass implements ProxyInterface {
        @Override
        public void doSomeStuff() {
            System.out.println("Regular class doing stuff");
        }
    }

    static class ProxyClass implements ProxyInterface {

        private ProxyInterface proxyInterface;

        public ProxyClass(ProxyInterface proxyInterface){
            this.proxyInterface = proxyInterface;
        }

        @Override
        public void doSomeStuff() {
            System.out.println("Proxy class doing stuff");
        }
    }

    public static void main(String[] args) {
        RegularClass regularClass = new RegularClass();
        regularClass.doSomeStuff();
        ProxyClass proxyClass = new ProxyClass(regularClass);
        proxyClass.doSomeStuff();
    }
}
