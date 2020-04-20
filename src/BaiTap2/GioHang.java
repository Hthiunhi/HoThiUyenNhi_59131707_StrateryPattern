package BaiTap2;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class GioHang {
    IThanhToan HinhThucTT;
    ArrayList<HangHoa> DSHangHoa = new ArrayList<>();
    
    //phuong thuc xac lap hinh thuc thanh toan
    IThanhToan a ;
    public void setHTThanhToan(IThanhToan b){
        this.a = b;  
    }
    //Phuong thuc them hang hoa vao gio hang
    public void ThemHH(HangHoa c){
        DSHangHoa.add(c);
    }
    //Phuong thuc tinh tien
    public int TinhTien() {
       int s = 0;
       for(HangHoa c:DSHangHoa)
           s = s + c.getGia();
       return s;
    }
    //phuong thuc tinh tien sau khi giam gia
    public double TienPhaiTra(){
        return a.ThanhToan(TinhTien());
    }
    //phuong thuc in danh sach
    public void InDS(){
        for(int i=0;i<DSHangHoa.size();i++)
            System.out.println(DSHangHoa.get(i).toString());
    }
}
