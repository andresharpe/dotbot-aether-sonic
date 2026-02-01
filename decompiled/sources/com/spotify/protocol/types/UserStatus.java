package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class UserStatus implements Item {
    public static final int STATUS_CODE_NOT_LOGGED_IN = 1;
    public static final int STATUS_CODE_OK = 0;

    @SerializedName(com.spotify.sdk.android.auth.a.f48965k)
    @JsonProperty(com.spotify.sdk.android.auth.a.f48965k)
    public final int code;

    @SerializedName("long_text")
    @JsonProperty("long_text")
    public final String longMessage;

    @SerializedName("short_text")
    @JsonProperty("short_text")
    public final String shortMessage;

    private UserStatus() {
        this(1, null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof UserStatus)) {
            return false;
        }
        UserStatus userStatus = (UserStatus) o4;
        if (this.code != userStatus.code) {
            return false;
        }
        String str = this.shortMessage;
        if (str == null ? userStatus.shortMessage != null : !str.equals(userStatus.shortMessage)) {
            return false;
        }
        String str2 = this.longMessage;
        if (str2 != null) {
            return str2.equals(userStatus.longMessage);
        }
        if (userStatus.longMessage == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5 = this.code * 31;
        String str = this.shortMessage;
        int i6 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i5 + i4) * 31;
        String str2 = this.longMessage;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i7 + i6;
    }

    @JsonIgnore
    public boolean isLoggedIn() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "UserStatus{code=" + this.code + ", shortMessage='" + this.shortMessage + "', longMessage='" + this.longMessage + "'}";
    }

    public UserStatus(int statusCode, String shortMessage, String longMessage) {
        this.code = statusCode;
        this.shortMessage = shortMessage;
        this.longMessage = longMessage;
    }
}
