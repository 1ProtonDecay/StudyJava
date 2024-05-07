/*public class MyFirstJavaProgramm {
    /*Это моя первая программа на Java. В результате выполнения на экран будет выведено  "Привет, мир"*/
/*    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.exit(-1);
    }

}
/*Внутри класса:
main() — это точка входа для любой программы. Он всегда записывается как public static void main (String [] args)
public: Public — это модификатор доступа, который используется для указания того, кто может получить доступ к этому методу. Public означает, что этот метод будет доступен любому классу.
static: это ключевое слово в java, которое определяет, что он основан на классах. main() в Java сделан статическим, поэтому к нему можно получить доступ без создания экземпляра класса. В случае, если main не сделан статическим, компилятор выдаст ошибку, поскольку main() вызывается JVM до того, как будут созданы какие-либо объекты, и только статические методы могут быть вызваны напрямую через класс.
void: это возвращаемый тип метода. Void определяет метод, который не возвращает никакого значения.
main: это имя метода, который JVM ищет в качестве отправной точки только для приложения с определенной подписью. Это метод, в котором происходит основное исполнение.
String args []: это параметр, передаваемый в основной метод.
- System.out.println: конструкция для печати данных с переводом строки вниз
 */

public class MyFirstJavaProgramm {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("b - a = "  + (b - a));
        System.out.println("b * a = " + (b * a));
        System.out.println("b / a = "  + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("a++ = "  + (++a));
        System.out.println("b-- = "  + (--b));


    }
}