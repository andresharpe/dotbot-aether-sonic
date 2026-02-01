package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@androidx.annotation.W(26)
/* loaded from: classes.dex */
public class W extends U {

    /* renamed from: A, reason: collision with root package name */
    private static final int f12438A = -1;

    /* renamed from: t, reason: collision with root package name */
    private static final String f12439t = "TypefaceCompatApi26Impl";

    /* renamed from: u, reason: collision with root package name */
    private static final String f12440u = "android.graphics.FontFamily";

    /* renamed from: v, reason: collision with root package name */
    private static final String f12441v = "addFontFromAssetManager";

    /* renamed from: w, reason: collision with root package name */
    private static final String f12442w = "addFontFromBuffer";

    /* renamed from: x, reason: collision with root package name */
    private static final String f12443x = "createFromFamiliesWithDefault";

    /* renamed from: y, reason: collision with root package name */
    private static final String f12444y = "freeze";

    /* renamed from: z, reason: collision with root package name */
    private static final String f12445z = "abortCreation";

    /* renamed from: m, reason: collision with root package name */
    protected final Class<?> f12446m;

    /* renamed from: n, reason: collision with root package name */
    protected final Constructor<?> f12447n;

    /* renamed from: o, reason: collision with root package name */
    protected final Method f12448o;

    /* renamed from: p, reason: collision with root package name */
    protected final Method f12449p;

    /* renamed from: q, reason: collision with root package name */
    protected final Method f12450q;

    /* renamed from: r, reason: collision with root package name */
    protected final Method f12451r;

    /* renamed from: s, reason: collision with root package name */
    protected final Method f12452s;

    public W() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = C();
            constructor = D(cls);
            method = z(cls);
            method2 = A(cls);
            method3 = E(cls);
            method4 = y(cls);
            method5 = B(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f12439t, "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f12446m = cls;
        this.f12447n = constructor;
        this.f12448o = method;
        this.f12449p = method2;
        this.f12450q = method3;
        this.f12451r = method4;
        this.f12452s = method5;
    }

    @androidx.annotation.P
    private Object s() {
        try {
            return this.f12447n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void t(Object obj) {
        try {
            this.f12451r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean u(Context context, Object obj, String str, int i4, int i5, int i6, @androidx.annotation.P FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f12448o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean v(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f12449p.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean w(Object obj) {
        try {
            return ((Boolean) this.f12450q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean x() {
        if (this.f12448o == null) {
            Log.w(f12439t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f12448o != null) {
            return true;
        }
        return false;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f12442w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f12443x, cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> C() throws ClassNotFoundException {
        return Class.forName(f12440u);
    }

    protected Constructor<?> D(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method E(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // androidx.core.graphics.U, androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        if (!x()) {
            return super.b(context, dVar, resources, i4);
        }
        Object s4 = s();
        if (s4 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            if (!u(context, s4, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                t(s4);
                return null;
            }
        }
        if (!w(s4)) {
            return null;
        }
        return p(s4);
    }

    @Override // androidx.core.graphics.U, androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface d(Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        Typeface p4;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!x()) {
            h.c l4 = l(cVarArr, i4);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l4.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l4.e()).setItalic(l4.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h4 = a0.h(context, cVarArr, cancellationSignal);
        Object s4 = s();
        if (s4 == null) {
            return null;
        }
        boolean z3 = false;
        for (h.c cVar : cVarArr) {
            ByteBuffer byteBuffer = h4.get(cVar.d());
            if (byteBuffer != null) {
                if (!v(s4, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    t(s4);
                    return null;
                }
                z3 = true;
            }
        }
        if (!z3) {
            t(s4);
            return null;
        }
        if (!w(s4) || (p4 = p(s4)) == null) {
            return null;
        }
        return Typeface.create(p4, i4);
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        if (!x()) {
            return super.f(context, resources, i4, str, i5);
        }
        Object s4 = s();
        if (s4 == null) {
            return null;
        }
        if (!u(context, s4, str, 0, -1, -1, null)) {
            t(s4);
            return null;
        }
        if (!w(s4)) {
            return null;
        }
        return p(s4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.graphics.U, androidx.core.graphics.Z
    @androidx.annotation.N
    public Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        Typeface typeface2;
        try {
            typeface2 = d0.b(typeface, i4, z3);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.g(context, typeface, i4, z3);
        }
        return typeface2;
    }

    @androidx.annotation.P
    protected Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f12446m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f12452s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f12445z, new Class[0]);
    }

    protected Method z(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f12441v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }
}
