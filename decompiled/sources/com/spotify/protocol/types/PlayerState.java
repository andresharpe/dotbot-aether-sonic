package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlayerState implements Item {

    @SerializedName("is_paused")
    @JsonProperty("is_paused")
    public final boolean isPaused;

    @SerializedName("playback_options")
    @JsonProperty("playback_options")
    public final PlayerOptions playbackOptions;

    @SerializedName("playback_position")
    @JsonProperty("playback_position")
    public final long playbackPosition;

    @SerializedName("playback_restrictions")
    @JsonProperty("playback_restrictions")
    public final PlayerRestrictions playbackRestrictions;

    @SerializedName("playback_speed")
    @JsonProperty("playback_speed")
    public final float playbackSpeed;

    @SerializedName("track")
    @JsonProperty("track")
    public final Track track;

    private PlayerState() {
        this(null, false, 0.0f, 0L, null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) o4;
        if (this.isPaused != playerState.isPaused || Float.compare(playerState.playbackSpeed, this.playbackSpeed) != 0 || this.playbackPosition != playerState.playbackPosition) {
            return false;
        }
        Track track = this.track;
        if (track == null ? playerState.track != null : !track.equals(playerState.track)) {
            return false;
        }
        PlayerOptions playerOptions = this.playbackOptions;
        if (playerOptions == null ? playerState.playbackOptions != null : !playerOptions.equals(playerState.playbackOptions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        if (playerRestrictions != null) {
            return playerRestrictions.equals(playerState.playbackRestrictions);
        }
        if (playerState.playbackRestrictions == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        Track track = this.track;
        int i7 = 0;
        if (track != null) {
            i4 = track.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = ((i4 * 31) + (this.isPaused ? 1 : 0)) * 31;
        float f4 = this.playbackSpeed;
        if (f4 != 0.0f) {
            i5 = Float.floatToIntBits(f4);
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        long j4 = this.playbackPosition;
        int i10 = (i9 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        PlayerOptions playerOptions = this.playbackOptions;
        if (playerOptions != null) {
            i6 = playerOptions.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        if (playerRestrictions != null) {
            i7 = playerRestrictions.hashCode();
        }
        return i11 + i7;
    }

    public String toString() {
        return "PlayerState{track=" + this.track + ", isPaused=" + this.isPaused + ", playbackSpeed=" + this.playbackSpeed + ", playbackPosition=" + this.playbackPosition + ", playbackOptions=" + this.playbackOptions + ", playbackRestrictions=" + this.playbackRestrictions + '}';
    }

    public PlayerState(Track track, boolean isPaused, float playbackSpeed, long playbackPosition, PlayerOptions playbackOptions, PlayerRestrictions playbackRestrictions) {
        this.track = track;
        this.isPaused = isPaused;
        this.playbackSpeed = playbackSpeed;
        this.playbackPosition = playbackPosition;
        this.playbackOptions = playbackOptions == null ? PlayerOptions.DEFAULT : playbackOptions;
        this.playbackRestrictions = playbackRestrictions == null ? PlayerRestrictions.DEFAULT : playbackRestrictions;
    }
}
