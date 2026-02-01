package com.harman.jbl.partybox.ui.connection.view;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class p {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42373a;

        public int a() {
            return ((Integer) this.f42373a.get("isFromProductList")).intValue();
        }

        @N
        public String b() {
            return (String) this.f42373a.get("pid");
        }

        @N
        public a c(int i4) {
            this.f42373a.put("isFromProductList", Integer.valueOf(i4));
            return this;
        }

        @N
        public a d(@N String str) {
            if (str != null) {
                this.f42373a.put("pid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42373a.containsKey("pid") != aVar.f42373a.containsKey("pid")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f42373a.containsKey("isFromProductList") == aVar.f42373a.containsKey("isFromProductList") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42373a.containsKey("pid")) {
                bundle.putString("pid", (String) this.f42373a.get("pid"));
            }
            if (this.f42373a.containsKey("isFromProductList")) {
                bundle.putInt("isFromProductList", ((Integer) this.f42373a.get("isFromProductList")).intValue());
            } else {
                bundle.putInt("isFromProductList", 0);
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            if (b() != null) {
                i4 = b().hashCode();
            } else {
                i4 = 0;
            }
            return ((((i4 + 31) * 31) + a()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41328r;
        }

        public String toString() {
            return "ActionConnectionGuideFragmentToActivateSpeakerBluetoothFragment(actionId=" + i() + "){pid=" + b() + ", isFromProductList=" + a() + "}";
        }

        private a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f42373a = hashMap;
            if (str != null) {
                hashMap.put("pid", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
    }

    private p() {
    }

    @N
    @InterfaceC0567j
    public static a a(@N String str) {
        return new a(str);
    }

    @N
    @InterfaceC0567j
    public static I b() {
        return new C0924a(j.h.f41333s);
    }

    @N
    @InterfaceC0567j
    public static I c() {
        return new C0924a(j.h.f41338t);
    }
}
