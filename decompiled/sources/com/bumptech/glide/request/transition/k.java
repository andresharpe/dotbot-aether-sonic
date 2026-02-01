package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public class k<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f26916a;

    /* loaded from: classes.dex */
    interface a {
        Animation a(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(a aVar) {
        this.f26916a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r4, f.a aVar) {
        View g4 = aVar.g();
        if (g4 != null) {
            g4.clearAnimation();
            g4.startAnimation(this.f26916a.a(g4.getContext()));
            return false;
        }
        return false;
    }
}
