package com.spotify.protocol.types;

import androidx.constraintlayout.core.motion.utils.v;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class ChildrenPageRequest implements Item {

    @SerializedName("limit")
    @JsonProperty("limit")
    public final int limit;

    @SerializedName(v.c.f7432R)
    @JsonProperty(v.c.f7432R)
    public final int offset;

    @SerializedName("parent_id")
    @JsonProperty("parent_id")
    public final String parentId;

    private ChildrenPageRequest() {
        this(null, 0, 0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof ChildrenPageRequest)) {
            return false;
        }
        ChildrenPageRequest childrenPageRequest = (ChildrenPageRequest) o4;
        if (this.limit != childrenPageRequest.limit || this.offset != childrenPageRequest.offset) {
            return false;
        }
        String str = this.parentId;
        String str2 = childrenPageRequest.parentId;
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
        String str = this.parentId;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return (((i4 * 31) + this.limit) * 31) + this.offset;
    }

    public String toString() {
        return "ChildrenPageRequest{parentId='" + this.parentId + "', limit=" + this.limit + ", offset=" + this.offset + '}';
    }

    public ChildrenPageRequest(String parentId, int limit, int offset) {
        this.parentId = parentId;
        this.limit = limit;
        this.offset = offset;
    }
}
