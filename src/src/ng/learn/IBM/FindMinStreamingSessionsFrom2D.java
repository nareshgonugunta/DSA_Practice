/*
package ng.learn.IBM;

import java.util.ArrayList;
import java.util.List;

public class FindMinStreamingSessionsFrom2D {

    public static void main(String[] args) {
        List<List<Integer>> sessionTimings = List.of(
                                                    List.of(2,8),
                                                    List.of(2,7),
                                                    List.of(4,6),
                                                    List.of(1, 9),
                                                    List.of(8, 10));
        int minEngines = getMinEngines(sessionTimings);
        System.out.println("Minimum stream engines are : "+minEngines);
n    }

    public static int getMinEngines(List<List<Integer>> sessionTimings) {
        // Write your code here
        List<int[]> events = new ArrayList<>();

        for(List<Integer> session : sessionTimings){
            int startTime =  session.get(0);
            int endTime =  session.get(1);
            events.add(new int[]{startTime, 1});
            events.add(new int[]{endTime, -1});
        }

        events.sort((a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);

        int maxEngines = 0, currentEngines = 0;

        for(int[] event : events){
            currentEngines += event[1];
            maxEngines = Math.max(maxEngines, currentEngines);
        }
        return maxEngines;
    }
}
*/
