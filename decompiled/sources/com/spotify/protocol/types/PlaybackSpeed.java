package com.spotify.protocol.types;

import androidx.recyclerview.widget.n;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlaybackSpeed implements Item {

    @SerializedName("playback_speed")
    @JsonProperty("playback_speed")
    public final int playbackSpeed;

    /* loaded from: classes2.dex */
    public enum PodcastPlaybackSpeed {
        PLAYBACK_SPEED_50(50),
        PLAYBACK_SPEED_80(80),
        PLAYBACK_SPEED_100(100),
        PLAYBACK_SPEED_120(120),
        PLAYBACK_SPEED_150(150),
        PLAYBACK_SPEED_200(n.f.f18255b),
        PLAYBACK_SPEED_300(300);

        private final int mValue;

        PodcastPlaybackSpeed(int value) {
            this.mValue = value;
        }

        public int b() {
            return this.mValue;
        }
    }

    protected PlaybackSpeed() {
        this(0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof PlaybackSpeed) && this.playbackSpeed == ((PlaybackSpeed) o4).playbackSpeed) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.playbackSpeed;
    }

    public String toString() {
        return "PlaybackSpeed{playbackSpeed=" + this.playbackSpeed + '}';
    }

    public PlaybackSpeed(int playbackSpeed) {
        this.playbackSpeed = playbackSpeed;
    }
}
