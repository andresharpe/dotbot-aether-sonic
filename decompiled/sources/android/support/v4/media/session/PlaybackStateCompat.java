package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.k;
import android.text.TextUtils;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {

    /* renamed from: A0, reason: collision with root package name */
    public static final int f4254A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public static final int f4255B0 = 1;

    /* renamed from: C0, reason: collision with root package name */
    public static final int f4256C0 = 2;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: D0, reason: collision with root package name */
    public static final int f4257D0 = 3;

    /* renamed from: E0, reason: collision with root package name */
    public static final int f4258E0 = -1;

    /* renamed from: F0, reason: collision with root package name */
    public static final int f4259F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    public static final int f4260G0 = 1;

    /* renamed from: H0, reason: collision with root package name */
    public static final int f4261H0 = 2;

    /* renamed from: I0, reason: collision with root package name */
    public static final int f4262I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    public static final int f4263J0 = 1;

    /* renamed from: K0, reason: collision with root package name */
    public static final int f4264K0 = 2;

    /* renamed from: L0, reason: collision with root package name */
    public static final int f4265L0 = 3;

    /* renamed from: M0, reason: collision with root package name */
    public static final int f4266M0 = 4;

    /* renamed from: N0, reason: collision with root package name */
    public static final int f4267N0 = 5;

    /* renamed from: O0, reason: collision with root package name */
    public static final int f4268O0 = 6;

    /* renamed from: P0, reason: collision with root package name */
    public static final int f4269P0 = 7;

    /* renamed from: Q, reason: collision with root package name */
    public static final long f4270Q = 1;

    /* renamed from: Q0, reason: collision with root package name */
    public static final int f4271Q0 = 8;

    /* renamed from: R, reason: collision with root package name */
    public static final long f4272R = 2;

    /* renamed from: R0, reason: collision with root package name */
    public static final int f4273R0 = 9;

    /* renamed from: S, reason: collision with root package name */
    public static final long f4274S = 4;

    /* renamed from: S0, reason: collision with root package name */
    public static final int f4275S0 = 10;

    /* renamed from: T, reason: collision with root package name */
    public static final long f4276T = 8;

    /* renamed from: T0, reason: collision with root package name */
    public static final int f4277T0 = 11;

    /* renamed from: U, reason: collision with root package name */
    public static final long f4278U = 16;

    /* renamed from: U0, reason: collision with root package name */
    private static final int f4279U0 = 127;

    /* renamed from: V, reason: collision with root package name */
    public static final long f4280V = 32;

    /* renamed from: V0, reason: collision with root package name */
    private static final int f4281V0 = 126;

    /* renamed from: W, reason: collision with root package name */
    public static final long f4282W = 64;

    /* renamed from: X, reason: collision with root package name */
    public static final long f4283X = 128;

    /* renamed from: Y, reason: collision with root package name */
    public static final long f4284Y = 256;

    /* renamed from: Z, reason: collision with root package name */
    public static final long f4285Z = 512;

    /* renamed from: a0, reason: collision with root package name */
    public static final long f4286a0 = 1024;

    /* renamed from: b0, reason: collision with root package name */
    public static final long f4287b0 = 2048;

    /* renamed from: c0, reason: collision with root package name */
    public static final long f4288c0 = 4096;

    /* renamed from: d0, reason: collision with root package name */
    public static final long f4289d0 = 8192;

    /* renamed from: e0, reason: collision with root package name */
    public static final long f4290e0 = 16384;

    /* renamed from: f0, reason: collision with root package name */
    public static final long f4291f0 = 32768;

    /* renamed from: g0, reason: collision with root package name */
    public static final long f4292g0 = 65536;

    /* renamed from: h0, reason: collision with root package name */
    public static final long f4293h0 = 131072;

    /* renamed from: i0, reason: collision with root package name */
    public static final long f4294i0 = 262144;

    /* renamed from: j0, reason: collision with root package name */
    @Deprecated
    public static final long f4295j0 = 524288;

    /* renamed from: k0, reason: collision with root package name */
    public static final long f4296k0 = 1048576;

    /* renamed from: l0, reason: collision with root package name */
    public static final long f4297l0 = 2097152;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f4298m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f4299n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f4300o0 = 2;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f4301p0 = 3;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f4302q0 = 4;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f4303r0 = 5;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f4304s0 = 6;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f4305t0 = 7;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f4306u0 = 8;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f4307v0 = 9;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f4308w0 = 10;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f4309x0 = 11;

    /* renamed from: y0, reason: collision with root package name */
    public static final long f4310y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f4311z0 = -1;

    /* renamed from: E, reason: collision with root package name */
    final int f4312E;

    /* renamed from: F, reason: collision with root package name */
    final long f4313F;

    /* renamed from: G, reason: collision with root package name */
    final long f4314G;

    /* renamed from: H, reason: collision with root package name */
    final float f4315H;

    /* renamed from: I, reason: collision with root package name */
    final long f4316I;

    /* renamed from: J, reason: collision with root package name */
    final int f4317J;

    /* renamed from: K, reason: collision with root package name */
    final CharSequence f4318K;

    /* renamed from: L, reason: collision with root package name */
    final long f4319L;

    /* renamed from: M, reason: collision with root package name */
    List<CustomAction> f4320M;

    /* renamed from: N, reason: collision with root package name */
    final long f4321N;

    /* renamed from: O, reason: collision with root package name */
    final Bundle f4322O;

    /* renamed from: P, reason: collision with root package name */
    private Object f4323P;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i4) {
            return new PlaybackStateCompat[i4];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface h {
    }

    PlaybackStateCompat(int i4, long j4, long j5, float f4, long j6, int i5, CharSequence charSequence, long j7, List<CustomAction> list, long j8, Bundle bundle) {
        this.f4312E = i4;
        this.f4313F = j4;
        this.f4314G = j5;
        this.f4315H = f4;
        this.f4316I = j6;
        this.f4317J = i5;
        this.f4318K = charSequence;
        this.f4319L = j7;
        this.f4320M = new ArrayList(list);
        this.f4321N = j8;
        this.f4322O = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        List<Object> d4 = k.d(obj);
        if (d4 != null) {
            arrayList = new ArrayList(d4.size());
            Iterator<Object> it = d4.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle a4 = l.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(k.i(obj), k.h(obj), k.c(obj), k.g(obj), k.a(obj), 0, k.e(obj), k.f(obj), arrayList, k.b(obj), a4);
        playbackStateCompat.f4323P = obj;
        return playbackStateCompat;
    }

    public static int s(long j4) {
        if (j4 == 4) {
            return f4281V0;
        }
        if (j4 == 2) {
            return 127;
        }
        if (j4 == 32) {
            return 87;
        }
        if (j4 == 16) {
            return 88;
        }
        if (j4 == 1) {
            return 86;
        }
        if (j4 == 64) {
            return 90;
        }
        if (j4 == 8) {
            return 89;
        }
        return j4 == 512 ? 85 : 0;
    }

    public long b() {
        return this.f4316I;
    }

    public long c() {
        return this.f4321N;
    }

    public long d() {
        return this.f4314G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long e(Long l4) {
        long elapsedRealtime;
        long j4 = this.f4313F;
        float f4 = this.f4315H;
        if (l4 != null) {
            elapsedRealtime = l4.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.f4319L;
        }
        return Math.max(0L, j4 + (f4 * ((float) elapsedRealtime)));
    }

    public List<CustomAction> g() {
        return this.f4320M;
    }

    public int h() {
        return this.f4317J;
    }

    public CharSequence i() {
        return this.f4318K;
    }

    @P
    public Bundle l() {
        return this.f4322O;
    }

    public long m() {
        return this.f4319L;
    }

    public float n() {
        return this.f4315H;
    }

    public Object o() {
        ArrayList arrayList;
        if (this.f4323P == null) {
            if (this.f4320M != null) {
                arrayList = new ArrayList(this.f4320M.size());
                Iterator<CustomAction> it = this.f4320M.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            } else {
                arrayList = null;
            }
            this.f4323P = l.b(this.f4312E, this.f4313F, this.f4314G, this.f4315H, this.f4316I, this.f4318K, this.f4319L, arrayList, this.f4321N, this.f4322O);
        }
        return this.f4323P;
    }

    public long q() {
        return this.f4313F;
    }

    public int r() {
        return this.f4312E;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f4312E + ", position=" + this.f4313F + ", buffered position=" + this.f4314G + ", speed=" + this.f4315H + ", updated=" + this.f4319L + ", actions=" + this.f4316I + ", error code=" + this.f4317J + ", error message=" + this.f4318K + ", custom actions=" + this.f4320M + ", active item id=" + this.f4321N + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4312E);
        parcel.writeLong(this.f4313F);
        parcel.writeFloat(this.f4315H);
        parcel.writeLong(this.f4319L);
        parcel.writeLong(this.f4314G);
        parcel.writeLong(this.f4316I);
        TextUtils.writeToParcel(this.f4318K, parcel, i4);
        parcel.writeTypedList(this.f4320M);
        parcel.writeLong(this.f4321N);
        parcel.writeBundle(this.f4322O);
        parcel.writeInt(this.f4317J);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<CustomAction> f4333a;

        /* renamed from: b, reason: collision with root package name */
        private int f4334b;

        /* renamed from: c, reason: collision with root package name */
        private long f4335c;

        /* renamed from: d, reason: collision with root package name */
        private long f4336d;

        /* renamed from: e, reason: collision with root package name */
        private float f4337e;

        /* renamed from: f, reason: collision with root package name */
        private long f4338f;

        /* renamed from: g, reason: collision with root package name */
        private int f4339g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f4340h;

        /* renamed from: i, reason: collision with root package name */
        private long f4341i;

        /* renamed from: j, reason: collision with root package name */
        private long f4342j;

        /* renamed from: k, reason: collision with root package name */
        private Bundle f4343k;

        public c() {
            this.f4333a = new ArrayList();
            this.f4342j = -1L;
        }

        public c a(CustomAction customAction) {
            if (customAction != null) {
                this.f4333a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        public c b(String str, String str2, int i4) {
            return a(new CustomAction(str, str2, i4, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.f4334b, this.f4335c, this.f4336d, this.f4337e, this.f4338f, this.f4339g, this.f4340h, this.f4341i, this.f4333a, this.f4342j, this.f4343k);
        }

        public c d(long j4) {
            this.f4338f = j4;
            return this;
        }

        public c e(long j4) {
            this.f4342j = j4;
            return this;
        }

        public c f(long j4) {
            this.f4336d = j4;
            return this;
        }

        public c g(int i4, CharSequence charSequence) {
            this.f4339g = i4;
            this.f4340h = charSequence;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f4340h = charSequence;
            return this;
        }

        public c i(Bundle bundle) {
            this.f4343k = bundle;
            return this;
        }

        public c j(int i4, long j4, float f4) {
            return k(i4, j4, f4, SystemClock.elapsedRealtime());
        }

        public c k(int i4, long j4, float f4, long j5) {
            this.f4334b = i4;
            this.f4335c = j4;
            this.f4341i = j5;
            this.f4337e = f4;
            return this;
        }

        public c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f4333a = arrayList;
            this.f4342j = -1L;
            this.f4334b = playbackStateCompat.f4312E;
            this.f4335c = playbackStateCompat.f4313F;
            this.f4337e = playbackStateCompat.f4315H;
            this.f4341i = playbackStateCompat.f4319L;
            this.f4336d = playbackStateCompat.f4314G;
            this.f4338f = playbackStateCompat.f4316I;
            this.f4339g = playbackStateCompat.f4317J;
            this.f4340h = playbackStateCompat.f4318K;
            List<CustomAction> list = playbackStateCompat.f4320M;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f4342j = playbackStateCompat.f4321N;
            this.f4343k = playbackStateCompat.f4322O;
        }
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        private final String f4324E;

        /* renamed from: F, reason: collision with root package name */
        private final CharSequence f4325F;

        /* renamed from: G, reason: collision with root package name */
        private final int f4326G;

        /* renamed from: H, reason: collision with root package name */
        private final Bundle f4327H;

        /* renamed from: I, reason: collision with root package name */
        private Object f4328I;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i4) {
                return new CustomAction[i4];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final String f4329a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f4330b;

            /* renamed from: c, reason: collision with root package name */
            private final int f4331c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f4332d;

            public b(String str, CharSequence charSequence, int i4) {
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (i4 != 0) {
                            this.f4329a = str;
                            this.f4330b = charSequence;
                            this.f4331c = i4;
                            return;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                    }
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
            }

            public CustomAction a() {
                return new CustomAction(this.f4329a, this.f4330b, this.f4331c, this.f4332d);
            }

            public b b(Bundle bundle) {
                this.f4332d = bundle;
                return this;
            }
        }

        CustomAction(String str, CharSequence charSequence, int i4, Bundle bundle) {
            this.f4324E = str;
            this.f4325F = charSequence;
            this.f4326G = i4;
            this.f4327H = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(k.a.a(obj), k.a.d(obj), k.a.c(obj), k.a.b(obj));
                customAction.f4328I = obj;
                return customAction;
            }
            return null;
        }

        public String b() {
            return this.f4324E;
        }

        public Object c() {
            Object obj = this.f4328I;
            if (obj == null) {
                Object e4 = k.a.e(this.f4324E, this.f4325F, this.f4326G, this.f4327H);
                this.f4328I = e4;
                return e4;
            }
            return obj;
        }

        public Bundle d() {
            return this.f4327H;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.f4326G;
        }

        public CharSequence g() {
            return this.f4325F;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f4325F) + ", mIcon=" + this.f4326G + ", mExtras=" + this.f4327H;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f4324E);
            TextUtils.writeToParcel(this.f4325F, parcel, i4);
            parcel.writeInt(this.f4326G);
            parcel.writeBundle(this.f4327H);
        }

        CustomAction(Parcel parcel) {
            this.f4324E = parcel.readString();
            this.f4325F = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4326G = parcel.readInt();
            this.f4327H = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f4312E = parcel.readInt();
        this.f4313F = parcel.readLong();
        this.f4315H = parcel.readFloat();
        this.f4319L = parcel.readLong();
        this.f4314G = parcel.readLong();
        this.f4316I = parcel.readLong();
        this.f4318K = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4320M = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4321N = parcel.readLong();
        this.f4322O = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f4317J = parcel.readInt();
    }
}
