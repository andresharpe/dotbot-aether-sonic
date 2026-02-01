package com.spotify.sdk.android.auth;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: M, reason: collision with root package name */
    static final String f48991M = "https";

    /* renamed from: N, reason: collision with root package name */
    static final String f48992N = "accounts.spotify.com";

    /* renamed from: O, reason: collision with root package name */
    static final String f48993O = "authorize";

    /* renamed from: P, reason: collision with root package name */
    static final String f48994P = " ";

    /* renamed from: Q, reason: collision with root package name */
    static final String f48995Q = "spotify-sdk";

    /* renamed from: R, reason: collision with root package name */
    static final String f48996R = "android-sdk";

    /* renamed from: E, reason: collision with root package name */
    private final String f48997E;

    /* renamed from: F, reason: collision with root package name */
    private final String f48998F;

    /* renamed from: G, reason: collision with root package name */
    private final String f48999G;

    /* renamed from: H, reason: collision with root package name */
    private final String f49000H;

    /* renamed from: I, reason: collision with root package name */
    private final String[] f49001I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f49002J;

    /* renamed from: K, reason: collision with root package name */
    private final Map<String, String> f49003K;

    /* renamed from: L, reason: collision with root package name */
    private final String f49004L;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i4) {
            return new d[i4];
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f49005a;

        /* renamed from: b, reason: collision with root package name */
        private final AuthorizationResponse.Type f49006b;

        /* renamed from: c, reason: collision with root package name */
        private final String f49007c;

        /* renamed from: d, reason: collision with root package name */
        private String f49008d;

        /* renamed from: e, reason: collision with root package name */
        private String[] f49009e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f49010f;

        /* renamed from: g, reason: collision with root package name */
        private String f49011g;

        /* renamed from: h, reason: collision with root package name */
        private final Map<String, String> f49012h = new HashMap();

        public b(String str, AuthorizationResponse.Type type, String str2) {
            if (str != null) {
                if (type != null) {
                    if (str2 != null && str2.length() != 0) {
                        this.f49005a = str;
                        this.f49006b = type;
                        this.f49007c = str2;
                        return;
                    }
                    throw new IllegalArgumentException("Redirect URI can't be null or empty");
                }
                throw new IllegalArgumentException("Response type can't be null");
            }
            throw new IllegalArgumentException("Client ID can't be null");
        }

        public d a() {
            return new d(this.f49005a, this.f49006b, this.f49007c, this.f49008d, this.f49009e, this.f49010f, this.f49012h, this.f49011g, null);
        }

        public b b(String str) {
            this.f49011g = str;
            return this;
        }

        public b c(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    this.f49012h.put(str, str2);
                    return this;
                }
                throw new IllegalArgumentException("Custom parameter value can't be null or empty");
            }
            throw new IllegalArgumentException("Custom parameter key can't be null or empty");
        }

        public b d(String[] strArr) {
            this.f49009e = strArr;
            return this;
        }

        public b e(boolean z3) {
            this.f49010f = z3;
            return this;
        }

        public b f(String str) {
            this.f49008d = str;
            return this;
        }
    }

    /* synthetic */ d(String str, AuthorizationResponse.Type type, String str2, String str3, String[] strArr, boolean z3, Map map, String str4, a aVar) {
        this(str, type, str2, str3, strArr, z3, map, str4);
    }

    private String i() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f49001I) {
            sb.append(str);
            sb.append(f48994P);
        }
        return sb.toString().trim();
    }

    public String a() {
        if (TextUtils.isEmpty(this.f49004L)) {
            return f48996R;
        }
        return this.f49004L;
    }

    public String b() {
        return this.f48997E;
    }

    public String c(String str) {
        return this.f49003K.get(str);
    }

    public String d() {
        return this.f48999G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f48998F;
    }

    public String[] g() {
        return this.f49001I;
    }

    public String h() {
        return this.f49000H;
    }

    public Uri l() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(f48991M).authority(f48992N).appendPath(f48993O).appendQueryParameter(com.spotify.sdk.android.auth.a.f48955a, this.f48997E).appendQueryParameter(com.spotify.sdk.android.auth.a.f48956b, this.f48998F).appendQueryParameter("redirect_uri", this.f48999G).appendQueryParameter(com.spotify.sdk.android.auth.a.f48960f, String.valueOf(this.f49002J)).appendQueryParameter("utm_source", f48995Q).appendQueryParameter("utm_medium", f48996R).appendQueryParameter("utm_campaign", a());
        String[] strArr = this.f49001I;
        if (strArr != null && strArr.length > 0) {
            builder.appendQueryParameter(com.spotify.sdk.android.auth.a.f48959e, i());
        }
        String str = this.f49000H;
        if (str != null) {
            builder.appendQueryParameter("state", str);
        }
        if (this.f49003K.size() > 0) {
            for (Map.Entry<String, String> entry : this.f49003K.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f48997E);
        parcel.writeString(this.f48998F);
        parcel.writeString(this.f48999G);
        parcel.writeString(this.f49000H);
        parcel.writeStringArray(this.f49001I);
        parcel.writeByte(this.f49002J ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f49004L);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.f49003K.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
    }

    public d(Parcel parcel) {
        this.f48997E = parcel.readString();
        this.f48998F = parcel.readString();
        this.f48999G = parcel.readString();
        this.f49000H = parcel.readString();
        this.f49001I = parcel.createStringArray();
        this.f49002J = parcel.readByte() == 1;
        this.f49003K = new HashMap();
        this.f49004L = parcel.readString();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : readBundle.keySet()) {
            this.f49003K.put(str, readBundle.getString(str));
        }
    }

    private d(String str, AuthorizationResponse.Type type, String str2, String str3, String[] strArr, boolean z3, Map<String, String> map, String str4) {
        this.f48997E = str;
        this.f48998F = type.toString();
        this.f48999G = str2;
        this.f49000H = str3;
        this.f49001I = strArr;
        this.f49002J = z3;
        this.f49003K = map;
        this.f49004L = str4;
    }
}
