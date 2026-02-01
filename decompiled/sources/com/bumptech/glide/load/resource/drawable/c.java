package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import com.bumptech.glide.k;
import com.bumptech.glide.request.transition.c;
import com.bumptech.glide.request.transition.g;

/* loaded from: classes.dex */
public final class c extends k<c, Drawable> {
    @N
    public static c n(@N g<Drawable> gVar) {
        return new c().g(gVar);
    }

    @N
    public static c o() {
        return new c().i();
    }

    @N
    public static c p(int i4) {
        return new c().j(i4);
    }

    @N
    public static c q(@N c.a aVar) {
        return new c().k(aVar);
    }

    @N
    public static c r(@N com.bumptech.glide.request.transition.c cVar) {
        return new c().l(cVar);
    }

    @N
    public c i() {
        return k(new c.a());
    }

    @N
    public c j(int i4) {
        return k(new c.a(i4));
    }

    @N
    public c k(@N c.a aVar) {
        return l(aVar.a());
    }

    @N
    public c l(@N com.bumptech.glide.request.transition.c cVar) {
        return g(cVar);
    }
}
