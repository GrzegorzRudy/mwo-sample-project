package pl.edu.agh.mwo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Race {
    @JsonProperty("session_key")
    private int session_key;
    @JsonProperty("meeting_key")
    private int meeting_key;
    @JsonProperty("date")
    private String date;
    @JsonProperty("driver_number")
    private int driver_number;
    @JsonProperty("pit_duration")
    private int pit_duration;
    @JsonProperty("lap_number")
    private float lap_number;

    public int getSession_key(){
        return this.session_key;
    }

    public int getDriver_number() {
        return this.driver_number;
    }

    public int getMeeting_key() {
        return this.meeting_key;
    }

    public float getLap_number() {
        return this.lap_number;
    }

    public int getPit_duration() {
        return this.pit_duration;
    }

    public String getDate() {
        return this.date;
    }
}
