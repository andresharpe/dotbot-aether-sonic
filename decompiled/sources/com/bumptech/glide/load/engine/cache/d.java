package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0226a {

    /* renamed from: c, reason: collision with root package name */
    private final long f25957c;

    /* renamed from: d, reason: collision with root package name */
    private final c f25958d;

    /* loaded from: classes.dex */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25959a;

        a(String str) {
            this.f25959a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f25959a);
        }
    }

    /* loaded from: classes.dex */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25960a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25961b;

        b(String str, String str2) {
            this.f25960a = str;
            this.f25961b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f25960a, this.f25961b);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        File a();
    }

    public d(String str, long j4) {
        this(new a(str), j4);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0226a
    public com.bumptech.glide.load.engine.cache.a a() {
        File a4 = this.f25958d.a();
        if (a4 == null) {
            return null;
        }
        if (!a4.isDirectory() && !a4.mkdirs()) {
            return null;
        }
        return e.d(a4, this.f25957c);
    }

    public d(String str, String str2, long j4) {
        this(new b(str, str2), j4);
    }

    public d(c cVar, long j4) {
        this.f25957c = j4;
        this.f25958d = cVar;
    }
}
