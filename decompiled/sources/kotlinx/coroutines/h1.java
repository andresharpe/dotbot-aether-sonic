package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class h1 {

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<kotlin.H0> f54396E;

        public a(X2.a<kotlin.H0> aVar) {
            this.f54396E = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f54396E.n();
        }
    }

    @l3.d
    public static final Runnable a(@l3.d X2.a<kotlin.H0> aVar) {
        return new a(aVar);
    }
}
