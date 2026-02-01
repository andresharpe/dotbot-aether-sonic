package com.google.android.material.internal;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class q extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    @P
    Drawable f32682E;

    /* renamed from: F, reason: collision with root package name */
    Rect f32683F;

    /* renamed from: G, reason: collision with root package name */
    private Rect f32684G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32685H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32686I;

    /* loaded from: classes2.dex */
    class a implements InterfaceC0772a0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, @N Y0 y02) {
            boolean z3;
            q qVar = q.this;
            if (qVar.f32683F == null) {
                qVar.f32683F = new Rect();
            }
            q.this.f32683F.set(y02.p(), y02.r(), y02.q(), y02.o());
            q.this.a(y02);
            q qVar2 = q.this;
            if (y02.w() && q.this.f32682E != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            qVar2.setWillNotDraw(z3);
            C0823k0.n1(q.this);
            return y02.c();
        }
    }

    public q(@N Context context) {
        this(context, null);
    }

    protected void a(Y0 y02) {
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f32683F != null && this.f32682E != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f32685H) {
                this.f32684G.set(0, 0, width, this.f32683F.top);
                this.f32682E.setBounds(this.f32684G);
                this.f32682E.draw(canvas);
            }
            if (this.f32686I) {
                this.f32684G.set(0, height - this.f32683F.bottom, width, height);
                this.f32682E.setBounds(this.f32684G);
                this.f32682E.draw(canvas);
            }
            Rect rect = this.f32684G;
            Rect rect2 = this.f32683F;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f32682E.setBounds(this.f32684G);
            this.f32682E.draw(canvas);
            Rect rect3 = this.f32684G;
            Rect rect4 = this.f32683F;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f32682E.setBounds(this.f32684G);
            this.f32682E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f32682E;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f32682E;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z3) {
        this.f32686I = z3;
    }

    public void setDrawTopInsetForeground(boolean z3) {
        this.f32685H = z3;
    }

    public void setScrimInsetForeground(@P Drawable drawable) {
        this.f32682E = drawable;
    }

    public q(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f32684G = new Rect();
        this.f32685H = true;
        this.f32686I = true;
        TypedArray j4 = w.j(context, attributeSet, a.o.Dq, i4, a.n.ge, new int[0]);
        this.f32682E = j4.getDrawable(a.o.Eq);
        j4.recycle();
        setWillNotDraw(true);
        C0823k0.a2(this, new a());
    }
}
