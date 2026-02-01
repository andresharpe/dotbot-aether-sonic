package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private ViewStub f13944a;

    /* renamed from: b, reason: collision with root package name */
    private ViewDataBinding f13945b;

    /* renamed from: c, reason: collision with root package name */
    private View f13946c;

    /* renamed from: d, reason: collision with root package name */
    private ViewStub.OnInflateListener f13947d;

    /* renamed from: e, reason: collision with root package name */
    private ViewDataBinding f13948e;

    /* renamed from: f, reason: collision with root package name */
    private ViewStub.OnInflateListener f13949f;

    /* loaded from: classes.dex */
    class a implements ViewStub.OnInflateListener {
        a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            E.this.f13946c = view;
            E e4 = E.this;
            e4.f13945b = m.c(e4.f13948e.f14002P, view, viewStub.getLayoutResource());
            E.this.f13944a = null;
            if (E.this.f13947d != null) {
                E.this.f13947d.onInflate(viewStub, view);
                E.this.f13947d = null;
            }
            E.this.f13948e.j0();
            E.this.f13948e.C();
        }
    }

    public E(@N ViewStub viewStub) {
        a aVar = new a();
        this.f13949f = aVar;
        this.f13944a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @P
    public ViewDataBinding g() {
        return this.f13945b;
    }

    public View h() {
        return this.f13946c;
    }

    @P
    public ViewStub i() {
        return this.f13944a;
    }

    public boolean j() {
        if (this.f13946c != null) {
            return true;
        }
        return false;
    }

    public void k(@N ViewDataBinding viewDataBinding) {
        this.f13948e = viewDataBinding;
    }

    public void l(@P ViewStub.OnInflateListener onInflateListener) {
        if (this.f13944a != null) {
            this.f13947d = onInflateListener;
        }
    }
}
