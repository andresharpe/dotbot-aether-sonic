package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.s;
import androidx.constraintlayout.motion.widget.r;

/* loaded from: classes.dex */
public class b extends r {

    /* renamed from: a, reason: collision with root package name */
    private s f8424a;

    /* renamed from: b, reason: collision with root package name */
    private p f8425b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.r f8426c;

    public b() {
        s sVar = new s();
        this.f8424a = sVar;
        this.f8426c = sVar;
    }

    @Override // androidx.constraintlayout.motion.widget.r
    public float a() {
        return this.f8426c.a();
    }

    public void b(float f4, float f5, float f6, float f7, float f8, float f9) {
        s sVar = this.f8424a;
        this.f8426c = sVar;
        sVar.f(f4, f5, f6, f7, f8, f9);
    }

    public String c(String str, float f4) {
        return this.f8426c.b(str, f4);
    }

    public float d(float f4) {
        return this.f8426c.c(f4);
    }

    public boolean e() {
        return this.f8426c.d();
    }

    public void f(float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i4) {
        if (this.f8425b == null) {
            this.f8425b = new p();
        }
        p pVar = this.f8425b;
        this.f8426c = pVar;
        pVar.h(f4, f5, f6, f7, f8, f9, f10, i4);
    }

    @Override // androidx.constraintlayout.motion.widget.r, android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        return this.f8426c.getInterpolation(f4);
    }
}
