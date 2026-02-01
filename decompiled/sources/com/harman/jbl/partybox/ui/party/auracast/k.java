package com.harman.jbl.partybox.ui.party.auracast;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class k {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44852a;

        @N
        public String a() {
            return (String) this.f44852a.get("loadUrl");
        }

        @N
        public a b(@N String str) {
            if (str != null) {
                this.f44852a.put("loadUrl", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f44852a.containsKey("loadUrl") != aVar.f44852a.containsKey("loadUrl")) {
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
            if (this.f44852a.containsKey("loadUrl")) {
                bundle.putString("loadUrl", (String) this.f44852a.get("loadUrl"));
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            if (a() != null) {
                i4 = a().hashCode();
            } else {
                i4 = 0;
            }
            return ((i4 + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41351w0;
        }

        public String toString() {
            return "ActionToWebviewQAFragment(actionId=" + i() + "){loadUrl=" + a() + "}";
        }

        private a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f44852a = hashMap;
            if (str != null) {
                hashMap.put("loadUrl", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"loadUrl\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44853a;

        public int a() {
            return ((Integer) this.f44853a.get("from")).intValue();
        }

        @N
        public b b(int i4) {
            this.f44853a.put("from", Integer.valueOf(i4));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f44853a.containsKey("from") == bVar.f44853a.containsKey("from") && a() == bVar.a() && i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f44853a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f44853a.get("from")).intValue());
            } else {
                bundle.putInt("from", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.ch;
        }

        public String toString() {
            return "ToPermissionAndAccess(actionId=" + i() + "){from=" + a() + "}";
        }

        private b() {
            this.f44853a = new HashMap();
        }
    }

    private k() {
    }

    @N
    @InterfaceC0567j
    public static a a(@N String str) {
        return new a(str);
    }

    @N
    @InterfaceC0567j
    public static b b() {
        return new b();
    }
}
