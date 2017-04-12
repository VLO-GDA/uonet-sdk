package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URLConnection;
import java.util.UUID;

public class CertyfikatRequest extends RequestBase<Certyfikat> {
    public static final String DEFAULT_SYSTEM_VERSION = "0.0.1";
    public static final String DEFAULT_SYSTEM_TYPE = "SDK";
    public static final String DEFAULT_DEVICE_NAME = "Unofficial SDK";

    @JsonProperty("DeviceSystemVersion")
    private String deviceSystemVersion = DEFAULT_SYSTEM_VERSION;
    @JsonProperty("DeviceDescription")
    private String deviceDescription = "";
    @JsonProperty("DeviceId")
    private String deviceId = UUID.randomUUID().toString();
    @JsonProperty("DeviceName")
    private String deviceName = DEFAULT_DEVICE_NAME;
    @JsonProperty("DeviceSystemType")
    private String deviceSystemType = DEFAULT_SYSTEM_TYPE;
    @JsonProperty("AppVersion")
    private String appVersion = RequestBase.APPLICATION_VERSION;
    @JsonProperty("PIN")
    private String pin;
    @JsonProperty("TokenKey")
    private String tokenKey;
    @JsonProperty("DeviceNameUser ")
    private String deviceNameUser = "";

    public CertyfikatRequest(String pin, String token) {
        this.pin = pin;
        this.tokenKey = token;
    }

    @Override
    public void prepare(URLConnection connection) {
        super.prepare(connection);
        connection.setRequestProperty("RequestMobileType", "RegisterDevice");
    }

    @Override
    public String getPath() {
        return "Certyfikat";
    }

    public String getDeviceSystemVersion() {
        return this.deviceSystemVersion;
    }

    public void setDeviceSystemVersion(String deviceSystemVersion) {
        this.deviceSystemVersion = deviceSystemVersion;
    }

    public String getDeviceDescription() {
        return this.deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSystemType() {
        return this.deviceSystemType;
    }

    public void setDeviceSystemType(String deviceSystemType) {
        this.deviceSystemType = deviceSystemType;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTokenKey() {
        return this.tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getDeviceNameUser() {
        return this.deviceNameUser;
    }

    public void setDeviceNameUser(String deviceNameUser) {
        this.deviceNameUser = deviceNameUser;
    }
}
