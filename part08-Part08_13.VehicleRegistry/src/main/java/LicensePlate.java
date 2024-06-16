
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object that) {
        if(this == that) {
            return true;
        }

       if(that == null || this.getClass()!=that.getClass()) {
        return false;
       }

       LicensePlate compared = (LicensePlate) that;

       return this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country);
    }

    @Override
    public int hashCode() {
        String fullLicenseNumber = this.country + this.liNumber;
        return fullLicenseNumber.hashCode();
    }

}
