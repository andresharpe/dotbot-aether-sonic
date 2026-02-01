package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.N;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f26396b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final n<g, Data> f26397a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, InputStream> c(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f26397a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return this.f26397a.b(new g(uri.toString()), i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        return f26396b.contains(uri.getScheme());
    }
}
