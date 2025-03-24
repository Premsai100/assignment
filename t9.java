public class t9{
    public void ns1(){
        System.out.println("this is non static 1");
        ns2();
    }
    public void ns2(){
        System.out.println("this is ns2");
    }
    public static void main(String[] args) {
        t9 t = new t9();
        t.ns1();
    }
}