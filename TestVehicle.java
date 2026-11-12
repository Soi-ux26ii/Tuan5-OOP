package dungtichxe;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tao danh sach rong:
        //cong thuc : ArrayList<tenkieu> tenDanhsach = new ArrayList<>();
        ArrayList<vehicle> dsXe = new ArrayList<>();

        System.out.print("Nhập số lượng xe: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("=== Nhập thông tin xe thứ " + (i+1) + " ===");
            System.out.print("Nhập tên chủ xe: ");
            String chuxe = sc.nextLine();

            System.out.print("Nhập loại xe: ");
            String loaixe = sc.nextLine();

            System.out.print("Nhập dung tích xe: ");
            int dungtich = sc.nextInt();

            System.out.print("Nhập trị giá xe: ");
            double trigiaxe = sc.nextDouble();
            sc.nextLine();
            vehicle v = new vehicle(chuxe, loaixe, dungtich, trigiaxe);
            dsXe.add(v);
        }

        // In bảng kết quả
        System.out.println("===============================================");
        System.out.printf("%-20s %-10s %-10s %-15s %-15s\n",
                          "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        for (vehicle v : dsXe) { //dung vong lap for lap 1 bien tam vehicle v de dc gan lan luot boi dsXe roi in lien luon 
            //no la cach viet gon cua: for(int i = 0 ; i < dsXe.size() ; i++)
        	System.out.printf("%-20s %-10s %-10d %-15.2f %-15.2f\n",
                              v.getChuxe(), v.getLoaixe(), v.getDungtich(), v.getTrigiaxe(), v.thue());
        }
        sc.close();
    }
}
