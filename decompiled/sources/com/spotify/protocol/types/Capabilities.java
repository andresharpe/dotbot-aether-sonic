package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Capabilities implements Item {

    @SerializedName("can_play_on_demand")
    @JsonProperty("can_play_on_demand")
    public final boolean canPlayOnDemand;

    private Capabilities() {
        this(false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof Capabilities) && this.canPlayOnDemand == ((Capabilities) o4).canPlayOnDemand) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.canPlayOnDemand ? 1 : 0;
    }

    public String toString() {
        return "Capabilities{canPlayOnDemand=" + this.canPlayOnDemand + '}';
    }

    public Capabilities(boolean canPlayOnDemand) {
        this.canPlayOnDemand = canPlayOnDemand;
    }
}
