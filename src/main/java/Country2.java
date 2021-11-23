import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class Country2 {


  public String getStartIP() {
    return startIP;
  }

  public void setStartIP(String startIP) {
    this.startIP = startIP;
  }

  public String getEndIp() {
    return endIp;
  }

  public void setEndIp(String endIp) {
    this.endIp = endIp;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Country2{" +
        "startIP='" + startIP + '\'' +
        ", endIp='" + endIp + '\'' +
        ", countryCode='" + countryCode + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  @CsvBindByPosition(position = 0)
  private String startIP;

  @CsvBindByPosition(position = 1)
  private String endIp;

  @CsvBindByPosition(position = 2)
  private String countryCode;

  @CsvBindByPosition(position = 3)
  private String country;

}


