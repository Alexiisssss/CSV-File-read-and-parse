import com.opencsv.bean.CsvBindByName;

public class Country3 {

  public String getStartIp() {
    return startIp;
  }

  public void setStartIp(String startIp) {
    this.startIp = startIp;
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
    return "Country3{" +
        "startIp='" + startIp + '\'' +
        ", endIp='" + endIp + '\'' +
        ", countryCode='" + countryCode + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  @CsvBindByName(column = "start ip")
  private String startIp;

  @CsvBindByName(column = "end ip")
  private String endIp;

  @CsvBindByName(column = "country code")
  private String countryCode;

  @CsvBindByName
  private String country;

}
