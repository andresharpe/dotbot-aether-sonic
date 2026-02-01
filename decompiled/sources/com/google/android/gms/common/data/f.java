package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    @N
    protected final DataHolder f28531a;

    /* renamed from: b, reason: collision with root package name */
    @I0.a
    protected int f28532b;

    /* renamed from: c, reason: collision with root package name */
    private int f28533c;

    @I0.a
    public f(@N DataHolder dataHolder, int i4) {
        this.f28531a = (DataHolder) C1285y.l(dataHolder);
        n(i4);
    }

    @I0.a
    protected void a(@N String str, @N CharArrayBuffer charArrayBuffer) {
        this.f28531a.f1(str, this.f28532b, this.f28533c, charArrayBuffer);
    }

    @I0.a
    protected boolean b(@N String str) {
        return this.f28531a.i0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    @N
    protected byte[] c(@N String str) {
        return this.f28531a.u0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    protected int d() {
        return this.f28532b;
    }

    @I0.a
    protected double e(@N String str) {
        return this.f28531a.Y0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    public boolean equals(@P Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (C1281w.b(Integer.valueOf(fVar.f28532b), Integer.valueOf(this.f28532b)) && C1281w.b(Integer.valueOf(fVar.f28533c), Integer.valueOf(this.f28533c)) && fVar.f28531a == this.f28531a) {
                return true;
            }
        }
        return false;
    }

    @I0.a
    protected float f(@N String str) {
        return this.f28531a.a1(str, this.f28532b, this.f28533c);
    }

    @I0.a
    protected int g(@N String str) {
        return this.f28531a.x0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    protected long h(@N String str) {
        return this.f28531a.y0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f28532b), Integer.valueOf(this.f28533c), this.f28531a);
    }

    @I0.a
    @N
    protected String i(@N String str) {
        return this.f28531a.B0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    public boolean j(@N String str) {
        return this.f28531a.F0(str);
    }

    @I0.a
    protected boolean k(@N String str) {
        return this.f28531a.M0(str, this.f28532b, this.f28533c);
    }

    @I0.a
    public boolean l() {
        if (!this.f28531a.isClosed()) {
            return true;
        }
        return false;
    }

    @P
    @I0.a
    protected Uri m(@N String str) {
        String B02 = this.f28531a.B0(str, this.f28532b, this.f28533c);
        if (B02 == null) {
            return null;
        }
        return Uri.parse(B02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 < this.f28531a.getCount()) {
            z3 = true;
        }
        C1285y.r(z3);
        this.f28532b = i4;
        this.f28533c = this.f28531a.E0(i4);
    }
}
