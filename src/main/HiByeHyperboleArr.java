package src.main;

public class HiByeHyperboleArr {

    static String[] array = {"привет","ПОКА","гипербола"};


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
            if(word.length()>=4 && word.substring(1,2).equalsIgnoreCase("о")) {
                String threeAndFourCharacter = word.substring(0,3) + " " + word.substring(3);
                System.out.println(threeAndFourCharacter);
                break;
            }
        }
        return this;
    }

}
