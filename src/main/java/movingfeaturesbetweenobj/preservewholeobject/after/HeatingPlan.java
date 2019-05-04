package movingfeaturesbetweenobj.preservewholeobject.after;

public class HeatingPlan {
    private TempRange range;

    boolean withinRange(TempRange roomRange) {
        return (range.includes(roomRange));
    }
}
