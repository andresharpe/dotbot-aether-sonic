package com.spotify.protocol.types;

import N0.a;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Track implements Item {

    @SerializedName("album")
    @JsonProperty("album")
    public final Album album;

    @SerializedName("artist")
    @JsonProperty("artist")
    public final Artist artist;

    @SerializedName("artists")
    @JsonProperty("artists")
    public final List<Artist> artists;

    @SerializedName("duration_ms")
    @JsonProperty("duration_ms")
    public final long duration;

    @SerializedName("image_id")
    @JsonProperty("image_id")
    public final ImageUri imageUri;

    @SerializedName("is_episode")
    @JsonProperty("is_episode")
    public final boolean isEpisode;

    @SerializedName("is_podcast")
    @JsonProperty("is_podcast")
    public final boolean isPodcast;

    @SerializedName(a.C0015a.f1688b)
    @JsonProperty(a.C0015a.f1688b)
    public final String name;

    @SerializedName("uri")
    @JsonProperty("uri")
    public final String uri;

    private Track() {
        this(null, null, null, 0L, null, null, null, false, false);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Track)) {
            return false;
        }
        Track track = (Track) o4;
        if (this.duration != track.duration) {
            return false;
        }
        Artist artist = this.artist;
        if (artist == null ? track.artist != null : !artist.equals(track.artist)) {
            return false;
        }
        List<Artist> list = this.artists;
        if (list == null ? track.artists != null : !list.equals(track.artists)) {
            return false;
        }
        Album album = this.album;
        if (album == null ? track.album != null : !album.equals(track.album)) {
            return false;
        }
        String str = this.name;
        if (str == null ? track.name != null : !str.equals(track.name)) {
            return false;
        }
        String str2 = this.uri;
        if (str2 == null ? track.uri != null : !str2.equals(track.uri)) {
            return false;
        }
        ImageUri imageUri = this.imageUri;
        if (imageUri == null ? track.imageUri != null : !imageUri.equals(track.imageUri)) {
            return false;
        }
        if (this.isEpisode == track.isEpisode && this.isPodcast == track.isPodcast) {
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
        Artist artist = this.artist;
        int i9 = 0;
        if (artist != null) {
            i4 = artist.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        List<Artist> list = this.artists;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Album album = this.album;
        if (album != null) {
            i6 = album.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        long j4 = this.duration;
        int i13 = (i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str = this.name;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        String str2 = this.uri;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i15 = (i14 + i8) * 31;
        ImageUri imageUri = this.imageUri;
        if (imageUri != null) {
            i9 = imageUri.hashCode();
        }
        return ((((i15 + i9) * 31) + (this.isEpisode ? 1 : 0)) * 31) + (this.isPodcast ? 1 : 0);
    }

    public String toString() {
        return "Track{artist=" + this.artist + ", artists=" + this.artists + ", album=" + this.album + ", duration=" + this.duration + ", name='" + this.name + "', uri='" + this.uri + "', imageId='" + this.imageUri + "', isEpisode=" + this.isEpisode + ", isPodcast=" + this.isPodcast + '}';
    }

    public Track(Artist artist, List<Artist> artists, Album album, long duration, String name, String uri, ImageUri imageUri, boolean isEpisode, boolean isPodcast) {
        this.artist = artist;
        this.artists = artists;
        this.album = album;
        this.duration = duration;
        this.name = name;
        this.uri = uri;
        this.imageUri = imageUri;
        this.isEpisode = isEpisode;
        this.isPodcast = isPodcast;
    }
}
