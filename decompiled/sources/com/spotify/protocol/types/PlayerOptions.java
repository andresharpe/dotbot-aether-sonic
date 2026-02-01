package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlayerOptions implements Item {
    public static final PlayerOptions DEFAULT = new PlayerOptions();

    @SerializedName("shuffle")
    @JsonProperty("shuffle")
    public final boolean isShuffling;

    @SerializedName("repeat")
    @JsonProperty("repeat")
    public final int repeatMode;

    private PlayerOptions() {
        this(false, 0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof PlayerOptions)) {
            return false;
        }
        PlayerOptions playerOptions = (PlayerOptions) o4;
        if (this.isShuffling == playerOptions.isShuffling && this.repeatMode == playerOptions.repeatMode) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.isShuffling ? 1 : 0) * 31) + this.repeatMode;
    }

    public String toString() {
        return "PlayerOptions{isShuffling=" + this.isShuffling + ", repeatMode=" + this.repeatMode + '}';
    }

    public PlayerOptions(boolean isShuffling, int repeatMode) {
        this.isShuffling = isShuffling;
        this.repeatMode = repeatMode;
    }
}
