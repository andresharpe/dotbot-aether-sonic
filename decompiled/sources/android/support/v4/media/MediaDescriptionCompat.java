package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.text.TextUtils;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: N, reason: collision with root package name */
    public static final String f3959N = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: O, reason: collision with root package name */
    public static final long f3960O = 0;

    /* renamed from: P, reason: collision with root package name */
    public static final long f3961P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public static final long f3962Q = 2;

    /* renamed from: R, reason: collision with root package name */
    public static final long f3963R = 3;

    /* renamed from: S, reason: collision with root package name */
    public static final long f3964S = 4;

    /* renamed from: T, reason: collision with root package name */
    public static final long f3965T = 5;

    /* renamed from: U, reason: collision with root package name */
    public static final long f3966U = 6;

    /* renamed from: V, reason: collision with root package name */
    public static final String f3967V = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: W, reason: collision with root package name */
    public static final long f3968W = 0;

    /* renamed from: X, reason: collision with root package name */
    public static final long f3969X = 1;

    /* renamed from: Y, reason: collision with root package name */
    public static final long f3970Y = 2;

    /* renamed from: Z, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f3971Z = "android.support.v4.media.description.MEDIA_URI";

    /* renamed from: a0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f3972a0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: E, reason: collision with root package name */
    private final String f3973E;

    /* renamed from: F, reason: collision with root package name */
    private final CharSequence f3974F;

    /* renamed from: G, reason: collision with root package name */
    private final CharSequence f3975G;

    /* renamed from: H, reason: collision with root package name */
    private final CharSequence f3976H;

    /* renamed from: I, reason: collision with root package name */
    private final Bitmap f3977I;

    /* renamed from: J, reason: collision with root package name */
    private final Uri f3978J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f3979K;

    /* renamed from: L, reason: collision with root package name */
    private final Uri f3980L;

    /* renamed from: M, reason: collision with root package name */
    private Object f3981M;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(d.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i4) {
            return new MediaDescriptionCompat[i4];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f3982a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f3983b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f3984c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f3985d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f3986e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f3987f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f3988g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f3989h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f3982a, this.f3983b, this.f3984c, this.f3985d, this.f3986e, this.f3987f, this.f3988g, this.f3989h);
        }

        public b b(@P CharSequence charSequence) {
            this.f3985d = charSequence;
            return this;
        }

        public b c(@P Bundle bundle) {
            this.f3988g = bundle;
            return this;
        }

        public b d(@P Bitmap bitmap) {
            this.f3986e = bitmap;
            return this;
        }

        public b e(@P Uri uri) {
            this.f3987f = uri;
            return this;
        }

        public b f(@P String str) {
            this.f3982a = str;
            return this;
        }

        public b g(@P Uri uri) {
            this.f3989h = uri;
            return this;
        }

        public b h(@P CharSequence charSequence) {
            this.f3984c = charSequence;
            return this;
        }

        public b i(@P CharSequence charSequence) {
            this.f3983b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3973E = str;
        this.f3974F = charSequence;
        this.f3975G = charSequence2;
        this.f3976H = charSequence3;
        this.f3977I = bitmap;
        this.f3978J = uri;
        this.f3979K = bundle;
        this.f3980L = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L74
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.d.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.d.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.d.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.d.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L44
            android.support.v4.media.session.MediaSessionCompat.b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L45
        L44:
            r4 = r0
        L45:
            if (r4 == 0) goto L5d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L57
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L57
            goto L5e
        L57:
            r2.remove(r3)
            r2.remove(r5)
        L5d:
            r0 = r2
        L5e:
            r1.c(r0)
            if (r4 == 0) goto L67
            r1.g(r4)
            goto L6e
        L67:
            android.net.Uri r0 = android.support.v4.media.e.a(r8)
            r1.g(r0)
        L6e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f3981M = r8
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @P
    public CharSequence b() {
        return this.f3976H;
    }

    @P
    public Bundle c() {
        return this.f3979K;
    }

    @P
    public Bitmap d() {
        return this.f3977I;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @P
    public Uri e() {
        return this.f3978J;
    }

    public Object g() {
        Object obj = this.f3981M;
        if (obj == null) {
            Object b4 = d.a.b();
            d.a.g(b4, this.f3973E);
            d.a.i(b4, this.f3974F);
            d.a.h(b4, this.f3975G);
            d.a.c(b4, this.f3976H);
            d.a.e(b4, this.f3977I);
            d.a.f(b4, this.f3978J);
            d.a.d(b4, this.f3979K);
            e.a.a(b4, this.f3980L);
            Object a4 = d.a.a(b4);
            this.f3981M = a4;
            return a4;
        }
        return obj;
    }

    @P
    public String h() {
        return this.f3973E;
    }

    @P
    public Uri i() {
        return this.f3980L;
    }

    @P
    public CharSequence l() {
        return this.f3975G;
    }

    @P
    public CharSequence m() {
        return this.f3974F;
    }

    public String toString() {
        return ((Object) this.f3974F) + ", " + ((Object) this.f3975G) + ", " + ((Object) this.f3976H);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        d.i(g(), parcel, i4);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f3973E = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3974F = (CharSequence) creator.createFromParcel(parcel);
        this.f3975G = (CharSequence) creator.createFromParcel(parcel);
        this.f3976H = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f3977I = (Bitmap) parcel.readParcelable(classLoader);
        this.f3978J = (Uri) parcel.readParcelable(classLoader);
        this.f3979K = parcel.readBundle(classLoader);
        this.f3980L = (Uri) parcel.readParcelable(classLoader);
    }
}
