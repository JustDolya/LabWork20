public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.setX(5);
        singleton.setY(3);
        singleton.calculate();
    }
}

enum Singleton{
    INSTANCE;

    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void calculate(){
        System.out.println(2*x + 3*y);
    }
}