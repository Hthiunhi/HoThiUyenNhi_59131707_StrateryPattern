package BaiTap2;

/**
 *
 * @author Acer
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double ThanhToan(int tienHang) {
        if(tienHang < 1000000 )
            return 0.95*tienHang; 
        return 0.93*tienHang;
    }
}
