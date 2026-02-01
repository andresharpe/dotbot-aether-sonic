package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class C {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51791a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51791a = iArr;
        }
    }

    @l3.d
    public static <T> A<T> a(@l3.d X2.a<? extends T> initializer) {
        kotlin.jvm.internal.F.p(initializer, "initializer");
        return new C2118f0(initializer, null, 2, null);
    }

    @l3.d
    public static final <T> A<T> b(@l3.e Object obj, @l3.d X2.a<? extends T> initializer) {
        kotlin.jvm.internal.F.p(initializer, "initializer");
        return new C2118f0(initializer, obj);
    }

    @l3.d
    public static <T> A<T> c(@l3.d LazyThreadSafetyMode mode, @l3.d X2.a<? extends T> initializer) {
        kotlin.jvm.internal.F.p(mode, "mode");
        kotlin.jvm.internal.F.p(initializer, "initializer");
        int i4 = a.f51791a[mode.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return new UnsafeLazyImpl(initializer);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new X(initializer);
        }
        return new C2118f0(initializer, null, 2, null);
    }
}
