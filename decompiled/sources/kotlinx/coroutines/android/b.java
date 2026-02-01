package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.O;

/* loaded from: classes2.dex */
public final class b extends kotlin.coroutines.a implements O {

    @l3.e
    private volatile Object _preHandler;

    public b() {
        super(O.f52951v);
        this._preHandler = this;
    }

    private final Method h1() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.O
    public void Y0(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
        Object obj;
        int i4 = Build.VERSION.SDK_INT;
        if (26 <= i4 && i4 < 28) {
            Method h12 = h1();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (h12 != null) {
                obj = h12.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
