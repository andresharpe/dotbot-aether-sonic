package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.N;
import com.bumptech.glide.util.n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    private final int f26917c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26918d;

    private a(int i4, com.bumptech.glide.load.c cVar) {
        this.f26917c = i4;
        this.f26918d = cVar;
    }

    @N
    public static com.bumptech.glide.load.c c(@N Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        this.f26918d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f26917c).array());
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26917c != aVar.f26917c || !this.f26918d.equals(aVar.f26918d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return n.q(this.f26918d, this.f26917c);
    }
}
