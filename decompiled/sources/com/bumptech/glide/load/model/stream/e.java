package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.resource.bitmap.O;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26365a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26366a;

        public a(Context context) {
            this.f26366a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, InputStream> c(r rVar) {
            return new e(this.f26366a);
        }
    }

    public e(Context context) {
        this.f26365a = context.getApplicationContext();
    }

    private boolean e(com.bumptech.glide.load.f fVar) {
        Long l4 = (Long) fVar.c(O.f26498g);
        if (l4 != null && l4.longValue() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.n
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        if (com.bumptech.glide.load.data.mediastore.b.d(i4, i5) && e(fVar)) {
            return new n.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.g(this.f26365a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
