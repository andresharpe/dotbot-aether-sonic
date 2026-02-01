package com.blankj.utilcode.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24796a = "defaultGson";

    /* renamed from: b, reason: collision with root package name */
    private static final String f24797b = "delegateGson";

    /* renamed from: c, reason: collision with root package name */
    private static final String f24798c = "logUtilsGson";

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Gson> f24799d = new ConcurrentHashMap();

    private J() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Gson a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    public static <T> T b(@androidx.annotation.N Gson gson, Reader reader, @androidx.annotation.N Class<T> cls) {
        return (T) gson.fromJson(reader, (Class) cls);
    }

    public static <T> T c(@androidx.annotation.N Gson gson, Reader reader, @androidx.annotation.N Type type) {
        return (T) gson.fromJson(reader, type);
    }

    public static <T> T d(@androidx.annotation.N Gson gson, String str, @androidx.annotation.N Class<T> cls) {
        return (T) gson.fromJson(str, (Class) cls);
    }

    public static <T> T e(@androidx.annotation.N Gson gson, String str, @androidx.annotation.N Type type) {
        return (T) gson.fromJson(str, type);
    }

    public static <T> T f(@androidx.annotation.N Reader reader, @androidx.annotation.N Class<T> cls) {
        return (T) b(k(), reader, cls);
    }

    public static <T> T g(@androidx.annotation.N Reader reader, @androidx.annotation.N Type type) {
        return (T) c(k(), reader, type);
    }

    public static <T> T h(String str, @androidx.annotation.N Class<T> cls) {
        return (T) d(k(), str, cls);
    }

    public static <T> T i(String str, @androidx.annotation.N Type type) {
        return (T) e(k(), str, type);
    }

    public static Type j(@androidx.annotation.N Type type) {
        return TypeToken.getArray(type).getType();
    }

    public static Gson k() {
        Map<String, Gson> map = f24799d;
        Gson gson = map.get(f24797b);
        if (gson != null) {
            return gson;
        }
        Gson gson2 = map.get(f24796a);
        if (gson2 == null) {
            Gson a4 = a();
            map.put(f24796a, a4);
            return a4;
        }
        return gson2;
    }

    public static Gson l(String str) {
        return f24799d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Gson m() {
        Map<String, Gson> map = f24799d;
        Gson gson = map.get(f24798c);
        if (gson == null) {
            Gson create = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
            map.put(f24798c, create);
            return create;
        }
        return gson;
    }

    public static Type n(@androidx.annotation.N Type type) {
        return TypeToken.getParameterized(List.class, type).getType();
    }

    public static Type o(@androidx.annotation.N Type type, @androidx.annotation.N Type type2) {
        return TypeToken.getParameterized(Map.class, type, type2).getType();
    }

    public static Type p(@androidx.annotation.N Type type) {
        return TypeToken.getParameterized(Set.class, type).getType();
    }

    public static Type q(@androidx.annotation.N Type type, @androidx.annotation.N Type... typeArr) {
        return TypeToken.getParameterized(type, typeArr).getType();
    }

    public static void r(String str, Gson gson) {
        if (!TextUtils.isEmpty(str) && gson != null) {
            f24799d.put(str, gson);
        }
    }

    public static void s(Gson gson) {
        if (gson == null) {
            return;
        }
        f24799d.put(f24797b, gson);
    }

    public static String t(@androidx.annotation.N Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    public static String u(@androidx.annotation.N Gson gson, Object obj, @androidx.annotation.N Type type) {
        return gson.toJson(obj, type);
    }

    public static String v(Object obj) {
        return t(k(), obj);
    }

    public static String w(Object obj, @androidx.annotation.N Type type) {
        return u(k(), obj, type);
    }
}
