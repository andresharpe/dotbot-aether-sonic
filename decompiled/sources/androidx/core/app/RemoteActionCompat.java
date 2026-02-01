package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.g {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public IconCompat f11852a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f11853b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f11854c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PendingIntent f11855d;

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f11856e;

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f11857f;

    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @InterfaceC0577u
        static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @InterfaceC0577u
        static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @InterfaceC0577u
        static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @InterfaceC0577u
        static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @InterfaceC0577u
        static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @InterfaceC0577u
        static void g(RemoteAction remoteAction, boolean z3) {
            remoteAction.setEnabled(z3);
        }
    }

    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(RemoteAction remoteAction, boolean z3) {
            remoteAction.setShouldShowIcon(z3);
        }

        @InterfaceC0577u
        static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@androidx.annotation.N IconCompat iconCompat, @androidx.annotation.N CharSequence charSequence, @androidx.annotation.N CharSequence charSequence2, @androidx.annotation.N PendingIntent pendingIntent) {
        this.f11852a = (IconCompat) androidx.core.util.u.l(iconCompat);
        this.f11853b = (CharSequence) androidx.core.util.u.l(charSequence);
        this.f11854c = (CharSequence) androidx.core.util.u.l(charSequence2);
        this.f11855d = (PendingIntent) androidx.core.util.u.l(pendingIntent);
        this.f11856e = true;
        this.f11857f = true;
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public static RemoteActionCompat h(@androidx.annotation.N RemoteAction remoteAction) {
        androidx.core.util.u.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.n(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.n(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.o(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    @androidx.annotation.N
    public PendingIntent i() {
        return this.f11855d;
    }

    @androidx.annotation.N
    public CharSequence j() {
        return this.f11854c;
    }

    @androidx.annotation.N
    public IconCompat k() {
        return this.f11852a;
    }

    @androidx.annotation.N
    public CharSequence l() {
        return this.f11853b;
    }

    public boolean m() {
        return this.f11856e;
    }

    public void n(boolean z3) {
        this.f11856e = z3;
    }

    public void o(boolean z3) {
        this.f11857f = z3;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean p() {
        return this.f11857f;
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public RemoteAction q() {
        RemoteAction a4 = a.a(this.f11852a.L(), this.f11853b, this.f11854c, this.f11855d);
        a.g(a4, m());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a4, p());
        }
        return a4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@androidx.annotation.N RemoteActionCompat remoteActionCompat) {
        androidx.core.util.u.l(remoteActionCompat);
        this.f11852a = remoteActionCompat.f11852a;
        this.f11853b = remoteActionCompat.f11853b;
        this.f11854c = remoteActionCompat.f11854c;
        this.f11855d = remoteActionCompat.f11855d;
        this.f11856e = remoteActionCompat.f11856e;
        this.f11857f = remoteActionCompat.f11857f;
    }
}
