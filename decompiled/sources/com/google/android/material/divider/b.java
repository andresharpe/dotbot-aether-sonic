package com.google.android.material.divider;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.core.content.C0669d;
import androidx.core.graphics.drawable.d;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.w;
import com.google.android.material.resources.c;

/* loaded from: classes2.dex */
public class b extends RecyclerView.n {

    /* renamed from: i, reason: collision with root package name */
    public static final int f32282i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f32283j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f32284k = a.n.qi;

    /* renamed from: a, reason: collision with root package name */
    @N
    private Drawable f32285a;

    /* renamed from: b, reason: collision with root package name */
    private int f32286b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC0569l
    private int f32287c;

    /* renamed from: d, reason: collision with root package name */
    private int f32288d;

    /* renamed from: e, reason: collision with root package name */
    private int f32289e;

    /* renamed from: f, reason: collision with root package name */
    private int f32290f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32291g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f32292h;

    public b(@N Context context, int i4) {
        this(context, null, i4);
    }

    private void l(@N Canvas canvas, @N RecyclerView recyclerView) {
        int height;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i4, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i4 = 0;
        }
        int i5 = i4 + this.f32289e;
        int i6 = height - this.f32290f;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.getLayoutManager().X(childAt, this.f32292h);
            int round = this.f32292h.right + Math.round(childAt.getTranslationX());
            this.f32285a.setBounds((round - this.f32285a.getIntrinsicWidth()) - this.f32286b, i5, round, i6);
            this.f32285a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(@N Canvas canvas, @N RecyclerView recyclerView) {
        int width;
        int i4;
        int i5;
        int i6;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i4, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i4 = 0;
        }
        boolean z3 = true;
        if (C0823k0.Z(recyclerView) != 1) {
            z3 = false;
        }
        if (z3) {
            i5 = this.f32290f;
        } else {
            i5 = this.f32289e;
        }
        int i7 = i4 + i5;
        if (z3) {
            i6 = this.f32289e;
        } else {
            i6 = this.f32290f;
        }
        int i8 = width - i6;
        int childCount = recyclerView.getChildCount();
        if (!this.f32291g) {
            childCount--;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            recyclerView.v0(childAt, this.f32292h);
            int round = this.f32292h.bottom + Math.round(childAt.getTranslationY());
            this.f32285a.setBounds(i7, (round - this.f32285a.getIntrinsicHeight()) - this.f32286b, i8, round);
            this.f32285a.draw(canvas);
        }
        canvas.restore();
    }

    public void A(@N Context context, @InterfaceC0574q int i4) {
        z(context.getResources().getDimensionPixelSize(i4));
    }

    public void B(boolean z3) {
        this.f32291g = z3;
    }

    public void C(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i4 + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.f32288d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@N Rect rect, @N View view, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
        rect.set(0, 0, 0, 0);
        if (this.f32288d == 1) {
            rect.bottom = this.f32285a.getIntrinsicHeight() + this.f32286b;
        } else {
            rect.right = this.f32285a.getIntrinsicWidth() + this.f32286b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f32288d == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    @InterfaceC0569l
    public int n() {
        return this.f32287c;
    }

    @U
    public int o() {
        return this.f32290f;
    }

    @U
    public int p() {
        return this.f32289e;
    }

    @U
    public int q() {
        return this.f32286b;
    }

    public int r() {
        return this.f32288d;
    }

    public boolean s() {
        return this.f32291g;
    }

    public void t(@InterfaceC0569l int i4) {
        this.f32287c = i4;
        Drawable r4 = d.r(this.f32285a);
        this.f32285a = r4;
        d.n(r4, i4);
    }

    public void u(@N Context context, @InterfaceC0571n int i4) {
        t(C0669d.f(context, i4));
    }

    public void v(@U int i4) {
        this.f32290f = i4;
    }

    public void w(@N Context context, @InterfaceC0574q int i4) {
        v(context.getResources().getDimensionPixelOffset(i4));
    }

    public void x(@U int i4) {
        this.f32289e = i4;
    }

    public void y(@N Context context, @InterfaceC0574q int i4) {
        x(context.getResources().getDimensionPixelOffset(i4));
    }

    public void z(@U int i4) {
        this.f32286b = i4;
    }

    public b(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, a.c.jb, i4);
    }

    public b(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        this.f32292h = new Rect();
        TypedArray j4 = w.j(context, attributeSet, a.o.nm, i4, f32284k, new int[0]);
        this.f32287c = c.a(context, j4, a.o.om).getDefaultColor();
        this.f32286b = j4.getDimensionPixelSize(a.o.rm, context.getResources().getDimensionPixelSize(a.f.s5));
        this.f32289e = j4.getDimensionPixelOffset(a.o.qm, 0);
        this.f32290f = j4.getDimensionPixelOffset(a.o.pm, 0);
        this.f32291g = j4.getBoolean(a.o.sm, true);
        j4.recycle();
        this.f32285a = new ShapeDrawable();
        t(this.f32287c);
        C(i5);
    }
}
