package com.spotify.protocol.types;

import androidx.constraintlayout.core.motion.utils.v;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes2.dex */
public class CrossfadeState implements Item {

    @JsonProperty(v.h.f7538b)
    public int duration;

    @JsonProperty("isEnabled")
    public boolean isEnabled;

    public CrossfadeState(boolean isEnabled, int duration) {
        this.isEnabled = isEnabled;
        this.duration = duration;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof CrossfadeState)) {
            return false;
        }
        CrossfadeState crossfadeState = (CrossfadeState) o4;
        if (this.isEnabled == crossfadeState.isEnabled && this.duration == crossfadeState.duration) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.isEnabled ? 1 : 0) * 31) + this.duration;
    }

    public String toString() {
        return "CrossfadeState{isEnabled=" + this.isEnabled + ", duration=" + this.duration + '}';
    }
}
