public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
        System.out.println();

        Printable printable = new Book("Learning Java: An Introduction to Real-World Programming with Java 5th Edition",
                "Marc Loy");
        printable.print();
        printable = new Journal("Super Puper Kruper Journal");
        printable.print();
        System.out.println();

        Printable p = new Journal("Foreign Affairs");
        p.print();
        String name = ((Journal)p).getName();
        System.out.println(name + "\n");

        Printable.read();
        System.out.println();

        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);
        System.out.println();

        Printable printable2 = createPrintable("Foreign Affairs",false);
        printable2.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}