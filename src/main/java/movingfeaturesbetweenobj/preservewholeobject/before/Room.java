package movingfeaturesbetweenobj.preservewholeobject.before;

public class Room {
    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        return plan.withinRange(low, high);
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }


}
