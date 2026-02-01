package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class T0 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f52978e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f52979f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f52980g = 1;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f52974a = new kotlinx.coroutines.internal.S("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final kotlinx.coroutines.internal.S f52975b = new kotlinx.coroutines.internal.S("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f52976c = new kotlinx.coroutines.internal.S("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f52977d = new kotlinx.coroutines.internal.S("TOO_LATE_TO_CANCEL");

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f52981h = new kotlinx.coroutines.internal.S("SEALED");

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final C2334q0 f52982i = new C2334q0(false);

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private static final C2334q0 f52983j = new C2334q0(true);

    @l3.e
    public static final Object g(@l3.e Object obj) {
        if (obj instanceof E0) {
            return new F0((E0) obj);
        }
        return obj;
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    @l3.e
    public static final Object o(@l3.e Object obj) {
        F0 f02;
        E0 e02;
        if (obj instanceof F0) {
            f02 = (F0) obj;
        } else {
            f02 = null;
        }
        if (f02 != null && (e02 = f02.f52928a) != null) {
            return e02;
        }
        return obj;
    }
}
