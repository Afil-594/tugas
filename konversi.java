import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexadesimal");
        System.out.println("4. Hexadesimal ke Biner");
        System.out.println("5. Desimal ke Hexadesimal");
        System.out.println("6. Hexadesimal ke Desimal");
        System.out.print("Masukkan Pilihan Anda: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                binerKeDesimal();
                break;
            case 2:
                desimalKeBiner();
                break;
            case 3:
                binerKeHexa();
                break;
            case 4:
                hexaKeBiner();
                break;
            case 5:
                desimalKeHexa();
                break;
            case 6:
                hexaKeDesimal();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    public static void binerKeDesimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String biner = scanner.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        System.out.println("Hasil konversi: " + desimal);
    }
    
    public static void desimalKeBiner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = scanner.nextInt();
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi: " + biner);
    }
    
    public static void binerKeHexa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String biner = scanner.nextLine();
        int desimal = Integer.parseInt(biner, 2);
        String hexa = Integer.toHexString(desimal);
        System.out.println("Hasil konversi: " + hexa);
    }
    
    public static void hexaKeBiner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan heksadesimal: ");
        String hexa = scanner.nextLine();
        int desimal = Integer.parseInt(hexa, 16);
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi: " + biner);
    }
    
    public static void desimalKeHexa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = scanner.nextInt();
        String hexa = Integer.toHexString(desimal);
        System.out.println("Hasil konversi: " + hexa);
    }
    
    public static void hexaKeDesimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan heksadesimal: ");
        String hexa = scanner.nextLine();
        int desimal = Integer.parseInt(hexa, 16);
        System.out.println("Hasil konversi: " + desimal);
    }
}
