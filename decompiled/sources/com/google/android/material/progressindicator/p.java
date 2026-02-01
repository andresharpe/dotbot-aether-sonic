package com.google.android.material.progressindicator;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import com.google.android.material.internal.w;

/* loaded from: classes2.dex */
public final class p extends c {

    /* renamed from: g, reason: collision with root package name */
    public int f32997g;

    /* renamed from: h, reason: collision with root package name */
    public int f32998h;

    /* renamed from: i, reason: collision with root package name */
    boolean f32999i;

    public p(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.fa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.c
    public void e() {
        if (this.f32997g == 0) {
            if (this.f32893b <= 0) {
                if (this.f32894c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public p(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        this(context, attributeSet, i4, o.f32990f0);
    }

    public p(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray j4 = w.j(context, attributeSet, a.o.Dk, a.c.fa, o.f32990f0, new int[0]);
        this.f32997g = j4.getInt(a.o.Ek, 1);
        this.f32998h = j4.getInt(a.o.Fk, 0);
        j4.recycle();
        e();
        this.f32999i = this.f32998h == 1;
    }
}
