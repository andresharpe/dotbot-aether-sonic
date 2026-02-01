package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class VolumeState implements Item {

    @SerializedName("controllable")
    @JsonProperty("controllable")
    public final boolean mControllable;

    @SerializedName("volume")
    @JsonProperty("volume")
    public final float mVolume;

    public VolumeState(float volume, boolean controllable) {
        this.mVolume = volume;
        this.mControllable = controllable;
    }

    public boolean equals(@Nullable Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof VolumeState)) {
            return false;
        }
        VolumeState volumeState = (VolumeState) o4;
        if (Float.compare(volumeState.mVolume, this.mVolume) == 0 && this.mControllable == volumeState.mControllable) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        float f4 = this.mVolume;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        return (i4 * 31) + (this.mControllable ? 1 : 0);
    }
}
