package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlayerContext implements Item {

    @SerializedName("subtitle")
    @JsonProperty("subtitle")
    public final String subtitle;

    @SerializedName("title")
    @JsonProperty("title")
    public final String title;

    @SerializedName("type")
    @JsonProperty("type")
    public final String type;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    public PlayerContext() {
        this(null, null, null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof PlayerContext)) {
            return false;
        }
        PlayerContext playerContext = (PlayerContext) o4;
        String str = this.uri;
        if (str == null ? playerContext.uri != null : !str.equals(playerContext.uri)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? playerContext.title != null : !str2.equals(playerContext.title)) {
            return false;
        }
        String str3 = this.subtitle;
        if (str3 == null ? playerContext.subtitle != null : !str3.equals(playerContext.subtitle)) {
            return false;
        }
        String str4 = this.type;
        String str5 = playerContext.type;
        if (str4 != null) {
            if (!str4.equals(str5)) {
                return true;
            }
        } else if (str5 != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        String str = this.uri;
        int i7 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = i4 * 31;
        String str2 = this.title;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        String str3 = this.subtitle;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        String str4 = this.type;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        return "PlayerContext{, uri=" + this.uri + ", title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + '}';
    }

    public PlayerContext(String uri, String title, String subtitle, String type) {
        this.uri = uri;
        this.title = title;
        this.subtitle = subtitle;
        this.type = type;
    }
}
