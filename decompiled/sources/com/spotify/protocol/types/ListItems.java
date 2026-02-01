package com.spotify.protocol.types;

import androidx.constraintlayout.core.motion.utils.v;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class ListItems implements Item {

    @SerializedName(FirebaseAnalytics.b.f34791f0)
    @JsonProperty(FirebaseAnalytics.b.f34791f0)
    public final ListItem[] items;

    @SerializedName("limit")
    @JsonProperty("limit")
    public final int limit;

    @SerializedName(v.c.f7432R)
    @JsonProperty(v.c.f7432R)
    public final int offset;

    @SerializedName("total")
    @JsonProperty("total")
    public final int total;

    private ListItems() {
        this(0, 0, 0, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof ListItems)) {
            return false;
        }
        ListItems listItems = (ListItems) o4;
        if (this.limit != listItems.limit || this.offset != listItems.offset || this.total != listItems.total) {
            return false;
        }
        return Arrays.equals(this.items, listItems.items);
    }

    public int hashCode() {
        return (((((this.limit * 31) + this.offset) * 31) + this.total) * 31) + Arrays.hashCode(this.items);
    }

    public String toString() {
        return "ListItems{limit=" + this.limit + ", offset=" + this.offset + ", total=" + this.total + ", items=" + Arrays.toString(this.items) + '}';
    }

    public ListItems(int limit, int offset, int total, ListItem[] items) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.items = items;
    }
}
