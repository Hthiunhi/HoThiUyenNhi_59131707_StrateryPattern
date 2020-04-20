package BaiTap2;

/**
 *
 * @author Acer
 */
public class ThanhToanCOD implements IThanhToan {

    @Override
    public double ThanhToan(int tienHang) {
        if (tienHang > 2000000 )
            return 0.98* tienHang;
        return tienHang;
    }
}
