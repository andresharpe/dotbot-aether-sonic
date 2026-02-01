package kotlinx.coroutines.internal;

/* loaded from: classes2.dex */
public abstract class J {
    @l3.e
    public abstract AbstractC2297d<?> a();

    public final boolean b(@l3.d J j4) {
        AbstractC2297d<?> a4;
        AbstractC2297d<?> a5 = a();
        if (a5 == null || (a4 = j4.a()) == null || a5.g() >= a4.g()) {
            return false;
        }
        return true;
    }

    @l3.e
    public abstract Object c(@l3.e Object obj);

    @l3.d
    public String toString() {
        return kotlinx.coroutines.X.a(this) + '@' + kotlinx.coroutines.X.b(this);
    }
}
