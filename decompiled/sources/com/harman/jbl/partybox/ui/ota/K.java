package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.navigation.C0924a;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class K {

    /* loaded from: classes2.dex */
    public static class a implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44500a;

        @androidx.annotation.N
        public String a() {
            return (String) this.f44500a.get("deviceFirmwareKey");
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44500a.get("deviceMid");
        }

        @androidx.annotation.N
        public String c() {
            return (String) this.f44500a.get("devicePid");
        }

        @androidx.annotation.N
        public String d() {
            return (String) this.f44500a.get("otaFailKey");
        }

        @androidx.annotation.N
        public String e() {
            return (String) this.f44500a.get("productNameKey");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f44500a.containsKey("otaFailKey") != aVar.f44500a.containsKey("otaFailKey")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f44500a.containsKey("productNameKey") != aVar.f44500a.containsKey("productNameKey")) {
                return false;
            }
            if (e() == null ? aVar.e() != null : !e().equals(aVar.e())) {
                return false;
            }
            if (this.f44500a.containsKey("serverFirmwareKey") != aVar.f44500a.containsKey("serverFirmwareKey")) {
                return false;
            }
            if (f() == null ? aVar.f() != null : !f().equals(aVar.f())) {
                return false;
            }
            if (this.f44500a.containsKey("deviceFirmwareKey") != aVar.f44500a.containsKey("deviceFirmwareKey")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (this.f44500a.containsKey("devicePid") != aVar.f44500a.containsKey("devicePid")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f44500a.containsKey("deviceMid") != aVar.f44500a.containsKey("deviceMid")) {
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

        @androidx.annotation.N
        public String f() {
            return (String) this.f44500a.get("serverFirmwareKey");
        }

        @androidx.annotation.N
        public a g(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f44500a.containsKey("otaFailKey")) {
                bundle.putString("otaFailKey", (String) this.f44500a.get("otaFailKey"));
            } else {
                bundle.putString("otaFailKey", "");
            }
            if (this.f44500a.containsKey("productNameKey")) {
                bundle.putString("productNameKey", (String) this.f44500a.get("productNameKey"));
            } else {
                bundle.putString("productNameKey", "");
            }
            if (this.f44500a.containsKey("serverFirmwareKey")) {
                bundle.putString("serverFirmwareKey", (String) this.f44500a.get("serverFirmwareKey"));
            } else {
                bundle.putString("serverFirmwareKey", "");
            }
            if (this.f44500a.containsKey("deviceFirmwareKey")) {
                bundle.putString("deviceFirmwareKey", (String) this.f44500a.get("deviceFirmwareKey"));
            } else {
                bundle.putString("deviceFirmwareKey", "");
            }
            if (this.f44500a.containsKey("devicePid")) {
                bundle.putString("devicePid", (String) this.f44500a.get("devicePid"));
            } else {
                bundle.putString("devicePid", "");
            }
            if (this.f44500a.containsKey("deviceMid")) {
                bundle.putString("deviceMid", (String) this.f44500a.get("deviceMid"));
            } else {
                bundle.putString("deviceMid", "");
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (d() != null) {
                i4 = d().hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i4 + 31) * 31;
            if (e() != null) {
                i5 = e().hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            if (f() != null) {
                i6 = f().hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            if (a() != null) {
                i7 = a().hashCode();
            } else {
                i7 = 0;
            }
            int i13 = (i12 + i7) * 31;
            if (c() != null) {
                i8 = c().hashCode();
            } else {
                i8 = 0;
            }
            int i14 = (i13 + i8) * 31;
            if (b() != null) {
                i9 = b().hashCode();
            }
            return ((i14 + i9) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41363z0;
        }

        @androidx.annotation.N
        public a j(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("deviceMid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a k(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a l(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("otaFailKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"otaFailKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a m(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a n(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44500a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "ActionUpgradeFragmentToDownloadUpgradeFailedFragment(actionId=" + i() + "){otaFailKey=" + d() + ", productNameKey=" + e() + ", serverFirmwareKey=" + f() + ", deviceFirmwareKey=" + a() + ", devicePid=" + c() + ", deviceMid=" + b() + "}";
        }

        private a() {
            this.f44500a = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44501a;

        @androidx.annotation.N
        public String a() {
            return (String) this.f44501a.get("deviceFirmwareKey");
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44501a.get("deviceMid");
        }

        @androidx.annotation.N
        public String c() {
            return (String) this.f44501a.get("devicePid");
        }

        @androidx.annotation.N
        public String d() {
            return (String) this.f44501a.get("productNameKey");
        }

        @androidx.annotation.N
        public String e() {
            return (String) this.f44501a.get("serverFirmwareKey");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f44501a.containsKey("devicePid") != bVar.f44501a.containsKey("devicePid")) {
                return false;
            }
            if (c() == null ? bVar.c() != null : !c().equals(bVar.c())) {
                return false;
            }
            if (this.f44501a.containsKey("productNameKey") != bVar.f44501a.containsKey("productNameKey")) {
                return false;
            }
            if (d() == null ? bVar.d() != null : !d().equals(bVar.d())) {
                return false;
            }
            if (this.f44501a.containsKey("serverFirmwareKey") != bVar.f44501a.containsKey("serverFirmwareKey")) {
                return false;
            }
            if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
                return false;
            }
            if (this.f44501a.containsKey("deviceFirmwareKey") != bVar.f44501a.containsKey("deviceFirmwareKey")) {
                return false;
            }
            if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                return false;
            }
            if (this.f44501a.containsKey("deviceMid") != bVar.f44501a.containsKey("deviceMid")) {
                return false;
            }
            if (b() == null ? bVar.b() != null : !b().equals(bVar.b())) {
                return false;
            }
            if (i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        public b f(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44501a.put("deviceFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public b g(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44501a.put("deviceMid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f44501a.containsKey("devicePid")) {
                bundle.putString("devicePid", (String) this.f44501a.get("devicePid"));
            } else {
                bundle.putString("devicePid", "");
            }
            if (this.f44501a.containsKey("productNameKey")) {
                bundle.putString("productNameKey", (String) this.f44501a.get("productNameKey"));
            } else {
                bundle.putString("productNameKey", "");
            }
            if (this.f44501a.containsKey("serverFirmwareKey")) {
                bundle.putString("serverFirmwareKey", (String) this.f44501a.get("serverFirmwareKey"));
            } else {
                bundle.putString("serverFirmwareKey", "");
            }
            if (this.f44501a.containsKey("deviceFirmwareKey")) {
                bundle.putString("deviceFirmwareKey", (String) this.f44501a.get("deviceFirmwareKey"));
            } else {
                bundle.putString("deviceFirmwareKey", "");
            }
            if (this.f44501a.containsKey("deviceMid")) {
                bundle.putString("deviceMid", (String) this.f44501a.get("deviceMid"));
            } else {
                bundle.putString("deviceMid", "");
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
            return j.h.f41140A0;
        }

        @androidx.annotation.N
        public b j(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44501a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public b k(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44501a.put("productNameKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"productNameKey\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public b l(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44501a.put("serverFirmwareKey", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"serverFirmwareKey\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "ActionUpgradeFragmentToRestartFragment(actionId=" + i() + "){devicePid=" + c() + ", productNameKey=" + d() + ", serverFirmwareKey=" + e() + ", deviceFirmwareKey=" + a() + ", deviceMid=" + b() + "}";
        }

        private b() {
            this.f44501a = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f44502a;

        @androidx.annotation.N
        public String a() {
            return (String) this.f44502a.get("deviceMid");
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f44502a.get("devicePid");
        }

        @androidx.annotation.N
        public c c(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44502a.put("deviceMid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceMid\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public c d(@androidx.annotation.N String str) {
            if (str != null) {
                this.f44502a.put("devicePid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"devicePid\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f44502a.containsKey("devicePid") != cVar.f44502a.containsKey("devicePid")) {
                return false;
            }
            if (b() == null ? cVar.b() != null : !b().equals(cVar.b())) {
                return false;
            }
            if (this.f44502a.containsKey("deviceMid") != cVar.f44502a.containsKey("deviceMid")) {
                return false;
            }
            if (a() == null ? cVar.a() != null : !a().equals(cVar.a())) {
                return false;
            }
            if (i() == cVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f44502a.containsKey("devicePid")) {
                bundle.putString("devicePid", (String) this.f44502a.get("devicePid"));
            } else {
                bundle.putString("devicePid", "");
            }
            if (this.f44502a.containsKey("deviceMid")) {
                bundle.putString("deviceMid", (String) this.f44502a.get("deviceMid"));
            } else {
                bundle.putString("deviceMid", "");
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
            return j.h.f41148C0;
        }

        public String toString() {
            return "ActionUpgradeFragmentToUpgradeFailFragment(actionId=" + i() + "){devicePid=" + b() + ", deviceMid=" + a() + "}";
        }

        private c() {
            this.f44502a = new HashMap();
        }
    }

    private K() {
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I a() {
        return new C0924a(j.h.f41359y0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static a b() {
        return new a();
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static b c() {
        return new b();
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I d() {
        return new C0924a(j.h.f41144B0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static c e() {
        return new c();
    }
}
