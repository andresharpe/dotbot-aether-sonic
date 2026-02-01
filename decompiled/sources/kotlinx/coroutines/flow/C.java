package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
public interface C {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f53479a = a.f53480a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f53480a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private static final C f53481b = new E();

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private static final C f53482c = new F();

        private a() {
        }

        public static /* synthetic */ C b(a aVar, long j4, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j4 = 0;
            }
            if ((i4 & 2) != 0) {
                j5 = Long.MAX_VALUE;
            }
            return aVar.a(j4, j5);
        }

        @l3.d
        public final C a(long j4, long j5) {
            return new G(j4, j5);
        }

        @l3.d
        public final C c() {
            return f53481b;
        }

        @l3.d
        public final C d() {
            return f53482c;
        }
    }

    @l3.d
    InterfaceC2282i<SharingCommand> a(@l3.d H<Integer> h4);
}
