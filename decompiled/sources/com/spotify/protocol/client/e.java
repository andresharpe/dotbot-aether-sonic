package com.spotify.protocol.client;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f48847a;

    /* renamed from: b, reason: collision with root package name */
    private final String f48848b;

    /* renamed from: c, reason: collision with root package name */
    private final String f48849c;

    /* renamed from: d, reason: collision with root package name */
    private final int f48850d;

    /* renamed from: e, reason: collision with root package name */
    private final int f48851e;

    /* renamed from: f, reason: collision with root package name */
    private final int f48852f;

    /* renamed from: g, reason: collision with root package name */
    private final int f48853g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f48854h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f48855i;

    /* renamed from: j, reason: collision with root package name */
    private final String f48856j;

    /* renamed from: k, reason: collision with root package name */
    private final String f48857k;

    /* renamed from: l, reason: collision with root package name */
    private final String f48858l;

    /* renamed from: m, reason: collision with root package name */
    private final List<String> f48859m;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f48860a;

        /* renamed from: b, reason: collision with root package name */
        private int f48861b;

        /* renamed from: c, reason: collision with root package name */
        private int f48862c;

        /* renamed from: d, reason: collision with root package name */
        private String[] f48863d;

        /* renamed from: e, reason: collision with root package name */
        private String f48864e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f48865f;

        /* renamed from: g, reason: collision with root package name */
        private String f48866g;

        /* renamed from: h, reason: collision with root package name */
        private String f48867h;

        /* renamed from: i, reason: collision with root package name */
        private String f48868i;

        /* renamed from: j, reason: collision with root package name */
        private String f48869j;

        /* renamed from: k, reason: collision with root package name */
        private List<String> f48870k;

        public b(String id) {
            this.f48860a = id;
        }

        public e a() {
            String str = this.f48860a;
            String str2 = this.f48866g;
            String str3 = this.f48867h;
            String str4 = this.f48868i;
            String str5 = this.f48869j;
            int i4 = this.f48861b;
            int i5 = this.f48862c;
            return new e(str, str2, str3, str4, str5, i4, i4, i5, i5, this.f48863d, this.f48864e, this.f48865f, this.f48870k);
        }

        public String b() {
            return this.f48867h;
        }

        public String c() {
            return this.f48866g;
        }

        public b d(String authId) {
            this.f48864e = authId;
            return this;
        }

        public b e(String[] authMethods) {
            this.f48863d = authMethods;
            return this;
        }

        public b f(String category) {
            this.f48868i = category;
            return this;
        }

        public b g(Map<String, String> extras) {
            this.f48865f = extras;
            return this;
        }

        public b h(int size) {
            this.f48861b = size;
            return this;
        }

        public b i(String model) {
            this.f48867h = model;
            return this;
        }

        public b j(String name) {
            this.f48866g = name;
            return this;
        }

        public b k(List<String> requiredFeatures) {
            this.f48870k = requiredFeatures;
            return this;
        }

        public b l(int size) {
            this.f48862c = size;
            return this;
        }

        public b m(String version) {
            this.f48869j = version;
            return this;
        }
    }

    public String a() {
        return this.f48848b;
    }

    public String[] b() {
        return this.f48854h;
    }

    public String c() {
        return this.f48857k;
    }

    public Map<String, String> d() {
        return this.f48855i;
    }

    public String e() {
        return this.f48847a;
    }

    public int f() {
        return this.f48851e;
    }

    public int g() {
        return this.f48850d;
    }

    public String h() {
        return this.f48856j;
    }

    public String i() {
        return this.f48849c;
    }

    public List<String> j() {
        return this.f48859m;
    }

    public int k() {
        return this.f48853g;
    }

    public int l() {
        return this.f48852f;
    }

    public String m() {
        return this.f48858l;
    }

    private e(String id, String name, String model, String category, String version, int imageWidth, int imageHeight, int thumbnailImageWidth, int thumbnailImageHeight, String[] authMethods, String authId, Map<String, String> extras, List<String> requiredFeatures) {
        this.f48847a = id;
        this.f48849c = name;
        this.f48856j = model;
        this.f48857k = category;
        this.f48858l = version;
        this.f48850d = imageWidth;
        this.f48851e = imageHeight;
        this.f48852f = thumbnailImageWidth;
        this.f48853g = thumbnailImageHeight;
        this.f48854h = authMethods;
        this.f48848b = authId;
        this.f48855i = extras;
        this.f48859m = requiredFeatures;
    }
}
