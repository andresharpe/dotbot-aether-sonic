package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class PlaybackPosition implements Item {

    @SerializedName("position_ms")
    @JsonProperty("position_ms")
    public final long position;

    private PlaybackPosition() {
        this(0L);
    }

    public PlaybackPosition(long position) {
        this.position = position;
    }
}
