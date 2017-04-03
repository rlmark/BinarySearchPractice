import java.util.ArrayList;

public class RealtorLog {
    private ArrayList<Realtor> realtorList;

    public RealtorLog(ArrayList<Realtor> realtorList) {
        this.realtorList = realtorList;
    }

    // This method should insert the given realtor into a sorted ArrayList
    public void add(Realtor realtor) {
        // Check if realtorList is empty or null
        if (realtorList == null) this.realtorList = (new ArrayList<Realtor>());
        if (realtorList.isEmpty()) realtorList.add(realtor);

        // Find the leftmost point
        Integer left = 0;
        // Find the rightmost point
        Integer right = this.realtorList.size() - 1;
        // Find the middle
        Integer middle = this.realtorList.size() / 2;

        loop(left, right, middle, realtor);
   }

    private void loop(Integer left, Integer right, Integer middle, Realtor realtor) {
        Integer midPointLicenseNumber = this.realtorList.get(middle).getLicenseNumber();
        Integer licenseNumberToBeInserted = realtor.getLicenseNumber();
        // maybe have this just be the catch all...
        if (midPointLicenseNumber.equals(realtor.getLicenseNumber())){
            this.realtorList.add(middle, realtor);
            return;
        } else if (midPointLicenseNumber < licenseNumberToBeInserted) {
            // this means that we need to look at the right side of the list now
            loop(middle, right, (right - middle) / 2, realtor);
        } else if (midPointLicenseNumber > licenseNumberToBeInserted) {
            // this means that we need to look at the left side of the list
            loop(left, middle, (middle - left) / 2, realtor);
        } else {
            this.realtorList.add(middle, realtor);
            return;
        }
    }

    public ArrayList<Realtor> getRealtorList() {
        if (realtorList == null) {
            realtorList = new ArrayList<Realtor>();
        }
        return realtorList;
    }


}
