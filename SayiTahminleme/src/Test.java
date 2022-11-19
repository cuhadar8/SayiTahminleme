import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Random r = new Random();
        int randomNumber = r.nextInt(100);
        

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            int selectedNumber = scanner.nextInt();

            if (selectedNumber < 0 || selectedNumber > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selectedNumber == randomNumber) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + randomNumber);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selectedNumber > randomNumber) {
                    System.out.println(selectedNumber + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selectedNumber + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selectedNumber;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Doğru sayı: " + randomNumber);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }


	}

}
