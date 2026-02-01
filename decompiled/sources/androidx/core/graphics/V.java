package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@androidx.annotation.W(24)
/* loaded from: classes.dex */
class V extends Z {

    /* renamed from: d, reason: collision with root package name */
    private static final String f12430d = "TypefaceCompatApi24Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12431e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12432f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12433g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static final Class<?> f12434h;

    /* renamed from: i, reason: collision with root package name */
    private static final Constructor<?> f12435i;

    /* renamed from: j, reason: collision with root package name */
    private static final Method f12436j;

    /* renamed from: k, reason: collision with root package name */
    private static final Method f12437k;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName(f12431e);
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(f12432f, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(f12433g, Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f12430d, e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f12435i = constructor;
        f12434h = cls;
        f12436j = method2;
        f12437k = method;
    }

    private static boolean o(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z3) {
        try {
            return ((Boolean) f12436j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(f12434h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f12437k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean q() {
        Method method = f12436j;
        if (method == null) {
            Log.w(f12430d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    private static Object r() {
        try {
            return f12435i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        Object r4 = r();
        if (r4 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            ByteBuffer b4 = a0.b(context, resources, eVar.b());
            if (b4 == null || !o(r4, b4, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return p(r4);
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface d(Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        Object r4 = r();
        if (r4 == null) {
            return null;
        }
        androidx.collection.l lVar = new androidx.collection.l();
        for (h.c cVar : cVarArr) {
            Uri d4 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) lVar.get(d4);
            if (byteBuffer == null) {
                byteBuffer = a0.f(context, cancellationSignal, d4);
                lVar.put(d4, byteBuffer);
            }
            if (byteBuffer == null || !o(r4, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface p4 = p(r4);
        if (p4 == null) {
            return null;
        }
        return Typeface.create(p4, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.graphics.Z
    @androidx.annotation.N
    public Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        Typeface typeface2;
        try {
            typeface2 = c0.b(typeface, i4, z3);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.g(context, typeface, i4, z3);
        }
        return typeface2;
    }
}
