import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int fiyat;
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen fiyati giriniz");
        fiyat=input.nextInt();
        if (fiyat<1000)
        {
            double KDV=fiyat+(fiyat*0.18);
            System.out.println("KDV olmadan fiyat: "+fiyat);
            System.out.println("KDV dahil fiyat"+KDV);

        }
        else if (fiyat>1000)
        {
            double KDV=fiyat+(fiyat*0.8);
            System.out.println("KDV olmadan fiyat: "+fiyat);
            System.out.println("KDV dahil fiyat: "+fiyat);

        }

    }
}

