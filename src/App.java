
public class App {
    public static void main(String[] args) {
        myArray numbers = new myArray(3);
        numbers.insert(52);
        numbers.insert(8542);
        numbers.insert(87);
        numbers.insert(6969);
        numbers.insert(785426);
        numbers.removeAt(2);
        System.out.println("Index of the item is " + numbers.indexOf(6969));
        numbers.print();
    }
}
