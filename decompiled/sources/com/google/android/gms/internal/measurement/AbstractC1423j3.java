package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1423j3 {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private static volatile AbstractC1399g3 f29687h = null;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f29688i = false;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f29692m = 0;

    /* renamed from: a, reason: collision with root package name */
    final C1391f3 f29693a;

    /* renamed from: b, reason: collision with root package name */
    final String f29694b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f29695c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f29696d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f29697e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29698f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f29686g = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReference f29689j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    private static final C1439l3 f29690k = new C1439l3(new Object() { // from class: com.google.android.gms.internal.measurement.a3
    }, null);

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicInteger f29691l = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1423j3(C1391f3 c1391f3, String str, Object obj, boolean z3, C1407h3 c1407h3) {
        if (c1391f3.f29639b != null) {
            this.f29693a = c1391f3;
            this.f29694b = str;
            this.f29695c = obj;
            this.f29698f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void d() {
        f29691l.incrementAndGet();
    }

    public static void e(final Context context) {
        if (f29687h == null) {
            Object obj = f29686g;
            synchronized (obj) {
                try {
                    if (f29687h == null) {
                        synchronized (obj) {
                            AbstractC1399g3 abstractC1399g3 = f29687h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC1399g3 != null) {
                                if (abstractC1399g3.a() != context) {
                                }
                            }
                            M2.d();
                            C1431k3.b();
                            U2.d();
                            f29687h = new J2(context, C1502t3.a(new InterfaceC1471p3() { // from class: com.google.android.gms.internal.measurement.Z2
                                @Override // com.google.android.gms.internal.measurement.InterfaceC1471p3
                                public final Object zza() {
                                    Context context2 = context;
                                    int i4 = AbstractC1423j3.f29692m;
                                    return V2.a(context2);
                                }
                            }));
                            f29691l.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0069, B:24:0x0073, B:27:0x00a4, B:29:0x00b4, B:31:0x00c8, B:32:0x00cb, B:33:0x00cf, B:34:0x007c, B:36:0x0082, B:39:0x0094, B:41:0x009a, B:43:0x00a2, B:44:0x0092, B:48:0x0059, B:49:0x00d4, B:50:0x00d9, B:51:0x00da), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1423j3.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f29693a.f29641d;
        return this.f29694b;
    }
}
