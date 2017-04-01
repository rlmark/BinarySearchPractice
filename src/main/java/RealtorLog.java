import java.util.ArrayList;

public class RealtorLog {
    private ArrayList<Realtor> realtorList;

    public RealtorLog(ArrayList<Realtor> realtorList) {
        this.realtorList = realtorList;
    }

    public void add(Realtor realtor) {
        // Check if realtorList is empty or null
        if (realtorList == null) this.realtorList = (new ArrayList<Realtor>());
        if (realtorList.isEmpty()) realtorList.add(realtor);
        // Collect current highest,
   }

    public ArrayList<Realtor> getRealtorList() {
        if (realtorList == null) {
            realtorList = new ArrayList<Realtor>();
        }
        return realtorList;
    }
}
