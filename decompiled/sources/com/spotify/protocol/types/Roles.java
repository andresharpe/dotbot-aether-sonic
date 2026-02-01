package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Roles implements Item {

    @SerializedName("broker")
    @JsonProperty("broker")
    public final Empty broker;

    @SerializedName("caller")
    @JsonProperty("caller")
    public final Empty caller;

    @SerializedName("dealer")
    @JsonProperty("dealer")
    public final Empty dealer;

    @SerializedName("subscriber")
    @JsonProperty("subscriber")
    public final Empty subscriber;

    public Roles() {
        this(null, null, null, null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Roles)) {
            return false;
        }
        Roles roles = (Roles) o4;
        Empty empty = this.dealer;
        if (empty == null ? roles.dealer != null : !empty.equals(roles.dealer)) {
            return false;
        }
        Empty empty2 = this.broker;
        if (empty2 == null ? roles.broker != null : !empty2.equals(roles.broker)) {
            return false;
        }
        Empty empty3 = this.subscriber;
        if (empty3 == null ? roles.subscriber != null : !empty3.equals(roles.subscriber)) {
            return false;
        }
        Empty empty4 = this.caller;
        Empty empty5 = roles.caller;
        if (empty4 != null) {
            return empty4.equals(empty5);
        }
        if (empty5 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        Empty empty = this.dealer;
        int i7 = 0;
        if (empty != null) {
            i4 = empty.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = i4 * 31;
        Empty empty2 = this.broker;
        if (empty2 != null) {
            i5 = empty2.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        Empty empty3 = this.subscriber;
        if (empty3 != null) {
            i6 = empty3.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        Empty empty4 = this.caller;
        if (empty4 != null) {
            i7 = empty4.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        return "Roles{dealer=" + this.dealer + ", broker=" + this.broker + ", subscriber=" + this.subscriber + ", caller=" + this.caller + '}';
    }

    public Roles(Empty dealer, Empty broker, Empty subscriber, Empty caller) {
        this.dealer = dealer;
        this.broker = broker;
        this.subscriber = subscriber;
        this.caller = caller;
    }
}
