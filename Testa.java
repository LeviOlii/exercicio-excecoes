public class Testa{
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Divisao d = new Divisao(x, y);
        d.divide();
    }
}