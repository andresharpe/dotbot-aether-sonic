package partybox.imp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.core.app.C0;
import com.amazonaws.http.h;
import com.google.gson.GsonBuilder;
import com.harman.log.f;
import com.spotify.sdk.android.auth.LoginActivity;
import jar.model.RequestPayloadDataDeviceAnalytics;
import jar.model.RequestPayloadDataHarmanDevice;
import jar.model_new.RequestPayloadDataGeneral;
import jar.model_new.RequestPayloadDataNew;
import jar.model_new.RequestPayloadNew;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import partybox.api.IBaseDataAnalytics;

/* loaded from: classes2.dex */
public class c implements IBaseDataAnalytics {

    /* renamed from: f, reason: collision with root package name */
    public static String f55890f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f55891g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final String f55892h = "UpdatePartyBoxAnalyticsReq";

    /* renamed from: i, reason: collision with root package name */
    private static final String f55893i = "JBL PartyBox";

    /* renamed from: j, reason: collision with root package name */
    private static long f55894j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final String f55895k = "S3DataAnalyticManager";

    /* renamed from: l, reason: collision with root package name */
    private static volatile c f55896l;

    /* renamed from: b, reason: collision with root package name */
    private boolean f55898b;

    /* renamed from: c, reason: collision with root package name */
    private String f55899c;

    /* renamed from: e, reason: collision with root package name */
    private RequestPayloadNew f55901e;

    /* renamed from: a, reason: collision with root package name */
    String f55897a = "";

    /* renamed from: d, reason: collision with root package name */
    private String f55900d = null;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q3.a f55902E;

        a(q3.a aVar) {
            this.f55902E = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            String json = new GsonBuilder().setPrettyPrinting().create().toJson(c.this.f55901e);
            JSONObject q4 = c.this.q(c.f55890f, c.f55891g, json);
            boolean z4 = true;
            if (q4 != null && q4.optJSONObject(LoginActivity.f48951P) != null && "success".equalsIgnoreCase(q4.optJSONObject(LoginActivity.f48951P).optString(C0.f11537F0))) {
                z3 = true;
            } else {
                z3 = false;
            }
            f.a(c.f55895k, "uploadToServer -----> url: " + c.f55890f + ", result json: " + q4);
            String l4 = c.this.f55901e.a().b().l();
            String g4 = c.this.f55901e.a().b().g();
            if (z3) {
                c.this.f55900d = json;
                f.a(c.f55895k, "uploadToServer -----> " + l4 + "/" + g4 + ", current json: " + json);
            } else {
                f.a(c.f55895k, "uploadToServer failed! productName:  " + l4 + ",mac: " + g4);
                z4 = false;
            }
            q3.a aVar = this.f55902E;
            if (aVar != null) {
                aVar.a(z4);
            }
        }
    }

    public static String h(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b4 : digest) {
                String hexString = Integer.toHexString(b4 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private boolean i(RequestPayloadDataHarmanDevice requestPayloadDataHarmanDevice) {
        if (requestPayloadDataHarmanDevice.d() != null && requestPayloadDataHarmanDevice.c() != null && requestPayloadDataHarmanDevice.f() != null) {
            return true;
        }
        return false;
    }

    private String j(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e4) {
            f.c(f55895k, "Exception:", e4);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return "";
    }

    public static c l() {
        if (f55896l == null) {
            synchronized (c.class) {
                try {
                    if (f55896l == null) {
                        f55896l = new c();
                    }
                } finally {
                }
            }
        }
        return f55896l;
    }

    private String m() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // partybox.api.IBaseDataAnalytics
    @N
    public String a() {
        if (TextUtils.isEmpty(this.f55900d)) {
            return "";
        }
        return this.f55900d;
    }

    @Override // partybox.api.IBaseDataAnalytics
    public void b(Context context, q3.a aVar) {
        RequestPayloadNew requestPayloadNew = this.f55901e;
        if (requestPayloadNew != null && requestPayloadNew.a() != null) {
            this.f55901e.d(m());
            boolean a4 = s3.b.a(context);
            f.a(f55895k, "uploadToServer isNetworkConnected: " + a4 + ",isUploadAlready: " + this.f55898b + ",currentAddress: " + this.f55897a);
            if (a4 && !this.f55898b) {
                this.f55898b = true;
                new Thread(new a(aVar)).start();
                return;
            }
            return;
        }
        f.a(f55895k, "uploadToServer requestPayload is not exist, so init current device!");
        if (aVar != null) {
            aVar.a(false);
        }
    }

    @Override // partybox.api.IBaseDataAnalytics
    public boolean c(Context context) {
        try {
            d.d().f(context);
            this.f55899c = j(context);
            return true;
        } catch (Exception e4) {
            f.c(f55895k, "Exception:", e4);
            return false;
        }
    }

    @Override // partybox.api.IBaseDataAnalytics
    public void d(boolean z3, String str, Object obj, boolean z4) {
    }

    @Override // partybox.api.IBaseDataAnalytics
    public IBaseDataAnalytics.CUR_DEVICE_STATUS e(String str, int i4, String str2, String str3, String str4) {
        IBaseDataAnalytics.CUR_DEVICE_STATUS cur_device_status = IBaseDataAnalytics.CUR_DEVICE_STATUS.UPDATED;
        if (str != null && i4 >= 0 && str2 != null) {
            this.f55897a = str;
            f.a(f55895k, "setCurDevice currentAddress: " + this.f55897a);
            RequestPayloadNew requestPayloadNew = this.f55901e;
            if (requestPayloadNew == null || requestPayloadNew.a() == null) {
                f.a(f55895k, "setCurDevice requestPayload is not exist, so init current device!");
                this.f55901e = k();
                cur_device_status = IBaseDataAnalytics.CUR_DEVICE_STATUS.CREATED;
            }
            this.f55898b = false;
            this.f55901e.a().b().u(str);
            this.f55901e.a().b().v(h(str));
            this.f55901e.a().b().A(str4);
            this.f55901e.a().b().y(Integer.toHexString(i4));
            this.f55901e.a().b().z(str2);
            this.f55901e.a().b().t(str3);
            this.f55901e.a().b().q(this.f55899c);
            this.f55901e.a().b().B(f55893i);
            this.f55901e.a().b().p("Android");
            this.f55901e.a().b().o(Build.VERSION.RELEASE);
            this.f55901e.a().b().w(Build.BRAND.toUpperCase());
            this.f55901e.a().b().x(Build.MODEL);
            f.a(f55895k, "setCurDevice macAddress: " + str + ",productId: " + i4 + ",productName: " + str2 + ",mac: " + this.f55901e.a().b().g() + ",fwVersion: " + str3);
            return cur_device_status;
        }
        f.b(f55895k, "setCurDevice params contain null or less than 0");
        return IBaseDataAnalytics.CUR_DEVICE_STATUS.FAILED;
    }

    public RequestPayloadNew k() {
        RequestPayloadNew requestPayloadNew = new RequestPayloadNew();
        requestPayloadNew.c(new RequestPayloadDataNew());
        RequestPayloadDataGeneral requestPayloadDataGeneral = new RequestPayloadDataGeneral();
        requestPayloadDataGeneral.p("");
        requestPayloadDataGeneral.o("");
        requestPayloadDataGeneral.w("");
        requestPayloadDataGeneral.x("");
        requestPayloadNew.a().d(requestPayloadDataGeneral);
        return requestPayloadNew;
    }

    public void n(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        RequestPayloadNew requestPayloadNew = this.f55901e;
        if (requestPayloadNew == null || requestPayloadNew.a() == null) {
            f.a(f55895k, "setCurDevice requestPayload is not exist, so init current device!");
            this.f55901e = k();
        }
        if (requestPayloadDataDeviceAnalytics == null) {
            f.d(f55895k, "logDeviceInfo deviceAnalytics: is null");
            return;
        }
        f.d(f55895k, "logDeviceInfo RequestPayloadDataDeviceAnalytics: " + new GsonBuilder().setPrettyPrinting().create().toJson(requestPayloadDataDeviceAnalytics));
        Map<String, Object> a4 = this.f55901e.a().a();
        if (a4 == null) {
            a4 = new HashMap<>();
            this.f55901e.a().c(a4);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("tws_sec", hashMap2);
        a4.put("tws_usage", hashMap);
        hashMap.put("tws_times", requestPayloadDataDeviceAnalytics.Y1());
        hashMap.put("tws_party_times", requestPayloadDataDeviceAnalytics.Z1());
        hashMap.put("tws_stereo_times", requestPayloadDataDeviceAnalytics.e2());
        hashMap.put("tws_party_duration", requestPayloadDataDeviceAnalytics.c2());
        hashMap.put("tws_stereo_duration", requestPayloadDataDeviceAnalytics.d2());
        hashMap.put("tws_party_prim_duration", requestPayloadDataDeviceAnalytics.a2());
        hashMap.put("tws_party_sec_duration", requestPayloadDataDeviceAnalytics.b2());
        if (requestPayloadDataDeviceAnalytics.k1() != null) {
            hashMap2.put("tws_sec_pid1", Integer.toHexString(requestPayloadDataDeviceAnalytics.k1().intValue()));
            hashMap2.put("tws_sec_pid1_times", requestPayloadDataDeviceAnalytics.n1());
        }
        if (requestPayloadDataDeviceAnalytics.o1() != null) {
            hashMap2.put("tws_sec_pid2", Integer.toHexString(requestPayloadDataDeviceAnalytics.o1().intValue()));
            hashMap2.put("tws_sec_pid2_times", requestPayloadDataDeviceAnalytics.p1());
        }
        if (requestPayloadDataDeviceAnalytics.q1() != null) {
            hashMap2.put("tws_sec_pid3", Integer.toHexString(requestPayloadDataDeviceAnalytics.q1().intValue()));
            hashMap2.put("tws_sec_pid3_times", requestPayloadDataDeviceAnalytics.r1());
        }
        if (requestPayloadDataDeviceAnalytics.s1() != null) {
            hashMap2.put("tws_sec_pid4", Integer.toHexString(requestPayloadDataDeviceAnalytics.s1().intValue()));
            hashMap2.put("tws_sec_pid4_times", requestPayloadDataDeviceAnalytics.t1());
        }
        if (requestPayloadDataDeviceAnalytics.u1() != null) {
            hashMap2.put("tws_sec_pid5", Integer.toHexString(requestPayloadDataDeviceAnalytics.u1().intValue()));
            hashMap2.put("tws_sec_pid5_times", requestPayloadDataDeviceAnalytics.v1());
        }
        if (requestPayloadDataDeviceAnalytics.w1() != null) {
            hashMap2.put("tws_sec_pid6", Integer.toHexString(requestPayloadDataDeviceAnalytics.w1().intValue()));
            hashMap2.put("tws_sec_pid6_times", requestPayloadDataDeviceAnalytics.x1());
        }
        if (requestPayloadDataDeviceAnalytics.y1() != null) {
            hashMap2.put("tws_sec_pid7", Integer.toHexString(requestPayloadDataDeviceAnalytics.y1().intValue()));
            hashMap2.put("tws_sec_pid7_times", requestPayloadDataDeviceAnalytics.z1());
        }
        if (requestPayloadDataDeviceAnalytics.A1() != null) {
            hashMap2.put("tws_sec_pid8", Integer.toHexString(requestPayloadDataDeviceAnalytics.A1().intValue()));
            hashMap2.put("tws_sec_pid8_times", requestPayloadDataDeviceAnalytics.B1());
        }
        if (requestPayloadDataDeviceAnalytics.C1() != null) {
            hashMap2.put("tws_sec_pid9", Integer.toHexString(requestPayloadDataDeviceAnalytics.C1().intValue()));
            hashMap2.put("tws_sec_pid9_times", requestPayloadDataDeviceAnalytics.D1());
        }
        if (requestPayloadDataDeviceAnalytics.l1() != null) {
            hashMap2.put("tws_sec_pid10", Integer.toHexString(requestPayloadDataDeviceAnalytics.l1().intValue()));
            hashMap2.put("tws_sec_pid10_times", requestPayloadDataDeviceAnalytics.m1());
        }
        a4.put("network_standby_times", requestPayloadDataDeviceAnalytics.f1());
        a4.put("network_standby_wakeup_by_app_times", requestPayloadDataDeviceAnalytics.g1());
        a4.put("network_standby_wakeup_by_power_times", requestPayloadDataDeviceAnalytics.i1());
        a4.put("network_standby_wakeup_by_bt_play_times", requestPayloadDataDeviceAnalytics.h1());
        a4.put("ble_standby_wakeup_by_app_times", requestPayloadDataDeviceAnalytics.w());
        a4.put("ble_standby_wakeup_by_power_times", requestPayloadDataDeviceAnalytics.x());
        a4.put("power_on_by_button_in_battery_mode", requestPayloadDataDeviceAnalytics.N1());
        a4.put("eq_usage", new HashMap());
        hashMap2.put("eq_bassboost_off_duration", requestPayloadDataDeviceAnalytics.V());
        hashMap2.put("eq_bassboost_1_duration", requestPayloadDataDeviceAnalytics.T());
        hashMap2.put("eq_bassboost_2_diration", requestPayloadDataDeviceAnalytics.U());
        hashMap2.put("eq_preset_sign_duration", requestPayloadDataDeviceAnalytics.m2());
        hashMap2.put("eq_preset_movie_duration", requestPayloadDataDeviceAnalytics.l2());
        hashMap2.put("eq_preset_chill_duration", requestPayloadDataDeviceAnalytics.i2());
        hashMap2.put("eq_preset_vocal_duration", requestPayloadDataDeviceAnalytics.n2());
        hashMap2.put("eq_default_duration", requestPayloadDataDeviceAnalytics.k2());
        hashMap2.put("eq_any_duration", requestPayloadDataDeviceAnalytics.h2());
        hashMap2.put("eq_custom_duration", requestPayloadDataDeviceAnalytics.j2());
        HashMap hashMap3 = new HashMap();
        a4.put("playback_usage", hashMap3);
        hashMap3.put("playback_battery_duration", requestPayloadDataDeviceAnalytics.F1());
        hashMap3.put("playback_ac_duration", requestPayloadDataDeviceAnalytics.E1());
        hashMap3.put("battery_bt_playback_duration", requestPayloadDataDeviceAnalytics.U1());
        hashMap3.put("battery_usb_playback_duration", requestPayloadDataDeviceAnalytics.X1());
        hashMap3.put("battery_aux_playback_duration", requestPayloadDataDeviceAnalytics.T1());
        hashMap3.put("battery_daisyChain_playback_duration", requestPayloadDataDeviceAnalytics.V1());
        hashMap3.put("battery_uac_playback_duration", requestPayloadDataDeviceAnalytics.W1());
        hashMap3.put("ac_bt_playback_duration", requestPayloadDataDeviceAnalytics.P1());
        hashMap3.put("ac_usb_playback_duration", requestPayloadDataDeviceAnalytics.S1());
        hashMap3.put("ac_aux_playback_duration", requestPayloadDataDeviceAnalytics.O1());
        hashMap3.put("ac_daisyChain_playback_duration", requestPayloadDataDeviceAnalytics.Q1());
        hashMap3.put("ac_uac_playback_duration", requestPayloadDataDeviceAnalytics.R1());
        a4.put("multi_phone_playback_times", requestPayloadDataDeviceAnalytics.e1());
        a4.put("battery_charging_duration", requestPayloadDataDeviceAnalytics.n());
        a4.put("battery_fast_charging_duration", requestPayloadDataDeviceAnalytics.o());
        a4.put("battery_pre_charging_duration", requestPayloadDataDeviceAnalytics.s());
        a4.put("phone_charging_times", requestPayloadDataDeviceAnalytics.j1());
        a4.put("battery_safety_temperature_times", requestPayloadDataDeviceAnalytics.i());
        a4.put("battery_safety_capacity_times", requestPayloadDataDeviceAnalytics.j());
        a4.put("amp_protection_reset_times", requestPayloadDataDeviceAnalytics.a());
        a4.put("car_charging_times", requestPayloadDataDeviceAnalytics.y());
        HashMap hashMap4 = new HashMap();
        a4.put("auracast_usage", hashMap4);
        hashMap4.put("auracast_transmitter_times", requestPayloadDataDeviceAnalytics.h());
        hashMap4.put("auracast_transmitter_duration", requestPayloadDataDeviceAnalytics.g());
        hashMap4.put("auracast_receiver_times", requestPayloadDataDeviceAnalytics.f());
        hashMap4.put("auracast_receiver_duration", requestPayloadDataDeviceAnalytics.e());
        hashMap4.put("auracast_button_times", requestPayloadDataDeviceAnalytics.b());
        hashMap4.put("auracast_party_times", requestPayloadDataDeviceAnalytics.c());
        hashMap4.put("auracast_party_duration", requestPayloadDataDeviceAnalytics.d());
        HashMap hashMap5 = new HashMap();
        a4.put("effect_lab_usage", hashMap5);
        hashMap5.put("effect_filter_times", requestPayloadDataDeviceAnalytics.P());
        hashMap5.put("effect_gitar_times", requestPayloadDataDeviceAnalytics.Q());
        hashMap5.put("effect_repeater_times", requestPayloadDataDeviceAnalytics.R());
        hashMap5.put("effect_wipe_out_times", requestPayloadDataDeviceAnalytics.S());
        hashMap5.put("effect_echo_times", requestPayloadDataDeviceAnalytics.O());
        hashMap5.put("dj_horn_times", requestPayloadDataDeviceAnalytics.E());
        hashMap5.put("dj_clap_times", requestPayloadDataDeviceAnalytics.B());
        hashMap5.put("dj_scratch_1_times", requestPayloadDataDeviceAnalytics.K());
        hashMap5.put("dj_scratch_2_times", requestPayloadDataDeviceAnalytics.L());
        hashMap5.put("dj_scratch_4_times", requestPayloadDataDeviceAnalytics.M());
        hashMap5.put("dj_like_times", requestPayloadDataDeviceAnalytics.I());
        hashMap5.put("dj_boo_times", requestPayloadDataDeviceAnalytics.A());
        hashMap5.put("dj_fx5_times", requestPayloadDataDeviceAnalytics.N());
        hashMap5.put("dj_lets_go_times", requestPayloadDataDeviceAnalytics.G());
        hashMap5.put("dj_handsups_times", requestPayloadDataDeviceAnalytics.C());
        hashMap5.put("dj_hey_times", requestPayloadDataDeviceAnalytics.D());
        hashMap5.put("dj_lets_party_times", requestPayloadDataDeviceAnalytics.H());
        hashMap5.put("dj_jump_times", requestPayloadDataDeviceAnalytics.F());
        hashMap5.put("dj_123_lets_go_times", requestPayloadDataDeviceAnalytics.z());
        hashMap5.put("dj_ready", requestPayloadDataDeviceAnalytics.J());
        HashMap hashMap6 = new HashMap();
        a4.put("button_usage", hashMap6);
        hashMap6.put("btn_power_on_times", requestPayloadDataDeviceAnalytics.l0());
        hashMap6.put("btn_power_on_duration", requestPayloadDataDeviceAnalytics.M1());
        hashMap6.put("btn_play_pause_times", requestPayloadDataDeviceAnalytics.k0());
        hashMap6.put("btn_tws_times", requestPayloadDataDeviceAnalytics.p0());
        hashMap6.put("btn_light_times", requestPayloadDataDeviceAnalytics.i0());
        hashMap6.put("btn_bassboost_times", requestPayloadDataDeviceAnalytics.a0());
        hashMap6.put("btn_source_times", requestPayloadDataDeviceAnalytics.m0());
        hashMap6.put("btn_dj_effect_1_times", requestPayloadDataDeviceAnalytics.d0());
        hashMap6.put("btn_dj_effect_2_times", requestPayloadDataDeviceAnalytics.e0());
        hashMap6.put("btn_dj_effect_3_times", requestPayloadDataDeviceAnalytics.f0());
        hashMap6.put("btn_bass_up_times", requestPayloadDataDeviceAnalytics.c0());
        hashMap6.put("btn_bass_down_times", requestPayloadDataDeviceAnalytics.b0());
        hashMap6.put("btn_treble_up_times", requestPayloadDataDeviceAnalytics.o0());
        hashMap6.put("btn_treble_down_times", requestPayloadDataDeviceAnalytics.n0());
        hashMap6.put("btn_echo_up_times", requestPayloadDataDeviceAnalytics.h0());
        hashMap6.put("btn_echo_down_times", requestPayloadDataDeviceAnalytics.g0());
        hashMap6.put("btn_volume_up_times", requestPayloadDataDeviceAnalytics.r0());
        hashMap6.put("btn_volume_down_times", requestPayloadDataDeviceAnalytics.q0());
        hashMap6.put("btn_bt_short_press_times", requestPayloadDataDeviceAnalytics.Z());
        hashMap6.put("btn_bt_long_press_times", requestPayloadDataDeviceAnalytics.Y());
        hashMap6.put("btn_light_long_press_times", requestPayloadDataDeviceAnalytics.j0());
        hashMap6.put("knobs_volume_times", requestPayloadDataDeviceAnalytics.z0());
        hashMap6.put("knobs_light_times", requestPayloadDataDeviceAnalytics.v0());
        hashMap6.put("knobs_bass_times", requestPayloadDataDeviceAnalytics.s0());
        hashMap6.put("knobs_treble_times", requestPayloadDataDeviceAnalytics.y0());
        hashMap6.put("knobs_echo_times", requestPayloadDataDeviceAnalytics.t0());
        hashMap6.put("knobs_mic1_volume_times", requestPayloadDataDeviceAnalytics.w0());
        hashMap6.put("knobs_mic2_volume_times", requestPayloadDataDeviceAnalytics.x0());
        hashMap6.put("knobs_guitar_volume_times", requestPayloadDataDeviceAnalytics.u0());
        HashMap hashMap7 = new HashMap();
        a4.put("light_usage", hashMap7);
        hashMap7.put("pattern_neon_duration", requestPayloadDataDeviceAnalytics.M0());
        hashMap7.put("pattern_loop_duration", requestPayloadDataDeviceAnalytics.L0());
        hashMap7.put("pattern_bounce_duration", requestPayloadDataDeviceAnalytics.A0());
        hashMap7.put("pattern_trim_duration", requestPayloadDataDeviceAnalytics.Z0());
        hashMap7.put("pattern_switch_duration", requestPayloadDataDeviceAnalytics.Y0());
        hashMap7.put("pattern_freeze_duration", requestPayloadDataDeviceAnalytics.K0());
        hashMap7.put("pattern_custom_duration", requestPayloadDataDeviceAnalytics.D0());
        hashMap7.put("pattern_rock_duration", requestPayloadDataDeviceAnalytics.O0());
        hashMap7.put("pattern_club_duration", requestPayloadDataDeviceAnalytics.B0());
        hashMap7.put("pattern_flow_duration", requestPayloadDataDeviceAnalytics.J0());
        hashMap7.put("pattern_ripple_duration", requestPayloadDataDeviceAnalytics.N0());
        hashMap7.put("pattern_cross_duration", requestPayloadDataDeviceAnalytics.C0());
        hashMap7.put("pattern_flash_duration", requestPayloadDataDeviceAnalytics.I0());
        hashMap7.put("figure_8_ring_right_duration", requestPayloadDataDeviceAnalytics.G0());
        hashMap7.put("strobe_duration", requestPayloadDataDeviceAnalytics.U0());
        hashMap7.put("strobe_up_duration", requestPayloadDataDeviceAnalytics.W0());
        hashMap7.put("strobe_down_duration", requestPayloadDataDeviceAnalytics.V0());
        hashMap7.put("side_2_ring_duration", requestPayloadDataDeviceAnalytics.P0());
        hashMap7.put("side_stripe_duration", requestPayloadDataDeviceAnalytics.Q0());
        hashMap7.put("star_duration_duration", requestPayloadDataDeviceAnalytics.R0());
        hashMap7.put("edge_duration", requestPayloadDataDeviceAnalytics.E0());
        hashMap7.put("figure_8_ring_right_off_duration", requestPayloadDataDeviceAnalytics.H0());
        hashMap7.put("strobe_off_duration", requestPayloadDataDeviceAnalytics.X0());
        hashMap7.put("star_off_duration", requestPayloadDataDeviceAnalytics.S0());
        hashMap7.put("edge_off_duration", requestPayloadDataDeviceAnalytics.F0());
        hashMap7.put("side_stripe_off_duration", requestPayloadDataDeviceAnalytics.T0());
        HashMap hashMap8 = new HashMap();
        a4.put("volume_usage", hashMap8);
        hashMap8.put("volume_change_by_avrcp_times", requestPayloadDataDeviceAnalytics.V2());
        hashMap8.put("volume_popular_level", requestPayloadDataDeviceAnalytics.X2());
        hashMap8.put("volume_popular_duration", requestPayloadDataDeviceAnalytics.W2());
        hashMap8.put("volume_0_duration", requestPayloadDataDeviceAnalytics.o2());
        hashMap8.put("volume_1_duration", requestPayloadDataDeviceAnalytics.z2());
        hashMap8.put("volume_2_duration", requestPayloadDataDeviceAnalytics.K2());
        hashMap8.put("volume_3_duration", requestPayloadDataDeviceAnalytics.O2());
        hashMap8.put("volume_4_duration", requestPayloadDataDeviceAnalytics.P2());
        hashMap8.put("volume_5_duration", requestPayloadDataDeviceAnalytics.Q2());
        hashMap8.put("volume_6_duration", requestPayloadDataDeviceAnalytics.R2());
        hashMap8.put("volume_7_duration", requestPayloadDataDeviceAnalytics.S2());
        hashMap8.put("volume_8_duration", requestPayloadDataDeviceAnalytics.T2());
        hashMap8.put("volume_9_duration", requestPayloadDataDeviceAnalytics.U2());
        hashMap8.put("volume_10_duration", requestPayloadDataDeviceAnalytics.p2());
        hashMap8.put("volume_11_duration", requestPayloadDataDeviceAnalytics.q2());
        hashMap8.put("volume_12_duration", requestPayloadDataDeviceAnalytics.r2());
        hashMap8.put("volume_13_duration", requestPayloadDataDeviceAnalytics.s2());
        hashMap8.put("volume_14_duration", requestPayloadDataDeviceAnalytics.t2());
        hashMap8.put("volume_15_duration", requestPayloadDataDeviceAnalytics.u2());
        hashMap8.put("volume_16_duration", requestPayloadDataDeviceAnalytics.v2());
        hashMap8.put("volume_17_duration", requestPayloadDataDeviceAnalytics.w2());
        hashMap8.put("volume_18_duration", requestPayloadDataDeviceAnalytics.x2());
        hashMap8.put("volume_19_duration", requestPayloadDataDeviceAnalytics.y2());
        hashMap8.put("volume_20_duration", requestPayloadDataDeviceAnalytics.A2());
        hashMap8.put("volume_21_duration", requestPayloadDataDeviceAnalytics.B2());
        hashMap8.put("volume_22_duration", requestPayloadDataDeviceAnalytics.C2());
        hashMap8.put("volume_23_duration", requestPayloadDataDeviceAnalytics.D2());
        hashMap8.put("volume_24_duration", requestPayloadDataDeviceAnalytics.E2());
        hashMap8.put("volume_25_duration", requestPayloadDataDeviceAnalytics.F2());
        hashMap8.put("volume_26_duration", requestPayloadDataDeviceAnalytics.G2());
        hashMap8.put("volume_27_duration", requestPayloadDataDeviceAnalytics.H2());
        hashMap8.put("volume_28_duration", requestPayloadDataDeviceAnalytics.I2());
        hashMap8.put("volume_29_duration", requestPayloadDataDeviceAnalytics.J2());
        hashMap8.put("volume_30_duration", requestPayloadDataDeviceAnalytics.L2());
        hashMap8.put("volume_31_duration", requestPayloadDataDeviceAnalytics.M2());
        hashMap8.put("volume_32_duration", requestPayloadDataDeviceAnalytics.N2());
        a4.put("karaok_usage", new HashMap());
        hashMap8.put("mic_1_times", requestPayloadDataDeviceAnalytics.a1());
        hashMap8.put("mic_2_times", requestPayloadDataDeviceAnalytics.c1());
        hashMap8.put("mic_1_duration", requestPayloadDataDeviceAnalytics.b1());
        hashMap8.put("mic_2_duration", requestPayloadDataDeviceAnalytics.d1());
        hashMap8.put("guitar_times", requestPayloadDataDeviceAnalytics.W());
        hashMap8.put("guitar_duration", requestPayloadDataDeviceAnalytics.X());
        hashMap8.put("popular_mic_1_volume", requestPayloadDataDeviceAnalytics.J1());
        hashMap8.put("popular_mic_2_volume", requestPayloadDataDeviceAnalytics.K1());
        hashMap8.put("popular_guitar_volume", requestPayloadDataDeviceAnalytics.I1());
        hashMap8.put("popular_bass_level", requestPayloadDataDeviceAnalytics.G1());
        hashMap8.put("popular_treble", requestPayloadDataDeviceAnalytics.L1());
        hashMap8.put("popular_echo", requestPayloadDataDeviceAnalytics.H1());
        a4.put("uac_record_times", requestPayloadDataDeviceAnalytics.g2());
        a4.put("uac_record_duration", requestPayloadDataDeviceAnalytics.f2());
        HashMap hashMap9 = new HashMap();
        a4.put("battery_info", hashMap9);
        hashMap9.put("battery_1_sn", requestPayloadDataDeviceAnalytics.t());
        hashMap9.put("battery_2_sn", requestPayloadDataDeviceAnalytics.u());
        hashMap9.put("battery_3_sn", requestPayloadDataDeviceAnalytics.v());
        hashMap9.put("battery_1_pack_model", requestPayloadDataDeviceAnalytics.p());
        hashMap9.put("battery_2_pack_model", requestPayloadDataDeviceAnalytics.q());
        hashMap9.put("battery_3_pack_model", requestPayloadDataDeviceAnalytics.r());
        hashMap9.put("battery_1_cell_connection", requestPayloadDataDeviceAnalytics.k());
        hashMap9.put("battery_2_cell_connection", requestPayloadDataDeviceAnalytics.l());
        hashMap9.put("battery_3_cell_connection", requestPayloadDataDeviceAnalytics.m());
        f.d(f55895k, "logDeviceInfo deviceAnalytics: " + new GsonBuilder().setPrettyPrinting().create().toJson(a4));
    }

    public void o(List<Map<String, Integer>> list) {
        RequestPayloadNew requestPayloadNew = this.f55901e;
        if (requestPayloadNew == null || requestPayloadNew.a() == null) {
            f.a(f55895k, "logPlayInfo requestPayload is not exist, so init current device!");
            this.f55901e = k();
        }
        if (list != null && !list.isEmpty()) {
            f.d(f55895k, "logPlayInfo data: " + list);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                Map<String, Integer> map = list.get(i4);
                if (map != null && !map.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    arrayList.add(hashMap);
                    hashMap.put("charging_status", map.get("chargingStatus"));
                    hashMap.put("volume_level", map.get("volumeLevel"));
                    hashMap.put("auracast_status", map.get("auracastStatus"));
                    hashMap.put("tws_status", map.get("twsStatus"));
                    hashMap.put("audio_status", map.get("audioInStatus"));
                    hashMap.put("eq_category_id", map.get("eqCategoryID"));
                    hashMap.put("play_duration", map.get("playDuration"));
                    hashMap.put("bass_boost", map.get("bassBoost"));
                    hashMap.put("lightshow_pattern", map.get("lightShow"));
                    hashMap.put("karaoke", map.get("karaok"));
                    hashMap.put("source", map.get("source"));
                }
            }
            Map<String, Object> a4 = this.f55901e.a().a();
            if (a4 == null) {
                a4 = new HashMap<>();
                this.f55901e.a().c(a4);
            }
            a4.put("device_play_analytics", arrayList);
            f.d(f55895k, "logPlayInfo deviceAnalytics: " + a4);
            return;
        }
        f.d(f55895k, "logPlayInfo playAnalytics: is null");
    }

    public void p(String str) {
        if (this.f55901e == null) {
            f.b(f55895k, "saveLog requestPayload is null, currentAddress: " + this.f55897a);
            return;
        }
        d.d().k(str, this.f55901e);
    }

    public JSONObject q(String str, String str2, String str3) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty(h.f23644c, String.valueOf(str3.length()));
            httpURLConnection.setRequestProperty("X-API-Key", str2);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(str3);
            dataOutputStream.flush();
            dataOutputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        f.a(f55895k, "sendPostRequest -----> current json: " + ((Object) sb));
                        return new JSONObject(sb.toString());
                    }
                }
            } else {
                throw new Exception("Error: " + responseCode);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
