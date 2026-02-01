package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class MotionState implements Item {
    public static final int DETECTED = 2;
    public static final int DETECTING = 1;
    public static final int ERROR = 3;
    public static final int INITIAL = 0;
    public static final int SKIPPED = 4;
    public static final int UNKNOWN = -1;

    @SerializedName("state")
    @JsonProperty("state")
    public final int state;

    private MotionState() {
        this(-1);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof MotionState) && this.state == ((MotionState) o4).state) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.state;
    }

    public String toString() {
        return "MotionState{state=" + this.state + '}';
    }

    public MotionState(int state) {
        this.state = state;
    }
}
