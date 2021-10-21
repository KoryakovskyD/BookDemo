
/**
 * Created by Дмитрий on 16.10.2021.
 */
public class PublishingOffice {
    private String publishingName;
    private String city;


    public PublishingOffice(String publishingName, String city) {
        setPublishingName(publishingName);
        setCity(city);
    }

    public String getPublishingName() {
        return publishingName;
    }

    public String getCity() {

        return city;
    }

    public void setPublishingName(String publishingName) {
        if (publishingName == null)
            throw new IllegalArgumentException("Incorrect publishing name.");
        this.publishingName = publishingName;
    }

    public void setCity(String city) {
        if (city == null)
            throw new IllegalArgumentException("Incorrect publishing city.");
        this.city = city;
    }
}
