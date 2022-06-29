package designpatternsday10factorypattern;

public class Test {

    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();

        XFactory factoryA = new AFactory();
        XFactory factoryB = new BFactory();

        X xA = factoryA.getInstance();
        xA.m();

        X xB = factoryB.getInstance();
        xB.m();

    }

}

interface X {

    public abstract void m();

}

class A implements X {

    @Override
    public void m() {
        System.out.println("A m");
    }

}

class B implements X {

    @Override
    public void m() {
        System.out.println("B m");
    }

}

interface XFactory {// factory

    public abstract X getInstance(); // return type eka X danen factory eken hadana dewal x waragaye ewa nisa hadena ewa x wala variation ekak wenawa e nisa moka haduwath apita puluwan x ekak denan kiyanna

}

class AFactory implements XFactory {

    @Override
    public X getInstance() {
        return new A();
    }

}

class BFactory implements XFactory {

    @Override
    public X getInstance() {
        return new B();
    }

}
