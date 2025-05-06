package old;

public class Piano implements Playable {
    @Override
    public void play(int struna) {
        System.out.println("Пианино играет на " + struna + " струнах");
    }
}
