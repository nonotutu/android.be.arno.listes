package be.arno.listes;

public class NewsItem {
	 
    private String headline;
    private String reporterName;
    private String date;
    private float rating;
 
    public String getHeadline() {
        return headline;
    }
 
    public void setHeadline(String headline) {
        this.headline = headline;
    }
 
    public String getReporterName() {
        return reporterName;
    }
 
    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }
 
    public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }

    public float getRating() {
        return rating;
    }
 
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[ headline=" + headline + ", reporter Name=" +
                reporterName + " , date=" + date + "]";
    }
}