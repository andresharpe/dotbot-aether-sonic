package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@androidx.annotation.W(21)
/* loaded from: classes.dex */
class U extends Z {

    /* renamed from: d, reason: collision with root package name */
    private static final String f12421d = "TypefaceCompatApi21Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12422e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12423f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12424g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static Class<?> f12425h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Constructor<?> f12426i = null;

    /* renamed from: j, reason: collision with root package name */
    private static Method f12427j = null;

    /* renamed from: k, reason: collision with root package name */
    private static Method f12428k = null;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f12429l = false;

    private static boolean o(Object obj, String str, int i4, boolean z3) {
        r();
        try {
            return ((Boolean) f12427j.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface p(Object obj) {
        r();
        try {
            Object newInstance = Array.newInstance(f12425h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f12428k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private File q(@androidx.annotation.N ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void r() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f12429l) {
            return;
        }
        f12429l = true;
        try {
            cls = Class.forName(f12422e);
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f12423f, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(f12424g, Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f12421d, e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f12426i = constructor;
        f12425h = cls;
        f12427j = method2;
        f12428k = method;
    }

    private static Object s() {
        r();
        try {
            return f12426i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // androidx.core.graphics.Z
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        Object s4 = s();
        for (f.e eVar : dVar.a()) {
            File e4 = a0.e(context);
            if (e4 == null) {
                return null;
            }
            try {
                if (!a0.c(e4, resources, eVar.b())) {
                    return null;
                }
                if (!o(s4, e4.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e4.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e4.delete();
            }
        }
        return p(s4);
    }

    @Override // androidx.core.graphics.Z
    public Typeface d(Context context, CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File q4 = q(openFileDescriptor);
                if (q4 != null && q4.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(q4);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface e4 = super.e(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return e4;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
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
