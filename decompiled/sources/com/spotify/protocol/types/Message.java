package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class Message implements Item {

    @SerializedName("message")
    @JsonProperty("message")
    public final String message;

    public Message(String message) {
        this.message = message;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof Message)) {
            return false;
        }
        String str = this.message;
        String str2 = ((Message) o4).message;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.message;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Message{message='" + this.message + "'}";
    }

    private Message() {
        this(null);
    }
}
