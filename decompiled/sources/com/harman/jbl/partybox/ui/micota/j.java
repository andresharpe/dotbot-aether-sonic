package com.harman.jbl.partybox.ui.micota;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class j {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44293a;

        @N
        public String a() {
            return (String) this.f44293a.get("deviceFirmwareKey");
        }

        @N
        public String b() {
            return (String) this.f44293a.get("devicePid");
        }

        @N
        public String c() {
            return (String) this.f44293a.get("otaFailKey");
        }

        @N
        public String d() {
            return (String) this.f44293a.get("productNameKey");
        }

        @N
        public String e() {
            return (String) this.f44293a.get("serverFirmwareKey");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f44293a.containsKey("otaFailKey") != aVar.f44293a.containsKey("otaFailKey")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f44293a.containsKey("productNameKey") != aVar.f44293a.containsKey("productNameKey")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f44293a.containsKey("serverFirmwareKey") != aVar.f44293a.containsKey("serverFirmwareKey")) {
                return false;
            }
            if (e() == null ? aVar.e() != null : !e().equals(aVar.e())) {
                return false;
            }
            if (this.f44293a.containsKey("deviceFirmwareKey") != aVar.f44293a.containsKey("deviceFirmwareKey")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (this.f44293a.containsKey("devicePid") != aVar.f44293a.containsKey("devicePid")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @N
        public a f(@N String str) {
            if (str != null) {
                this.f44293a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a g(@N String str) {
            if (str != null) {
                this.f44293a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f44293a.containsKey("otaFailKey")) {
                bundle.putString("otaFailKey", (String) this.f44293a.get("otaFailKey"));
            } else {
                bundle.putString("otaFailKey", "");
            }
            if (this.f44293a.containsKey("productNameKey")) {
                bundle.putString("productNameKey", (String) this.f44293a.get("productNameKey"));
            } else {
                bundle.putString("productNameKey", "");
            }
            if (this.f44293a.containsKey("serverFirmwareKey")) {
                bundle.putString("serverFirmwareKey", (String) this.f44293a.get("serverFirmwareKey"));
            } else {
                bundle.putString("serverFirmwareKey", "");
            }
            if (this.f44293a.containsKey("deviceFirmwareKey")) {
                bundle.putString("deviceFirmwareKey", (String) this.f44293a.get("deviceFirmwareKey"));
            } else {
                bundle.putString("deviceFirmwareKey", "");
            }
            if (this.f44293a.containsKey("devicePid")) {
                bundle.putString("devicePid", (String) this.f44293a.get("devicePid"));
            } else {
                bundle.putString("devicePid", "");
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (c() != null) {
                i4 = c().hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i4 + 31) * 31;
            if (d() != null) {
                i5 = d().hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (i9 + i5) * 31;
            if (e() != null) {
                i6 = e().hashCode();
            } else {
                i6 = 0;
            }
            int i11 = (i10 + i6) * 31;
            if (a() != null) {
                i7 = a().hashCode();
            } else {
                i7 = 0;
            }
            int i12 = (i11 + i7) * 31;
            if (b() != null) {
                i8 = b().hashCode();
            }
            return ((i12 + i8) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41191N;
        }

        @N
        public a j(@N String str) {
            if (str != null) {
                this.f44293a.put("otaFailKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a k(@N String str) {
            if (str != null) {
                this.f44293a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @N
        public a l(@N String str) {
            if (str != null) {
                this.f44293a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "ActionMicOTAUpgradeFragmentToMicUpgradeFailedFragment(actionId=" + i() + "){otaFailKey=" + c() + ", productNameKey=" + d() + ", serverFirmwareKey=" + e() + ", deviceFirmwareKey=" + a() + ", devicePid=" + b() + "}";
        }

        private a() {
            this.f44293a = new HashMap();
        }
    }

    private j() {
    }

    @N
    @InterfaceC0567j
    public static a a() {
        return new a();
    }

    @N
    @InterfaceC0567j
    public static I b() {
        return new C0924a(j.h.f41195O);
    }
}
