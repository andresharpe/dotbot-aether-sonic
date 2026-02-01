package com.spotify.protocol.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes2.dex */
public class WelcomeDetails implements Item {

    @SerializedName("roles")
    @JsonProperty("roles")
    public final Roles roles;

    private WelcomeDetails() {
        this(null);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof WelcomeDetails)) {
            return false;
        }
        Roles roles = this.roles;
        Roles roles2 = ((WelcomeDetails) o4).roles;
        if (roles != null) {
            return roles.equals(roles2);
        }
        if (roles2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Roles roles = this.roles;
        if (roles != null) {
            return roles.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "WelcomeDetails{roles=" + this.roles + '}';
    }

    public WelcomeDetails(Roles roles) {
        this.roles = roles;
    }
}
