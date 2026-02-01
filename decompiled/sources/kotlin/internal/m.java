package kotlin.internal;

import kotlin.C2231x;
import kotlin.U;
import kotlin.Y;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final l f52098a = new kotlin.internal.jdk8.d();

    @U
    @Y(version = "1.2")
    public static final boolean a(int i4, int i5, int i6) {
        return C2231x.f52899K.j(i4, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    private static final /* synthetic */ <T> T b(Object obj) {
        try {
            F.y(1, androidx.exifinterface.media.a.f5);
            return obj;
        } catch (ClassCastException e4) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            F.y(4, androidx.exifinterface.media.a.f5);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!F.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e4);
            }
            throw e4;
        }
    }
}
