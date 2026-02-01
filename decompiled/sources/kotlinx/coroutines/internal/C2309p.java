package kotlinx.coroutines.internal;

import kotlin.Result;

/* renamed from: kotlinx.coroutines.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2309p {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f54501a = false;

    static {
        Object b4;
        try {
            Result.a aVar = Result.f51807F;
            b4 = Result.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(kotlin.W.a(th));
        }
        Result.j(b4);
    }

    public static final boolean a() {
        return true;
    }
}
