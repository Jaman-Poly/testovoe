import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner kk = new Scanner(System.in);
        calc(kk.nextLine());
    }

    public static void calc(String inLine) throws Exception {
        Map<String, Integer> number = new HashMap<>();
        number.put("I", 1);
        number.put("II", 2);
        number.put("III", 3);
        number.put("IV", 4);
        number.put("V", 5);
        number.put("VI", 6);
        number.put("VII", 7);
        number.put("VIII", 8);
        number.put("IX", 9);
        number.put("X", 10);
        number.put("XII", 12);
        number.put("XIV", 14);
        number.put("XV", 15);
        number.put("XVI", 16);
        number.put("XVII", 18);
        number.put("XX", 20);
        number.put("XXI", 21);
        number.put("XXIV", 24);
        number.put("XXVII", 27);
        number.put("XXX", 30);
        number.put("XXVIII", 28);
        number.put("XXXII", 32);
        number.put("XXXVI", 36);
        number.put("XL", 40);
        number.put("XXV", 25);
        number.put("XXXV", 35);
        number.put("XLV", 45);
        number.put("L", 50);
        number.put("XLII", 42);
        number.put("XLVIII", 48);
        number.put("LIV", 54);
        number.put("LX", 60);
        number.put("XLIX", 49);
        number.put("LVI", 56);
        number.put("LXIII", 63);
        number.put("LXX", 70);
        number.put("LXIV", 64);
        number.put("LXXII", 72);
        number.put("LXXX", 80);
        number.put("LXXXI", 81);
        number.put("XC", 90);
        number.put("C", 100);

        String[] words = inLine.split(" ");

        if (words.length > 3) {
            throw new Exception("Неверная длина. Допустимо только 2 числа");
        } else {
            int a2 = 0;
            int b2 = 0;
            if ((number.containsKey(words[0])) && (number.containsKey(words[2]))) {
                a2 = number.get(words[0]);
                b2 = number.get(words[2]);
                int s1 = 0;
                if ((0 < a2) & (a2 < 11) & (0 < b2) & (b2 < 11)) {
                    switch (words[1]) {
                        case ("+"):
                            s1 = a2 + b2;
                            break;
                        case ("-"):
                            s1 = a2 - b2;
                            break;
                        case ("*"):
                            s1 = a2 * b2;
                            break;
                        case ("/"):
                            s1 = Math.round(a2 / b2);
                            break;
                        default:
                            throw new Exception("Неверный символ");
                    }
                }
                int finalS = s1;
                Optional<String> foundKey = number.entrySet().stream()
                        .filter(entry -> entry.getValue().equals(finalS))
                        .map(Map.Entry::getKey)
                        .findFirst();
                String answer = foundKey.get();
                System.out.println(answer);
            } else {
                int a1 = 0;
                int b1 = 0;
                int s2 = 0;
                try {
                    a1 = Integer.parseInt(words[0]);
                    b1 = Integer.parseInt(words[2]);
                } catch (Exception e) {
                    throw new Exception("Неверный символ");
                }
                if ((0 < a1) & (a1 < 11) & (0 < b1) & (b1 < 11)) {
                    switch (words[1]) {
                        case ("+"):
                            System.out.println(a1 + b1);
                            break;
                        case ("-"):
                            System.out.println(a1 - b1);
                            break;
                        case ("*"):
                            System.out.println(a1 * b1);
                            break;
                        case ("/"):
                            s2 = Math.round(a1 / b1);
                            System.out.println(s2);
                            break;
                        default:
                            throw new Exception("Неверный символ");
                    }
                } else {
                    throw new Exception("Неверный символ");
                }
            }
        }
    }
}