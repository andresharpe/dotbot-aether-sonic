package com.spotify.protocol.types;

import N0.a;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Artist implements Item {

    @SerializedName(a.C0015a.f1688b)
    @JsonProperty(a.C0015a.f1688b)
    public final String name;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    private Artist() {
        this(null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) o4;
        String str = this.name;
        if (str == null ? artist.name != null : !str.equals(artist.name)) {
            return false;
        }
        String str2 = this.uri;
        String str3 = artist.uri;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        String str = this.name;
        int i5 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i6 = i4 * 31;
        String str2 = this.uri;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        return "Artist{name='" + this.name + "', uri='" + this.uri + "'}";
    }

    public Artist(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }
}
