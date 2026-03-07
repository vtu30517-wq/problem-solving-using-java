import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    // Store check-in details: id -> (stationName, time)
    private Map<Integer, CheckInData> checkInMap;

    // Store route data: "startStation->endStation" -> (totalTime, tripCount)
    private Map<String, RouteData> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInData checkInData = checkInMap.get(id);
        checkInMap.remove(id);

        String routeKey = checkInData.stationName + "->" + stationName;
        int travelTime = t - checkInData.time;

        RouteData routeData = routeMap.getOrDefault(routeKey, new RouteData(0, 0));
        routeData.totalTime += travelTime;
        routeData.tripCount += 1;

        routeMap.put(routeKey, routeData);
    }

    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        RouteData routeData = routeMap.get(routeKey);
        return (double) routeData.totalTime / routeData.tripCount;
    }

    // Helper class for check-in data
    private static class CheckInData {
        String stationName;
        int time;

        CheckInData(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    // Helper class for route data
    private static class RouteData {
        int totalTime;
        int tripCount;

        RouteData(int totalTime, int tripCount) {
            this.totalTime = totalTime;
            this.tripCount = tripCount;
        }
    }
}