package movingfeaturesbetweenobj.preservewholeobject.after;

public class Room {
    boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(daysTempRange());
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }


}
