package com.bumptech.glide.provider;

import androidx.annotation.N;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f26709a = new ArrayList();

    public synchronized void a(@N ImageHeaderParser imageHeaderParser) {
        this.f26709a.add(imageHeaderParser);
    }

    @N
    public synchronized List<ImageHeaderParser> b() {
        return this.f26709a;
    }
}
