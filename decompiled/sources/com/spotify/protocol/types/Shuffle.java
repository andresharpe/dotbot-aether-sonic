package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Shuffle implements Item {

    @SerializedName("shuffle")
    @JsonProperty("shuffle")
    public final boolean shuffle;

    private Shuffle() {
        this(false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if ((o4 instanceof Shuffle) && this.shuffle == ((Shuffle) o4).shuffle) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.shuffle ? 1 : 0;
    }

    public String toString() {
        return "Shuffle{shuffle=" + this.shuffle + '}';
    }

    public Shuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }
}
