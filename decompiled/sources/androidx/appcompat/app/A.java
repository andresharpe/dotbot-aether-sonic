package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4591a = "ResourcesFlusher";

    /* renamed from: b, reason: collision with root package name */
    private static Field f4592b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4593c;

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f4594d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4595e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f4596f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4597g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f4598h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f4599i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@N Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        d(resources);
    }

    @W(21)
    private static void b(@N Resources resources) {
        Map map;
        if (!f4593c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f4592b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f4591a, "Could not retrieve Resources#mDrawableCache field", e4);
            }
            f4593c = true;
        }
        Field field = f4592b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e(f4591a, "Could not retrieve value from Resources#mDrawableCache", e5);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @androidx.annotation.W(23)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(@androidx.annotation.N android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.A.f4593c
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.A.f4592b = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.A.f4593c = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.A.f4592b
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.A.c(android.content.res.Resources):void");
    }

    @W(24)
    private static void d(@N Resources resources) {
        Object obj;
        if (!f4599i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f4598h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f4591a, "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            f4599i = true;
        }
        Field field = f4598h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e(f4591a, "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f4593c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f4592b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e(f4591a, "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            f4593c = true;
        }
        Field field2 = f4592b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e7) {
                Log.e(f4591a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @W(16)
    private static void e(@N Object obj) {
        LongSparseArray longSparseArray;
        if (!f4595e) {
            try {
                f4594d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e(f4591a, "Could not find ThemedResourceCache class", e4);
            }
            f4595e = true;
        }
        Class<?> cls = f4594d;
        if (cls == null) {
            return;
        }
        if (!f4597g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f4596f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e(f4591a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f4597g = true;
        }
        Field field = f4596f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e(f4591a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
