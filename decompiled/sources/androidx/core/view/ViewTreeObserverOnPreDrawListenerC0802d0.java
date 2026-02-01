package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0802d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: E, reason: collision with root package name */
    private final View f13462E;

    /* renamed from: F, reason: collision with root package name */
    private ViewTreeObserver f13463F;

    /* renamed from: G, reason: collision with root package name */
    private final Runnable f13464G;

    private ViewTreeObserverOnPreDrawListenerC0802d0(View view, Runnable runnable) {
        this.f13462E = view;
        this.f13463F = view.getViewTreeObserver();
        this.f13464G = runnable;
    }

    @androidx.annotation.N
    public static ViewTreeObserverOnPreDrawListenerC0802d0 a(@androidx.annotation.N View view, @androidx.annotation.N Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserverOnPreDrawListenerC0802d0 viewTreeObserverOnPreDrawListenerC0802d0 = new ViewTreeObserverOnPreDrawListenerC0802d0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0802d0);
                view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0802d0);
                return viewTreeObserverOnPreDrawListenerC0802d0;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.f13463F.isAlive()) {
            this.f13463F.removeOnPreDrawListener(this);
        } else {
            this.f13462E.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f13462E.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f13464G.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@androidx.annotation.N View view) {
        this.f13463F = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@androidx.annotation.N View view) {
        b();
    }
}
