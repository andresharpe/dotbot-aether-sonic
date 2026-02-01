package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.N;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private View f33095a;

    /* renamed from: b, reason: collision with root package name */
    private j f33096b;

    /* renamed from: c, reason: collision with root package name */
    private ScrollView f33097c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f33098d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    private final int[] f33099e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f33100f = new a();

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            h.this.e();
        }
    }

    public h(View view, j jVar, ScrollView scrollView) {
        this.f33095a = view;
        this.f33096b = jVar;
        this.f33097c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f33097c = scrollView;
    }

    public void b(j jVar) {
        this.f33096b = jVar;
    }

    public void c(@N ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f33100f);
    }

    public void d(@N ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f33100f);
    }

    public void e() {
        ScrollView scrollView = this.f33097c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() != 0) {
            this.f33097c.getLocationInWindow(this.f33098d);
            this.f33097c.getChildAt(0).getLocationInWindow(this.f33099e);
            int top = (this.f33095a.getTop() - this.f33098d[1]) + this.f33099e[1];
            int height = this.f33095a.getHeight();
            int height2 = this.f33097c.getHeight();
            if (top < 0) {
                this.f33096b.p0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                this.f33095a.invalidate();
                return;
            }
            if (top + height > height2) {
                this.f33096b.p0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
                this.f33095a.invalidate();
                return;
            } else {
                if (this.f33096b.z() != 1.0f) {
                    this.f33096b.p0(1.0f);
                    this.f33095a.invalidate();
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}
