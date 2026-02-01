package com.amazonaws.auth;

import com.amazonaws.internal.config.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23390a = "QueryStringSignerType";

    /* renamed from: b, reason: collision with root package name */
    private static final String f23391b = "AWS3SignerType";

    /* renamed from: c, reason: collision with root package name */
    private static final String f23392c = "AWS4SignerType";

    /* renamed from: d, reason: collision with root package name */
    private static final String f23393d = "NoOpSignerType";

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Class<? extends I>> f23394e;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f23394e = concurrentHashMap;
        concurrentHashMap.put(f23390a, B.class);
        concurrentHashMap.put(f23391b, C1023a.class);
        concurrentHashMap.put(f23392c, C1024b.class);
        concurrentHashMap.put(f23393d, w.class);
    }

    private J() {
    }

    private static I a(String str, String str2) {
        Class<? extends I> cls = f23394e.get(str);
        if (cls != null) {
            try {
                I newInstance = cls.newInstance();
                if (newInstance instanceof G) {
                    ((G) newInstance).a(str2);
                }
                return newInstance;
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Cannot create an instance of " + cls.getName(), e4);
            } catch (InstantiationException e5) {
                throw new IllegalStateException("Cannot create an instance of " + cls.getName(), e5);
            }
        }
        throw new IllegalArgumentException();
    }

    public static I b(String str, String str2) {
        return d(str, str2);
    }

    public static I c(String str, String str2) {
        return a(str, str2);
    }

    private static I d(String str, String str2) {
        return a(c.a.a().k(str, str2).a(), str);
    }

    public static void e(String str, Class<? extends I> cls) {
        if (str != null) {
            if (cls != null) {
                f23394e.put(str, cls);
                return;
            }
            throw new IllegalArgumentException("signerClass cannot be null");
        }
        throw new IllegalArgumentException("signerType cannot be null");
    }
}
