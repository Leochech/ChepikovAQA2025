public class Car {

    public String model;
    public String voice;
    public int year;

    public Car(String model, int year, String voice) {
        this.model = model;
        this.year = year;
        this.voice = voice;
    }

    public void makeBebe() {
        System.out.println("Авто: " + model + " (" + year + " года) \nсигналит: " + voice);
    }

}
