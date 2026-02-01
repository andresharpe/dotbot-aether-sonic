package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.harman.sdk.message.BatteryInfo;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Image implements Item {

    @SerializedName("height")
    @JsonProperty("height")
    public final int height;

    @SerializedName("image_data")
    @JsonProperty("image_data")
    public final byte[] imageData;

    @SerializedName("width")
    @JsonProperty("width")
    public final int width;

    /* loaded from: classes2.dex */
    public enum Dimension {
        LARGE(720),
        MEDIUM(480),
        SMALL(360),
        X_SMALL(BatteryInfo.f48169K),
        THUMBNAIL(144);

        private final int mValue;

        Dimension(int value) {
            this.mValue = value;
        }

        public int b() {
            return this.mValue;
        }
    }

    private Image() {
        this(null, 0, 0);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Image)) {
            return false;
        }
        Image image = (Image) o4;
        if (this.width != image.width || this.height != image.height) {
            return false;
        }
        return Arrays.equals(this.imageData, image.imageData);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.imageData) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "Image{imageData=" + Arrays.toString(this.imageData) + ", width=" + this.width + ", height=" + this.height + '}';
    }

    public Image(byte[] bytes, int defaultImageWidth, int defaultImageHeight) {
        this.imageData = bytes;
        this.width = defaultImageWidth;
        this.height = defaultImageHeight;
    }
}
