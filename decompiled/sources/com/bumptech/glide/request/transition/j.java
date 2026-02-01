package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public class j<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f26915a;

    /* loaded from: classes.dex */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f26915a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r4, f.a aVar) {
        if (aVar.g() != null) {
            this.f26915a.a(aVar.g());
            return false;
        }
        return false;
    }
}
