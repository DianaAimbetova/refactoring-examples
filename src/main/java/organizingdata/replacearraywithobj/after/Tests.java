package organizingdata.replacearraywithobj.after;

public class Tests {
    public void test(){
    Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");
        String name = row.getName();
        int wins = row.getWins();
    }
}
