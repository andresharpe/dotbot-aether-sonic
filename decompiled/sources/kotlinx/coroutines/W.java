package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final String f52987a = "kotlinx.coroutines.debug";

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f52988b = "kotlinx.coroutines.stacktrace.recovery";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f52989c = "auto";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final String f52990d = "on";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final String f52991e = "off";

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f52992f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f52993g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f52994h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final AtomicLong f52995i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.U.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = r2
            goto L64
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = r1
            goto L64
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            kotlinx.coroutines.W.f52993g = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.U.e(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            kotlinx.coroutines.W.f52994h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.W.f52995i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.W.<clinit>():void");
    }

    public static final boolean b() {
        return f52992f;
    }

    @l3.d
    public static final AtomicLong c() {
        return f52995i;
    }

    public static final boolean d() {
        return f52993g;
    }

    public static final boolean e() {
        return f52994h;
    }

    public static final void f() {
        f52995i.set(0L);
    }

    @kotlin.internal.f
    private static final void a(X2.a<Boolean> aVar) {
    }
}
