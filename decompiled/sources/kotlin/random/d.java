package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class d extends kotlin.random.a implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final a f52442H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    private static final long f52443I = 0;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final java.util.Random f52444G;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public d(@l3.d java.util.Random impl) {
        F.p(impl, "impl");
        this.f52444G = impl;
    }

    @Override // kotlin.random.a
    @l3.d
    public java.util.Random r() {
        return this.f52444G;
    }
}
