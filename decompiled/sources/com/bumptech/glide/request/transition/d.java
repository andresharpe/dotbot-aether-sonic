package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public class d implements f<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f26905a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26906b;

    public d(int i4, boolean z3) {
        this.f26905a = i4;
        this.f26906b = z3;
    }

    @Override // com.bumptech.glide.request.transition.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable h4 = aVar.h();
        if (h4 == null) {
            h4 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{h4, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f26906b);
        transitionDrawable.startTransition(this.f26905a);
        aVar.f(transitionDrawable);
        return true;
    }
}
