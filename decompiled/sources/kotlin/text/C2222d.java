package kotlin.text;

import java.nio.charset.Charset;

/* renamed from: kotlin.text.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2222d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2222d f52791a = new C2222d();

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52792b;

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52793c;

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52794d;

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52795e;

    /* renamed from: f, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52796f;

    /* renamed from: g, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Charset f52797g;

    /* renamed from: h, reason: collision with root package name */
    @l3.e
    private static volatile Charset f52798h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private static volatile Charset f52799i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private static volatile Charset f52800j;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.F.o(forName, "forName(...)");
        f52792b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.F.o(forName2, "forName(...)");
        f52793c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.F.o(forName3, "forName(...)");
        f52794d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.F.o(forName4, "forName(...)");
        f52795e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.F.o(forName5, "forName(...)");
        f52796f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.F.o(forName6, "forName(...)");
        f52797g = forName6;
    }

    private C2222d() {
    }

    @l3.d
    @W2.i(name = "UTF32")
    public final Charset a() {
        Charset charset = f52798h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32");
            kotlin.jvm.internal.F.o(forName, "forName(...)");
            f52798h = forName;
            return forName;
        }
        return charset;
    }

    @l3.d
    @W2.i(name = "UTF32_BE")
    public final Charset b() {
        Charset charset = f52800j;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            kotlin.jvm.internal.F.o(forName, "forName(...)");
            f52800j = forName;
            return forName;
        }
        return charset;
    }

    @l3.d
    @W2.i(name = "UTF32_LE")
    public final Charset c() {
        Charset charset = f52799i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            kotlin.jvm.internal.F.o(forName, "forName(...)");
            f52799i = forName;
            return forName;
        }
        return charset;
    }
}
