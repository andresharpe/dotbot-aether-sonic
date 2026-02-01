package com.google.android.gms.common.api;

import androidx.annotation.N;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28057a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f28058b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f28059c = 2;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f28060d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28061e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28062f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28063g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f28064h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f28065i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f28066j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f28067k = 13;

    /* renamed from: l, reason: collision with root package name */
    public static final int f28068l = 14;

    /* renamed from: m, reason: collision with root package name */
    public static final int f28069m = 15;

    /* renamed from: n, reason: collision with root package name */
    public static final int f28070n = 16;

    /* renamed from: o, reason: collision with root package name */
    public static final int f28071o = 17;

    /* renamed from: p, reason: collision with root package name */
    public static final int f28072p = 19;

    /* renamed from: q, reason: collision with root package name */
    public static final int f28073q = 20;

    /* renamed from: r, reason: collision with root package name */
    public static final int f28074r = 21;

    /* renamed from: s, reason: collision with root package name */
    public static final int f28075s = 22;

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public f() {
    }

    @N
    public static String a(int i4) {
        switch (i4) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i4;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
