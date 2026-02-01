package com.harman.sdk.setting;

import com.google.gson.annotations.SerializedName;
import com.harman.jbl.partybox.f;
import com.harman.jbl.partybox.ui.ota.business.a;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AppConfig implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f48353E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("maxReconnectCount")
    private int f48354F = 3;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("maxDiscoverCount")
    private int f48355G = 10;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("maxRewriteCount")
    private int f48356H = 3;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("bleScanWindow")
    private int f48357I = 15;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("bleScanInterval")
    private int f48358J = 2;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("commandTimeout")
    private long f48359K = a.f44562c;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("deviceDuration")
    private long f48360L = 30000;

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("mtuBrEdr")
    private int f48361M = 512;

    /* renamed from: N, reason: collision with root package name */
    @SerializedName("sppUUID")
    private String f48362N = "00001101-0000-1000-8000-00805F9B34FB";

    /* renamed from: O, reason: collision with root package name */
    @SerializedName("gapUUID")
    private String f48363O = "00001801-0000-1000-8000-00805F9B34FB";

    /* renamed from: P, reason: collision with root package name */
    @SerializedName("rxUUID")
    private String f48364P = "65786365-6C70-6F69-6E74-2E636F6D0001";

    /* renamed from: Q, reason: collision with root package name */
    @SerializedName("txUUID")
    private String f48365Q = "65786365-6C70-6F69-6E74-2E636F6D0002";

    /* renamed from: R, reason: collision with root package name */
    @SerializedName("descriptor")
    private String f48366R = "00002902-0000-1000-8000-00805F9B34FB";

    /* renamed from: S, reason: collision with root package name */
    @SerializedName("bleRxTxUUID")
    private String f48367S = "65786365-6C70-6F69-6E74-2E636F6D0000";

    /* renamed from: T, reason: collision with root package name */
    @SerializedName("manufactureSpecificDataCharUUID")
    private String f48368T = "00002A01-0000-1000-8000-00805F9B34FB";

    /* renamed from: U, reason: collision with root package name */
    @SerializedName("debugProductListConfigHost")
    private String f48369U = "https://appstorage-dev.onecloud.harman.com/jbl_partybox/ota/";

    /* renamed from: V, reason: collision with root package name */
    @SerializedName("releaseProductListConfigHost")
    private String f48370V = f.f40396k;

    /* renamed from: W, reason: collision with root package name */
    @SerializedName("debugSupportDeviceLink")
    private String f48371W = "https://appstorage-dev.onecloud.harman.com/jbl_partybox/app_config/support_device.json";

    /* renamed from: X, reason: collision with root package name */
    @SerializedName("releaseSupportDeviceLink")
    private String f48372X = "https://appstorage.onecloud.harman.com/jbl_partybox/app_config/support_device.json";

    public String a() {
        return this.f48367S;
    }

    public int b() {
        return this.f48358J;
    }

    public int c() {
        return this.f48357I;
    }

    public long d() {
        return this.f48359K;
    }

    public String e() {
        return this.f48369U;
    }

    public String f() {
        return this.f48371W;
    }

    public String g() {
        return this.f48366R;
    }

    public long h() {
        return this.f48360L;
    }

    public String i() {
        return this.f48363O;
    }

    public String j() {
        return this.f48368T;
    }

    public int k() {
        return this.f48355G;
    }

    public int l() {
        return this.f48354F;
    }

    public int m() {
        return this.f48356H;
    }

    public int n() {
        return this.f48361M;
    }

    public String o() {
        return this.f48370V;
    }

    public String p() {
        return this.f48372X;
    }

    public String q() {
        return this.f48353E;
    }

    public String r() {
        return this.f48364P;
    }

    public String s() {
        return this.f48362N;
    }

    public String t() {
        return this.f48365Q;
    }

    public void u(String str) {
        this.f48353E = str;
    }
}
