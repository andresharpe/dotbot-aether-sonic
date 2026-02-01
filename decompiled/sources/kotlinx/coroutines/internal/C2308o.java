package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.C2210p;
import kotlin.collections.C2109w;

/* renamed from: kotlinx.coroutines.internal.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2308o {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2308o f54499a = new C2308o();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f54500b = "META-INF/services/";

    private C2308o() {
    }

    private final D a(Class<D> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        List<S> V5;
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            V5 = kotlin.collections.D.V5(ServiceLoader.load(cls, classLoader));
            return V5;
        }
    }

    private final List<String> f(URL url) {
        boolean s22;
        BufferedReader bufferedReader;
        String n5;
        String u5;
        String n52;
        String url2 = url.toString();
        s22 = kotlin.text.z.s2(url2, "jar", false, 2, null);
        if (s22) {
            n5 = kotlin.text.A.n5(url2, "jar:file:", null, 2, null);
            u5 = kotlin.text.A.u5(n5, '!', null, 2, null);
            n52 = kotlin.text.A.n5(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(u5, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(n52)), "UTF-8"));
                try {
                    List<String> g4 = f54499a.g(bufferedReader);
                    kotlin.io.b.a(bufferedReader, null);
                    jarFile.close();
                    return g4;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C2210p.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g5 = f54499a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                return g5;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private final List<String> g(BufferedReader bufferedReader) {
        List<String> V5;
        String v5;
        CharSequence C5;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                V5 = kotlin.collections.D.V5(linkedHashSet);
                return V5;
            }
            v5 = kotlin.text.A.v5(readLine, "#", null, 2, null);
            C5 = kotlin.text.A.C5(v5);
            String obj = C5.toString();
            for (int i4 = 0; i4 < obj.length(); i4++) {
                char charAt = obj.charAt(i4);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    private final <R> R h(JarFile jarFile, X2.l<? super JarFile, ? extends R> lVar) {
        try {
            R C3 = lVar.C(jarFile);
            kotlin.jvm.internal.C.d(1);
            jarFile.close();
            kotlin.jvm.internal.C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.C.c(1);
                    throw th2;
                } catch (Throwable th3) {
                    C2210p.a(th, th3);
                    throw th;
                }
            }
        }
    }

    @l3.d
    public final List<D> d() {
        D d4;
        if (!C2309p.a()) {
            return c(D.class, D.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            D d5 = null;
            try {
                d4 = (D) D.class.cast(Class.forName("kotlinx.coroutines.android.a", true, D.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                d4 = null;
            }
            if (d4 != null) {
                arrayList.add(d4);
            }
            try {
                d5 = (D) D.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, D.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (d5 != null) {
                arrayList.add(d5);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return c(D.class, D.class.getClassLoader());
        }
    }

    @l3.d
    public final <S> List<S> e(@l3.d Class<S> cls, @l3.d ClassLoader classLoader) {
        Set a6;
        int b02;
        ArrayList list = Collections.list(classLoader.getResources(f54500b + cls.getName()));
        kotlin.jvm.internal.F.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.A.q0(arrayList, f54499a.f((URL) it.next()));
        }
        a6 = kotlin.collections.D.a6(arrayList);
        if (!a6.isEmpty()) {
            b02 = C2109w.b0(a6, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator it2 = a6.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f54499a.b((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
