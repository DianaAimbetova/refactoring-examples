package organizingdata.replacearraywithobj.after;

public class Performance {
    public String[] data = new String[3];

    public String getName() {
        return data[0];
    }

    public void setName(String arg) {
        data[0] = arg;
    }

    public int getWins() {
        return Integer.parseInt(data[1]);
    }

    public void setWins(String arg) {
        data[1] = arg;
    }
}
