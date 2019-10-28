package co.konrad.citytrend;

public class EventListObject {
    private String eventButton;
    private String eventName;
    private String eventLocation;
    private String eventDate;
    private String eventType;

    public EventListObject(String eventName, String eventLocation, String eventDate,
                           String eventType, String eventButton) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.eventButton = eventButton;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventButton() {
        return eventButton;
    }

    public void setEventButton(String eventButton) {
        this.eventButton = eventButton;
    }
}
