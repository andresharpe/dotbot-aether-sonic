package com.android.volley;

import androidx.annotation.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f24456a;

        /* renamed from: b, reason: collision with root package name */
        public String f24457b;

        /* renamed from: c, reason: collision with root package name */
        public long f24458c;

        /* renamed from: d, reason: collision with root package name */
        public long f24459d;

        /* renamed from: e, reason: collision with root package name */
        public long f24460e;

        /* renamed from: f, reason: collision with root package name */
        public long f24461f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f24462g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<i> f24463h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(long j4) {
            if (this.f24460e < j4) {
                return true;
            }
            return false;
        }

        public boolean c() {
            return d(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(long j4) {
            if (this.f24461f < j4) {
                return true;
            }
            return false;
        }
    }

    @P
    a a(String str);

    void b();

    void c(String str, boolean z3);

    void clear();

    void d(String str, a aVar);

    void e(String str);
}
