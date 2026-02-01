package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class HelloDetails implements Item {

    @SerializedName("authid")
    @JsonProperty("authid")
    public final String authid;

    @SerializedName("authmethods")
    @JsonProperty("authmethods")
    public final String[] authmethods;

    @SerializedName("extras")
    @JsonProperty("extras")
    public final Map<String, String> extras;

    @SerializedName("info")
    @JsonProperty("info")
    public final Info info;

    @SerializedName("roles")
    @JsonProperty("roles")
    public final Roles roles;

    private HelloDetails() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof HelloDetails)) {
            return false;
        }
        HelloDetails helloDetails = (HelloDetails) o4;
        Roles roles = this.roles;
        if (roles == null ? helloDetails.roles != null : !roles.equals(helloDetails.roles)) {
            return false;
        }
        Info info = this.info;
        if (info == null ? helloDetails.info != null : !info.equals(helloDetails.info)) {
            return false;
        }
        if (!Arrays.equals(this.authmethods, helloDetails.authmethods)) {
            return false;
        }
        String str = this.authid;
        if (str == null ? helloDetails.authid != null : !str.equals(helloDetails.authid)) {
            return false;
        }
        Map<String, String> map = this.extras;
        Map<String, String> map2 = helloDetails.extras;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        Roles roles = this.roles;
        int i7 = 0;
        if (roles != null) {
            i4 = roles.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = i4 * 31;
        Info info = this.info;
        if (info != null) {
            i5 = info.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode = (((i8 + i5) * 31) + Arrays.hashCode(this.authmethods)) * 31;
        String str = this.authid;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i9 = (hashCode + i6) * 31;
        Map<String, String> map = this.extras;
        if (map != null) {
            i7 = map.hashCode();
        }
        return i9 + i7;
    }

    public String toString() {
        return "HelloDetails{roles=" + this.roles + ", info=" + this.info + ", authmethods=" + Arrays.toString(this.authmethods) + ", authid='" + this.authid + "', extras=" + this.extras + '}';
    }

    public HelloDetails(Roles roles, Info info, String[] authmethods, String authid, Map<String, String> extras) {
        this.roles = roles;
        this.info = info;
        this.authmethods = authmethods;
        this.authid = authid;
        this.extras = extras;
    }
}
