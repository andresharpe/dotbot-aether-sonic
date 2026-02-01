package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0642n0 {

    /* renamed from: a, reason: collision with root package name */
    final String f11994a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f11995b;

    /* renamed from: c, reason: collision with root package name */
    String f11996c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11997d;

    /* renamed from: e, reason: collision with root package name */
    private List<C0622d0> f11998e;

    /* renamed from: androidx.core.app.n0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final C0642n0 f11999a;

        public a(@androidx.annotation.N String str) {
            this.f11999a = new C0642n0(str);
        }

        @androidx.annotation.N
        public C0642n0 a() {
            return this.f11999a;
        }

        @androidx.annotation.N
        public a b(@androidx.annotation.P String str) {
            this.f11999a.f11996c = str;
            return this;
        }

        @androidx.annotation.N
        public a c(@androidx.annotation.P CharSequence charSequence) {
            this.f11999a.f11995b = charSequence;
            return this;
        }
    }

    C0642n0(@androidx.annotation.N String str) {
        this.f11998e = Collections.emptyList();
        this.f11994a = (String) androidx.core.util.u.l(str);
    }

    @androidx.annotation.W(26)
    private List<C0622d0> b(List<NotificationChannel> list) {
        String group;
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel a4 = C0636k0.a(it.next());
            String str = this.f11994a;
            group = a4.getGroup();
            if (str.equals(group)) {
                arrayList.add(new C0622d0(a4));
            }
        }
        return arrayList;
    }

    @androidx.annotation.N
    public List<C0622d0> a() {
        return this.f11998e;
    }

    @androidx.annotation.P
    public String c() {
        return this.f11996c;
    }

    @androidx.annotation.N
    public String d() {
        return this.f11994a;
    }

    @androidx.annotation.P
    public CharSequence e() {
        return this.f11995b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationChannelGroup f() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        C0640m0.a();
        NotificationChannelGroup a4 = C0638l0.a(this.f11994a, this.f11995b);
        if (i4 >= 28) {
            a4.setDescription(this.f11996c);
        }
        return a4;
    }

    public boolean g() {
        return this.f11997d;
    }

    @androidx.annotation.N
    public a h() {
        return new a(this.f11994a).c(this.f11995b).b(this.f11996c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    public C0642n0(@androidx.annotation.N NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.W(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0642n0(@androidx.annotation.N android.app.NotificationChannelGroup r4, @androidx.annotation.N java.util.List<android.app.NotificationChannel> r5) {
        /*
            r3 = this;
            java.lang.String r0 = androidx.core.app.C0624e0.a(r4)
            r3.<init>(r0)
            java.lang.CharSequence r0 = androidx.core.app.C0626f0.a(r4)
            r3.f11995b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r2 = androidx.core.app.C0628g0.a(r4)
            r3.f11996c = r2
        L19:
            if (r0 < r1) goto L2c
            boolean r5 = androidx.core.app.C0630h0.a(r4)
            r3.f11997d = r5
            java.util.List r4 = androidx.core.app.C0632i0.a(r4)
            java.util.List r4 = r3.b(r4)
            r3.f11998e = r4
            goto L32
        L2c:
            java.util.List r4 = r3.b(r5)
            r3.f11998e = r4
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0642n0.<init>(android.app.NotificationChannelGroup, java.util.List):void");
    }
}
