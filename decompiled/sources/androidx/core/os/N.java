package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.P;
import androidx.annotation.W;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@W(17)
/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    @P
    private static Method f12728a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private static Constructor<UserHandle> f12729b;

    @W(24)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        @androidx.annotation.N
        static UserHandle a(int i4) {
            return UserHandle.getUserHandleForUid(i4);
        }
    }

    private N() {
    }

    private static Method a() throws NoSuchMethodException {
        if (f12728a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f12728a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f12728a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f12729b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f12729b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f12729b;
    }

    @androidx.annotation.N
    public static UserHandle c(int i4) {
        return a.a(i4);
    }
}
