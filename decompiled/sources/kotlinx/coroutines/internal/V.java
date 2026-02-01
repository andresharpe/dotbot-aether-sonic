package kotlinx.coroutines.internal;

/* loaded from: classes2.dex */
final /* synthetic */ class V {

    /* renamed from: a, reason: collision with root package name */
    private static final int f54457a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f54457a;
    }

    @l3.e
    public static final String b(@l3.d String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
