package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.protocol.types.Image;
import com.spotify.sdk.android.auth.b;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class ImageIdentifier implements Item {

    @JsonProperty("height")
    public final int height;

    @JsonProperty(b.c.f48986a)
    public final String id;

    @JsonProperty("width")
    public final int width;

    public ImageIdentifier(String id, Image.Dimension dimension) {
        this.id = id;
        this.width = dimension.b();
        this.height = dimension.b();
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof ImageIdentifier)) {
            return false;
        }
        ImageIdentifier imageIdentifier = (ImageIdentifier) o4;
        String str = this.id;
        if (str == null ? imageIdentifier.id != null : !str.equals(imageIdentifier.id)) {
            return false;
        }
        if (this.height == imageIdentifier.height && this.width == imageIdentifier.width) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        String str = this.id;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return (((i4 * 31) + this.height) * 31) + this.width;
    }
}
