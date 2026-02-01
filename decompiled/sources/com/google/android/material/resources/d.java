package com.google.android.material.resources;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.InterfaceC0581y;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.core.content.res.i;
import androidx.core.view.C0823k0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    private static final String f33009r = "TextAppearance";

    /* renamed from: s, reason: collision with root package name */
    private static final int f33010s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f33011t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f33012u = 3;

    /* renamed from: a, reason: collision with root package name */
    @P
    public final ColorStateList f33013a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final ColorStateList f33014b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final ColorStateList f33015c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f33016d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33018f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33019g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33020h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33021i;

    /* renamed from: j, reason: collision with root package name */
    public final float f33022j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33023k;

    /* renamed from: l, reason: collision with root package name */
    public final float f33024l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private ColorStateList f33025m;

    /* renamed from: n, reason: collision with root package name */
    private float f33026n;

    /* renamed from: o, reason: collision with root package name */
    @InterfaceC0581y
    private final int f33027o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33028p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f33029q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends i.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f33030a;

        a(f fVar) {
            this.f33030a = fVar;
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: h */
        public void f(int i4) {
            d.this.f33028p = true;
            this.f33030a.a(i4);
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: i */
        public void g(@N Typeface typeface) {
            d dVar = d.this;
            dVar.f33029q = Typeface.create(typeface, dVar.f33017e);
            d.this.f33028p = true;
            this.f33030a.b(d.this.f33029q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f33032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f33033b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f33034c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f33032a = context;
            this.f33033b = textPaint;
            this.f33034c = fVar;
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
            this.f33034c.a(i4);
        }

        @Override // com.google.android.material.resources.f
        public void b(@N Typeface typeface, boolean z3) {
            d.this.p(this.f33032a, this.f33033b, typeface);
            this.f33034c.b(typeface, z3);
        }
    }

    public d(@N Context context, @d0 int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.xt);
        l(obtainStyledAttributes.getDimension(a.o.yt, 0.0f));
        k(c.a(context, obtainStyledAttributes, a.o.Bt));
        this.f33013a = c.a(context, obtainStyledAttributes, a.o.Ct);
        this.f33014b = c.a(context, obtainStyledAttributes, a.o.Dt);
        this.f33017e = obtainStyledAttributes.getInt(a.o.At, 0);
        this.f33018f = obtainStyledAttributes.getInt(a.o.zt, 1);
        int f4 = c.f(obtainStyledAttributes, a.o.Kt, a.o.It);
        this.f33027o = obtainStyledAttributes.getResourceId(f4, 0);
        this.f33016d = obtainStyledAttributes.getString(f4);
        this.f33019g = obtainStyledAttributes.getBoolean(a.o.Mt, false);
        this.f33015c = c.a(context, obtainStyledAttributes, a.o.Et);
        this.f33020h = obtainStyledAttributes.getFloat(a.o.Ft, 0.0f);
        this.f33021i = obtainStyledAttributes.getFloat(a.o.Gt, 0.0f);
        this.f33022j = obtainStyledAttributes.getFloat(a.o.Ht, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, a.o.zm);
        this.f33023k = obtainStyledAttributes2.hasValue(a.o.Am);
        this.f33024l = obtainStyledAttributes2.getFloat(a.o.Am, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f33029q == null && (str = this.f33016d) != null) {
            this.f33029q = Typeface.create(str, this.f33017e);
        }
        if (this.f33029q == null) {
            int i4 = this.f33018f;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        this.f33029q = Typeface.DEFAULT;
                    } else {
                        this.f33029q = Typeface.MONOSPACE;
                    }
                } else {
                    this.f33029q = Typeface.SERIF;
                }
            } else {
                this.f33029q = Typeface.SANS_SERIF;
            }
            this.f33029q = Typeface.create(this.f33029q, this.f33017e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (e.b()) {
            return true;
        }
        int i4 = this.f33027o;
        if (i4 != 0) {
            typeface = androidx.core.content.res.i.d(context, i4);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f33029q;
    }

    @i0
    @N
    public Typeface f(@N Context context) {
        if (this.f33028p) {
            return this.f33029q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j4 = androidx.core.content.res.i.j(context, this.f33027o);
                this.f33029q = j4;
                if (j4 != null) {
                    this.f33029q = Typeface.create(j4, this.f33017e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d(f33009r, "Error loading font " + this.f33016d, e4);
            }
        }
        d();
        this.f33028p = true;
        return this.f33029q;
    }

    public void g(@N Context context, @N TextPaint textPaint, @N f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@N Context context, @N f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i4 = this.f33027o;
        if (i4 == 0) {
            this.f33028p = true;
        }
        if (this.f33028p) {
            fVar.b(this.f33029q, true);
            return;
        }
        try {
            androidx.core.content.res.i.l(context, i4, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f33028p = true;
            fVar.a(1);
        } catch (Exception e4) {
            Log.d(f33009r, "Error loading font " + this.f33016d, e4);
            this.f33028p = true;
            fVar.a(-3);
        }
    }

    @P
    public ColorStateList i() {
        return this.f33025m;
    }

    public float j() {
        return this.f33026n;
    }

    public void k(@P ColorStateList colorStateList) {
        this.f33025m = colorStateList;
    }

    public void l(float f4) {
        this.f33026n = f4;
    }

    public void n(@N Context context, @N TextPaint textPaint, @N f fVar) {
        int i4;
        int i5;
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f33025m;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i4 = C0823k0.f13589t;
        }
        textPaint.setColor(i4);
        float f4 = this.f33022j;
        float f5 = this.f33020h;
        float f6 = this.f33021i;
        ColorStateList colorStateList2 = this.f33015c;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i5 = 0;
        }
        textPaint.setShadowLayer(f4, f5, f6, i5);
    }

    public void o(@N Context context, @N TextPaint textPaint, @N f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@N Context context, @N TextPaint textPaint, @N Typeface typeface) {
        boolean z3;
        float f4;
        Typeface a4 = j.a(context, typeface);
        if (a4 != null) {
            typeface = a4;
        }
        textPaint.setTypeface(typeface);
        int i4 = this.f33017e & (~typeface.getStyle());
        if ((i4 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        textPaint.setFakeBoldText(z3);
        if ((i4 & 2) != 0) {
            f4 = -0.25f;
        } else {
            f4 = 0.0f;
        }
        textPaint.setTextSkewX(f4);
        textPaint.setTextSize(this.f33026n);
        if (this.f33023k) {
            textPaint.setLetterSpacing(this.f33024l);
        }
    }
}
