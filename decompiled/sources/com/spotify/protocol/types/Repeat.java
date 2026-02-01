package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Repeat implements Item {
    public static final int ALL = 2;
    public static final int OFF = 0;
    public static final int ONE = 1;

    @SerializedName("repeat")
    @JsonProperty("repeat")
    public final int repeat;

    private Repeat() {
        this(0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof Repeat) && this.repeat == ((Repeat) o4).repeat) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.repeat;
    }

    public String toString() {
        return "Repeat{repeat=" + this.repeat + '}';
    }

    public Repeat(int repeat) {
        this.repeat = repeat;
    }
}
