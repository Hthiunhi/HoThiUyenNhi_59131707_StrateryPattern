package BaiTap1;

/**
 *
 * @author Acer
 */
public class Main {
 
    public static void Main(String[] args) {
        Context context = new Context();
        context. setTinhToan(new Cong());
        System.out.println(context.Tinh(75, 12));
        context. setTinhToan(new Tru());
        System.out.println(context.Tinh(54, 78));
    }
}
