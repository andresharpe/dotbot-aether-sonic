package org.junit.internal;

/* loaded from: classes2.dex */
public class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public Object f55560b;

    public e(double d4) {
        this.f55560b = Double.valueOf(d4);
    }

    @Override // org.junit.internal.c
    protected void c(Object obj, Object obj2) {
        if (obj instanceof Double) {
            org.junit.c.t(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.f55560b).doubleValue());
        } else {
            org.junit.c.u(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.f55560b).floatValue());
        }
    }

    public e(float f4) {
        this.f55560b = Float.valueOf(f4);
    }
}
