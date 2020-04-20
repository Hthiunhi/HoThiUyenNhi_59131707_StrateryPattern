package BaiTap2;

/**
 *
 * @author Acer
 */
public class HangHoa {
    private String TenHH;
    private int Gia;
    private String MoTa;

    public HangHoa (String TenHH, int Gia, String Mota){
        this.TenHH = TenHH; this.Gia = Gia; this.MoTa = Mota;
    }
    public int getGia(){
        return Gia;
    } 

    public String toString() {
        return "ten hang hoa: "+TenHH + "Gia: "+Gia+"Mo ta: "+MoTa; //To change body of generated methods, choose Tools | Templates.
    }
    
}
