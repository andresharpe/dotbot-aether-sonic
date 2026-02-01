package com.spotify.protocol.client;

/* loaded from: classes2.dex */
public final class d {
    private d() {
    }

    public static <T> T a(T object) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException("Null is not allowed here.");
    }
}
