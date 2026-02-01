package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: androidx.core.app.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0622d0 {

    /* renamed from: s, reason: collision with root package name */
    public static final String f11906s = "miscellaneous";

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f11907t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final int f11908u = 0;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    final String f11909a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f11910b;

    /* renamed from: c, reason: collision with root package name */
    int f11911c;

    /* renamed from: d, reason: collision with root package name */
    String f11912d;

    /* renamed from: e, reason: collision with root package name */
    String f11913e;

    /* renamed from: f, reason: collision with root package name */
    boolean f11914f;

    /* renamed from: g, reason: collision with root package name */
    Uri f11915g;

    /* renamed from: h, reason: collision with root package name */
    AudioAttributes f11916h;

    /* renamed from: i, reason: collision with root package name */
    boolean f11917i;

    /* renamed from: j, reason: collision with root package name */
    int f11918j;

    /* renamed from: k, reason: collision with root package name */
    boolean f11919k;

    /* renamed from: l, reason: collision with root package name */
    long[] f11920l;

    /* renamed from: m, reason: collision with root package name */
    String f11921m;

    /* renamed from: n, reason: collision with root package name */
    String f11922n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11923o;

    /* renamed from: p, reason: collision with root package name */
    private int f11924p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11925q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11926r;

    /* renamed from: androidx.core.app.d0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final C0622d0 f11927a;

        public a(@androidx.annotation.N String str, int i4) {
            this.f11927a = new C0622d0(str, i4);
        }

        @androidx.annotation.N
        public C0622d0 a() {
            return this.f11927a;
        }

        @androidx.annotation.N
        public a b(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                C0622d0 c0622d0 = this.f11927a;
                c0622d0.f11921m = str;
                c0622d0.f11922n = str2;
            }
            return this;
        }

        @androidx.annotation.N
        public a c(@androidx.annotation.P String str) {
            this.f11927a.f11912d = str;
            return this;
        }

        @androidx.annotation.N
        public a d(@androidx.annotation.P String str) {
            this.f11927a.f11913e = str;
            return this;
        }

        @androidx.annotation.N
        public a e(int i4) {
            this.f11927a.f11911c = i4;
            return this;
        }

        @androidx.annotation.N
        public a f(int i4) {
            this.f11927a.f11918j = i4;
            return this;
        }

        @androidx.annotation.N
        public a g(boolean z3) {
            this.f11927a.f11917i = z3;
            return this;
        }

        @androidx.annotation.N
        public a h(@androidx.annotation.P CharSequence charSequence) {
            this.f11927a.f11910b = charSequence;
            return this;
        }

        @androidx.annotation.N
        public a i(boolean z3) {
            this.f11927a.f11914f = z3;
            return this;
        }

        @androidx.annotation.N
        public a j(@androidx.annotation.P Uri uri, @androidx.annotation.P AudioAttributes audioAttributes) {
            C0622d0 c0622d0 = this.f11927a;
            c0622d0.f11915g = uri;
            c0622d0.f11916h = audioAttributes;
            return this;
        }

        @androidx.annotation.N
        public a k(boolean z3) {
            this.f11927a.f11919k = z3;
            return this;
        }

        @androidx.annotation.N
        public a l(@androidx.annotation.P long[] jArr) {
            boolean z3;
            C0622d0 c0622d0 = this.f11927a;
            if (jArr != null && jArr.length > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            c0622d0.f11919k = z3;
            c0622d0.f11920l = jArr;
            return this;
        }
    }

    C0622d0(@androidx.annotation.N String str, int i4) {
        this.f11914f = true;
        this.f11915g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f11918j = 0;
        this.f11909a = (String) androidx.core.util.u.l(str);
        this.f11911c = i4;
        this.f11916h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f11925q;
    }

    public boolean b() {
        return this.f11923o;
    }

    public boolean c() {
        return this.f11914f;
    }

    @androidx.annotation.P
    public AudioAttributes d() {
        return this.f11916h;
    }

    @androidx.annotation.P
    public String e() {
        return this.f11922n;
    }

    @androidx.annotation.P
    public String f() {
        return this.f11912d;
    }

    @androidx.annotation.P
    public String g() {
        return this.f11913e;
    }

    @androidx.annotation.N
    public String h() {
        return this.f11909a;
    }

    public int i() {
        return this.f11911c;
    }

    public int j() {
        return this.f11918j;
    }

    public int k() {
        return this.f11924p;
    }

    @androidx.annotation.P
    public CharSequence l() {
        return this.f11910b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationChannel m() {
        String str;
        String str2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        U.a();
        NotificationChannel a4 = T.a(this.f11909a, this.f11910b, this.f11911c);
        a4.setDescription(this.f11912d);
        a4.setGroup(this.f11913e);
        a4.setShowBadge(this.f11914f);
        a4.setSound(this.f11915g, this.f11916h);
        a4.enableLights(this.f11917i);
        a4.setLightColor(this.f11918j);
        a4.setVibrationPattern(this.f11920l);
        a4.enableVibration(this.f11919k);
        if (i4 >= 30 && (str = this.f11921m) != null && (str2 = this.f11922n) != null) {
            a4.setConversationId(str, str2);
        }
        return a4;
    }

    @androidx.annotation.P
    public String n() {
        return this.f11921m;
    }

    @androidx.annotation.P
    public Uri o() {
        return this.f11915g;
    }

    @androidx.annotation.P
    public long[] p() {
        return this.f11920l;
    }

    public boolean q() {
        return this.f11926r;
    }

    public boolean r() {
        return this.f11917i;
    }

    public boolean s() {
        return this.f11919k;
    }

    @androidx.annotation.N
    public a t() {
        return new a(this.f11909a, this.f11911c).h(this.f11910b).c(this.f11912d).d(this.f11913e).i(this.f11914f).j(this.f11915g, this.f11916h).g(this.f11917i).f(this.f11918j).k(this.f11919k).l(this.f11920l).b(this.f11921m, this.f11922n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.W(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0622d0(@androidx.annotation.N android.app.NotificationChannel r4) {
        /*
            r3 = this;
            java.lang.String r0 = androidx.core.app.C0664z.a(r4)
            int r1 = androidx.core.app.C0620c0.a(r4)
            r3.<init>(r0, r1)
            java.lang.CharSequence r0 = androidx.core.app.A.a(r4)
            r3.f11910b = r0
            java.lang.String r0 = androidx.core.app.B.a(r4)
            r3.f11912d = r0
            java.lang.String r0 = androidx.core.app.C.a(r4)
            r3.f11913e = r0
            boolean r0 = androidx.core.app.D.a(r4)
            r3.f11914f = r0
            android.net.Uri r0 = androidx.core.app.E.a(r4)
            r3.f11915g = r0
            android.media.AudioAttributes r0 = androidx.core.app.F.a(r4)
            r3.f11916h = r0
            boolean r0 = androidx.core.app.G.a(r4)
            r3.f11917i = r0
            int r0 = androidx.core.app.H.a(r4)
            r3.f11918j = r0
            boolean r0 = androidx.core.app.K.a(r4)
            r3.f11919k = r0
            long[] r0 = androidx.core.app.V.a(r4)
            r3.f11920l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L59
            java.lang.String r2 = androidx.core.app.W.a(r4)
            r3.f11921m = r2
            java.lang.String r2 = androidx.core.app.X.a(r4)
            r3.f11922n = r2
        L59:
            boolean r2 = androidx.core.app.Y.a(r4)
            r3.f11923o = r2
            int r2 = androidx.core.app.Z.a(r4)
            r3.f11924p = r2
            r2 = 29
            if (r0 < r2) goto L6f
            boolean r2 = androidx.core.app.C0616a0.a(r4)
            r3.f11925q = r2
        L6f:
            if (r0 < r1) goto L77
            boolean r4 = androidx.core.app.C0618b0.a(r4)
            r3.f11926r = r4
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0622d0.<init>(android.app.NotificationChannel):void");
    }
}
