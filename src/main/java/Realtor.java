public class Realtor {

    private Integer licenseNumber;

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Realtor(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Realtor realtor = (Realtor) o;

        return licenseNumber != null ? licenseNumber.equals(realtor.licenseNumber) : realtor.licenseNumber == null;
    }

    @Override
    public int hashCode() {
        return licenseNumber != null ? licenseNumber.hashCode() : 0;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (obj instanceof Realtor) {
//            Realtor otherRealtor = (Realtor) obj;
//            return otherRealtor.licenseNumber.equals(licenseNumber);
//        }
//        return false;
//    }
}
