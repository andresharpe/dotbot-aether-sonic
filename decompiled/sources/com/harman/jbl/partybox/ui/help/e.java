package com.harman.jbl.partybox.ui.help;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43810a;

        @N
        public String a() {
            return (String) this.f43810a.get("screenType");
        }

        @N
        public a b(@N String str) {
            if (str != null) {
                this.f43810a.put("screenType", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"screenType\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f43810a.containsKey("screenType") != aVar.f43810a.containsKey("screenType")) {
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
            if (this.f43810a.containsKey("screenType")) {
                bundle.putString("screenType", (String) this.f43810a.get("screenType"));
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
            return j.h.f41175J;
        }

        public String toString() {
            return "ActionHelpFragmentToSupportedDevicesFragment(actionId=" + i() + "){screenType=" + a() + "}";
        }

        private a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f43810a = hashMap;
            if (str != null) {
                hashMap.put("screenType", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"screenType\" is marked as non-null but was passed a null value.");
        }
    }

    private e() {
    }

    @N
    @InterfaceC0567j
    public static a a(@N String str) {
        return new a(str);
    }
}
