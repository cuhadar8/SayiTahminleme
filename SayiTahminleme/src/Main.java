import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Sayı Bulma Oyununa Hoş Geldiniz.");
		int i = 1;
		while (i == 1) {
			int randomNumber = r.nextInt(100);
			System.out.print("0 ile 100 arasında bir sayı giriniz: ");
			int selected = scanner.nextInt();
			while (selected != randomNumber) {
				if (selected > 100) {
					System.out.print("100 den büyük bir sayı girdiniz.Lütfen tekrar deneyiniz.");
					selected = scanner.nextInt();
				} else if (selected < 0) {
					System.out.print("0'dan küçük bir sayı girdiniz. Lütfen tekrar deneyiniz.");
					selected = scanner.nextInt();
				} else {
					if (selected < randomNumber) {
						System.out.print("Daha büyük bir sayı giriniz:");
						selected = scanner.nextInt();
					} else {
						System.out.print("Daha küçük bir sayı giriniz:");
						selected = scanner.nextInt();
					}
				}
			}
			System.out.println("Sayıyı buldunuz");
			System.out.print("Oyuna devam etmek için 1'i çıkmak için 0'ı tuşlayınız: ");
			i = scanner.nextInt();
		}
		System.out.println("Oyun Bitmiştir");
	}
}
