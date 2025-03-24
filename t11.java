public class t11 {
    public static void st(){
        System.out.println("i am static method");
    }
    public void first(){
        System.out.println("i am first non static mrthod");
    }
    public void second(){
        System.out.println("i am second non static method");
        st();
        first();
    }
    public static void main(String[] args) {
        new t11().second();
    }
}
