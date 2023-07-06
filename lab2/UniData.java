package lab2;
/**
 * Lab 1 Solution
 * @author pree.t
 */
public class UniData implements Comparable<UniData>{
    
    String year, score, uniName, link, city, country, region, logo, rank;

    public void setYear(String year) {
        this.year = year;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        if(!score.isEmpty()){
            Double temp = Double.parseDouble(score);
            temp = Math.ceil(temp);
            Integer temp2 = temp.intValue();
            this.score = temp2.toString();
        }else{
            this.score = "0";
        }
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String  getYear() {
        return this.year;
    }

    public UniData() {

    }// default constructor

    public UniData(String year, String rank, String uniName, String  score, String link, String country, String city, String region, String logo) {
        this.year = year;
        this.rank = rank;
        this.uniName = uniName;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;
        this.score = score;
        if(!score.isEmpty()){
            Double temp = Double.parseDouble(score);
            temp = Math.ceil(temp);
            Integer temp2 = temp.intValue();
            this.score = temp2.toString();
        }else{
            this.score = "0";
        }
        
    }// end overload constructor

    

    public String toString() {
        return "[" + this.year + ", " + this.rank + ", " + this.uniName + ", " + this.score + ", " 
        + this.link + ", " + this.country + ", " + this.city + ", " + this.logo + "]";

    }// override method toString

    @Override
    public int compareTo(UniData o) {
        return this.uniName.compareTo(o.getUniName());
    }


   
}// end class UniData
