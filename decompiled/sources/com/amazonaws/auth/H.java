package com.amazonaws.auth;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<a, F> f23387a = new HashMap();

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23388a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23389b;

        public a(String str, String str2) {
            this.f23388a = str;
            this.f23389b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f23388a;
            if (str == null) {
                if (aVar.f23388a != null) {
                    return false;
                }
            } else if (!str.equals(aVar.f23388a)) {
                return false;
            }
            String str2 = this.f23389b;
            if (str2 == null) {
                if (aVar.f23389b != null) {
                    return false;
                }
            } else if (!str2.equals(aVar.f23389b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f23388a;
            int i4 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i5 = (hashCode + 31) * 31;
            String str2 = this.f23389b;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            return i5 + i4;
        }
    }

    public static synchronized F a(InterfaceC1029g interfaceC1029g, String str, com.amazonaws.d dVar) {
        F f4;
        synchronized (H.class) {
            try {
                a aVar = new a(interfaceC1029g.a(), str);
                Map<a, F> map = f23387a;
                if (!map.containsKey(aVar)) {
                    map.put(aVar, new F(interfaceC1029g, dVar));
                }
                f4 = map.get(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4;
    }
}
