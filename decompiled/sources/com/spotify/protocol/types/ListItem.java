package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.spotify.sdk.android.auth.b;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class ListItem implements Item {

    @SerializedName("has_children")
    @JsonProperty("has_children")
    public final boolean hasChildren;

    @SerializedName(b.c.f48986a)
    @JsonProperty(b.c.f48986a)
    public final String id;

    @SerializedName("image_id")
    @JsonProperty("image_id")
    public final ImageUri imageUri;

    @SerializedName("playable")
    @JsonProperty("playable")
    public final boolean playable;

    @SerializedName("subtitle")
    @JsonProperty("subtitle")
    public final String subtitle;

    @SerializedName("title")
    @JsonProperty("title")
    public final String title;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    private ListItem() {
        this(null, null, null, null, null, false, false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof ListItem)) {
            return false;
        }
        ListItem listItem = (ListItem) o4;
        if (this.playable != listItem.playable || this.hasChildren != listItem.hasChildren) {
            return false;
        }
        String str = this.id;
        if (str == null ? listItem.id != null : !str.equals(listItem.id)) {
            return false;
        }
        String str2 = this.uri;
        if (str2 == null ? listItem.uri != null : !str2.equals(listItem.uri)) {
            return false;
        }
        ImageUri imageUri = this.imageUri;
        if (imageUri == null ? listItem.imageUri != null : !imageUri.equals(listItem.imageUri)) {
            return false;
        }
        String str3 = this.title;
        if (str3 == null ? listItem.title != null : !str3.equals(listItem.title)) {
            return false;
        }
        String str4 = this.subtitle;
        String str5 = listItem.subtitle;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.id;
        int i8 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = i4 * 31;
        String str2 = this.uri;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        ImageUri imageUri = this.imageUri;
        if (imageUri != null) {
            i6 = imageUri.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i11 + i7) * 31;
        String str4 = this.subtitle;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return ((((i12 + i8) * 31) + (this.playable ? 1 : 0)) * 31) + (this.hasChildren ? 1 : 0);
    }

    public String toString() {
        return "ListItem{id='" + this.id + "', uri='" + this.uri + "', imageId='" + this.imageUri + "', title='" + this.title + "', subtitle='" + this.subtitle + "', playable=" + this.playable + ", hasChildren=" + this.hasChildren + '}';
    }

    public ListItem(String id, String uri, ImageUri imageUri, String title, String subtitle, boolean playable, boolean hasChildren) {
        this.id = id;
        this.uri = uri;
        this.imageUri = imageUri;
        this.title = title;
        this.subtitle = subtitle;
        this.playable = playable;
        this.hasChildren = hasChildren;
    }
}
