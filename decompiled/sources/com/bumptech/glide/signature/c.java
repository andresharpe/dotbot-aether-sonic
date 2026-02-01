package com.bumptech.glide.signature;

import androidx.annotation.N;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f26921c = new c();

    private c() {
    }

    @N
    public static c c() {
        return f26921c;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
