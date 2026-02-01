package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0893k {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.collection.l<ClassLoader, androidx.collection.l<String, Class<?>>> f15316a = new androidx.collection.l<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @androidx.annotation.N
    private static Class<?> c(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws ClassNotFoundException {
        androidx.collection.l<ClassLoader, androidx.collection.l<String, Class<?>>> lVar = f15316a;
        androidx.collection.l<String, Class<?>> lVar2 = lVar.get(classLoader);
        if (lVar2 == null) {
            lVar2 = new androidx.collection.l<>();
            lVar.put(classLoader, lVar2);
        }
        Class<?> cls = lVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            lVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    @androidx.annotation.N
    public static Class<? extends Fragment> d(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        } catch (ClassNotFoundException e5) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e5);
        }
    }

    @androidx.annotation.N
    public Fragment a(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }
}
