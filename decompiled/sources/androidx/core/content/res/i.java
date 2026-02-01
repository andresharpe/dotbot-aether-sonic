package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0560c;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0581y;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.i;
import androidx.core.util.p;
import androidx.core.util.u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12364a = "ResourcesCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f12365b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    @B("sColorStateCacheLock")
    private static final WeakHashMap<f, SparseArray<e>> f12366c = new WeakHashMap<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f12367d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC0560c
    public static final int f12368e = 0;

    @W(15)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Drawable a(Resources resources, int i4, int i5) {
            return resources.getDrawableForDensity(i4, i5);
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static Drawable a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getDrawable(i4, theme);
        }

        @InterfaceC0577u
        static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i4, i5, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColor(i4, theme);
        }

        @InterfaceC0577u
        @N
        static ColorStateList b(@N Resources resources, @InterfaceC0571n int i4, @P Resources.Theme theme) {
            return resources.getColorStateList(i4, theme);
        }
    }

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static float a(@N Resources resources, @InterfaceC0574q int i4) {
            return resources.getFloat(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f12369a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f12370b;

        /* renamed from: c, reason: collision with root package name */
        final int f12371c;

        e(@N ColorStateList colorStateList, @N Configuration configuration, @P Resources.Theme theme) {
            int hashCode;
            this.f12369a = colorStateList;
            this.f12370b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f12371c = hashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        final Resources f12372a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f12373b;

        f(@N Resources resources, @P Resources.Theme theme) {
            this.f12372a = resources;
            this.f12373b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f12372a.equals(fVar.f12372a) && p.a(this.f12373b, fVar.f12373b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return p.b(this.f12372a, this.f12373b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        @N
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler e(@P Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void c(final int i4, @P Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.this.f(i4);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void d(@N final Typeface typeface, @P Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i4);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(@N Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class h {

        @W(23)
        /* loaded from: classes.dex */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f12374a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f12375b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f12376c;

            private a() {
            }

            @SuppressLint({"BanUncheckedReflection"})
            static void a(@N Resources.Theme theme) {
                synchronized (f12374a) {
                    if (!f12376c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f12375b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e4) {
                            Log.i(i.f12364a, "Failed to retrieve rebase() method", e4);
                        }
                        f12376c = true;
                    }
                    Method method = f12375b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e5) {
                            Log.i(i.f12364a, "Failed to invoke rebase() method via reflection", e5);
                            f12375b = null;
                        }
                    }
                }
            }
        }

        @W(ConstraintLayout.b.a.f9571D)
        /* loaded from: classes.dex */
        static class b {
            private b() {
            }

            @InterfaceC0577u
            static void a(@N Resources.Theme theme) {
                theme.rebase();
            }
        }

        private h() {
        }

        public static void a(@N Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private i() {
    }

    private static void a(@N f fVar, @InterfaceC0571n int i4, @N ColorStateList colorStateList, @P Resources.Theme theme) {
        synchronized (f12367d) {
            try {
                WeakHashMap<f, SparseArray<e>> weakHashMap = f12366c;
                SparseArray<e> sparseArray = weakHashMap.get(fVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(fVar, sparseArray);
                }
                sparseArray.append(i4, new e(colorStateList, fVar.f12372a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(@N Resources.Theme theme) {
        synchronized (f12367d) {
            try {
                Iterator<f> it = f12366c.keySet().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null && theme.equals(next.f12373b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f12371c == r5.hashCode()) goto L22;
     */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList c(@androidx.annotation.N androidx.core.content.res.i.f r5, @androidx.annotation.InterfaceC0571n int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.i.f12367d
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.i$f, android.util.SparseArray<androidx.core.content.res.i$e>> r1 = androidx.core.content.res.i.f12366c     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.i$e r2 = (androidx.core.content.res.i.e) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f12370b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f12372a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f12373b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f12371c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f12371c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f12369a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.c(androidx.core.content.res.i$f, int):android.content.res.ColorStateList");
    }

    @P
    public static Typeface d(@N Context context, @InterfaceC0581y int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, new TypedValue(), 0, null, null, false, true);
    }

    @InterfaceC0569l
    public static int e(@N Resources resources, @InterfaceC0571n int i4, @P Resources.Theme theme) throws Resources.NotFoundException {
        return c.a(resources, i4, theme);
    }

    @P
    public static ColorStateList f(@N Resources resources, @InterfaceC0571n int i4, @P Resources.Theme theme) throws Resources.NotFoundException {
        f fVar = new f(resources, theme);
        ColorStateList c4 = c(fVar, i4);
        if (c4 != null) {
            return c4;
        }
        ColorStateList n4 = n(resources, i4, theme);
        if (n4 != null) {
            a(fVar, i4, n4, theme);
            return n4;
        }
        return c.b(resources, i4, theme);
    }

    @P
    public static Drawable g(@N Resources resources, @InterfaceC0578v int i4, @P Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i4, theme);
    }

    @P
    public static Drawable h(@N Resources resources, @InterfaceC0578v int i4, int i5, @P Resources.Theme theme) throws Resources.NotFoundException {
        return b.b(resources, i4, i5, theme);
    }

    public static float i(@N Resources resources, @InterfaceC0574q int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i4);
        }
        TypedValue m4 = m();
        resources.getValue(i4, m4, true);
        if (m4.type == 4) {
            return m4.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(m4.type) + " is not valid");
    }

    @P
    public static Typeface j(@N Context context, @InterfaceC0581y int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, new TypedValue(), 0, null, null, false, false);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface k(@N Context context, @InterfaceC0581y int i4, @N TypedValue typedValue, int i5, @P g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, typedValue, i5, gVar, null, true, false);
    }

    public static void l(@N Context context, @InterfaceC0581y int i4, @N g gVar, @P Handler handler) throws Resources.NotFoundException {
        u.l(gVar);
        if (context.isRestricted()) {
            gVar.c(-4, handler);
        } else {
            p(context, i4, new TypedValue(), 0, gVar, handler, false, false);
        }
    }

    @N
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f12365b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @P
    private static ColorStateList n(Resources resources, int i4, @P Resources.Theme theme) {
        if (o(resources, i4)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.w(f12364a, "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    private static boolean o(@N Resources resources, @InterfaceC0571n int i4) {
        TypedValue m4 = m();
        resources.getValue(i4, m4, true);
        int i5 = m4.type;
        if (i5 >= 28 && i5 <= 31) {
            return true;
        }
        return false;
    }

    private static Typeface p(@N Context context, int i4, @N TypedValue typedValue, int i5, @P g gVar, @P Handler handler, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface q4 = q(context, resources, typedValue, i4, i5, gVar, handler, z3, z4);
        if (q4 == null && gVar == null && !z4) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface q(@androidx.annotation.N android.content.Context r16, android.content.res.Resources r17, @androidx.annotation.N android.util.TypedValue r18, int r19, int r20, @androidx.annotation.P androidx.core.content.res.i.g r21, @androidx.annotation.P android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.q(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.i$g, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
