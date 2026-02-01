package com.harman.jbl.partybox.ui.permissions;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class h {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45494a;

        public int a() {
            return ((Integer) this.f45494a.get("from")).intValue();
        }

        @N
        public a b(int i4) {
            this.f45494a.put("from", Integer.valueOf(i4));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f45494a.containsKey("from") == aVar.f45494a.containsKey("from") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45494a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f45494a.get("from")).intValue());
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
            return j.h.f41273g;
        }

        public String toString() {
            return "ActionToPermissionsGrantFragment(actionId=" + i() + "){from=" + a() + "}";
        }

        private a() {
            this.f45494a = new HashMap();
        }
    }

    private h() {
    }

    @N
    @InterfaceC0567j
    public static I a() {
        return new C0924a(j.h.f41207R);
    }

    @N
    @InterfaceC0567j
    public static I b() {
        return new C0924a(j.h.f41304m0);
    }

    @N
    @InterfaceC0567j
    public static a c() {
        return new a();
    }
}
