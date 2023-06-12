import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String a = "4";
        String b = "Plovdiv - Burgas";
        String c = "Sofia - Plovdiv";
        String d = "Varna - Pleven";
        String e = "Burgas - Varna";

        String arr[] = {b, c, d, e};
        ArrayList<String> from = new ArrayList<>();
        ArrayList<String> to = new ArrayList<>();

        ArrayList<String> output = new ArrayList<>();
        String temp[];
        for (int i = 0; i < 4; i++) {
            temp = arr[i].split(" - ");
            from.add(temp[0]);
            to.add(temp[1]);
        }
        System.out.println(from);
        System.out.println(to);
        for (int i = 0; i < 4; i++) {
            if (!to.contains(from.get(i))) {
                output.add(from.get(i));
                break;
            }
        }

        for (int i = 0; i < 4; i++) {
        output.add(to.get(from.indexOf(output.get(i))));
        }
        for( String x : output)
            System.out.println(x);
    }
}

