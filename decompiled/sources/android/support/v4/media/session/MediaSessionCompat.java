package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.g;
import android.support.v4.media.session.i;
import android.support.v4.media.session.j;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.C0635k;
import androidx.media.i;
import androidx.media.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: A, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4100A = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    /* renamed from: B, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4101B = "android.support.v4.media.session.action.ARGUMENT_URI";

    /* renamed from: C, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4102C = "android.support.v4.media.session.action.ARGUMENT_RATING";

    /* renamed from: D, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4103D = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    /* renamed from: E, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4104E = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    /* renamed from: F, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4105F = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    /* renamed from: G, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4106G = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    /* renamed from: H, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f4107H = "android.support.v4.media.session.TOKEN";

    /* renamed from: I, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4108I = "android.support.v4.media.session.EXTRA_BINDER";

    /* renamed from: J, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f4109J = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    /* renamed from: K, reason: collision with root package name */
    private static final int f4110K = 320;

    /* renamed from: L, reason: collision with root package name */
    private static final String f4111L = "data_calling_pkg";

    /* renamed from: M, reason: collision with root package name */
    private static final String f4112M = "data_calling_pid";

    /* renamed from: N, reason: collision with root package name */
    private static final String f4113N = "data_calling_uid";

    /* renamed from: O, reason: collision with root package name */
    private static final String f4114O = "data_extras";

    /* renamed from: P, reason: collision with root package name */
    static int f4115P = 0;

    /* renamed from: d, reason: collision with root package name */
    static final String f4116d = "MediaSessionCompat";

    /* renamed from: e, reason: collision with root package name */
    public static final int f4117e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4118f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4119g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final String f4120h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: i, reason: collision with root package name */
    public static final String f4121i = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: j, reason: collision with root package name */
    public static final String f4122j = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: k, reason: collision with root package name */
    public static final String f4123k = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: l, reason: collision with root package name */
    public static final String f4124l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: m, reason: collision with root package name */
    public static final String f4125m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: n, reason: collision with root package name */
    public static final int f4126n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4127o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4128p = 2;

    /* renamed from: q, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4129q = "android.support.v4.media.session.action.PLAY_FROM_URI";

    /* renamed from: r, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4130r = "android.support.v4.media.session.action.PREPARE";

    /* renamed from: s, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4131s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    /* renamed from: t, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4132t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    /* renamed from: u, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4133u = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    /* renamed from: v, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4134v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    /* renamed from: w, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4135w = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    /* renamed from: x, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4136x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";

    /* renamed from: y, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4137y = "android.support.v4.media.session.action.SET_RATING";

    /* renamed from: z, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4138z = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: a, reason: collision with root package name */
    private final e f4139a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaControllerCompat f4140b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<k> f4141c;

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: H, reason: collision with root package name */
        public static final int f4142H = -1;

        /* renamed from: E, reason: collision with root package name */
        private final MediaDescriptionCompat f4143E;

        /* renamed from: F, reason: collision with root package name */
        private final long f4144F;

        /* renamed from: G, reason: collision with root package name */
        private Object f4145G;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i4) {
                return new QueueItem[i4];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j4) {
            this(null, mediaDescriptionCompat, j4);
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(g.c.b(obj)), g.c.c(obj));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        public MediaDescriptionCompat c() {
            return this.f4143E;
        }

        public long d() {
            return this.f4144F;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            Object obj = this.f4145G;
            if (obj == null) {
                Object a4 = g.c.a(this.f4143E.g(), this.f4144F);
                this.f4145G = a4;
                return a4;
            }
            return obj;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f4143E + ", Id=" + this.f4144F + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            this.f4143E.writeToParcel(parcel, i4);
            parcel.writeLong(this.f4144F);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j4) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j4 != -1) {
                this.f4143E = mediaDescriptionCompat;
                this.f4144F = j4;
                this.f4145G = obj;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        QueueItem(Parcel parcel) {
            this.f4143E = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f4144F = parcel.readLong();
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        private final Object f4147E;

        /* renamed from: F, reason: collision with root package name */
        private android.support.v4.media.session.b f4148F;

        /* renamed from: G, reason: collision with root package name */
        private Bundle f4149G;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i4) {
                return new Token[i4];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.support.v4.media.session.b v3 = b.a.v(C0635k.a(bundle, MediaSessionCompat.f4108I));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f4109J);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.f4107H);
            if (token == null) {
                return null;
            }
            return new Token(token.f4147E, v3, bundle2);
        }

        public static Token b(Object obj) {
            return c(obj, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token c(Object obj, android.support.v4.media.session.b bVar) {
            if (obj != null) {
                return new Token(android.support.v4.media.session.g.u(obj), bVar);
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public android.support.v4.media.session.b d() {
            return this.f4148F;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle e() {
            return this.f4149G;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f4147E;
            if (obj2 == null) {
                if (token.f4147E == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f4147E;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Object g() {
            return this.f4147E;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void h(android.support.v4.media.session.b bVar) {
            this.f4148F = bVar;
        }

        public int hashCode() {
            Object obj = this.f4147E;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void i(Bundle bundle) {
            this.f4149G = bundle;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle l() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.f4107H, this);
            android.support.v4.media.session.b bVar = this.f4148F;
            if (bVar != null) {
                C0635k.b(bundle, MediaSessionCompat.f4108I, bVar.asBinder());
            }
            Bundle bundle2 = this.f4149G;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.f4109J, bundle2);
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeParcelable((Parcelable) this.f4147E, i4);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, Bundle bundle) {
            this.f4147E = obj;
            this.f4148F = bVar;
            this.f4149G = bundle;
        }
    }

    /* loaded from: classes.dex */
    class a extends d {
        a() {
        }
    }

    /* loaded from: classes.dex */
    class b extends d {
        b() {
        }
    }

    /* loaded from: classes.dex */
    class c extends d {
        c() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: b, reason: collision with root package name */
        WeakReference<e> f4154b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4156d;

        /* renamed from: c, reason: collision with root package name */
        private a f4155c = null;

        /* renamed from: a, reason: collision with root package name */
        final Object f4153a = android.support.v4.media.session.j.a(new C0029d());

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a extends Handler {

            /* renamed from: b, reason: collision with root package name */
            private static final int f4157b = 1;

            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    d.this.a((i.b) message.obj);
                }
            }
        }

        @W(21)
        /* loaded from: classes.dex */
        private class b implements g.a {
            b() {
            }

            @Override // android.support.v4.media.session.g.a
            public void a() {
                d.this.C();
            }

            @Override // android.support.v4.media.session.g.a
            public void c() {
                d.this.h();
            }

            @Override // android.support.v4.media.session.g.a
            public void d() {
                d.this.z();
            }

            @Override // android.support.v4.media.session.g.a
            public void e() {
                d.this.s();
            }

            @Override // android.support.v4.media.session.g.a
            public void f(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.f4052e)) {
                        h hVar = (h) d.this.f4154b.get();
                        if (hVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token b4 = hVar.b();
                            android.support.v4.media.session.b d4 = b4.d();
                            if (d4 != null) {
                                asBinder = d4.asBinder();
                            }
                            C0635k.b(bundle2, MediaSessionCompat.f4108I, asBinder);
                            bundle2.putBundle(MediaSessionCompat.f4109J, b4.e());
                            resultReceiver.send(0, bundle2);
                            return;
                        }
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f4053f)) {
                        d.this.b((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f4057j));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f4054g)) {
                        d.this.c((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f4057j), bundle.getInt(MediaControllerCompat.f4058k));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f4055h)) {
                        d.this.q((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f4057j));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f4056i)) {
                        h hVar2 = (h) d.this.f4154b.get();
                        if (hVar2 != null && hVar2.f4170f != null) {
                            int i4 = bundle.getInt(MediaControllerCompat.f4058k, -1);
                            if (i4 >= 0 && i4 < hVar2.f4170f.size()) {
                                queueItem = hVar2.f4170f.get(i4);
                            }
                            if (queueItem != null) {
                                d.this.q(queueItem.c());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    d.this.d(str, bundle, resultReceiver);
                } catch (BadParcelableException unused) {
                    Log.e(MediaSessionCompat.f4116d, "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.g.a
            public void g(long j4) {
                d.this.B(j4);
            }

            @Override // android.support.v4.media.session.g.a
            public void h(Object obj) {
                d.this.v(RatingCompat.a(obj));
            }

            @Override // android.support.v4.media.session.g.a
            public void i() {
                d.this.i();
            }

            @Override // android.support.v4.media.session.g.a
            public void j() {
                d.this.A();
            }

            @Override // android.support.v4.media.session.g.a
            public boolean k(Intent intent) {
                return d.this.g(intent);
            }

            @Override // android.support.v4.media.session.g.a
            public void n(Object obj, Bundle bundle) {
            }

            @Override // android.support.v4.media.session.g.a
            public void o(String str, Bundle bundle) {
                d.this.k(str, bundle);
            }

            @Override // android.support.v4.media.session.g.a
            public void p(String str, Bundle bundle) {
                d.this.j(str, bundle);
            }

            @Override // android.support.v4.media.session.g.a
            public void q() {
                d.this.f();
            }

            @Override // android.support.v4.media.session.g.a
            public void r(long j4) {
                d.this.t(j4);
            }

            @Override // android.support.v4.media.session.g.a
            public void s(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f4103D);
                MediaSessionCompat.b(bundle2);
                if (str.equals(MediaSessionCompat.f4129q)) {
                    d.this.l((Uri) bundle.getParcelable(MediaSessionCompat.f4101B), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f4130r)) {
                    d.this.m();
                    return;
                }
                if (str.equals(MediaSessionCompat.f4131s)) {
                    d.this.n(bundle.getString(MediaSessionCompat.f4138z), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f4132t)) {
                    d.this.o(bundle.getString(MediaSessionCompat.f4100A), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f4133u)) {
                    d.this.p((Uri) bundle.getParcelable(MediaSessionCompat.f4101B), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f4134v)) {
                    d.this.u(bundle.getBoolean(MediaSessionCompat.f4104E));
                    return;
                }
                if (str.equals(MediaSessionCompat.f4135w)) {
                    d.this.x(bundle.getInt(MediaSessionCompat.f4105F));
                } else if (str.equals(MediaSessionCompat.f4136x)) {
                    d.this.y(bundle.getInt(MediaSessionCompat.f4106G));
                } else if (str.equals(MediaSessionCompat.f4137y)) {
                    d.this.w((RatingCompat) bundle.getParcelable(MediaSessionCompat.f4102C), bundle2);
                } else {
                    d.this.e(str, bundle);
                }
            }
        }

        @W(23)
        /* loaded from: classes.dex */
        private class c extends b implements i.a {
            c() {
                super();
            }

            @Override // android.support.v4.media.session.i.a
            public void u(Uri uri, Bundle bundle) {
                d.this.l(uri, bundle);
            }
        }

        @W(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0029d extends c implements j.a {
            C0029d() {
                super();
            }

            @Override // android.support.v4.media.session.j.a
            public void b(String str, Bundle bundle) {
                d.this.n(str, bundle);
            }

            @Override // android.support.v4.media.session.j.a
            public void l() {
                d.this.m();
            }

            @Override // android.support.v4.media.session.j.a
            public void m(Uri uri, Bundle bundle) {
                d.this.p(uri, bundle);
            }

            @Override // android.support.v4.media.session.j.a
            public void t(String str, Bundle bundle) {
                d.this.o(str, bundle);
            }
        }

        public void A() {
        }

        public void B(long j4) {
        }

        public void C() {
        }

        void D(e eVar, Handler handler) {
            this.f4154b = new WeakReference<>(eVar);
            a aVar = this.f4155c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f4155c = new a(handler.getLooper());
        }

        void a(i.b bVar) {
            long b4;
            boolean z3;
            boolean z4;
            if (!this.f4156d) {
                return;
            }
            boolean z5 = false;
            this.f4156d = false;
            this.f4155c.removeMessages(1);
            e eVar = this.f4154b.get();
            if (eVar == null) {
                return;
            }
            PlaybackStateCompat f4 = eVar.f();
            if (f4 == null) {
                b4 = 0;
            } else {
                b4 = f4.b();
            }
            if (f4 != null && f4.r() == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((516 & b4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((b4 & 514) != 0) {
                z5 = true;
            }
            eVar.r(bVar);
            if (z3 && z5) {
                h();
            } else if (!z3 && z4) {
                i();
            }
            eVar.r(null);
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            e eVar;
            KeyEvent keyEvent;
            long b4;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = this.f4154b.get()) == null || this.f4155c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            i.b w3 = eVar.w();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(w3);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(w3);
            } else if (this.f4156d) {
                this.f4155c.removeMessages(1);
                this.f4156d = false;
                PlaybackStateCompat f4 = eVar.f();
                if (f4 == null) {
                    b4 = 0;
                } else {
                    b4 = f4.b();
                }
                if ((b4 & 32) != 0) {
                    z();
                }
            } else {
                this.f4156d = true;
                a aVar = this.f4155c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, w3), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void r(int i4) {
        }

        public void s() {
        }

        public void t(long j4) {
        }

        public void u(boolean z3) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i4) {
        }

        public void y(int i4) {
        }

        public void z() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void D(int i4);

        Token b();

        boolean c();

        void d(int i4);

        void e(String str, Bundle bundle);

        PlaybackStateCompat f();

        String g();

        void h(PendingIntent pendingIntent);

        void i(d dVar, Handler handler);

        void j(int i4);

        void k(CharSequence charSequence);

        void l(MediaMetadataCompat mediaMetadataCompat);

        void m(PendingIntent pendingIntent);

        void n(int i4);

        void o(List<QueueItem> list);

        Object p();

        void q(boolean z3);

        void r(i.b bVar);

        void release();

        void s(PlaybackStateCompat playbackStateCompat);

        void setExtras(Bundle bundle);

        void t(boolean z3);

        Object u();

        void v(t tVar);

        i.b w();

        void z(int i4);
    }

    @W(18)
    /* loaded from: classes.dex */
    static class f extends j {

        /* renamed from: I, reason: collision with root package name */
        private static boolean f4162I = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j4) {
                f.this.B(18, -1, -1, Long.valueOf(j4), null);
            }
        }

        f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        int A(long j4) {
            int A3 = super.A(j4);
            if ((j4 & 256) != 0) {
                return A3 | 256;
            }
            return A3;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void C(PendingIntent pendingIntent, ComponentName componentName) {
            if (f4162I) {
                try {
                    this.f4192h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w(MediaSessionCompat.f4116d, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f4162I = false;
                }
            }
            if (!f4162I) {
                super.C(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void P(PlaybackStateCompat playbackStateCompat) {
            long q4 = playbackStateCompat.q();
            float n4 = playbackStateCompat.n();
            long m4 = playbackStateCompat.m();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.r() == 3) {
                long j4 = 0;
                if (q4 > 0) {
                    if (m4 > 0) {
                        j4 = elapsedRealtime - m4;
                        if (n4 > 0.0f && n4 != 1.0f) {
                            j4 = ((float) j4) * n4;
                        }
                    }
                    q4 += j4;
                }
            }
            this.f4193i.setPlaybackState(y(playbackStateCompat.r()), q4, n4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void R(PendingIntent pendingIntent, ComponentName componentName) {
            if (f4162I) {
                this.f4192h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.R(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.e
        public void i(d dVar, Handler handler) {
            super.i(dVar, handler);
            if (dVar == null) {
                this.f4193i.setPlaybackPositionUpdateListener(null);
            } else {
                this.f4193i.setPlaybackPositionUpdateListener(new a());
            }
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    static class g extends f {

        /* loaded from: classes.dex */
        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i4, Object obj) {
                if (i4 == 268435457 && (obj instanceof Rating)) {
                    g.this.B(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.j
        int A(long j4) {
            int A3 = super.A(j4);
            if ((j4 & 128) != 0) {
                return A3 | 512;
            }
            return A3;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.e
        public void i(d dVar, Handler handler) {
            super.i(dVar, handler);
            if (dVar == null) {
                this.f4193i.setMetadataUpdateListener(null);
            } else {
                this.f4193i.setMetadataUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        RemoteControlClient.MetadataEditor x(Bundle bundle) {
            long b4;
            RemoteControlClient.MetadataEditor x3 = super.x(bundle);
            PlaybackStateCompat playbackStateCompat = this.f4205u;
            if (playbackStateCompat == null) {
                b4 = 0;
            } else {
                b4 = playbackStateCompat.b();
            }
            if ((b4 & 128) != 0) {
                x3.addEditableKey(268435457);
            }
            if (bundle == null) {
                return x3;
            }
            if (bundle.containsKey(MediaMetadataCompat.f4000R)) {
                x3.putLong(8, bundle.getLong(MediaMetadataCompat.f4000R));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4011c0)) {
                x3.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.f4011c0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4010b0)) {
                x3.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.f4010b0));
            }
            return x3;
        }
    }

    @W(28)
    /* loaded from: classes.dex */
    static class i extends h {
        i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.h, android.support.v4.media.session.MediaSessionCompat.e
        public void r(i.b bVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.h, android.support.v4.media.session.MediaSessionCompat.e
        @N
        public final i.b w() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = ((MediaSession) this.f4165a).getCurrentControllerInfo();
            return new i.b(currentControllerInfo);
        }

        i(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j implements e {

        /* renamed from: H, reason: collision with root package name */
        static final int f4177H = 0;

        /* renamed from: A, reason: collision with root package name */
        int f4178A;

        /* renamed from: B, reason: collision with root package name */
        int f4179B;

        /* renamed from: C, reason: collision with root package name */
        Bundle f4180C;

        /* renamed from: D, reason: collision with root package name */
        int f4181D;

        /* renamed from: E, reason: collision with root package name */
        int f4182E;

        /* renamed from: F, reason: collision with root package name */
        t f4183F;

        /* renamed from: a, reason: collision with root package name */
        private final Context f4185a;

        /* renamed from: b, reason: collision with root package name */
        private final ComponentName f4186b;

        /* renamed from: c, reason: collision with root package name */
        private final PendingIntent f4187c;

        /* renamed from: d, reason: collision with root package name */
        private final c f4188d;

        /* renamed from: e, reason: collision with root package name */
        private final Token f4189e;

        /* renamed from: f, reason: collision with root package name */
        final String f4190f;

        /* renamed from: g, reason: collision with root package name */
        final String f4191g;

        /* renamed from: h, reason: collision with root package name */
        final AudioManager f4192h;

        /* renamed from: i, reason: collision with root package name */
        final RemoteControlClient f4193i;

        /* renamed from: l, reason: collision with root package name */
        private d f4196l;

        /* renamed from: q, reason: collision with root package name */
        volatile d f4201q;

        /* renamed from: r, reason: collision with root package name */
        private i.b f4202r;

        /* renamed from: s, reason: collision with root package name */
        int f4203s;

        /* renamed from: t, reason: collision with root package name */
        MediaMetadataCompat f4204t;

        /* renamed from: u, reason: collision with root package name */
        PlaybackStateCompat f4205u;

        /* renamed from: v, reason: collision with root package name */
        PendingIntent f4206v;

        /* renamed from: w, reason: collision with root package name */
        List<QueueItem> f4207w;

        /* renamed from: x, reason: collision with root package name */
        CharSequence f4208x;

        /* renamed from: y, reason: collision with root package name */
        int f4209y;

        /* renamed from: z, reason: collision with root package name */
        boolean f4210z;

        /* renamed from: j, reason: collision with root package name */
        final Object f4194j = new Object();

        /* renamed from: k, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f4195k = new RemoteCallbackList<>();

        /* renamed from: m, reason: collision with root package name */
        boolean f4197m = false;

        /* renamed from: n, reason: collision with root package name */
        boolean f4198n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f4199o = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f4200p = false;

        /* renamed from: G, reason: collision with root package name */
        private t.b f4184G = new a();

        /* loaded from: classes.dex */
        class a extends t.b {
            a() {
            }

            @Override // androidx.media.t.b
            public void a(t tVar) {
                if (j.this.f4183F != tVar) {
                    return;
                }
                j jVar = j.this;
                j.this.O(new ParcelableVolumeInfo(jVar.f4181D, jVar.f4182E, tVar.c(), tVar.b(), tVar.a()));
            }
        }

        /* loaded from: classes.dex */
        private static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f4212a;

            /* renamed from: b, reason: collision with root package name */
            public final Bundle f4213b;

            /* renamed from: c, reason: collision with root package name */
            public final ResultReceiver f4214c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f4212a = str;
                this.f4213b = bundle;
                this.f4214c = resultReceiver;
            }
        }

        /* loaded from: classes.dex */
        class c extends b.a {
            c() {
            }

            void A(int i4) {
                j.this.B(i4, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void A0(android.support.v4.media.session.a aVar) {
                j.this.f4195k.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void A1(boolean z3) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public int B() {
                return j.this.f4178A;
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo B1() {
                int i4;
                int i5;
                int i6;
                int streamMaxVolume;
                int streamVolume;
                synchronized (j.this.f4194j) {
                    try {
                        j jVar = j.this;
                        i4 = jVar.f4181D;
                        i5 = jVar.f4182E;
                        t tVar = jVar.f4183F;
                        i6 = 2;
                        if (i4 == 2) {
                            int c4 = tVar.c();
                            int b4 = tVar.b();
                            streamVolume = tVar.a();
                            streamMaxVolume = b4;
                            i6 = c4;
                        } else {
                            streamMaxVolume = jVar.f4192h.getStreamMaxVolume(i5);
                            streamVolume = j.this.f4192h.getStreamVolume(i5);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new ParcelableVolumeInfo(i4, i5, i6, streamMaxVolume, streamVolume);
            }

            @Override // android.support.v4.media.session.b
            public void C0(String str, Bundle bundle) throws RemoteException {
                O1(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void D(int i4) throws RemoteException {
                G(30, i4);
            }

            @Override // android.support.v4.media.session.b
            public void D0(String str, Bundle bundle) throws RemoteException {
                O1(9, str, bundle);
            }

            void G(int i4, int i5) {
                j.this.B(i4, i5, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void G0() throws RemoteException {
                A(16);
            }

            @Override // android.support.v4.media.session.b
            public void I0(Uri uri, Bundle bundle) throws RemoteException {
                O1(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void J(String str, Bundle bundle) throws RemoteException {
                O1(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void M(android.support.v4.media.session.a aVar) {
                if (j.this.f4197m) {
                    try {
                        aVar.r();
                    } catch (Exception unused) {
                    }
                } else {
                    j.this.f4195k.register(aVar, new i.b(i.b.f16075b, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            void N1(int i4, Object obj, int i5) {
                j.this.B(i4, i5, 0, obj, null);
            }

            void O0(int i4, Object obj) {
                j.this.B(i4, 0, 0, obj, null);
            }

            void O1(int i4, Object obj, Bundle bundle) {
                j.this.B(i4, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public boolean P() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void Q(RatingCompat ratingCompat) throws RemoteException {
                O0(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public void R(int i4, int i5, String str) {
                j.this.Q(i4, i5);
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                O1(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public boolean T0(KeyEvent keyEvent) {
                boolean z3 = true;
                if ((j.this.f4203s & 1) == 0) {
                    z3 = false;
                }
                if (z3) {
                    O0(21, keyEvent);
                }
                return z3;
            }

            @Override // android.support.v4.media.session.b
            public void V0(int i4, int i5, String str) {
                j.this.a(i4, i5);
            }

            @Override // android.support.v4.media.session.b
            public void Z0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                O1(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public long a() {
                long j4;
                synchronized (j.this.f4194j) {
                    j4 = j.this.f4203s;
                }
                return j4;
            }

            @Override // android.support.v4.media.session.b
            public void b() throws RemoteException {
                A(12);
            }

            @Override // android.support.v4.media.session.b
            public boolean b0() {
                if ((j.this.f4203s & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void d1(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
                N1(26, mediaDescriptionCompat, i4);
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat e() {
                return j.this.f4204t;
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f4194j) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f4205u;
                    mediaMetadataCompat = jVar.f4204t;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public String g() {
                return j.this.f4190f;
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent g0() {
                PendingIntent pendingIntent;
                synchronized (j.this.f4194j) {
                    pendingIntent = j.this.f4206v;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.f4194j) {
                    bundle = j.this.f4180C;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public void h(MediaDescriptionCompat mediaDescriptionCompat) {
                O0(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void i(MediaDescriptionCompat mediaDescriptionCompat) {
                O0(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void i0(String str, Bundle bundle) throws RemoteException {
                O1(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public int j() {
                return j.this.f4209y;
            }

            @Override // android.support.v4.media.session.b
            public CharSequence m() {
                return j.this.f4208x;
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                A(3);
            }

            @Override // android.support.v4.media.session.b
            public void m1(int i4) {
                G(28, i4);
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                A(14);
            }

            @Override // android.support.v4.media.session.b
            public void p(long j4) throws RemoteException {
                O0(18, Long.valueOf(j4));
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                A(15);
            }

            @Override // android.support.v4.media.session.b
            public void q1() throws RemoteException {
                A(7);
            }

            @Override // android.support.v4.media.session.b
            public void r1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                O0(1, new b(str, bundle, resultReceiverWrapper.f4146E));
            }

            @Override // android.support.v4.media.session.b
            public String s() {
                return j.this.f4191g;
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                A(13);
            }

            @Override // android.support.v4.media.session.b
            public void t(boolean z3) throws RemoteException {
                O0(29, Boolean.valueOf(z3));
            }

            @Override // android.support.v4.media.session.b
            public void u1() throws RemoteException {
                A(17);
            }

            @Override // android.support.v4.media.session.b
            public int w() {
                return j.this.f4179B;
            }

            @Override // android.support.v4.media.session.b
            public boolean x() {
                return j.this.f4210z;
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> y() {
                List<QueueItem> list;
                synchronized (j.this.f4194j) {
                    list = j.this.f4207w;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void y0(String str, Bundle bundle) throws RemoteException {
                O1(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void z(int i4) throws RemoteException {
                G(23, i4);
            }

            @Override // android.support.v4.media.session.b
            public void z1(long j4) {
                O0(11, Long.valueOf(j4));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d extends Handler {

            /* renamed from: A, reason: collision with root package name */
            private static final int f4216A = 26;

            /* renamed from: B, reason: collision with root package name */
            private static final int f4217B = 27;

            /* renamed from: C, reason: collision with root package name */
            private static final int f4218C = 28;

            /* renamed from: D, reason: collision with root package name */
            private static final int f4219D = 29;

            /* renamed from: E, reason: collision with root package name */
            private static final int f4220E = 30;

            /* renamed from: F, reason: collision with root package name */
            private static final int f4221F = 127;

            /* renamed from: G, reason: collision with root package name */
            private static final int f4222G = 126;

            /* renamed from: b, reason: collision with root package name */
            private static final int f4223b = 1;

            /* renamed from: c, reason: collision with root package name */
            private static final int f4224c = 2;

            /* renamed from: d, reason: collision with root package name */
            private static final int f4225d = 3;

            /* renamed from: e, reason: collision with root package name */
            private static final int f4226e = 4;

            /* renamed from: f, reason: collision with root package name */
            private static final int f4227f = 5;

            /* renamed from: g, reason: collision with root package name */
            private static final int f4228g = 6;

            /* renamed from: h, reason: collision with root package name */
            private static final int f4229h = 7;

            /* renamed from: i, reason: collision with root package name */
            private static final int f4230i = 8;

            /* renamed from: j, reason: collision with root package name */
            private static final int f4231j = 9;

            /* renamed from: k, reason: collision with root package name */
            private static final int f4232k = 10;

            /* renamed from: l, reason: collision with root package name */
            private static final int f4233l = 11;

            /* renamed from: m, reason: collision with root package name */
            private static final int f4234m = 12;

            /* renamed from: n, reason: collision with root package name */
            private static final int f4235n = 13;

            /* renamed from: o, reason: collision with root package name */
            private static final int f4236o = 14;

            /* renamed from: p, reason: collision with root package name */
            private static final int f4237p = 15;

            /* renamed from: q, reason: collision with root package name */
            private static final int f4238q = 16;

            /* renamed from: r, reason: collision with root package name */
            private static final int f4239r = 17;

            /* renamed from: s, reason: collision with root package name */
            private static final int f4240s = 18;

            /* renamed from: t, reason: collision with root package name */
            private static final int f4241t = 19;

            /* renamed from: u, reason: collision with root package name */
            private static final int f4242u = 31;

            /* renamed from: v, reason: collision with root package name */
            private static final int f4243v = 20;

            /* renamed from: w, reason: collision with root package name */
            private static final int f4244w = 21;

            /* renamed from: x, reason: collision with root package name */
            private static final int f4245x = 22;

            /* renamed from: y, reason: collision with root package name */
            private static final int f4246y = 23;

            /* renamed from: z, reason: collision with root package name */
            private static final int f4247z = 25;

            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, d dVar) {
                long b4;
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.f4205u;
                    if (playbackStateCompat == null) {
                        b4 = 0;
                    } else {
                        b4 = playbackStateCompat.b();
                    }
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != f4222G) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((b4 & 1) != 0) {
                                            dVar.C();
                                            return;
                                        }
                                        return;
                                    case com.harman.sdk.impl.scan.e.f48067e /* 87 */:
                                        if ((b4 & 32) != 0) {
                                            dVar.z();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((b4 & 16) != 0) {
                                            dVar.A();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((b4 & 8) != 0) {
                                            dVar.s();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((b4 & 64) != 0) {
                                            dVar.f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else {
                                if ((b4 & 2) != 0) {
                                    dVar.h();
                                    return;
                                }
                                return;
                            }
                        } else {
                            if ((b4 & 4) != 0) {
                                dVar.i();
                                return;
                            }
                            return;
                        }
                    }
                    Log.w(MediaSessionCompat.f4116d, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                QueueItem queueItem;
                d dVar = j.this.f4201q;
                if (dVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j.this.r(new i.b(data.getString(MediaSessionCompat.f4111L), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.f4114O);
                MediaSessionCompat.b(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar = (b) message.obj;
                            dVar.d(bVar.f4212a, bVar.f4213b, bVar.f4214c);
                            break;
                        case 2:
                            j.this.a(message.arg1, 0);
                            break;
                        case 3:
                            dVar.m();
                            break;
                        case 4:
                            dVar.n((String) message.obj, bundle);
                            break;
                        case 5:
                            dVar.o((String) message.obj, bundle);
                            break;
                        case 6:
                            dVar.p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            dVar.i();
                            break;
                        case 8:
                            dVar.j((String) message.obj, bundle);
                            break;
                        case 9:
                            dVar.k((String) message.obj, bundle);
                            break;
                        case 10:
                            dVar.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            dVar.B(((Long) message.obj).longValue());
                            break;
                        case 12:
                            dVar.h();
                            break;
                        case 13:
                            dVar.C();
                            break;
                        case 14:
                            dVar.z();
                            break;
                        case 15:
                            dVar.A();
                            break;
                        case 16:
                            dVar.f();
                            break;
                        case 17:
                            dVar.s();
                            break;
                        case 18:
                            dVar.t(((Long) message.obj).longValue());
                            break;
                        case 19:
                            dVar.v((RatingCompat) message.obj);
                            break;
                        case 20:
                            dVar.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!dVar.g(intent)) {
                                a(keyEvent, dVar);
                                break;
                            }
                            break;
                        case 22:
                            j.this.Q(message.arg1, 0);
                            break;
                        case 23:
                            dVar.x(message.arg1);
                            break;
                        case 25:
                            dVar.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            dVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            dVar.q((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.f4207w;
                            if (list != null) {
                                int i4 = message.arg1;
                                if (i4 >= 0 && i4 < list.size()) {
                                    queueItem = j.this.f4207w.get(message.arg1);
                                } else {
                                    queueItem = null;
                                }
                                if (queueItem != null) {
                                    dVar.q(queueItem.c());
                                    break;
                                }
                            }
                            break;
                        case 29:
                            dVar.u(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            dVar.y(message.arg1);
                            break;
                        case 31:
                            dVar.w((RatingCompat) message.obj, bundle);
                            break;
                    }
                } finally {
                    j.this.r(null);
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f4185a = context;
                this.f4190f = context.getPackageName();
                this.f4192h = (AudioManager) context.getSystemService("audio");
                this.f4191g = str;
                this.f4186b = componentName;
                this.f4187c = pendingIntent;
                c cVar = new c();
                this.f4188d = cVar;
                this.f4189e = new Token(cVar);
                this.f4209y = 0;
                this.f4181D = 1;
                this.f4182E = 3;
                this.f4193i = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        private void E(boolean z3) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).J0(z3);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void F(String str, Bundle bundle) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).E(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void G(Bundle bundle) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).k(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void H(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).e1(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void I(List<QueueItem> list) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).l(list);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void J(CharSequence charSequence) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).q(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void K(int i4) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).i1(i4);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void L() {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).r();
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
            this.f4195k.kill();
        }

        private void M(int i4) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).o1(i4);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        private void N(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).H1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        int A(long j4) {
            int i4 = (1 & j4) != 0 ? 32 : 0;
            if ((2 & j4) != 0) {
                i4 |= 16;
            }
            if ((4 & j4) != 0) {
                i4 |= 4;
            }
            if ((8 & j4) != 0) {
                i4 |= 2;
            }
            if ((16 & j4) != 0) {
                i4 |= 1;
            }
            if ((32 & j4) != 0) {
                i4 |= 128;
            }
            if ((64 & j4) != 0) {
                i4 |= 64;
            }
            return (j4 & 512) != 0 ? i4 | 8 : i4;
        }

        void B(int i4, int i5, int i6, Object obj, Bundle bundle) {
            synchronized (this.f4194j) {
                try {
                    d dVar = this.f4196l;
                    if (dVar != null) {
                        Message obtainMessage = dVar.obtainMessage(i4, i5, i6, obj);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(MediaSessionCompat.f4111L, i.b.f16075b);
                        bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                        bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.f4114O, bundle);
                        }
                        obtainMessage.setData(bundle2);
                        obtainMessage.sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void C(PendingIntent pendingIntent, ComponentName componentName) {
            this.f4192h.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void D(int i4) {
            if (this.f4179B != i4) {
                this.f4179B = i4;
                M(i4);
            }
        }

        void O(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f4195k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4195k.getBroadcastItem(beginBroadcast).M1(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f4195k.finishBroadcast();
        }

        void P(PlaybackStateCompat playbackStateCompat) {
            this.f4193i.setPlaybackState(y(playbackStateCompat.r()));
        }

        void Q(int i4, int i5) {
            if (this.f4181D == 2) {
                t tVar = this.f4183F;
                if (tVar != null) {
                    tVar.f(i4);
                    return;
                }
                return;
            }
            this.f4192h.setStreamVolume(this.f4182E, i4, i5);
        }

        void R(PendingIntent pendingIntent, ComponentName componentName) {
            this.f4192h.unregisterMediaButtonEventReceiver(componentName);
        }

        boolean S() {
            if (this.f4198n) {
                boolean z3 = this.f4199o;
                if (!z3 && (this.f4203s & 1) != 0) {
                    C(this.f4187c, this.f4186b);
                    this.f4199o = true;
                } else if (z3 && (this.f4203s & 1) == 0) {
                    R(this.f4187c, this.f4186b);
                    this.f4199o = false;
                }
                boolean z4 = this.f4200p;
                if (!z4 && (this.f4203s & 2) != 0) {
                    this.f4192h.registerRemoteControlClient(this.f4193i);
                    this.f4200p = true;
                    return true;
                }
                if (!z4 || (this.f4203s & 2) != 0) {
                    return false;
                }
                this.f4193i.setPlaybackState(0);
                this.f4192h.unregisterRemoteControlClient(this.f4193i);
                this.f4200p = false;
                return false;
            }
            if (this.f4199o) {
                R(this.f4187c, this.f4186b);
                this.f4199o = false;
            }
            if (!this.f4200p) {
                return false;
            }
            this.f4193i.setPlaybackState(0);
            this.f4192h.unregisterRemoteControlClient(this.f4193i);
            this.f4200p = false;
            return false;
        }

        void a(int i4, int i5) {
            if (this.f4181D == 2) {
                t tVar = this.f4183F;
                if (tVar != null) {
                    tVar.e(i4);
                    return;
                }
                return;
            }
            this.f4192h.adjustStreamVolume(this.f4182E, i4, i5);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Token b() {
            return this.f4189e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public boolean c() {
            return this.f4198n;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void d(int i4) {
            synchronized (this.f4194j) {
                this.f4203s = i4;
            }
            S();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void e(String str, Bundle bundle) {
            F(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public PlaybackStateCompat f() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f4194j) {
                playbackStateCompat = this.f4205u;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public String g() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void h(PendingIntent pendingIntent) {
            synchronized (this.f4194j) {
                this.f4206v = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void i(d dVar, Handler handler) {
            this.f4201q = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f4194j) {
                    try {
                        d dVar2 = this.f4196l;
                        if (dVar2 != null) {
                            dVar2.removeCallbacksAndMessages(null);
                        }
                        this.f4196l = new d(handler.getLooper());
                        this.f4201q.D(this, handler);
                    } finally {
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void j(int i4) {
            t tVar = this.f4183F;
            if (tVar != null) {
                tVar.g(null);
            }
            this.f4182E = i4;
            this.f4181D = 1;
            int i5 = this.f4181D;
            int i6 = this.f4182E;
            O(new ParcelableVolumeInfo(i5, i6, 2, this.f4192h.getStreamMaxVolume(i6), this.f4192h.getStreamVolume(this.f4182E)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void k(CharSequence charSequence) {
            this.f4208x = charSequence;
            J(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void l(MediaMetadataCompat mediaMetadataCompat) {
            Bundle d4;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.c(mediaMetadataCompat, MediaSessionCompat.f4115P).a();
            }
            synchronized (this.f4194j) {
                this.f4204t = mediaMetadataCompat;
            }
            H(mediaMetadataCompat);
            if (!this.f4198n) {
                return;
            }
            if (mediaMetadataCompat == null) {
                d4 = null;
            } else {
                d4 = mediaMetadataCompat.d();
            }
            x(d4).apply();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void m(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void n(int i4) {
            this.f4209y = i4;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void o(List<QueueItem> list) {
            this.f4207w = list;
            I(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object p() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void q(boolean z3) {
            if (z3 == this.f4198n) {
                return;
            }
            this.f4198n = z3;
            if (S()) {
                l(this.f4204t);
                s(this.f4205u);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void r(i.b bVar) {
            synchronized (this.f4194j) {
                this.f4202r = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void release() {
            this.f4198n = false;
            this.f4197m = true;
            S();
            L();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void s(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f4194j) {
                this.f4205u = playbackStateCompat;
            }
            N(playbackStateCompat);
            if (!this.f4198n) {
                return;
            }
            if (playbackStateCompat == null) {
                this.f4193i.setPlaybackState(0);
                this.f4193i.setTransportControlFlags(0);
            } else {
                P(playbackStateCompat);
                this.f4193i.setTransportControlFlags(A(playbackStateCompat.b()));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setExtras(Bundle bundle) {
            this.f4180C = bundle;
            G(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void t(boolean z3) {
            if (this.f4210z != z3) {
                this.f4210z = z3;
                E(z3);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object u() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void v(t tVar) {
            if (tVar != null) {
                t tVar2 = this.f4183F;
                if (tVar2 != null) {
                    tVar2.g(null);
                }
                this.f4181D = 2;
                this.f4183F = tVar;
                O(new ParcelableVolumeInfo(this.f4181D, this.f4182E, this.f4183F.c(), this.f4183F.b(), this.f4183F.a()));
                tVar.g(this.f4184G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public i.b w() {
            i.b bVar;
            synchronized (this.f4194j) {
                bVar = this.f4202r;
            }
            return bVar;
        }

        RemoteControlClient.MetadataEditor x(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f4193i.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.f4006X)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f4006X);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey(MediaMetadataCompat.f4008Z)) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f4008Z);
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey(MediaMetadataCompat.f3994L)) {
                editMetadata.putString(1, bundle.getString(MediaMetadataCompat.f3994L));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4005W)) {
                editMetadata.putString(13, bundle.getString(MediaMetadataCompat.f4005W));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3992J)) {
                editMetadata.putString(2, bundle.getString(MediaMetadataCompat.f3992J));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3995M)) {
                editMetadata.putString(3, bundle.getString(MediaMetadataCompat.f3995M));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3998P)) {
                editMetadata.putString(15, bundle.getString(MediaMetadataCompat.f3998P));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3997O)) {
                editMetadata.putString(4, bundle.getString(MediaMetadataCompat.f3997O));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3999Q)) {
                editMetadata.putString(5, bundle.getString(MediaMetadataCompat.f3999Q));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4004V)) {
                editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.f4004V));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3993K)) {
                editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.f3993K));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4001S)) {
                editMetadata.putString(6, bundle.getString(MediaMetadataCompat.f4001S));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3991I)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.f3991I));
            }
            if (bundle.containsKey(MediaMetadataCompat.f4002T)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.f4002T));
            }
            if (bundle.containsKey(MediaMetadataCompat.f3996N)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.f3996N));
            }
            return editMetadata;
        }

        int y(int i4) {
            switch (i4) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void z(int i4) {
            if (this.f4178A != i4) {
                this.f4178A = i4;
                K(i4);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface l {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void b(@P Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        if (context != null && obj != null) {
            return new MediaSessionCompat(context, new h(obj));
        }
        return null;
    }

    static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j4;
        if (playbackStateCompat != null) {
            long j5 = -1;
            if (playbackStateCompat.q() != -1) {
                if (playbackStateCompat.r() == 3 || playbackStateCompat.r() == 4 || playbackStateCompat.r() == 5) {
                    if (playbackStateCompat.m() > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long n4 = (playbackStateCompat.n() * ((float) (elapsedRealtime - r0))) + playbackStateCompat.q();
                        if (mediaMetadataCompat != null && mediaMetadataCompat.a(MediaMetadataCompat.f3993K)) {
                            j5 = mediaMetadataCompat.g(MediaMetadataCompat.f3993K);
                        }
                        if (j5 >= 0 && n4 > j5) {
                            j4 = j5;
                        } else if (n4 < 0) {
                            j4 = 0;
                        } else {
                            j4 = n4;
                        }
                        return new PlaybackStateCompat.c(playbackStateCompat).k(playbackStateCompat.r(), j4, playbackStateCompat.n(), elapsedRealtime).c();
                    }
                    return playbackStateCompat;
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    public void A(CharSequence charSequence) {
        this.f4139a.k(charSequence);
    }

    public void B(int i4) {
        this.f4139a.n(i4);
    }

    public void C(int i4) {
        this.f4139a.z(i4);
    }

    public void D(PendingIntent pendingIntent) {
        this.f4139a.h(pendingIntent);
    }

    public void E(int i4) {
        this.f4139a.D(i4);
    }

    public void a(k kVar) {
        if (kVar != null) {
            this.f4141c.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String d() {
        return this.f4139a.g();
    }

    public MediaControllerCompat e() {
        return this.f4140b;
    }

    @N
    public final i.b f() {
        return this.f4139a.w();
    }

    public Object g() {
        return this.f4139a.u();
    }

    public Object h() {
        return this.f4139a.p();
    }

    public Token i() {
        return this.f4139a.b();
    }

    public boolean k() {
        return this.f4139a.c();
    }

    public void l() {
        this.f4139a.release();
    }

    public void m(k kVar) {
        if (kVar != null) {
            this.f4141c.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f4139a.e(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void o(boolean z3) {
        this.f4139a.q(z3);
        Iterator<k> it = this.f4141c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(d dVar) {
        q(dVar, null);
    }

    public void q(d dVar, Handler handler) {
        if (dVar == null) {
            this.f4139a.i(null, null);
            return;
        }
        e eVar = this.f4139a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.i(dVar, handler);
    }

    public void r(boolean z3) {
        this.f4139a.t(z3);
    }

    public void s(Bundle bundle) {
        this.f4139a.setExtras(bundle);
    }

    public void t(int i4) {
        this.f4139a.d(i4);
    }

    public void u(PendingIntent pendingIntent) {
        this.f4139a.m(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.f4139a.l(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.f4139a.s(playbackStateCompat);
    }

    public void x(int i4) {
        this.f4139a.j(i4);
    }

    public void y(t tVar) {
        if (tVar != null) {
            this.f4139a.v(tVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void z(List<QueueItem> list) {
        this.f4139a.o(list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        ResultReceiver f4146E;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i4) {
                return new ResultReceiverWrapper[i4];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f4146E = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            this.f4146E.writeToParcel(parcel, i4);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f4146E = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f4141c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = androidx.media.session.b.c(context)) == null) {
                    Log.w(f4116d, "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    i iVar = new i(context, str, bundle);
                    this.f4139a = iVar;
                    p(new a());
                    iVar.m(pendingIntent);
                } else {
                    h hVar = new h(context, str, bundle);
                    this.f4139a = hVar;
                    p(new b());
                    hVar.m(pendingIntent);
                }
                this.f4140b = new MediaControllerCompat(context, this);
                if (f4115P == 0) {
                    f4115P = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @W(21)
    /* loaded from: classes.dex */
    static class h implements e {

        /* renamed from: a, reason: collision with root package name */
        final Object f4165a;

        /* renamed from: b, reason: collision with root package name */
        final Token f4166b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4167c = false;

        /* renamed from: d, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f4168d = new RemoteCallbackList<>();

        /* renamed from: e, reason: collision with root package name */
        PlaybackStateCompat f4169e;

        /* renamed from: f, reason: collision with root package name */
        List<QueueItem> f4170f;

        /* renamed from: g, reason: collision with root package name */
        MediaMetadataCompat f4171g;

        /* renamed from: h, reason: collision with root package name */
        int f4172h;

        /* renamed from: i, reason: collision with root package name */
        boolean f4173i;

        /* renamed from: j, reason: collision with root package name */
        int f4174j;

        /* renamed from: k, reason: collision with root package name */
        int f4175k;

        /* loaded from: classes.dex */
        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public void A0(android.support.v4.media.session.a aVar) {
                h.this.f4168d.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void A1(boolean z3) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public int B() {
                return h.this.f4174j;
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo B1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void C0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D(int i4) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M(android.support.v4.media.session.a aVar) {
                h hVar = h.this;
                if (!hVar.f4167c) {
                    String g4 = hVar.g();
                    if (g4 == null) {
                        g4 = i.b.f16075b;
                    }
                    h.this.f4168d.register(aVar, new i.b(g4, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean P() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void Q(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void R(int i4, int i5, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean T0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V0(int i4, int i5, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Z0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void b() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean b0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void d1(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() {
                h hVar = h.this;
                return MediaSessionCompat.j(hVar.f4169e, hVar.f4171g);
            }

            @Override // android.support.v4.media.session.b
            public String g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent g0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int j() {
                return h.this.f4172h;
            }

            @Override // android.support.v4.media.session.b
            public CharSequence m() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m1(int i4) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void p(long j4) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void q1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void r1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t(boolean z3) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int w() {
                return h.this.f4175k;
            }

            @Override // android.support.v4.media.session.b
            public boolean x() {
                return h.this.f4173i;
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> y() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void y0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z(int i4) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z1(long j4) {
                throw new AssertionError();
            }
        }

        h(Context context, String str, Bundle bundle) {
            Object b4 = android.support.v4.media.session.g.b(context, str);
            this.f4165a = b4;
            this.f4166b = new Token(android.support.v4.media.session.g.c(b4), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void D(int i4) {
            if (this.f4175k != i4) {
                this.f4175k = i4;
                for (int beginBroadcast = this.f4168d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f4168d.getBroadcastItem(beginBroadcast).o1(i4);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4168d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Token b() {
            return this.f4166b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public boolean c() {
            return android.support.v4.media.session.g.e(this.f4165a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void d(int i4) {
            android.support.v4.media.session.g.k(this.f4165a, i4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void e(String str, Bundle bundle) {
            android.support.v4.media.session.g.g(this.f4165a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public PlaybackStateCompat f() {
            return this.f4169e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public String g() {
            return android.support.v4.media.session.j.b(this.f4165a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void h(PendingIntent pendingIntent) {
            android.support.v4.media.session.g.s(this.f4165a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void i(d dVar, Handler handler) {
            Object obj;
            Object obj2 = this.f4165a;
            if (dVar == null) {
                obj = null;
            } else {
                obj = dVar.f4153a;
            }
            android.support.v4.media.session.g.i(obj2, obj, handler);
            if (dVar != null) {
                dVar.D(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void j(int i4) {
            android.support.v4.media.session.g.o(this.f4165a, i4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void k(CharSequence charSequence) {
            android.support.v4.media.session.g.r(this.f4165a, charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void l(MediaMetadataCompat mediaMetadataCompat) {
            Object h4;
            this.f4171g = mediaMetadataCompat;
            Object obj = this.f4165a;
            if (mediaMetadataCompat == null) {
                h4 = null;
            } else {
                h4 = mediaMetadataCompat.h();
            }
            android.support.v4.media.session.g.m(obj, h4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void m(PendingIntent pendingIntent) {
            android.support.v4.media.session.g.l(this.f4165a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void n(int i4) {
            android.support.v4.media.session.h.a(this.f4165a, i4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void o(List<QueueItem> list) {
            ArrayList arrayList;
            this.f4170f = list;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<QueueItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().e());
                }
            } else {
                arrayList = null;
            }
            android.support.v4.media.session.g.q(this.f4165a, arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object p() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void q(boolean z3) {
            android.support.v4.media.session.g.h(this.f4165a, z3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void r(i.b bVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void release() {
            this.f4167c = true;
            android.support.v4.media.session.g.f(this.f4165a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void s(PlaybackStateCompat playbackStateCompat) {
            Object o4;
            this.f4169e = playbackStateCompat;
            for (int beginBroadcast = this.f4168d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f4168d.getBroadcastItem(beginBroadcast).H1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f4168d.finishBroadcast();
            Object obj = this.f4165a;
            if (playbackStateCompat == null) {
                o4 = null;
            } else {
                o4 = playbackStateCompat.o();
            }
            android.support.v4.media.session.g.n(obj, o4);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setExtras(Bundle bundle) {
            android.support.v4.media.session.g.j(this.f4165a, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void t(boolean z3) {
            if (this.f4173i != z3) {
                this.f4173i = z3;
                for (int beginBroadcast = this.f4168d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f4168d.getBroadcastItem(beginBroadcast).J0(z3);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4168d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object u() {
            return this.f4165a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void v(t tVar) {
            android.support.v4.media.session.g.p(this.f4165a, tVar.d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public i.b w() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void z(int i4) {
            if (this.f4174j != i4) {
                this.f4174j = i4;
                for (int beginBroadcast = this.f4168d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f4168d.getBroadcastItem(beginBroadcast).i1(i4);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4168d.finishBroadcast();
            }
        }

        h(Object obj) {
            Object t3 = android.support.v4.media.session.g.t(obj);
            this.f4165a = t3;
            this.f4166b = new Token(android.support.v4.media.session.g.c(t3), new a());
        }
    }

    private MediaSessionCompat(Context context, e eVar) {
        this.f4141c = new ArrayList<>();
        this.f4139a = eVar;
        if (!android.support.v4.media.session.g.d(eVar.u())) {
            p(new c());
        }
        this.f4140b = new MediaControllerCompat(context, this);
    }
}
