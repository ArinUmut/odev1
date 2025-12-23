
public class odev
{
    public void main {
        // iki sayı alcaz başta
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        double n1 = input.nextDouble();
        System.out.print("ikinci sayıyı giriniz: ");
        double n2 = input.nextDouble();
        //işlemlere geçiyoruz
        System.out.println("toplama:   " + (n1 + n2) +
                "\nÇıkarma: " + (n1 - n2) +
                "\nÇarpma:  " + (n1 * n2) +
                "\nBölme:   " + (n1 / n2));
        // eşkenar üçgene geçiyoruz
        System.out.print("eşkenar üçgenin bir kenarını giriniz: ");
        double k = input.nextDouble();
        // çevre ve alanı hesaplayacağız
        double ç = 3 * k;
        double a = (Math.sqrt(3) / 4) * k * k;
        // sonuçları yazdırıyoruz
        System.out.println("üçgenin çevresi:  " + ç);
        System.out.println("üçgenin alanı:    " + a);
    } }
