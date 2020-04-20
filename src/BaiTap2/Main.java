package BaiTap2;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang GH1 =  new GioHang();
        HangHoa h1 = new HangHoa("Bánh", 2000000, "Rong biển");
        HangHoa h2 = new HangHoa("Kẹo", 5500000, "Vị dâu");
        HangHoa h3 = new HangHoa("Nước Ngọt", 6000000, "Cocacola");
        GH1.ThemHH(h1);
        GH1.ThemHH(h2);
        GH1.ThemHH(h3);
        GH1.InDS();
        GH1.setHTThanhToan(new ThanhToanOnline());
        System.out.println("Tong so tien hang: " + GH1.TinhTien());
        System.err.println("tien phai trai sau khi giam gia: " + GH1.TienPhaiTra());
        GioHang GH2 = new GioHang();
        HangHoa h4 = new HangHoa("Kem", 3000000, "Sầu riêng");
        HangHoa h5 = new HangHoa("Trái cây", 4700000, "Xoài");
        HangHoa h6 = new HangHoa("Quần áo", 8200000, "Áo thun");
        GH2.ThemHH(h4);
        GH2.ThemHH(h5);
        GH2.ThemHH(h6);
        GH2.InDS();
        GH2.setHTThanhToan(new ThanhToanCOD());
        System.out.println("Tong so tien hang: " + GH1.TinhTien());
        System.err.println("tien phai trai sau khi giam gia: " + GH2.TienPhaiTra());
    }
    
}
