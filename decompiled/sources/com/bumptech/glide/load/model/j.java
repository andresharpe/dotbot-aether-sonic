package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<i>> f26305c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f26306d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f26307d = "User-Agent";

        /* renamed from: e, reason: collision with root package name */
        private static final String f26308e;

        /* renamed from: f, reason: collision with root package name */
        private static final Map<String, List<i>> f26309f;

        /* renamed from: a, reason: collision with root package name */
        private boolean f26310a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<i>> f26311b = f26309f;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26312c = true;

        static {
            String g4 = g();
            f26308e = g4;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g4)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g4)));
            }
            f26309f = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<i>> d() {
            HashMap hashMap = new HashMap(this.f26311b.size());
            for (Map.Entry<String, List<i>> entry : this.f26311b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f26310a) {
                this.f26310a = false;
                this.f26311b = d();
            }
        }

        private List<i> f(String str) {
            List<i> list = this.f26311b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f26311b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        @i0
        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = property.charAt(i4);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(@N String str, @N i iVar) {
            if (this.f26312c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, iVar);
            }
            e();
            f(str).add(iVar);
            return this;
        }

        public a b(@N String str, @N String str2) {
            return a(str, new b(str2));
        }

        public j c() {
            this.f26310a = true;
            return new j(this.f26311b);
        }

        public a h(@N String str, @P i iVar) {
            e();
            if (iVar == null) {
                this.f26311b.remove(str);
            } else {
                List<i> f4 = f(str);
                f4.clear();
                f4.add(iVar);
            }
            if (this.f26312c && "User-Agent".equalsIgnoreCase(str)) {
                this.f26312c = false;
            }
            return this;
        }

        public a i(@N String str, @P String str2) {
            b bVar;
            if (str2 == null) {
                bVar = null;
            } else {
                bVar = new b(str2);
            }
            return h(str, bVar);
        }
    }

    /* loaded from: classes.dex */
    static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final String f26313a;

        b(@N String str) {
            this.f26313a = str;
        }

        @Override // com.bumptech.glide.load.model.i
        public String a() {
            return this.f26313a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f26313a.equals(((b) obj).f26313a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26313a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f26313a + "'}";
        }
    }

    j(Map<String, List<i>> map) {
        this.f26305c = Collections.unmodifiableMap(map);
    }

    @N
    private String b(@N List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String a4 = list.get(i4).a();
            if (!TextUtils.isEmpty(a4)) {
                sb.append(a4);
                if (i4 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f26305c.entrySet()) {
            String b4 = b(entry.getValue());
            if (!TextUtils.isEmpty(b4)) {
                hashMap.put(entry.getKey(), b4);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.model.h
    public Map<String, String> a() {
        if (this.f26306d == null) {
            synchronized (this) {
                try {
                    if (this.f26306d == null) {
                        this.f26306d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f26306d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f26305c.equals(((j) obj).f26305c);
        }
        return false;
    }

    public int hashCode() {
        return this.f26305c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f26305c + '}';
    }
}
