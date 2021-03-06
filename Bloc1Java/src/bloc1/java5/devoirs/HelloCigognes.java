package bloc1.java5.devoirs;
// ----------------- A/ ---------------------
// int[] tCigogne = new int[52];

// ----------------- B/ ---------------------
public class HelloCigognes {

    public static int totalCigogne(int[] tCigogne) {
        int c = 0;
        for (int i = 0; i < tCigogne.length; i++) {
            c += tCigogne[i];
        }
        return c;
    }

    public static int moyenneCigogne(int[] tCigogne) {
        int c = totalCigogne(tCigogne);

        return c / tCigogne.length;
    }

    public static int maxCigogne(int[] tCigogne) {
        int maxi = 0;
        for (int i = 0; i < tCigogne.length; i++) {
            if (tCigogne[i] > tCigogne[maxi]) {
                maxi = i;
            }
        }
        return tCigogne[maxi];
    }

    // ----------------- C/ ---------------------
    public static void main(String[] args) {

        int[] tCigogne2020 = new int[52];

        int total = totalCigogne(tCigogne2020);
        int max = maxCigogne(tCigogne2020);
        System.out.println("Total=" + total);
        System.out.println("Maximum=" + max);

        int moy = moyenneCigogne(tCigogne2020);
        System.out.println("Liste des semaines < " + moy);

        for (int i = 0; i < tCigogne2020.length; i++) {
            if (tCigogne2020[i] < moy) {
                System.out.println("semaine : " + i);
            }
        }

    }
}
