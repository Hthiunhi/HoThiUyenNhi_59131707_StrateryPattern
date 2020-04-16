package BaiTap1;

/**
 *
 * @author Acer
 */
public class Context {
    private Tinh TinhToan;
    
    public void  setTinhToan(Tinh TinhToan) {
        this.TinhToan = TinhToan;
    }

    public float Tinh(float a, float b) {
        return TinhToan.Tinh(a, b);
    }
    
}
