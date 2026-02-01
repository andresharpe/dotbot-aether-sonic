package com.harman.jbl.partybox.ui.permissions;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class q {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45501a;

        public int a() {
            return ((Integer) this.f45501a.get("from")).intValue();
        }

        @N
        public a b(int i4) {
            this.f45501a.put("from", Integer.valueOf(i4));
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
            if (this.f45501a.containsKey("from") == aVar.f45501a.containsKey("from") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45501a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f45501a.get("from")).intValue());
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
            return j.h.f41339t0;
        }

        public String toString() {
            return "ActionToPermissionAndAccessFragment(actionId=" + i() + "){from=" + a() + "}";
        }

        private a() {
            this.f45501a = new HashMap();
        }
    }

    private q() {
    }

    @N
    @InterfaceC0567j
    public static I a() {
        return new C0924a(j.h.f41219U);
    }

    @N
    @InterfaceC0567j
    public static a b() {
        return new a();
    }
}
