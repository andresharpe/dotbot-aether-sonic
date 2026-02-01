package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final float f12982a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12983b;

    @W(21)
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        @InterfaceC0577u
        @N
        static SizeF a(@N D d4) {
            u.l(d4);
            return new SizeF(d4.b(), d4.a());
        }

        @InterfaceC0577u
        @N
        static D b(@N SizeF sizeF) {
            u.l(sizeF);
            return new D(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public D(float f4, float f5) {
        this.f12982a = u.d(f4, "width");
        this.f12983b = u.d(f5, "height");
    }

    @N
    @W(21)
    public static D d(@N SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f12983b;
    }

    public float b() {
        return this.f12982a;
    }

    @N
    @W(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        if (d4.f12982a == this.f12982a && d4.f12983b == this.f12983b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f12982a) ^ Float.floatToIntBits(this.f12983b);
    }

    @N
    public String toString() {
        return this.f12982a + "x" + this.f12983b;
    }
}
