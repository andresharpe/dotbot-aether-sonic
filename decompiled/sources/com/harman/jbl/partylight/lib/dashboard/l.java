package com.harman.jbl.partylight.lib.dashboard;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partylight.lib.g;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class l {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f46338a;

        public boolean a() {
            return ((Boolean) this.f46338a.get("hasNew")).booleanValue();
        }

        @N
        public a b(boolean z3) {
            this.f46338a.put("hasNew", Boolean.valueOf(z3));
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
            if (this.f46338a.containsKey("hasNew") == aVar.f46338a.containsKey("hasNew") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f46338a.containsKey("hasNew")) {
                bundle.putBoolean("hasNew", ((Boolean) this.f46338a.get("hasNew")).booleanValue());
            }
            return bundle;
        }

        public int hashCode() {
            return (((a() ? 1 : 0) + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return g.C0418g.f46902c;
        }

        public String toString() {
            return "ActionDashboardfragmentToProductinformationfragment(actionId=" + i() + "){hasNew=" + a() + "}";
        }

        private a(boolean z3) {
            HashMap hashMap = new HashMap();
            this.f46338a = hashMap;
            hashMap.put("hasNew", Boolean.valueOf(z3));
        }
    }

    private l() {
    }

    @N
    @InterfaceC0567j
    public static a a(boolean z3) {
        return new a(z3);
    }

    @N
    @InterfaceC0567j
    public static I b() {
        return new C0924a(g.C0418g.f46898b);
    }
}
