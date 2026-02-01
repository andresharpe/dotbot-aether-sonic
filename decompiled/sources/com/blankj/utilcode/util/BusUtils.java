package com.blankj.utilcode.util;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.v;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class BusUtils {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f24717e = "nULl";

    /* renamed from: f, reason: collision with root package name */
    private static final String f24718f = "BusUtils";

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<c>> f24719a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Set<Object>> f24720b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f24721c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Map<String, Object>> f24722d;

    /* loaded from: classes.dex */
    public enum ThreadMode {
        MAIN,
        IO,
        CPU,
        CACHED,
        SINGLE,
        POSTING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f24723E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Object f24724F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c f24725G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f24726H;

        a(Object obj, Object obj2, c cVar, boolean z3) {
            this.f24723E = obj;
            this.f24724F = obj2;
            this.f24725G = cVar;
            this.f24726H = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            BusUtils.this.t(this.f24723E, this.f24724F, this.f24725G, this.f24726H);
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface b {
        int priority() default 0;

        boolean sticky() default false;

        String tag();

        ThreadMode threadMode() default ThreadMode.POSTING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        String f24728a;

        /* renamed from: b, reason: collision with root package name */
        String f24729b;

        /* renamed from: c, reason: collision with root package name */
        String f24730c;

        /* renamed from: d, reason: collision with root package name */
        String f24731d;

        /* renamed from: e, reason: collision with root package name */
        String f24732e;

        /* renamed from: f, reason: collision with root package name */
        boolean f24733f;

        /* renamed from: g, reason: collision with root package name */
        String f24734g;

        /* renamed from: h, reason: collision with root package name */
        int f24735h;

        /* renamed from: i, reason: collision with root package name */
        Method f24736i;

        /* renamed from: j, reason: collision with root package name */
        List<String> f24737j = new CopyOnWriteArrayList();

        c(String str, String str2, String str3, String str4, String str5, boolean z3, String str6, int i4) {
            this.f24728a = str;
            this.f24729b = str2;
            this.f24730c = str3;
            this.f24731d = str4;
            this.f24732e = str5;
            this.f24733f = z3;
            this.f24734g = str6;
            this.f24735h = i4;
        }

        private String a() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24729b);
            sb.append("#");
            sb.append(this.f24730c);
            if ("".equals(this.f24731d)) {
                str = "()";
            } else {
                str = "(" + this.f24731d + " " + this.f24732e + ")";
            }
            sb.append(str);
            return sb.toString();
        }

        public String toString() {
            return "BusInfo { tag : " + this.f24728a + ", desc: " + a() + ", sticky: " + this.f24733f + ", threadMode: " + this.f24734g + ", method: " + this.f24736i + ", priority: " + this.f24735h + " }";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final BusUtils f24738a = new BusUtils(null);

        private d() {
        }
    }

    /* synthetic */ BusUtils(a aVar) {
        this();
    }

    public static void A(String str) {
        e().B(str);
    }

    private void B(String str) {
        List<c> list = this.f24719a.get(str);
        if (list == null) {
            Log.e(f24718f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (c cVar : list) {
            if (cVar.f24733f) {
                synchronized (this.f24722d) {
                    try {
                        Map<String, Object> map = this.f24722d.get(cVar.f24729b);
                        if (map != null && map.containsKey(str)) {
                            map.remove(str);
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static String C() {
        return e().toString();
    }

    public static void D(@androidx.annotation.P Object obj) {
        e().E(obj);
    }

    private void E(Object obj) {
        if (obj == null) {
            return;
        }
        String name = obj.getClass().getName();
        synchronized (this.f24720b) {
            try {
                Set<Object> set = this.f24720b.get(name);
                if (set != null && set.contains(obj)) {
                    set.remove(obj);
                    return;
                }
                Log.e(f24718f, "The bus of <" + obj + "> was not registered before.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(Object obj, String str, Object obj2) {
        List<c> list = this.f24719a.get(str);
        if (list == null) {
            Log.e(f24718f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (c cVar : list) {
            if (cVar.f24737j.contains(obj.getClass().getName()) && cVar.f24733f) {
                synchronized (this.f24722d) {
                    try {
                        Map<String, Object> map = this.f24722d.get(cVar.f24729b);
                        if (map != null && map.containsKey(str)) {
                            i(obj, obj2, cVar, true);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    private void c(Object obj) {
        Map<String, Object> map = this.f24722d.get(obj.getClass().getName());
        if (map == null) {
            return;
        }
        synchronized (this.f24722d) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    b(obj, entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Class d(String str) throws ClassNotFoundException {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1325958191:
                if (str.equals("double")) {
                    c4 = 0;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c4 = 1;
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c4 = 2;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c4 = 3;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c4 = 4;
                    break;
                }
                break;
            case 64711720:
                if (str.equals(v.b.f7404f)) {
                    c4 = 5;
                    break;
                }
                break;
            case 97526364:
                if (str.equals(v.b.f7401c)) {
                    c4 = 6;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c4 = 7;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return Double.TYPE;
            case 1:
                return Integer.TYPE;
            case 2:
                return Byte.TYPE;
            case 3:
                return Character.TYPE;
            case 4:
                return Long.TYPE;
            case 5:
                return Boolean.TYPE;
            case 6:
                return Float.TYPE;
            case 7:
                return Short.TYPE;
            default:
                return Class.forName(str);
        }
    }

    private static BusUtils e() {
        return d.f24738a;
    }

    private Method f(c cVar) {
        try {
            if ("".equals(cVar.f24731d)) {
                return Class.forName(cVar.f24729b).getDeclaredMethod(cVar.f24730c, new Class[0]);
            }
            return Class.forName(cVar.f24729b).getDeclaredMethod(cVar.f24730c, d(cVar.f24731d));
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return null;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void g() {
    }

    private void h(Object obj, c cVar, boolean z3) {
        i(null, obj, cVar, z3);
    }

    private void i(Object obj, Object obj2, c cVar, boolean z3) {
        if (cVar.f24736i == null) {
            Method f4 = f(cVar);
            if (f4 == null) {
                return;
            } else {
                cVar.f24736i = f4;
            }
        }
        l(obj, obj2, cVar, z3);
    }

    private void j(Object obj, c cVar, Set<Object> set) {
        try {
            if (obj == f24717e) {
                Iterator<Object> it = set.iterator();
                while (it.hasNext()) {
                    cVar.f24736i.invoke(it.next(), new Object[0]);
                }
                return;
            }
            Iterator<Object> it2 = set.iterator();
            while (it2.hasNext()) {
                cVar.f24736i.invoke(it2.next(), obj);
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    private void k(Object obj, c cVar, boolean z3) {
        l(null, obj, cVar, z3);
    }

    private void l(Object obj, Object obj2, c cVar, boolean z3) {
        a aVar = new a(obj, obj2, cVar, z3);
        String str = cVar.f24734g;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1848936376:
                if (str.equals("SINGLE")) {
                    c4 = 0;
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c4 = 1;
                    break;
                }
                break;
            case 66952:
                if (str.equals("CPU")) {
                    c4 = 2;
                    break;
                }
                break;
            case 2358713:
                if (str.equals("MAIN")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1980249378:
                if (str.equals("CACHED")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                y0.p0().execute(aVar);
                return;
            case 1:
                y0.k0().execute(aVar);
                return;
            case 2:
                y0.f0().execute(aVar);
                return;
            case 3:
                y0.s0(aVar);
                return;
            case 4:
                y0.d0().execute(aVar);
                return;
            default:
                aVar.run();
                return;
        }
    }

    public static void m(@androidx.annotation.N String str) {
        n(str, f24717e);
    }

    public static void n(@androidx.annotation.N String str, @androidx.annotation.N Object obj) {
        e().o(str, obj);
    }

    private void o(String str, Object obj) {
        p(str, obj, false);
    }

    private void p(String str, Object obj, boolean z3) {
        List<c> list = this.f24719a.get(str);
        if (list == null) {
            Log.e(f24718f, "The bus of tag <" + str + "> is not exists.");
            if (this.f24719a.isEmpty()) {
                Log.e(f24718f, "Please check whether the bus plugin is applied.");
                return;
            }
            return;
        }
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            h(obj, it.next(), z3);
        }
    }

    public static void q(@androidx.annotation.N String str) {
        r(str, f24717e);
    }

    public static void r(@androidx.annotation.N String str, Object obj) {
        e().s(str, obj);
    }

    private void s(String str, Object obj) {
        List<c> list = this.f24719a.get(str);
        if (list == null) {
            Log.e(f24718f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (c cVar : list) {
            if (!cVar.f24733f) {
                h(obj, cVar, false);
            } else {
                synchronized (this.f24722d) {
                    try {
                        Map<String, Object> map = this.f24722d.get(cVar.f24729b);
                        if (map == null) {
                            map = new ConcurrentHashMap<>();
                            this.f24722d.put(cVar.f24729b, map);
                        }
                        map.put(str, obj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h(obj, cVar, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Object obj, Object obj2, c cVar, boolean z3) {
        Set<Object> hashSet = new HashSet<>();
        if (obj == null) {
            Iterator<String> it = cVar.f24737j.iterator();
            while (it.hasNext()) {
                Set<Object> set = this.f24720b.get(it.next());
                if (set != null && !set.isEmpty()) {
                    hashSet.addAll(set);
                }
            }
            if (hashSet.size() == 0) {
                if (!z3) {
                    Log.e(f24718f, "The " + cVar + " was not registered before.");
                    return;
                }
                return;
            }
        } else {
            hashSet.add(obj);
        }
        j(obj2, cVar, hashSet);
    }

    private void u(Class<?> cls, String str) {
        if (this.f24721c.get(str) == null) {
            synchronized (this.f24721c) {
                if (this.f24721c.get(str) == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    for (Map.Entry<String, List<c>> entry : this.f24719a.entrySet()) {
                        for (c cVar : entry.getValue()) {
                            try {
                                if (Class.forName(cVar.f24729b).isAssignableFrom(cls)) {
                                    copyOnWriteArrayList.add(entry.getKey());
                                    cVar.f24737j.add(str);
                                }
                            } catch (ClassNotFoundException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    this.f24721c.put(str, copyOnWriteArrayList);
                }
            }
        }
    }

    public static void v(@androidx.annotation.P Object obj) {
        e().z(obj);
    }

    private void w(String str, String str2, String str3, String str4, String str5, boolean z3, String str6) {
        x(str, str2, str3, str4, str5, z3, str6, 0);
    }

    private void x(String str, String str2, String str3, String str4, String str5, boolean z3, String str6, int i4) {
        List<c> list = this.f24719a.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.f24719a.put(str, list);
        }
        list.add(new c(str, str2, str3, str4, str5, z3, str6, i4));
    }

    static void y(String str, String str2, String str3, String str4, String str5, boolean z3, String str6, int i4) {
        e().x(str, str2, str3, str4, str5, z3, str6, i4);
    }

    private void z(@androidx.annotation.P Object obj) {
        boolean z3;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        String name = cls.getName();
        synchronized (this.f24720b) {
            try {
                Set<Object> set = this.f24720b.get(name);
                if (set == null) {
                    set = new CopyOnWriteArraySet<>();
                    this.f24720b.put(name, set);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (set.contains(obj)) {
                    Log.w(f24718f, "The bus of <" + obj + "> already registered.");
                    return;
                }
                set.add(obj);
                if (z3) {
                    u(cls, name);
                }
                c(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "BusUtils: " + this.f24719a;
    }

    private BusUtils() {
        this.f24719a = new ConcurrentHashMap();
        this.f24720b = new ConcurrentHashMap();
        this.f24721c = new ConcurrentHashMap();
        this.f24722d = new ConcurrentHashMap();
        g();
    }
}
