package old;

import java.util.Random;

public class HiByeHyperboleArr {

    static String[] array = {"привет", "ПОКА", "гипербола"};


    public HiByeHyperboleArr outputFirstStringInArray() {
        System.out.println(array[0].toUpperCase());
        return this;
    }

    public HiByeHyperboleArr outputSecondStringInArray() {
        System.out.println(array[1].toLowerCase());
        return this;
    }

    public HiByeHyperboleArr fiendWordWhereSecondO() {
        for (String word : array) {
            if (word.length() >= 4 && word.substring(1, 2).equalsIgnoreCase("о")) {
                String threeAndFourCharacter = word.substring(0, 3) + " " + word.substring(3);
                System.out.println(threeAndFourCharacter);
                break;
            }
        }
        return this;
    }

    public HiByeHyperboleArr generateRandomNumber() {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println(randomNumber);
        return this;
    }

    public HiByeHyperboleArr getRandomString() {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        String randomString = array[randomIndex];
        System.out.println(randomString);
        return this;
    }

}
