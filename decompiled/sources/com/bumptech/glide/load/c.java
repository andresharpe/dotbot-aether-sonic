package com.bumptech.glide.load;

import androidx.annotation.N;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f25783a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f25784b = Charset.forName("UTF-8");

    void a(@N MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
