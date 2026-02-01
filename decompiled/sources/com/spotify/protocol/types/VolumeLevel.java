package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class VolumeLevel implements Item {

    @SerializedName("volume")
    @JsonProperty("volume")
    public final float mVolume;

    public VolumeLevel(float volume) {
        this.mVolume = volume;
    }

    public boolean equals(@Nullable Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof VolumeLevel) && Float.compare(((VolumeLevel) o4).mVolume, this.mVolume) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float f4 = this.mVolume;
        if (f4 != 0.0f) {
            return Float.floatToIntBits(f4);
        }
        return 0;
    }
}
