package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class t {

    /* renamed from: c, reason: collision with root package name */
    private float f32720c;

    /* renamed from: f, reason: collision with root package name */
    @P
    private com.google.android.material.resources.d f32723f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f32718a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.material.resources.f f32719b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f32721d = true;

    /* renamed from: e, reason: collision with root package name */
    @P
    private WeakReference<b> f32722e = new WeakReference<>(null);

    /* loaded from: classes2.dex */
    class a extends com.google.android.material.resources.f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
            t.this.f32721d = true;
            b bVar = (b) t.this.f32722e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public void b(@N Typeface typeface, boolean z3) {
            if (!z3) {
                t.this.f32721d = true;
                b bVar = (b) t.this.f32722e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        @N
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public t(@P b bVar) {
        h(bVar);
    }

    private float c(@P CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f32718a.measureText(charSequence, 0, charSequence.length());
    }

    @P
    public com.google.android.material.resources.d d() {
        return this.f32723f;
    }

    @N
    public TextPaint e() {
        return this.f32718a;
    }

    public float f(String str) {
        if (!this.f32721d) {
            return this.f32720c;
        }
        float c4 = c(str);
        this.f32720c = c4;
        this.f32721d = false;
        return c4;
    }

    public boolean g() {
        return this.f32721d;
    }

    public void h(@P b bVar) {
        this.f32722e = new WeakReference<>(bVar);
    }

    public void i(@P com.google.android.material.resources.d dVar, Context context) {
        if (this.f32723f != dVar) {
            this.f32723f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f32718a, this.f32719b);
                b bVar = this.f32722e.get();
                if (bVar != null) {
                    this.f32718a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f32718a, this.f32719b);
                this.f32721d = true;
            }
            b bVar2 = this.f32722e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z3) {
        this.f32721d = z3;
    }

    public void k(Context context) {
        this.f32723f.n(context, this.f32718a, this.f32719b);
    }
}
