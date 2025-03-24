public class t10 {
    public void nonstatic(){
        System.out.println("i am non static");
        st();
    }
    public static void st(){
        System.out.println("i am static ");
    }
    public static void main(String[] args) {
        t10 t = new t10();
        t.nonstatic();
    }
}
