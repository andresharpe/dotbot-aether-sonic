package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes2.dex */
public class Uris implements Item {

    @JsonProperty("uris")
    public final String[] uris;

    public Uris() {
        this(null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Uris)) {
            return false;
        }
        return Arrays.equals(this.uris, ((Uris) o4).uris);
    }

    public int hashCode() {
        return Arrays.hashCode(this.uris);
    }

    public String toString() {
        return "Uris{uris=" + Arrays.toString(this.uris) + '}';
    }

    public Uris(String[] uris) {
        this.uris = uris;
    }
}
