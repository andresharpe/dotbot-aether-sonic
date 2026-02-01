package kotlin.random;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b extends kotlin.random.a {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final a f52437G = new a();

    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<java.util.Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @l3.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // kotlin.random.a
    @l3.d
    public java.util.Random r() {
        java.util.Random random = this.f52437G.get();
        F.o(random, "get(...)");
        return random;
    }
}
