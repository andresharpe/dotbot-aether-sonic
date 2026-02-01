package com.spotify.sdk.android.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.C0745h;

/* loaded from: classes2.dex */
public class AuthorizationResponse implements Parcelable {
    public static final Parcelable.Creator<AuthorizationResponse> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    private final Type f48929E;

    /* renamed from: F, reason: collision with root package name */
    private final String f48930F;

    /* renamed from: G, reason: collision with root package name */
    private final String f48931G;

    /* renamed from: H, reason: collision with root package name */
    private final String f48932H;

    /* renamed from: I, reason: collision with root package name */
    private final String f48933I;

    /* renamed from: J, reason: collision with root package name */
    private final int f48934J;

    /* loaded from: classes2.dex */
    public enum Type {
        CODE(com.spotify.sdk.android.auth.a.f48965k),
        TOKEN("token"),
        ERROR("error"),
        EMPTY("empty"),
        UNKNOWN(C0745h.f12738b);

        private final String mType;

        Type(String str) {
            this.mType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<AuthorizationResponse> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthorizationResponse createFromParcel(Parcel parcel) {
            return new AuthorizationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthorizationResponse[] newArray(int i4) {
            return new AuthorizationResponse[i4];
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Type f48935a;

        /* renamed from: b, reason: collision with root package name */
        private String f48936b;

        /* renamed from: c, reason: collision with root package name */
        private String f48937c;

        /* renamed from: d, reason: collision with root package name */
        private String f48938d;

        /* renamed from: e, reason: collision with root package name */
        private String f48939e;

        /* renamed from: f, reason: collision with root package name */
        private int f48940f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AuthorizationResponse a() {
            return new AuthorizationResponse(this.f48935a, this.f48936b, this.f48937c, this.f48938d, this.f48939e, this.f48940f, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(String str) {
            this.f48937c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(String str) {
            this.f48936b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b d(String str) {
            this.f48939e = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b e(int i4) {
            this.f48940f = i4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b f(String str) {
            this.f48938d = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b g(Type type) {
            this.f48935a = type;
            return this;
        }
    }

    /* synthetic */ AuthorizationResponse(Type type, String str, String str2, String str3, String str4, int i4, a aVar) {
        this(type, str, str2, str3, str4, i4);
    }

    public static AuthorizationResponse a(Uri uri) {
        b bVar = new b();
        if (uri == null) {
            bVar.g(Type.EMPTY);
            return bVar.a();
        }
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("state");
            bVar.d(queryParameter);
            bVar.f(queryParameter2);
            bVar.g(Type.ERROR);
            return bVar.a();
        }
        String queryParameter3 = uri.getQueryParameter(com.spotify.sdk.android.auth.a.f48965k);
        if (queryParameter3 != null) {
            String queryParameter4 = uri.getQueryParameter("state");
            bVar.c(queryParameter3);
            bVar.f(queryParameter4);
            bVar.g(Type.CODE);
            return bVar.a();
        }
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null && encodedFragment.length() > 0) {
            String str = null;
            String str2 = null;
            String str3 = null;
            for (String str4 : encodedFragment.split("&")) {
                String[] split = str4.split("=");
                if (split.length == 2) {
                    if (split[0].startsWith(com.spotify.sdk.android.auth.a.f48966l)) {
                        str = Uri.decode(split[1]);
                    }
                    if (split[0].startsWith("state")) {
                        str2 = Uri.decode(split[1]);
                    }
                    if (split[0].startsWith(com.spotify.sdk.android.auth.a.f48967m)) {
                        str3 = Uri.decode(split[1]);
                    }
                }
            }
            bVar.b(str);
            bVar.f(str2);
            if (str3 != null) {
                try {
                    bVar.e(Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                }
            }
            bVar.g(Type.TOKEN);
            return bVar.a();
        }
        bVar.g(Type.UNKNOWN);
        return bVar.a();
    }

    public String b() {
        return this.f48931G;
    }

    public String c() {
        return this.f48930F;
    }

    public String d() {
        return this.f48933I;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f48934J;
    }

    public String g() {
        return this.f48932H;
    }

    public Type h() {
        return this.f48929E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f48934J);
        parcel.writeString(this.f48933I);
        parcel.writeString(this.f48932H);
        parcel.writeString(this.f48931G);
        parcel.writeString(this.f48930F);
        parcel.writeInt(this.f48929E.ordinal());
    }

    private AuthorizationResponse(Type type, String str, String str2, String str3, String str4, int i4) {
        this.f48929E = type == null ? Type.UNKNOWN : type;
        this.f48930F = str;
        this.f48931G = str2;
        this.f48932H = str3;
        this.f48933I = str4;
        this.f48934J = i4;
    }

    public AuthorizationResponse(Parcel parcel) {
        this.f48934J = parcel.readInt();
        this.f48933I = parcel.readString();
        this.f48932H = parcel.readString();
        this.f48931G = parcel.readString();
        this.f48930F = parcel.readString();
        this.f48929E = Type.values()[parcel.readInt()];
    }
}
