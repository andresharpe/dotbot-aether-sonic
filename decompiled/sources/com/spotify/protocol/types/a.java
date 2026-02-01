package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    @JsonProperty("type")
    public final String f48924a;

    public a() {
        this("");
    }

    public a(String type) {
        this.f48924a = type;
    }
}
