package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627g {

    @androidx.annotation.W(19)
    /* renamed from: androidx.core.app.g$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExact(i4, j4, pendingIntent);
        }
    }

    @androidx.annotation.W(21)
    /* renamed from: androidx.core.app.g$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static AlarmManager.AlarmClockInfo a(long j4, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j4, pendingIntent);
        }

        @InterfaceC0577u
        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @androidx.annotation.W(23)
    /* renamed from: androidx.core.app.g$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i4, j4, pendingIntent);
        }

        @InterfaceC0577u
        static void b(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i4, j4, pendingIntent);
        }
    }

    private C0627g() {
    }

    @SuppressLint({"MissingPermission"})
    public static void a(@androidx.annotation.N AlarmManager alarmManager, long j4, @androidx.annotation.N PendingIntent pendingIntent, @androidx.annotation.N PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j4, pendingIntent), pendingIntent2);
    }

    public static void b(@androidx.annotation.N AlarmManager alarmManager, int i4, long j4, @androidx.annotation.N PendingIntent pendingIntent) {
        c.a(alarmManager, i4, j4, pendingIntent);
    }

    public static void c(@androidx.annotation.N AlarmManager alarmManager, int i4, long j4, @androidx.annotation.N PendingIntent pendingIntent) {
        a.a(alarmManager, i4, j4, pendingIntent);
    }

    public static void d(@androidx.annotation.N AlarmManager alarmManager, int i4, long j4, @androidx.annotation.N PendingIntent pendingIntent) {
        c.b(alarmManager, i4, j4, pendingIntent);
    }
}
