package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2295b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC2297d<?> f54472a;

    public abstract void a(@l3.d AbstractC2297d<?> abstractC2297d, @l3.e Object obj);

    @l3.d
    public final AbstractC2297d<?> b() {
        AbstractC2297d<?> abstractC2297d = this.f54472a;
        if (abstractC2297d != null) {
            return abstractC2297d;
        }
        kotlin.jvm.internal.F.S("atomicOp");
        return null;
    }

    @l3.e
    public abstract Object c(@l3.d AbstractC2297d<?> abstractC2297d);

    public final void d(@l3.d AbstractC2297d<?> abstractC2297d) {
        this.f54472a = abstractC2297d;
    }
}
