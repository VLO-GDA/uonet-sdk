package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseBase<T> {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("TimeKey")
    private Integer timeKey;
    @JsonProperty("TimeValue")
    private String timeValue;
    @JsonProperty("RequestId")
    private String requestId;
    @JsonProperty("DayOfWeek")
    private Integer dayOfWeek;
    @JsonProperty("AppVersion")
    private String appVersion;
    @JsonProperty("Data")
    private T data;

    public String getStatus() {
        return this.status;
    }

    public Integer getTimeKey() {
        return this.timeKey;
    }

    public String getTimeValue() {
        return this.timeValue;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public T getData() {
        return this.data;
    }
}
