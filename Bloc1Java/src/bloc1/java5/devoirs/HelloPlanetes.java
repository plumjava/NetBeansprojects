package bloc1.java5.devoirs;

public class HelloPlanetes {

    public static int distance(String laPlanete,
            String tPlanete[],
            int tDistance[]) {
        int i = 0;
        for (i = 0; i < tPlanete.length; i++) {
            if (tPlanete[i].equals(laPlanete)) {
                break;
            }
        }

        return tDistance[i];
    }

    public static int distanceEntreDeuxPlanete(String laPlanete1,
            String laPlanete2,
            String tPlanete[],
            int tDistance[]) {
        int d1 = distance(laPlanete1, tPlanete, tDistance);
        int d2 = distance(laPlanete1, tPlanete, tDistance);

        return Math.abs(d1 - d2);

    }

    public static String laPlusProche(String laPlanete,
            String tPlanete[],
            int tDistance[]) {

        int dmin = -1;
        int imin = -1;

        for (int i = 0; i < tPlanete.length; i++) {
            
            int d = distanceEntreDeuxPlanete(laPlanete,
                    tPlanete[i],
                    tPlanete,
                    tDistance);

            if (d > 0 & (d < dmin | dmin == -1) ) {
                dmin = d;
                imin = i;
            }
        }
        return tPlanete[imin];
    }

}
