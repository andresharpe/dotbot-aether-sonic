package com.bumptech.glide.load.engine.cache;

import androidx.annotation.N;
import androidx.core.util.t;
import com.bumptech.glide.util.n;
import com.bumptech.glide.util.pool.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.i<com.bumptech.glide.load.c, String> f26000a = new com.bumptech.glide.util.i<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final t.a<b> f26001b = com.bumptech.glide.util.pool.a.e(10, new a());

    /* loaded from: classes.dex */
    class a implements a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: E, reason: collision with root package name */
        final MessageDigest f26003E;

        /* renamed from: F, reason: collision with root package name */
        private final com.bumptech.glide.util.pool.c f26004F = com.bumptech.glide.util.pool.c.a();

        b(MessageDigest messageDigest) {
            this.f26003E = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @N
        public com.bumptech.glide.util.pool.c g() {
            return this.f26004F;
        }
    }

    private String a(com.bumptech.glide.load.c cVar) {
        b bVar = (b) com.bumptech.glide.util.l.d(this.f26001b.b());
        try {
            cVar.a(bVar.f26003E);
            return n.z(bVar.f26003E.digest());
        } finally {
            this.f26001b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.c cVar) {
        String k4;
        synchronized (this.f26000a) {
            k4 = this.f26000a.k(cVar);
        }
        if (k4 == null) {
            k4 = a(cVar);
        }
        synchronized (this.f26000a) {
            this.f26000a.o(cVar, k4);
        }
        return k4;
    }
}
