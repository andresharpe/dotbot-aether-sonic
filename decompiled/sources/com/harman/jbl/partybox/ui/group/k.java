package com.harman.jbl.partybox.ui.group;

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
        private final HashMap f43758a;

        public int a() {
            return ((Integer) this.f43758a.get("currentIndex")).intValue();
        }

        @N
        public a b(int i4) {
            this.f43758a.put("currentIndex", Integer.valueOf(i4));
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
            if (this.f43758a.containsKey("currentIndex") == aVar.f43758a.containsKey("currentIndex") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43758a.containsKey("currentIndex")) {
                bundle.putInt("currentIndex", ((Integer) this.f43758a.get("currentIndex")).intValue());
            } else {
                bundle.putInt("currentIndex", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41263e;
        }

        public String toString() {
            return "ActionToIdentityDialogFragment(actionId=" + i() + "){currentIndex=" + a() + "}";
        }

        private a() {
            this.f43758a = new HashMap();
        }
    }

    private k() {
    }

    @N
    @InterfaceC0567j
    public static a a() {
        return new a();
    }
}
