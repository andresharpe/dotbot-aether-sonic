package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.C0;
import androidx.core.app.InterfaceC0662y;
import androidx.media.s;

/* loaded from: classes.dex */
public class a {

    /* renamed from: androidx.media.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0150a extends b {
        private void L(RemoteViews remoteViews) {
            int color;
            if (this.f11800a.r() != 0) {
                color = this.f11800a.r();
            } else {
                color = this.f11800a.f11721a.getResources().getColor(s.b.f16103c);
            }
            remoteViews.setInt(s.e.f16178z, "setBackgroundColor", color);
        }

        @Override // androidx.media.app.a.b
        int E(int i4) {
            if (i4 <= 3) {
                return s.g.f16188h;
            }
            return s.g.f16186f;
        }

        @Override // androidx.media.app.a.b
        int F() {
            if (this.f11800a.s() != null) {
                return s.g.f16193m;
            }
            return super.F();
        }

        @Override // androidx.media.app.a.b, androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void b(InterfaceC0662y interfaceC0662y) {
            interfaceC0662y.a().setStyle(A(new Notification.DecoratedMediaCustomViewStyle()));
        }

        @Override // androidx.media.app.a.b, androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews v(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @Override // androidx.media.app.a.b, androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews w(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews x(InterfaceC0662y interfaceC0662y) {
            return null;
        }
    }

    private a() {
    }

    /* loaded from: classes.dex */
    public static class b extends C0.q {

        /* renamed from: i, reason: collision with root package name */
        private static final int f15895i = 3;

        /* renamed from: j, reason: collision with root package name */
        private static final int f15896j = 5;

        /* renamed from: e, reason: collision with root package name */
        int[] f15897e = null;

        /* renamed from: f, reason: collision with root package name */
        MediaSessionCompat.Token f15898f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15899g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f15900h;

        public b() {
        }

        private RemoteViews D(C0.b bVar) {
            boolean z3;
            if (bVar.a() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f11800a.f11721a.getPackageName(), s.g.f16183c);
            remoteViews.setImageViewResource(s.e.f16153a, bVar.e());
            if (!z3) {
                remoteViews.setOnClickPendingIntent(s.e.f16153a, bVar.a());
            }
            remoteViews.setContentDescription(s.e.f16153a, bVar.j());
            return remoteViews;
        }

        public static MediaSessionCompat.Token G(Notification notification) {
            Parcelable parcelable;
            Bundle n4 = C0.n(notification);
            if (n4 != null && (parcelable = n4.getParcelable(C0.f11577c0)) != null) {
                return MediaSessionCompat.Token.b(parcelable);
            }
            return null;
        }

        @W(21)
        Notification.MediaStyle A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f15897e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f15898f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.g());
            }
            return mediaStyle;
        }

        RemoteViews B() {
            int min = Math.min(this.f11800a.f11722b.size(), 5);
            RemoteViews c4 = c(false, E(min), false);
            c4.removeAllViews(s.e.f16171s);
            if (min > 0) {
                for (int i4 = 0; i4 < min; i4++) {
                    c4.addView(s.e.f16171s, D(this.f11800a.f11722b.get(i4)));
                }
            }
            if (this.f15899g) {
                c4.setViewVisibility(s.e.f16161i, 0);
                c4.setInt(s.e.f16161i, "setAlpha", this.f11800a.f11721a.getResources().getInteger(s.f.f16179a));
                c4.setOnClickPendingIntent(s.e.f16161i, this.f15900h);
            } else {
                c4.setViewVisibility(s.e.f16161i, 8);
            }
            return c4;
        }

        RemoteViews C() {
            int min;
            RemoteViews c4 = c(false, F(), true);
            int size = this.f11800a.f11722b.size();
            int[] iArr = this.f15897e;
            if (iArr == null) {
                min = 0;
            } else {
                min = Math.min(iArr.length, 3);
            }
            c4.removeAllViews(s.e.f16171s);
            if (min > 0) {
                for (int i4 = 0; i4 < min; i4++) {
                    if (i4 < size) {
                        c4.addView(s.e.f16171s, D(this.f11800a.f11722b.get(this.f15897e[i4])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i4), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.f15899g) {
                c4.setViewVisibility(s.e.f16163k, 8);
                c4.setViewVisibility(s.e.f16161i, 0);
                c4.setOnClickPendingIntent(s.e.f16161i, this.f15900h);
                c4.setInt(s.e.f16161i, "setAlpha", this.f11800a.f11721a.getResources().getInteger(s.f.f16179a));
            } else {
                c4.setViewVisibility(s.e.f16163k, 0);
                c4.setViewVisibility(s.e.f16161i, 8);
            }
            return c4;
        }

        int E(int i4) {
            if (i4 <= 3) {
                return s.g.f16187g;
            }
            return s.g.f16185e;
        }

        int F() {
            return s.g.f16192l;
        }

        public b H(PendingIntent pendingIntent) {
            this.f15900h = pendingIntent;
            return this;
        }

        public b I(MediaSessionCompat.Token token) {
            this.f15898f = token;
            return this;
        }

        public b J(int... iArr) {
            this.f15897e = iArr;
            return this;
        }

        public b K(boolean z3) {
            return this;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void b(InterfaceC0662y interfaceC0662y) {
            interfaceC0662y.a().setStyle(A(new Notification.MediaStyle()));
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews v(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews w(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        public b(C0.g gVar) {
            z(gVar);
        }
    }
}
