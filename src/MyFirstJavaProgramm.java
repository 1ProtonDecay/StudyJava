import static java.lang.System.*;
public class MyFirstJavaProgramm {
//    public static void main(String[] args) {
//        System.out.println("Hello, world");
//        System.exit(-1);
//    }
//}


//    public static void main(String args[]) {
//        int a = 10;
//        int b = 20;
//        System.out.println("a + b = " + (a + b));
//        System.out.println("b - a = "  + (b - a));
//        System.out.println("b * a = " + (b * a));
//        System.out.println("b / a = "  + (b / a));
//        System.out.println("b % a = " + (b % a));
//        System.out.println("a++ = "  + (++a));
//        System.out.println("b-- = "  + (--b));
//    }
//}

    //    public static void main(String args[]) {
//        int a = 10;
//        int b = 20;
//        System.out.println("a == b " + (a == b));
//        System.out.println("a != b " + (a != b));
//        System.out.println("a > b " + (a > b));
//        System.out.println("a < b " + (a < b));
//    }
//}
//    public static void main(String args[]) {
//    int x;
//        x = 30;
//        if (x < 20) {
//        out.println("Это оператор if");
//    }   else {
//            out.println("Это оператор else");
//        }
//    }
//    }
    public static void main(String args[]) {
        char grade = 'C';
        switch (grade) {
            case ('A'):
                out.println("Отлично");
                break;
            case ('B'):
            case ('C'):
                out.println("Хорошо");
                break;
            default:
                out.println("Неверно");
        }
        System.out.println("Ваша оценка " + grade);
    }
}