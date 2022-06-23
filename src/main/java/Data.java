public class Data {
    private int state=1;

    synchronized public int getState() { return state; }

    synchronized public void setState(int state) {
        this.state = state;
    }

    public void Tic() {
        System.out.print("Tic-");
        setState(2);
    }
    public void Tak() {
        System.out.print("Tak-");
        setState(3);
    }
    public void Toe() {
        System.out.println("Toe");
        setState(1);
    }
}
