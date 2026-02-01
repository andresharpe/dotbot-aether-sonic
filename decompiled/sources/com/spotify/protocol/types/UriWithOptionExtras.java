package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class UriWithOptionExtras implements Item {

    @SerializedName("options")
    @JsonProperty("options")
    public final String[] options;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    public UriWithOptionExtras() {
        this(null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof UriWithOptionExtras)) {
            return false;
        }
        UriWithOptionExtras uriWithOptionExtras = (UriWithOptionExtras) o4;
        if (this.uri.equals(uriWithOptionExtras.uri) && Arrays.equals(this.options, uriWithOptionExtras.options)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + Arrays.hashCode(this.options);
    }

    public String toString() {
        return "UriWithOptionExtras{uri='" + this.uri + "', options=" + Arrays.toString(this.options) + '}';
    }

    public UriWithOptionExtras(String uri, String[] options) {
        this.uri = uri;
        this.options = options;
    }
}
