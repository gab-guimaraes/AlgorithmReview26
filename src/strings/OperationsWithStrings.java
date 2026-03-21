package strings;

public class OperationsWithStrings {
    public static void main(String[] args) {
        //String never changes, it creates a new object
        String name = "Gabriel";
        name.concat(" Guimaraes");
        System.out.println(name);
        String game = "Gran Turismo";
        game.length();
        game.charAt(0);
        game.substring(0,4);
        game.concat("Turismo");
        boolean isValid = game.equals("Gran Turismo");
        String[] players = "mario luigi peach".split(" ");
        game.replace("Gran","Super");

    }

    public String badLoop() {
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += i;
        }
        return result;
    }

    public String goodLoop() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
