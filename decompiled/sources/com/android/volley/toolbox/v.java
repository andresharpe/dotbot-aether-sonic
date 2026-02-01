package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.K;
import androidx.annotation.P;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.q;

/* loaded from: classes.dex */
public class v extends ImageView {

    /* renamed from: E, reason: collision with root package name */
    private String f24667E;

    /* renamed from: F, reason: collision with root package name */
    private int f24668F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private Drawable f24669G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private Bitmap f24670H;

    /* renamed from: I, reason: collision with root package name */
    private int f24671I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private Drawable f24672J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private Bitmap f24673K;

    /* renamed from: L, reason: collision with root package name */
    private q f24674L;

    /* renamed from: M, reason: collision with root package name */
    private q.g f24675M;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements q.h {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f24676E;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.android.volley.toolbox.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0215a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ q.g f24678E;

            RunnableC0215a(q.g gVar) {
                this.f24678E = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f24678E, false);
            }
        }

        a(boolean z3) {
            this.f24676E = z3;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(q.g gVar, boolean z3) {
            if (z3 && this.f24676E) {
                v.this.post(new RunnableC0215a(gVar));
                return;
            }
            if (gVar.d() != null) {
                v.this.setImageBitmap(gVar.d());
                return;
            }
            if (v.this.f24668F != 0) {
                v vVar = v.this;
                vVar.setImageResource(vVar.f24668F);
            } else if (v.this.f24669G != null) {
                v vVar2 = v.this;
                vVar2.setImageDrawable(vVar2.f24669G);
            } else if (v.this.f24670H != null) {
                v vVar3 = v.this;
                vVar3.setImageBitmap(vVar3.f24670H);
            }
        }

        @Override // com.android.volley.p.a
        public void c(VolleyError volleyError) {
            if (v.this.f24671I != 0) {
                v vVar = v.this;
                vVar.setImageResource(vVar.f24671I);
            } else if (v.this.f24672J != null) {
                v vVar2 = v.this;
                vVar2.setImageDrawable(vVar2.f24672J);
            } else if (v.this.f24673K != null) {
                v vVar3 = v.this;
                vVar3.setImageBitmap(vVar3.f24673K);
            }
        }
    }

    public v(Context context) {
        this(context, null);
    }

    private void h() {
        int i4 = this.f24668F;
        if (i4 != 0) {
            setImageResource(i4);
            return;
        }
        Drawable drawable = this.f24669G;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f24670H;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    void g(boolean z3) {
        boolean z4;
        boolean z5;
        int i4;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z6 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getLayoutParams().height == -2) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z4 = false;
            z5 = false;
        }
        if (!z4 || !z5) {
            z6 = false;
        }
        if (width == 0 && height == 0 && !z6) {
            return;
        }
        if (TextUtils.isEmpty(this.f24667E)) {
            q.g gVar = this.f24675M;
            if (gVar != null) {
                gVar.c();
                this.f24675M = null;
            }
            h();
            return;
        }
        q.g gVar2 = this.f24675M;
        if (gVar2 != null && gVar2.e() != null) {
            if (this.f24675M.e().equals(this.f24667E)) {
                return;
            }
            this.f24675M.c();
            h();
        }
        if (z4) {
            width = 0;
        }
        if (z5) {
            i4 = 0;
        } else {
            i4 = height;
        }
        this.f24675M = this.f24674L.g(this.f24667E, new a(z3), width, i4, scaleType);
    }

    @K
    public void i(String str, q qVar) {
        C.a();
        this.f24667E = str;
        this.f24674L = qVar;
        g(false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        q.g gVar = this.f24675M;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.f24675M = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        g(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f24668F = 0;
        this.f24669G = null;
        this.f24670H = bitmap;
    }

    public void setDefaultImageDrawable(@P Drawable drawable) {
        this.f24668F = 0;
        this.f24670H = null;
        this.f24669G = drawable;
    }

    public void setDefaultImageResId(int i4) {
        this.f24670H = null;
        this.f24669G = null;
        this.f24668F = i4;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f24671I = 0;
        this.f24672J = null;
        this.f24673K = bitmap;
    }

    public void setErrorImageDrawable(@P Drawable drawable) {
        this.f24671I = 0;
        this.f24673K = null;
        this.f24672J = drawable;
    }

    public void setErrorImageResId(int i4) {
        this.f24673K = null;
        this.f24672J = null;
        this.f24671I = i4;
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
