public class Main  extends DogFood{
    Integer num = 110;
    void printNumber(){
        System.out.println(super.num);
    }
    public static void main(String[] args) {
    DogFood df = new Main();
    ((Main) df).printNumber();
    }
    
}
