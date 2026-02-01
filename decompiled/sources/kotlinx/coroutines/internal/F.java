package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.W0;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f54439a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f54440b = false;

    private static final G a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        e();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ G b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    private static /* synthetic */ void c() {
    }

    @G0
    public static final boolean d(@l3.d W0 w02) {
        return w02.m1() instanceof G;
    }

    @l3.d
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @l3.d
    @G0
    public static final W0 f(@l3.d D d4, @l3.d List<? extends D> list) {
        try {
            return d4.b(list);
        } catch (Throwable th) {
            return a(th, d4.a());
        }
    }
}
