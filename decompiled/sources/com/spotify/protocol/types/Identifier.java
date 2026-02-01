package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.spotify.sdk.android.auth.b;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Identifier implements Item {

    @SerializedName(b.c.f48986a)
    @JsonProperty(b.c.f48986a)
    public final String id;

    private Identifier() {
        this(null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Identifier)) {
            return false;
        }
        String str = this.id;
        String str2 = ((Identifier) o4).id;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Identifier{id='" + this.id + "'}";
    }

    public Identifier(String id) {
        this.id = id;
    }
}
