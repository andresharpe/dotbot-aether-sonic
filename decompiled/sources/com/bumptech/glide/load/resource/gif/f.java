package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.C1122g;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements com.bumptech.glide.load.i<c> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Bitmap> f26598c;

    public f(com.bumptech.glide.load.i<Bitmap> iVar) {
        this.f26598c = (com.bumptech.glide.load.i) l.d(iVar);
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        this.f26598c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.i
    @N
    public u<c> b(@N Context context, @N u<c> uVar, int i4, int i5) {
        c cVar = uVar.get();
        u<Bitmap> c1122g = new C1122g(cVar.h(), com.bumptech.glide.b.e(context).h());
        u<Bitmap> b4 = this.f26598c.b(context, c1122g, i4, i5);
        if (!c1122g.equals(b4)) {
            c1122g.a();
        }
        cVar.r(this.f26598c, b4.get());
        return uVar;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f26598c.equals(((f) obj).f26598c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f26598c.hashCode();
    }
}
