package movingfeaturesbetweenobj.preservewholeobject.after;

public class TempRange {
    public int getLow() {
        return 0;
    }

    public int getHigh() {
        return 100;
    }

    boolean includes (TempRange arg) {
        return arg.getLow() >= this.getLow() && arg.getHigh() <=
                this.getHigh();
    }
}
