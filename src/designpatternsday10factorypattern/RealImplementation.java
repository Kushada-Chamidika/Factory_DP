package designpatternsday10factorypattern;

public class RealImplementation {

    public static void main(String[] args) {

        appleFactory factIphone = new factoryIphone();
        appleFactory factMacBook = new factoryMacBook();

        appleProducts Iphone = factIphone.getProduct();
        Iphone.releaseProduct();

        appleProducts MacBook = factMacBook.getProduct();
        MacBook.releaseProduct();

    }

}

interface appleProducts {

    public abstract void releaseProduct();

}

class appleIphone implements appleProducts {

    @Override
    public void releaseProduct() {
        System.out.println("Apple Iphone");
    }

}

class appleMacBook implements appleProducts {

    @Override
    public void releaseProduct() {
        System.out.println("Apple Macbook");
    }

}

interface appleFactory {

    public abstract appleProducts getProduct();

}

class factoryIphone implements appleFactory {

    @Override
    public appleProducts getProduct() {
        return new appleIphone();
    }

}

class factoryMacBook implements appleFactory {

    @Override
    public appleProducts getProduct() {
        return new appleMacBook();
    }

}
