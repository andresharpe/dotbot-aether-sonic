package com.blankj.utilcode.util;

import android.util.Pair;
import com.google.android.gms.internal.measurement.zzlf;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import junit.framework.JUnit4TestAdapterCache;
import org.apache.commons.logging.impl.WeakHashtable;

/* loaded from: classes.dex */
public class P {

    /* JADX INFO: Add missing generic type declarations: [K1, V1] */
    /* loaded from: classes.dex */
    class a<K1, V1> implements b<K1, V1> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f24923a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f24924b;

        a(c cVar, Map map) {
            this.f24923a = cVar;
            this.f24924b = map;
        }

        @Override // com.blankj.utilcode.util.P.b
        public void a(K1 k12, V1 v12) {
            Pair a4 = this.f24923a.a(k12, v12);
            this.f24924b.put(a4.first, a4.second);
        }
    }

    /* loaded from: classes.dex */
    public interface b<K, V> {
        void a(K k4, V v3);
    }

    /* loaded from: classes.dex */
    public interface c<K1, V1, K2, V2> {
        Pair<K2, V2> a(K1 k12, V1 v12);
    }

    private P() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <K, V> void a(Map<K, V> map, b<K, V> bVar) {
        if (map != null && bVar != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
    }

    public static boolean b(Map map) {
        if (map != null && map.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean c(Map map) {
        return !b(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> HashMap<K, V> d(Pair<K, V>... pairArr) {
        JUnit4TestAdapterCache jUnit4TestAdapterCache = (HashMap<K, V>) new HashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    jUnit4TestAdapterCache.put(pair.first, pair.second);
                }
            }
        }
        return jUnit4TestAdapterCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> Hashtable<K, V> e(Pair<K, V>... pairArr) {
        WeakHashtable weakHashtable = (Hashtable<K, V>) new Hashtable();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    weakHashtable.put(pair.first, pair.second);
                }
            }
        }
        return weakHashtable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> LinkedHashMap<K, V> f(Pair<K, V>... pairArr) {
        zzlf zzlfVar = (LinkedHashMap<K, V>) new LinkedHashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    zzlfVar.put(pair.first, pair.second);
                }
            }
        }
        return zzlfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> TreeMap<K, V> g(Comparator<K> comparator, Pair<K, V>... pairArr) {
        if (comparator != null) {
            com.bumptech.glide.load.engine.bitmap_recycle.o oVar = (TreeMap<K, V>) new TreeMap(comparator);
            if (pairArr != null && pairArr.length != 0) {
                for (Pair<K, V> pair : pairArr) {
                    if (pair != null) {
                        oVar.put(pair.first, pair.second);
                    }
                }
            }
            return oVar;
        }
        throw new IllegalArgumentException("comparator must not be null");
    }

    @SafeVarargs
    public static <K, V> Map<K, V> h(Pair<K, V>... pairArr) {
        return Collections.unmodifiableMap(d(pairArr));
    }

    public static int i(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String j(Map map) {
        if (map == null) {
            return "null";
        }
        return map.toString();
    }

    public static <K1, V1, K2, V2> Map<K2, V2> k(Map<K1, V1> map, c<K1, V1, K2, V2> cVar) {
        if (map != null && cVar != null) {
            try {
                Map<K2, V2> map2 = (Map) map.getClass().newInstance();
                a(map, new a(cVar, map2));
                return map2;
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InstantiationException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }
}
