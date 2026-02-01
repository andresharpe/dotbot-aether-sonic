package com.bumptech.glide.load.resource.gif;

import androidx.annotation.N;
import com.bumptech.glide.load.engine.q;

/* loaded from: classes.dex */
public class e extends com.bumptech.glide.load.resource.drawable.b<c> implements q {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
        ((c) this.f26562E).stop();
        ((c) this.f26562E).p();
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void b() {
        ((c) this.f26562E).h().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return ((c) this.f26562E).m();
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<c> d() {
        return c.class;
    }
}
