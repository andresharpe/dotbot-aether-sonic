package com.amazonaws.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f23669a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23670b;

    /* renamed from: c, reason: collision with root package name */
    private final InputStream f23671c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f23672d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f23673e;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f23674a;

        /* renamed from: b, reason: collision with root package name */
        private int f23675b;

        /* renamed from: c, reason: collision with root package name */
        private InputStream f23676c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, String> f23677d = new HashMap();

        public l a() {
            return new l(this.f23674a, this.f23675b, Collections.unmodifiableMap(this.f23677d), this.f23676c);
        }

        public b b(InputStream inputStream) {
            this.f23676c = inputStream;
            return this;
        }

        public b c(String str, String str2) {
            this.f23677d.put(str, str2);
            return this;
        }

        public b d(int i4) {
            this.f23675b = i4;
            return this;
        }

        public b e(String str) {
            this.f23674a = str;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    public InputStream b() throws IOException {
        if (this.f23673e == null) {
            synchronized (this) {
                try {
                    if (this.f23671c != null && "gzip".equals(this.f23672d.get("Content-Encoding"))) {
                        this.f23673e = new GZIPInputStream(this.f23671c);
                    } else {
                        this.f23673e = this.f23671c;
                    }
                } finally {
                }
            }
        }
        return this.f23673e;
    }

    public Map<String, String> c() {
        return this.f23672d;
    }

    public InputStream d() throws IOException {
        return this.f23671c;
    }

    public int e() {
        return this.f23670b;
    }

    public String f() {
        return this.f23669a;
    }

    private l(String str, int i4, Map<String, String> map, InputStream inputStream) {
        this.f23669a = str;
        this.f23670b = i4;
        this.f23672d = map;
        this.f23671c = inputStream;
    }
}
