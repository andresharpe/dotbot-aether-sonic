package com.harman.jbl.partybox.ui.splash;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class f {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45533a;

        public int a() {
            return ((Integer) this.f45533a.get("showAgreement")).intValue();
        }

        @N
        public a b(int i4) {
            this.f45533a.put("showAgreement", Integer.valueOf(i4));
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
            if (this.f45533a.containsKey("showAgreement") == aVar.f45533a.containsKey("showAgreement") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45533a.containsKey("showAgreement")) {
                bundle.putInt("showAgreement", ((Integer) this.f45533a.get("showAgreement")).intValue());
            } else {
                bundle.putInt("showAgreement", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41259d0;
        }

        public String toString() {
            return "ActionSplashFragmentToWelcomeFragment(actionId=" + i() + "){showAgreement=" + a() + "}";
        }

        private a() {
            this.f45533a = new HashMap();
        }
    }

    private f() {
    }

    @N
    @InterfaceC0567j
    public static I a() {
        return new C0924a(j.h.f41254c0);
    }

    @N
    @InterfaceC0567j
    public static a b() {
        return new a();
    }
}
