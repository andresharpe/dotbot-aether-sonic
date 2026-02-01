package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Uri implements Item {

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    private Uri() {
        this(null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Uri)) {
            return false;
        }
        String str = this.uri;
        String str2 = ((Uri) o4).uri;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.uri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Uri{uri='" + this.uri + "'}";
    }

    public Uri(String uri) {
        this.uri = uri;
    }
}
