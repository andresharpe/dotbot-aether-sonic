package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.C0;
import androidx.core.app.p1;
import com.blankj.utilcode.util.E0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24971a = -1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f24972b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f24973c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f24974d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f24975e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24976f = 4;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24977b = new a(E0.a().getPackageName(), E0.a().getPackageName(), 3);

        /* renamed from: a, reason: collision with root package name */
        private NotificationChannel f24978a;

        public a(String str, CharSequence charSequence, int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a = androidx.core.app.T.a(str, charSequence, i4);
            }
        }

        public NotificationChannel b() {
            return this.f24978a;
        }

        public a c(boolean z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setBypassDnd(z3);
            }
            return this;
        }

        public a d(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setDescription(str);
            }
            return this;
        }

        public a e(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setGroup(str);
            }
            return this;
        }

        public a f(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setImportance(i4);
            }
            return this;
        }

        public a g(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setLightColor(i4);
            }
            return this;
        }

        public a h(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setLockscreenVisibility(i4);
            }
            return this;
        }

        public a i(CharSequence charSequence) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setName(charSequence);
            }
            return this;
        }

        public a j(boolean z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setShowBadge(z3);
            }
            return this;
        }

        public a k(Uri uri, AudioAttributes audioAttributes) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setSound(uri, audioAttributes);
            }
            return this;
        }

        public a l(long[] jArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24978a.setVibrationPattern(jArr);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static boolean a() {
        return p1.p(E0.a()).a();
    }

    public static void b(int i4) {
        p1.p(E0.a()).b(i4);
    }

    public static void c(String str, int i4) {
        p1.p(E0.a()).c(str, i4);
    }

    public static void d() {
        p1.p(E0.a()).d();
    }

    public static Notification e(a aVar, E0.b<C0.g> bVar) {
        String id;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ((NotificationManager) E0.a().getSystemService("notification")).createNotificationChannel(aVar.b());
        }
        C0.g gVar = new C0.g(E0.a());
        if (i4 >= 26) {
            id = aVar.f24978a.getId();
            gVar.H(id);
        }
        if (bVar != null) {
            bVar.accept(gVar);
        }
        return gVar.h();
    }

    private static void f(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(E0.a().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void g(int i4, a aVar, E0.b<C0.g> bVar) {
        i(null, i4, aVar, bVar);
    }

    public static void h(int i4, E0.b<C0.g> bVar) {
        i(null, i4, a.f24977b, bVar);
    }

    public static void i(String str, int i4, a aVar, E0.b<C0.g> bVar) {
        p1.p(E0.a()).D(str, i4, e(aVar, bVar));
    }

    public static void j(String str, int i4, E0.b<C0.g> bVar) {
        i(str, i4, a.f24977b, bVar);
    }

    @androidx.annotation.Y("android.permission.EXPAND_STATUS_BAR")
    public static void k(boolean z3) {
        String str;
        if (z3) {
            str = "expandNotificationsPanel";
        } else {
            str = "collapsePanels";
        }
        f(str);
    }
}
