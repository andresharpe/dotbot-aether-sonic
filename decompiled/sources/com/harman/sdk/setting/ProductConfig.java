package com.harman.sdk.setting;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.harman.sdk.utils.d;
import com.harman.sdk.utils.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProductConfig implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    public static final String f48381H = "PRESET_EQ";

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("version")
    private String f48382E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("configFile")
    private String f48383F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("productList")
    private List<ProductItem> f48384G = new LinkedList();

    /* loaded from: classes2.dex */
    public static class ImageItem implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("speakerIcon")
        private String f48385E = null;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("speakerSmallIcon")
        private String f48386F = null;

        /* renamed from: G, reason: collision with root package name */
        @SerializedName("colorName")
        private String f48387G = null;

        /* renamed from: H, reason: collision with root package name */
        @SerializedName("identityIcon")
        private String f48388H = null;

        /* renamed from: I, reason: collision with root package name */
        @SerializedName("topPanelImageSmall")
        private String f48389I = null;

        /* renamed from: J, reason: collision with root package name */
        @SerializedName("topPanelImageCover")
        private String f48390J = null;

        public String a() {
            return this.f48387G;
        }

        public String b() {
            return this.f48388H;
        }

        public String c() {
            return this.f48385E;
        }

        public String d() {
            return this.f48386F;
        }

        public String e() {
            return this.f48390J;
        }

        public String f() {
            return this.f48389I;
        }

        public String toString() {
            return h.a().toJson(this);
        }
    }

    /* loaded from: classes2.dex */
    public static class ProductItem implements Serializable {

        /* renamed from: X, reason: collision with root package name */
        public static final String f48391X = "horizontal";

        /* renamed from: Y, reason: collision with root package name */
        public static final String f48392Y = "vertical";

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("deviceName")
        private String f48393E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("pid")
        private String f48394F;

        /* renamed from: G, reason: collision with root package name */
        @SerializedName("platform")
        private String f48395G;

        /* renamed from: H, reason: collision with root package name */
        @SerializedName("orientation")
        private String f48396H;

        /* renamed from: S, reason: collision with root package name */
        @SerializedName("otaUrl")
        private String f48407S;

        /* renamed from: I, reason: collision with root package name */
        @SerializedName("qsgUrl")
        private String f48397I = "";

        /* renamed from: J, reason: collision with root package name */
        @SerializedName("eqFileName")
        private String f48398J = "";

        /* renamed from: K, reason: collision with root package name */
        @SerializedName("newPartyBox")
        private boolean f48399K = false;

        /* renamed from: L, reason: collision with root package name */
        @SerializedName("isWifiPartyBox")
        private boolean f48400L = false;

        /* renamed from: M, reason: collision with root package name */
        @SerializedName("supportDaisyChain")
        private boolean f48401M = false;

        /* renamed from: N, reason: collision with root package name */
        @SerializedName("visibleDJButton")
        private boolean f48402N = false;

        /* renamed from: O, reason: collision with root package name */
        @SerializedName("supportPowerOff")
        private boolean f48403O = false;

        /* renamed from: P, reason: collision with root package name */
        @SerializedName("newFirmwareFormat")
        private boolean f48404P = false;

        /* renamed from: Q, reason: collision with root package name */
        @SerializedName("supportSetDeviceName")
        private boolean f48405Q = false;

        /* renamed from: R, reason: collision with root package name */
        @SerializedName("canConnectPreviousMic")
        private boolean f48406R = false;

        /* renamed from: T, reason: collision with root package name */
        @SerializedName("otaUrlList")
        private List<String> f48408T = null;

        /* renamed from: U, reason: collision with root package name */
        @SerializedName("image_list")
        private Map<String, ImageItem> f48409U = new HashMap();

        /* renamed from: V, reason: collision with root package name */
        @SerializedName("imageVersion")
        private String f48410V = null;

        /* renamed from: W, reason: collision with root package name */
        private String f48411W = "";

        public String a() {
            return this.f48393E;
        }

        public String b() {
            return this.f48398J;
        }

        public Map<String, ImageItem> c() {
            return this.f48409U;
        }

        public String d() {
            return this.f48410V;
        }

        public String e() {
            return this.f48396H;
        }

        public String f() {
            if (TextUtils.isEmpty(this.f48407S)) {
                return "";
            }
            return this.f48411W + this.f48407S;
        }

        public List<String> g() {
            ArrayList arrayList = new ArrayList();
            List<String> list = this.f48408T;
            if (list == null) {
                arrayList.add(f());
            } else {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f48411W + it.next());
                }
            }
            return arrayList;
        }

        public String h() {
            return this.f48407S;
        }

        public String i() {
            return this.f48394F;
        }

        public String j() {
            return this.f48395G;
        }

        public String k() {
            return this.f48397I;
        }

        public boolean l() {
            return this.f48406R;
        }

        public boolean m() {
            return this.f48404P;
        }

        public boolean n() {
            if (!this.f48400L && this.f48399K) {
                return true;
            }
            return false;
        }

        public boolean o() {
            return this.f48401M;
        }

        public boolean p() {
            return this.f48403O;
        }

        public boolean q() {
            return this.f48405Q;
        }

        public boolean r() {
            return this.f48402N;
        }

        public boolean s() {
            return this.f48400L;
        }

        public void t(String str) {
            this.f48393E = str;
        }

        public String toString() {
            return "ProductItem{deviceName='" + this.f48393E + "', pid='" + this.f48394F + "', platform='" + this.f48395G + "', eqFileName=" + this.f48398J + ", otaUrl='" + this.f48407S + "', qsgUrl='" + this.f48397I + "', imageList=" + this.f48409U + ", hostUrl='" + this.f48411W + "'}";
        }

        public void u(String str) {
            this.f48411W = str;
        }

        public void v(String str) {
            this.f48394F = str;
        }
    }

    public List<ProductItem> a() {
        List<ProductItem> list = this.f48384G;
        if (list != null) {
            Iterator<ProductItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().u(d.j().q());
            }
        }
        return this.f48384G;
    }

    public String b() {
        return this.f48382E;
    }

    public void c(String str) {
        this.f48382E = str;
    }

    public String toString() {
        return "ProductConfig{version='" + this.f48382E + "', productItems=" + this.f48384G + '}';
    }
}
