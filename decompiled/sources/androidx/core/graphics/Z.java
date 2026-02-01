package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Z {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12456b = "TypefaceCompatBaseImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final int f12457c = 0;

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, f.d> f12458a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d<h.c> {
        a() {
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(h.c cVar) {
            return cVar.e();
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(h.c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d<f.e> {
        b() {
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements d<f.e> {
        c() {
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.Z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d<T> {
        int a(T t3);

        boolean b(T t3);
    }

    private void a(Typeface typeface, f.d dVar) {
        long n4 = n(typeface);
        if (n4 != 0) {
            this.f12458a.put(Long.valueOf(n4), dVar);
        }
    }

    private f.e h(f.d dVar, int i4) {
        return (f.e) j(dVar.a(), i4, new b());
    }

    private f.e i(f.d dVar, int i4, boolean z3) {
        return (f.e) k(dVar.a(), i4, z3, new c());
    }

    private static <T> T j(T[] tArr, int i4, d<T> dVar) {
        int i5;
        boolean z3;
        if ((i4 & 1) == 0) {
            i5 = 400;
        } else {
            i5 = v.h.f7546j;
        }
        if ((i4 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return (T) k(tArr, i5, z3, dVar);
    }

    private static <T> T k(T[] tArr, int i4, boolean z3, d<T> dVar) {
        int i5;
        T t3 = null;
        int i6 = Integer.MAX_VALUE;
        for (T t4 : tArr) {
            int abs = Math.abs(dVar.a(t4) - i4) * 2;
            if (dVar.b(t4) == z3) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            int i7 = abs + i5;
            if (t3 == null || i6 > i7) {
                t3 = t4;
                i6 = i7;
            }
        }
        return t3;
    }

    private static long n(@androidx.annotation.P Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e4) {
            Log.e(f12456b, "Could not retrieve font from family.", e4);
            return 0L;
        } catch (NoSuchFieldException e5) {
            Log.e(f12456b, "Could not retrieve font from family.", e5);
            return 0L;
        }
    }

    @androidx.annotation.P
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        f.e h4 = h(dVar, i4);
        if (h4 == null) {
            return null;
        }
        Typeface h5 = T.h(context, resources, h4.b(), h4.a(), 0, i4);
        a(h5, dVar);
        return h5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Typeface c(Context context, f.d dVar, Resources resources, int i4, boolean z3) {
        f.e i5 = i(dVar, i4, z3);
        if (i5 == null) {
            return null;
        }
        Typeface h4 = T.h(context, resources, i5.b(), i5.a(), 0, 0);
        a(h4, dVar);
        return h4;
    }

    @androidx.annotation.P
    public Typeface d(Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(l(cVarArr, i4).d());
            try {
                Typeface e4 = e(context, inputStream);
                a0.a(inputStream);
                return e4;
            } catch (IOException unused) {
                a0.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                a0.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface e(Context context, InputStream inputStream) {
        File e4 = a0.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (!a0.d(e4, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e4.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    @androidx.annotation.P
    public Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        File e4 = a0.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (!a0.c(e4, resources, i4)) {
                return null;
            }
            return Typeface.createFromFile(e4.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        Typeface typeface2;
        try {
            typeface2 = b0.a(this, context, typeface, i4, z3);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 != null) {
            return typeface2;
        }
        return typeface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h.c l(h.c[] cVarArr, int i4) {
        return (h.c) j(cVarArr, i4, new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public f.d m(Typeface typeface) {
        long n4 = n(typeface);
        if (n4 == 0) {
            return null;
        }
        return this.f12458a.get(Long.valueOf(n4));
    }
}
