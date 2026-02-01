package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
final class s {

    /* renamed from: n, reason: collision with root package name */
    static final int f32695n = 1;

    /* renamed from: o, reason: collision with root package name */
    static final float f32696o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    static final float f32697p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    private static final String f32698q = "android.text.TextDirectionHeuristic";

    /* renamed from: r, reason: collision with root package name */
    private static final String f32699r = "android.text.TextDirectionHeuristics";

    /* renamed from: s, reason: collision with root package name */
    private static final String f32700s = "LTR";

    /* renamed from: t, reason: collision with root package name */
    private static final String f32701t = "RTL";

    /* renamed from: u, reason: collision with root package name */
    private static boolean f32702u;

    /* renamed from: v, reason: collision with root package name */
    @P
    private static Constructor<StaticLayout> f32703v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private static Object f32704w;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f32705a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f32706b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32707c;

    /* renamed from: e, reason: collision with root package name */
    private int f32709e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32716l;

    /* renamed from: d, reason: collision with root package name */
    private int f32708d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f32710f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f32711g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f32712h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f32713i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f32714j = f32695n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32715k = true;

    /* renamed from: m, reason: collision with root package name */
    @P
    private TextUtils.TruncateAt f32717m = null;

    /* loaded from: classes2.dex */
    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private s(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f32705a = charSequence;
        this.f32706b = textPaint;
        this.f32707c = i4;
        this.f32709e = charSequence.length();
    }

    private void b() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (f32702u) {
            return;
        }
        try {
            if (this.f32716l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            f32704w = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f32703v = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f32702u = true;
        } catch (Exception e4) {
            throw new a(e4);
        }
    }

    @N
    public static s c(@N CharSequence charSequence, @N TextPaint textPaint, @androidx.annotation.F(from = 0) int i4) {
        return new s(charSequence, textPaint, i4);
    }

    public StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f32705a == null) {
            this.f32705a = "";
        }
        int max = Math.max(0, this.f32707c);
        CharSequence charSequence = this.f32705a;
        if (this.f32711g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f32706b, max, this.f32717m);
        }
        int min = Math.min(charSequence.length(), this.f32709e);
        this.f32709e = min;
        if (this.f32716l && this.f32711g == 1) {
            this.f32710f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f32708d, min, this.f32706b, max);
        obtain.setAlignment(this.f32710f);
        obtain.setIncludePad(this.f32715k);
        if (this.f32716l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f32717m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f32711g);
        float f4 = this.f32712h;
        if (f4 != 0.0f || this.f32713i != 1.0f) {
            obtain.setLineSpacing(f4, this.f32713i);
        }
        if (this.f32711g > 1) {
            obtain.setHyphenationFrequency(this.f32714j);
        }
        return obtain.build();
    }

    @N
    public s d(@N Layout.Alignment alignment) {
        this.f32710f = alignment;
        return this;
    }

    @N
    public s e(@P TextUtils.TruncateAt truncateAt) {
        this.f32717m = truncateAt;
        return this;
    }

    @N
    public s f(@androidx.annotation.F(from = 0) int i4) {
        this.f32709e = i4;
        return this;
    }

    @N
    public s g(int i4) {
        this.f32714j = i4;
        return this;
    }

    @N
    public s h(boolean z3) {
        this.f32715k = z3;
        return this;
    }

    public s i(boolean z3) {
        this.f32716l = z3;
        return this;
    }

    @N
    public s j(float f4, float f5) {
        this.f32712h = f4;
        this.f32713i = f5;
        return this;
    }

    @N
    public s k(@androidx.annotation.F(from = 0) int i4) {
        this.f32711g = i4;
        return this;
    }

    @N
    public s l(@androidx.annotation.F(from = 0) int i4) {
        this.f32708d = i4;
        return this;
    }
}
