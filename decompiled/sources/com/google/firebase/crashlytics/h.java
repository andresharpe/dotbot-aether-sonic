package com.google.firebase.crashlytics;

import androidx.annotation.N;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, String> f34969a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, String> f34970a = new HashMap();

        @N
        public h b() {
            return new h(this);
        }

        @N
        public a c(@N String str, boolean z3) {
            this.f34970a.put(str, Boolean.toString(z3));
            return this;
        }

        @N
        public a d(@N String str, double d4) {
            this.f34970a.put(str, Double.toString(d4));
            return this;
        }

        @N
        public a e(@N String str, float f4) {
            this.f34970a.put(str, Float.toString(f4));
            return this;
        }

        @N
        public a f(@N String str, int i4) {
            this.f34970a.put(str, Integer.toString(i4));
            return this;
        }

        @N
        public a g(@N String str, long j4) {
            this.f34970a.put(str, Long.toString(j4));
            return this;
        }

        @N
        public a h(@N String str, @N String str2) {
            this.f34970a.put(str, str2);
            return this;
        }
    }

    h(@N a aVar) {
        this.f34969a = aVar.f34970a;
    }
}
