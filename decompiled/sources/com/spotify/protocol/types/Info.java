package com.spotify.protocol.types;

import N0.a;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.spotify.sdk.android.auth.b;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Info implements Item {

    @SerializedName("category")
    @JsonProperty("category")
    public final String category;

    @SerializedName("default_image_height")
    @JsonProperty("default_image_height")
    public final int defaultImageHeight;

    @SerializedName("default_image_width")
    @JsonProperty("default_image_width")
    public final int defaultImageWidth;

    @SerializedName("default_thumbnail_image_height")
    @JsonProperty("default_thumbnail_image_height")
    public final int defaultThumbnailImageHeight;

    @SerializedName("default_thumbnail_image_width")
    @JsonProperty("default_thumbnail_image_width")
    public final int defaultThumbnailImageWidth;

    @SerializedName(b.c.f48986a)
    @JsonProperty(b.c.f48986a)
    public final String id;

    @SerializedName("image_type")
    @JsonProperty("image_type")
    public final String imageType;

    @SerializedName("model")
    @JsonProperty("model")
    public final String model;

    @SerializedName(a.C0015a.f1688b)
    @JsonProperty(a.C0015a.f1688b)
    public final String name;

    @SerializedName("protocol_version")
    @JsonProperty("protocol_version")
    public final int protocolVersion;

    @SerializedName("required_features")
    @JsonProperty("required_features")
    public final List<String> requiredFeatures;

    @SerializedName("version")
    @JsonProperty("version")
    public final String version;

    private Info() {
        this(0, null, null, null, null, null, null, null, 0, 0, 0, 0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Info)) {
            return false;
        }
        Info info = (Info) o4;
        if (this.protocolVersion != info.protocolVersion || this.defaultImageHeight != info.defaultImageHeight || this.defaultImageWidth != info.defaultImageWidth || this.defaultThumbnailImageHeight != info.defaultThumbnailImageHeight || this.defaultThumbnailImageWidth != info.defaultThumbnailImageWidth) {
            return false;
        }
        String str = this.id;
        if (str == null ? info.id != null : !str.equals(info.id)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null ? info.name != null : !str2.equals(info.name)) {
            return false;
        }
        String str3 = this.model;
        if (str3 == null ? info.model != null : !str3.equals(info.model)) {
            return false;
        }
        String str4 = this.category;
        if (str4 == null ? info.category != null : !str4.equals(info.category)) {
            return false;
        }
        String str5 = this.version;
        if (str5 == null ? info.version != null : !str5.equals(info.version)) {
            return false;
        }
        String str6 = this.imageType;
        if (str6 == null ? info.imageType != null : !str6.equals(info.imageType)) {
            return false;
        }
        List<String> list = this.requiredFeatures;
        if (list == null ? info.requiredFeatures == null : list.equals(info.requiredFeatures)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.protocolVersion * 31;
        String str = this.id;
        int i11 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i10 + i4) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        String str3 = this.model;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        String str4 = this.category;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        String str5 = this.version;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i16 = (i15 + i8) * 31;
        String str6 = this.imageType;
        if (str6 != null) {
            i9 = str6.hashCode();
        } else {
            i9 = 0;
        }
        int i17 = (i16 + i9) * 31;
        List<String> list = this.requiredFeatures;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((((((((i17 + i11) * 31) + this.defaultImageHeight) * 31) + this.defaultImageWidth) * 31) + this.defaultThumbnailImageHeight) * 31) + this.defaultThumbnailImageWidth;
    }

    public String toString() {
        return "Info{protocolVersion=" + this.protocolVersion + ", id='" + this.id + "', name='" + this.name + "', model='" + this.model + "', category='" + this.category + "', version='" + this.version + "', imageType='" + this.imageType + "', requiredFeatures=" + this.requiredFeatures + ", defaultImageHeight=" + this.defaultImageHeight + ", defaultImageWidth=" + this.defaultImageWidth + ", defaultThumbnailImageHeight=" + this.defaultThumbnailImageHeight + ", defaultThumbnailImageWidth=" + this.defaultThumbnailImageWidth + '}';
    }

    public Info(int protocolVersion, List<String> requiredFeatures, String id, String name, String model, String category, String version, String imageType, int defaultImageWidth, int defaultImageHeight, int defaultThumbnailImageWidth, int defaultThumbnailImageHeight) {
        this.protocolVersion = protocolVersion;
        this.id = id;
        this.name = name;
        this.model = model;
        this.category = category;
        this.version = version;
        this.imageType = imageType;
        this.requiredFeatures = requiredFeatures;
        this.defaultImageHeight = defaultImageHeight;
        this.defaultImageWidth = defaultImageWidth;
        this.defaultThumbnailImageHeight = defaultThumbnailImageHeight;
        this.defaultThumbnailImageWidth = defaultThumbnailImageWidth;
    }
}
