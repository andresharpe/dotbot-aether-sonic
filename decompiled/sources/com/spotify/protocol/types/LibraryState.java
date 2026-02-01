package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class LibraryState implements Item {

    @SerializedName("can_save")
    @JsonProperty("can_save")
    public final boolean canAdd;

    @SerializedName("saved")
    @JsonProperty("saved")
    public final boolean isAdded;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    private LibraryState() {
        this(null, false, false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof LibraryState)) {
            return false;
        }
        LibraryState libraryState = (LibraryState) o4;
        if (this.isAdded != libraryState.isAdded || this.canAdd != libraryState.canAdd) {
            return false;
        }
        String str = this.uri;
        String str2 = libraryState.uri;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        String str = this.uri;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return (((i4 * 31) + (this.isAdded ? 1 : 0)) * 31) + (this.canAdd ? 1 : 0);
    }

    public String toString() {
        return "LibraryState{uri='" + this.uri + "', isAdded=" + this.isAdded + ", canAdd=" + this.canAdd + '}';
    }

    public LibraryState(String uri, boolean isAdded, boolean canAdd) {
        this.uri = uri;
        this.isAdded = isAdded;
        this.canAdd = canAdd;
    }
}
