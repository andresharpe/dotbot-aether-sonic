package com.harman.jbl.partylight.lib.productinfo;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.google.android.gms.common.internal.C1275t;
import com.harman.jbl.partylight.lib.g;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class h {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f47534a;

        @P
        public String a() {
            return (String) this.f47534a.get("title");
        }

        @N
        public String b() {
            return (String) this.f47534a.get(C1275t.f28813a);
        }

        @N
        public a c(@P String str) {
            this.f47534a.put("title", str);
            return this;
        }

        @N
        public a d(@N String str) {
            if (str != null) {
                this.f47534a.put(C1275t.f28813a, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f47534a.containsKey(C1275t.f28813a) != aVar.f47534a.containsKey(C1275t.f28813a)) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f47534a.containsKey("title") != aVar.f47534a.containsKey("title")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f47534a.containsKey(C1275t.f28813a)) {
                bundle.putString(C1275t.f28813a, (String) this.f47534a.get(C1275t.f28813a));
            }
            if (this.f47534a.containsKey("title")) {
                bundle.putString("title", (String) this.f47534a.get("title"));
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            if (b() != null) {
                i4 = b().hashCode();
            } else {
                i4 = 0;
            }
            int i6 = (i4 + 31) * 31;
            if (a() != null) {
                i5 = a().hashCode();
            }
            return ((i6 + i5) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return g.C0418g.f46960q1;
        }

        public String toString() {
            return "ToWebviewFragment(actionId=" + i() + "){url=" + b() + ", title=" + a() + "}";
        }

        private a(@N String str, @P String str2) {
            HashMap hashMap = new HashMap();
            this.f47534a = hashMap;
            if (str != null) {
                hashMap.put(C1275t.f28813a, str);
                hashMap.put("title", str2);
                return;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
    }

    private h() {
    }

    @N
    @InterfaceC0567j
    public static I a() {
        return new C0924a(g.C0418g.f46898b);
    }

    @N
    @InterfaceC0567j
    public static I b() {
        return new C0924a(g.C0418g.f46964r1);
    }

    @N
    @InterfaceC0567j
    public static a c(@N String str, @P String str2) {
        return new a(str, str2);
    }
}
