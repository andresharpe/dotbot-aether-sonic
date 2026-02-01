package com.spotify.protocol.types;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.protocol.mappers.jackson.a;
import javax.annotation.Nullable;

@JsonDeserialize(using = a.C0434a.class)
@JsonSerialize(using = a.b.class)
/* loaded from: classes2.dex */
public class ImageUri implements Item {

    @Nullable
    public final String raw;

    private ImageUri() {
        this(null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof ImageUri)) {
            return false;
        }
        String str = this.raw;
        String str2 = ((ImageUri) o4).raw;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.raw;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ImageId{" + this.raw + "'}";
    }

    public ImageUri(String raw) {
        this.raw = raw;
    }
}
