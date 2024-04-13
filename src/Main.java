import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber=0,lastNumber;
//      en sonda number ile yeni değeri karşılaştıracağımız için tmp değişkeni ile number değişkenini eşitledik.
        while (temp != 0) {
//            System.out.println("=======");
//          System.out.println("Sayı : "+ temp);

            lastNumber = temp % 10; //en son sayımızı bulduk.
//            System.out.println("Son Basamak : "+ lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber; //birler basamagı 0 + son basamak olarak hesaplanacağı için. Devamı zaten birleri onların; onla carpılıp son basamagın eklenmesi.
//            System.out.println("Yeni sayı : " + reverseNumber);

            temp /= 10;
//            System.out.println("Yeni temp : "+ temp);
        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
//        Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
        Scanner inp = new Scanner(System.in);

        System.out.println(isPalindrom(99));
    }
}