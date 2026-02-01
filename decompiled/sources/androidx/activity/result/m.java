package androidx.activity.result;

import b.C1001b;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private C1001b.k.f f4568a = C1001b.k.C0192b.f20930a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private C1001b.k.f f4569a = C1001b.k.C0192b.f20930a;

        @l3.d
        public final m a() {
            m mVar = new m();
            mVar.b(this.f4569a);
            return mVar;
        }

        @l3.d
        public final a b(@l3.d C1001b.k.f mediaType) {
            F.p(mediaType, "mediaType");
            this.f4569a = mediaType;
            return this;
        }
    }

    @l3.d
    public final C1001b.k.f a() {
        return this.f4568a;
    }

    public final void b(@l3.d C1001b.k.f fVar) {
        F.p(fVar, "<set-?>");
        this.f4568a = fVar;
    }
}
