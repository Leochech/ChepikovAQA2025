package old;

public class Guitar implements Playable {

    @Override
    public void play(int struna) {
        System.out.println("Гитара играет на " + struna + " струнах");
    }
}
