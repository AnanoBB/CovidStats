package ge.edu.btu.CovidStats.services.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {
    private String country;
    private int confirmed;
    private int deaths;
    private int recovered;


    public Covid(){

    }

    public Covid(String country,int confirmed,int recovered,int deaths){
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setConfirmed(int confirmed){
        this.confirmed = confirmed;
    }

    public void setDeaths(int deaths){
        this.deaths = deaths;
    }


    public int getConfirmed() {
        return confirmed;
    }


    public int getDeaths() {
        return deaths;
    }

    public void setRecovered(int recovered){
        this.recovered = recovered;
    }

    public int getRecovered() {
        return recovered;
    }



    @Override
    public String toString() {
        return "Student{" +
                "Country=" + country +
                ", Confirmed='" + deaths + '\'' +
                ", Recovered=" + recovered + "Deaths=" + deaths +
                '}';
    }


}
