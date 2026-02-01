package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlayerRestrictions implements Item {
    public static final PlayerRestrictions DEFAULT = new PlayerRestrictions();

    @SerializedName("can_repeat_context")
    @JsonProperty("can_repeat_context")
    public final boolean canRepeatContext;

    @SerializedName("can_repeat_track")
    @JsonProperty("can_repeat_track")
    public final boolean canRepeatTrack;

    @SerializedName("can_seek")
    @JsonProperty("can_seek")
    public final boolean canSeek;

    @SerializedName("can_skip_next")
    @JsonProperty("can_skip_next")
    public final boolean canSkipNext;

    @SerializedName("can_skip_prev")
    @JsonProperty("can_skip_prev")
    public final boolean canSkipPrev;

    @SerializedName("can_toggle_shuffle")
    @JsonProperty("can_toggle_shuffle")
    public final boolean canToggleShuffle;

    private PlayerRestrictions() {
        this(false, false, false, false, false, false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof PlayerRestrictions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = (PlayerRestrictions) o4;
        if (this.canSkipNext == playerRestrictions.canSkipNext && this.canSkipPrev == playerRestrictions.canSkipPrev && this.canRepeatTrack == playerRestrictions.canRepeatTrack && this.canRepeatContext == playerRestrictions.canRepeatContext && this.canToggleShuffle == playerRestrictions.canToggleShuffle) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.canSkipNext ? 1 : 0) * 31) + (this.canSkipPrev ? 1 : 0)) * 31) + (this.canRepeatTrack ? 1 : 0)) * 31) + (this.canRepeatContext ? 1 : 0)) * 31) + (this.canToggleShuffle ? 1 : 0);
    }

    public String toString() {
        return "PlayerRestrictions{canSkipNext=" + this.canSkipNext + ", canSkipPrev=" + this.canSkipPrev + ", canRepeatTrack=" + this.canRepeatTrack + ", canRepeatContext=" + this.canRepeatContext + ", canToggleShuffle=" + this.canToggleShuffle + '}';
    }

    public PlayerRestrictions(boolean canSkipNext, boolean canSkipPrev, boolean canRepeatTrack, boolean canRepeatContext, boolean canToggleShuffle, boolean canSeek) {
        this.canSkipNext = canSkipNext;
        this.canSkipPrev = canSkipPrev;
        this.canRepeatTrack = canRepeatTrack;
        this.canRepeatContext = canRepeatContext;
        this.canToggleShuffle = canToggleShuffle;
        this.canSeek = canSeek;
    }
}
