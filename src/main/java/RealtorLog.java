import java.util.ArrayList;

public class RealtorLog {
    private ArrayList<Realtor> realtorList;

    public RealtorLog(ArrayList<Realtor> realtorList) {
        this.realtorList = realtorList;
    }

    public void add(Realtor realtor) {
        realtorList.add(realtor);
    }

    public ArrayList<Realtor> getRealtorList() {
        return realtorList;
    }
}
