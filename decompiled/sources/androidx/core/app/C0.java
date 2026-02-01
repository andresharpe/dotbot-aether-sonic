package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.t1;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C0753a;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.C2356a;

/* loaded from: classes.dex */
public class C0 {

    /* renamed from: A, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11526A = "android.title";

    /* renamed from: A0, reason: collision with root package name */
    public static final String f11527A0 = "transport";

    /* renamed from: B, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11528B = "android.title.big";

    /* renamed from: B0, reason: collision with root package name */
    public static final String f11529B0 = "sys";

    /* renamed from: C, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11530C = "android.text";

    /* renamed from: C0, reason: collision with root package name */
    public static final String f11531C0 = "service";

    /* renamed from: D, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11532D = "android.subText";

    /* renamed from: D0, reason: collision with root package name */
    public static final String f11533D0 = "reminder";

    /* renamed from: E, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11534E = "android.remoteInputHistory";

    /* renamed from: E0, reason: collision with root package name */
    public static final String f11535E0 = "recommendation";

    /* renamed from: F, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11536F = "android.infoText";

    /* renamed from: F0, reason: collision with root package name */
    public static final String f11537F0 = "status";

    /* renamed from: G, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11538G = "android.summaryText";

    /* renamed from: G0, reason: collision with root package name */
    public static final String f11539G0 = "workout";

    /* renamed from: H, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11540H = "android.bigText";

    /* renamed from: H0, reason: collision with root package name */
    public static final String f11541H0 = "location_sharing";

    /* renamed from: I, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11542I = "android.icon";

    /* renamed from: I0, reason: collision with root package name */
    public static final String f11543I0 = "stopwatch";

    /* renamed from: J, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11544J = "android.largeIcon";

    /* renamed from: J0, reason: collision with root package name */
    public static final String f11545J0 = "missed_call";

    /* renamed from: K, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11546K = "android.largeIcon.big";

    /* renamed from: K0, reason: collision with root package name */
    public static final int f11547K0 = 0;

    /* renamed from: L, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11548L = "android.progress";

    /* renamed from: L0, reason: collision with root package name */
    public static final int f11549L0 = 1;

    /* renamed from: M, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11550M = "android.progressMax";

    /* renamed from: M0, reason: collision with root package name */
    public static final int f11551M0 = 2;

    /* renamed from: N, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11552N = "android.progressIndeterminate";

    /* renamed from: N0, reason: collision with root package name */
    public static final int f11553N0 = 0;

    /* renamed from: O, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11554O = "android.showChronometer";

    /* renamed from: O0, reason: collision with root package name */
    public static final int f11555O0 = 1;

    /* renamed from: P, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11556P = "android.chronometerCountDown";

    /* renamed from: P0, reason: collision with root package name */
    public static final int f11557P0 = 2;

    /* renamed from: Q, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11558Q = "android.colorized";

    /* renamed from: Q0, reason: collision with root package name */
    public static final String f11559Q0 = "silent";

    /* renamed from: R, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11560R = "android.showWhen";

    /* renamed from: R0, reason: collision with root package name */
    public static final int f11561R0 = 0;

    /* renamed from: S, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11562S = "android.picture";

    /* renamed from: S0, reason: collision with root package name */
    public static final int f11563S0 = 1;

    /* renamed from: T, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11564T = "android.pictureIcon";

    /* renamed from: T0, reason: collision with root package name */
    public static final int f11565T0 = 2;

    /* renamed from: U, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11566U = "android.pictureContentDescription";

    /* renamed from: V, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11567V = "android.showBigPictureWhenCollapsed";

    /* renamed from: W, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11568W = "android.textLines";

    /* renamed from: X, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11569X = "android.template";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f11570Y = "androidx.core.app.extra.COMPAT_TEMPLATE";

    /* renamed from: Z, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String f11571Z = "android.people";

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11572a = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* renamed from: a0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11573a0 = "android.people.list";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11574b = "android.intent.extra.CHANNEL_ID";

    /* renamed from: b0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11575b0 = "android.backgroundImageUri";

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11576c = "android.intent.extra.CHANNEL_GROUP_ID";

    /* renamed from: c0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11577c0 = "android.mediaSession";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11578d = "android.intent.extra.NOTIFICATION_TAG";

    /* renamed from: d0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11579d0 = "android.compactActions";

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11580e = "android.intent.extra.NOTIFICATION_ID";

    /* renamed from: e0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11581e0 = "android.selfDisplayName";

    /* renamed from: f, reason: collision with root package name */
    public static final int f11582f = -1;

    /* renamed from: f0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11583f0 = "android.messagingStyleUser";

    /* renamed from: g, reason: collision with root package name */
    public static final int f11584g = 1;

    /* renamed from: g0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11585g0 = "android.conversationTitle";

    /* renamed from: h, reason: collision with root package name */
    public static final int f11586h = 2;

    /* renamed from: h0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11587h0 = "android.messages";

    /* renamed from: i, reason: collision with root package name */
    public static final int f11588i = 4;

    /* renamed from: i0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11589i0 = "android.messages.historic";

    /* renamed from: j, reason: collision with root package name */
    public static final int f11590j = -1;

    /* renamed from: j0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11591j0 = "android.isGroupConversation";

    /* renamed from: k, reason: collision with root package name */
    public static final int f11592k = 1;

    /* renamed from: k0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11593k0 = "android.hiddenConversationTitle";

    /* renamed from: l, reason: collision with root package name */
    public static final int f11594l = 2;

    /* renamed from: l0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f11595l0 = "android.audioContents";

    /* renamed from: m, reason: collision with root package name */
    public static final int f11596m = 4;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0569l
    public static final int f11597m0 = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11598n = 8;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f11599n0 = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11600o = 16;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f11601o0 = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11602p = 32;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f11603p0 = -1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11604q = 64;

    /* renamed from: q0, reason: collision with root package name */
    public static final String f11605q0 = "call";

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f11606r = 128;

    /* renamed from: r0, reason: collision with root package name */
    public static final String f11607r0 = "navigation";

    /* renamed from: s, reason: collision with root package name */
    public static final int f11608s = 256;

    /* renamed from: s0, reason: collision with root package name */
    public static final String f11609s0 = "msg";

    /* renamed from: t, reason: collision with root package name */
    public static final int f11610t = 512;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f11611t0 = "email";

    /* renamed from: u, reason: collision with root package name */
    public static final int f11612u = 4096;

    /* renamed from: u0, reason: collision with root package name */
    public static final String f11613u0 = "event";

    /* renamed from: v, reason: collision with root package name */
    public static final int f11614v = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final String f11615v0 = "promo";

    /* renamed from: w, reason: collision with root package name */
    public static final int f11616w = -1;

    /* renamed from: w0, reason: collision with root package name */
    public static final String f11617w0 = "alarm";

    /* renamed from: x, reason: collision with root package name */
    public static final int f11618x = -2;

    /* renamed from: x0, reason: collision with root package name */
    public static final String f11619x0 = "progress";

    /* renamed from: y, reason: collision with root package name */
    public static final int f11620y = 1;

    /* renamed from: y0, reason: collision with root package name */
    public static final String f11621y0 = "social";

    /* renamed from: z, reason: collision with root package name */
    public static final int f11622z = 2;

    /* renamed from: z0, reason: collision with root package name */
    public static final String f11623z0 = "err";

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: m, reason: collision with root package name */
        public static final int f11624m = 0;

        /* renamed from: n, reason: collision with root package name */
        public static final int f11625n = 1;

        /* renamed from: o, reason: collision with root package name */
        public static final int f11626o = 2;

        /* renamed from: p, reason: collision with root package name */
        public static final int f11627p = 3;

        /* renamed from: q, reason: collision with root package name */
        public static final int f11628q = 4;

        /* renamed from: r, reason: collision with root package name */
        public static final int f11629r = 5;

        /* renamed from: s, reason: collision with root package name */
        public static final int f11630s = 6;

        /* renamed from: t, reason: collision with root package name */
        public static final int f11631t = 7;

        /* renamed from: u, reason: collision with root package name */
        public static final int f11632u = 8;

        /* renamed from: v, reason: collision with root package name */
        public static final int f11633v = 9;

        /* renamed from: w, reason: collision with root package name */
        public static final int f11634w = 10;

        /* renamed from: x, reason: collision with root package name */
        static final String f11635x = "android.support.action.showsUserInterface";

        /* renamed from: y, reason: collision with root package name */
        static final String f11636y = "android.support.action.semanticAction";

        /* renamed from: a, reason: collision with root package name */
        final Bundle f11637a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.P
        private IconCompat f11638b;

        /* renamed from: c, reason: collision with root package name */
        private final v1[] f11639c;

        /* renamed from: d, reason: collision with root package name */
        private final v1[] f11640d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11641e;

        /* renamed from: f, reason: collision with root package name */
        boolean f11642f;

        /* renamed from: g, reason: collision with root package name */
        private final int f11643g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f11644h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f11645i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f11646j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f11647k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f11648l;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f11649a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f11650b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f11651c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f11652d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f11653e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<v1> f11654f;

            /* renamed from: g, reason: collision with root package name */
            private int f11655g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f11656h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f11657i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f11658j;

            public a(@androidx.annotation.P IconCompat iconCompat, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void d() {
                if (!this.f11657i || this.f11651c != null) {
                } else {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @androidx.annotation.N
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.W(19)
            public static a f(@androidx.annotation.N Notification.Action action) {
                a aVar;
                boolean isAuthenticationRequired;
                boolean isContextual;
                int semanticAction;
                if (action.getIcon() != null) {
                    aVar = new a(IconCompat.n(action.getIcon()), action.title, action.actionIntent);
                } else {
                    aVar = new a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        aVar.b(v1.e(remoteInput));
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                aVar.f11652d = action.getAllowGeneratedReplies();
                if (i4 >= 28) {
                    semanticAction = action.getSemanticAction();
                    aVar.k(semanticAction);
                }
                if (i4 >= 29) {
                    isContextual = action.isContextual();
                    aVar.j(isContextual);
                }
                if (i4 >= 31) {
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    aVar.i(isAuthenticationRequired);
                }
                return aVar;
            }

            @androidx.annotation.N
            public a a(@androidx.annotation.P Bundle bundle) {
                if (bundle != null) {
                    this.f11653e.putAll(bundle);
                }
                return this;
            }

            @androidx.annotation.N
            public a b(@androidx.annotation.P v1 v1Var) {
                if (this.f11654f == null) {
                    this.f11654f = new ArrayList<>();
                }
                if (v1Var != null) {
                    this.f11654f.add(v1Var);
                }
                return this;
            }

            @androidx.annotation.N
            public b c() {
                v1[] v1VarArr;
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<v1> arrayList3 = this.f11654f;
                if (arrayList3 != null) {
                    Iterator<v1> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        v1 next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                v1[] v1VarArr2 = null;
                if (arrayList.isEmpty()) {
                    v1VarArr = null;
                } else {
                    v1VarArr = (v1[]) arrayList.toArray(new v1[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    v1VarArr2 = (v1[]) arrayList2.toArray(new v1[arrayList2.size()]);
                }
                return new b(this.f11649a, this.f11650b, this.f11651c, this.f11653e, v1VarArr2, v1VarArr, this.f11652d, this.f11655g, this.f11656h, this.f11657i, this.f11658j);
            }

            @androidx.annotation.N
            public a e(@androidx.annotation.N InterfaceC0073b interfaceC0073b) {
                interfaceC0073b.a(this);
                return this;
            }

            @androidx.annotation.N
            public Bundle g() {
                return this.f11653e;
            }

            @androidx.annotation.N
            public a h(boolean z3) {
                this.f11652d = z3;
                return this;
            }

            @androidx.annotation.N
            public a i(boolean z3) {
                this.f11658j = z3;
                return this;
            }

            @androidx.annotation.N
            public a j(boolean z3) {
                this.f11657i = z3;
                return this;
            }

            @androidx.annotation.N
            public a k(int i4) {
                this.f11655g = i4;
                return this;
            }

            @androidx.annotation.N
            public a l(boolean z3) {
                this.f11656h = z3;
                return this;
            }

            public a(int i4, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
                this(i4 != 0 ? IconCompat.y(null, "", i4) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@androidx.annotation.N b bVar) {
                this(bVar.f(), bVar.f11646j, bVar.f11647k, new Bundle(bVar.f11637a), bVar.g(), bVar.b(), bVar.h(), bVar.f11642f, bVar.l(), bVar.k());
            }

            private a(@androidx.annotation.P IconCompat iconCompat, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.N Bundle bundle, @androidx.annotation.P v1[] v1VarArr, boolean z3, int i4, boolean z4, boolean z5, boolean z6) {
                this.f11652d = true;
                this.f11656h = true;
                this.f11649a = iconCompat;
                this.f11650b = g.A(charSequence);
                this.f11651c = pendingIntent;
                this.f11653e = bundle;
                this.f11654f = v1VarArr == null ? null : new ArrayList<>(Arrays.asList(v1VarArr));
                this.f11652d = z3;
                this.f11655g = i4;
                this.f11656h = z4;
                this.f11657i = z5;
                this.f11658j = z6;
            }
        }

        /* renamed from: androidx.core.app.C0$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0073b {
            @androidx.annotation.N
            a a(@androidx.annotation.N a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface c {
        }

        public b(int i4, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
            this(i4 != 0 ? IconCompat.y(null, "", i4) : null, charSequence, pendingIntent);
        }

        @androidx.annotation.P
        public PendingIntent a() {
            return this.f11647k;
        }

        public boolean b() {
            return this.f11641e;
        }

        @androidx.annotation.P
        public v1[] c() {
            return this.f11640d;
        }

        @androidx.annotation.N
        public Bundle d() {
            return this.f11637a;
        }

        @Deprecated
        public int e() {
            return this.f11645i;
        }

        @androidx.annotation.P
        public IconCompat f() {
            int i4;
            if (this.f11638b == null && (i4 = this.f11645i) != 0) {
                this.f11638b = IconCompat.y(null, "", i4);
            }
            return this.f11638b;
        }

        @androidx.annotation.P
        public v1[] g() {
            return this.f11639c;
        }

        public int h() {
            return this.f11643g;
        }

        public boolean i() {
            return this.f11642f;
        }

        @androidx.annotation.P
        public CharSequence j() {
            return this.f11646j;
        }

        public boolean k() {
            return this.f11648l;
        }

        public boolean l() {
            return this.f11644h;
        }

        /* loaded from: classes.dex */
        public static final class d implements InterfaceC0073b {

            /* renamed from: e, reason: collision with root package name */
            private static final String f11659e = "android.wearable.EXTENSIONS";

            /* renamed from: f, reason: collision with root package name */
            private static final String f11660f = "flags";

            /* renamed from: g, reason: collision with root package name */
            private static final String f11661g = "inProgressLabel";

            /* renamed from: h, reason: collision with root package name */
            private static final String f11662h = "confirmLabel";

            /* renamed from: i, reason: collision with root package name */
            private static final String f11663i = "cancelLabel";

            /* renamed from: j, reason: collision with root package name */
            private static final int f11664j = 1;

            /* renamed from: k, reason: collision with root package name */
            private static final int f11665k = 2;

            /* renamed from: l, reason: collision with root package name */
            private static final int f11666l = 4;

            /* renamed from: m, reason: collision with root package name */
            private static final int f11667m = 1;

            /* renamed from: a, reason: collision with root package name */
            private int f11668a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f11669b;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f11670c;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f11671d;

            public d() {
                this.f11668a = 1;
            }

            private void l(int i4, boolean z3) {
                if (z3) {
                    this.f11668a = i4 | this.f11668a;
                } else {
                    this.f11668a = (~i4) & this.f11668a;
                }
            }

            @Override // androidx.core.app.C0.b.InterfaceC0073b
            @androidx.annotation.N
            public a a(@androidx.annotation.N a aVar) {
                Bundle bundle = new Bundle();
                int i4 = this.f11668a;
                if (i4 != 1) {
                    bundle.putInt(f11660f, i4);
                }
                CharSequence charSequence = this.f11669b;
                if (charSequence != null) {
                    bundle.putCharSequence(f11661g, charSequence);
                }
                CharSequence charSequence2 = this.f11670c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f11662h, charSequence2);
                }
                CharSequence charSequence3 = this.f11671d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f11663i, charSequence3);
                }
                aVar.g().putBundle(f11659e, bundle);
                return aVar;
            }

            @androidx.annotation.N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f11668a = this.f11668a;
                dVar.f11669b = this.f11669b;
                dVar.f11670c = this.f11670c;
                dVar.f11671d = this.f11671d;
                return dVar;
            }

            @androidx.annotation.P
            @Deprecated
            public CharSequence c() {
                return this.f11671d;
            }

            @androidx.annotation.P
            @Deprecated
            public CharSequence d() {
                return this.f11670c;
            }

            public boolean e() {
                if ((this.f11668a & 4) != 0) {
                    return true;
                }
                return false;
            }

            public boolean f() {
                if ((this.f11668a & 2) != 0) {
                    return true;
                }
                return false;
            }

            @androidx.annotation.P
            @Deprecated
            public CharSequence g() {
                return this.f11669b;
            }

            public boolean h() {
                if ((this.f11668a & 1) != 0) {
                    return true;
                }
                return false;
            }

            @androidx.annotation.N
            public d i(boolean z3) {
                l(1, z3);
                return this;
            }

            @androidx.annotation.N
            @Deprecated
            public d j(@androidx.annotation.P CharSequence charSequence) {
                this.f11671d = charSequence;
                return this;
            }

            @androidx.annotation.N
            @Deprecated
            public d k(@androidx.annotation.P CharSequence charSequence) {
                this.f11670c = charSequence;
                return this;
            }

            @androidx.annotation.N
            public d m(boolean z3) {
                l(4, z3);
                return this;
            }

            @androidx.annotation.N
            public d n(boolean z3) {
                l(2, z3);
                return this;
            }

            @androidx.annotation.N
            @Deprecated
            public d o(@androidx.annotation.P CharSequence charSequence) {
                this.f11669b = charSequence;
                return this;
            }

            public d(@androidx.annotation.N b bVar) {
                this.f11668a = 1;
                Bundle bundle = bVar.d().getBundle(f11659e);
                if (bundle != null) {
                    this.f11668a = bundle.getInt(f11660f, 1);
                    this.f11669b = bundle.getCharSequence(f11661g);
                    this.f11670c = bundle.getCharSequence(f11662h);
                    this.f11671d = bundle.getCharSequence(f11663i);
                }
            }
        }

        public b(@androidx.annotation.P IconCompat iconCompat, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (v1[]) null, (v1[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i4, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P Bundle bundle, @androidx.annotation.P v1[] v1VarArr, @androidx.annotation.P v1[] v1VarArr2, boolean z3, int i5, boolean z4, boolean z5, boolean z6) {
            this(i4 != 0 ? IconCompat.y(null, "", i4) : null, charSequence, pendingIntent, bundle, v1VarArr, v1VarArr2, z3, i5, z4, z5, z6);
        }

        b(@androidx.annotation.P IconCompat iconCompat, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P Bundle bundle, @androidx.annotation.P v1[] v1VarArr, @androidx.annotation.P v1[] v1VarArr2, boolean z3, int i4, boolean z4, boolean z5, boolean z6) {
            this.f11642f = true;
            this.f11638b = iconCompat;
            if (iconCompat != null && iconCompat.D() == 2) {
                this.f11645i = iconCompat.A();
            }
            this.f11646j = g.A(charSequence);
            this.f11647k = pendingIntent;
            this.f11637a = bundle == null ? new Bundle() : bundle;
            this.f11639c = v1VarArr;
            this.f11640d = v1VarArr2;
            this.f11641e = z3;
            this.f11643g = i4;
            this.f11642f = z4;
            this.f11644h = z5;
            this.f11648l = z6;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends q {

        /* renamed from: j, reason: collision with root package name */
        private static final String f11672j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f11673e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f11674f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11675g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f11676h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11677i;

        @androidx.annotation.W(16)
        /* loaded from: classes.dex */
        private static class a {
            private a() {
            }

            @androidx.annotation.W(16)
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @androidx.annotation.W(16)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @androidx.annotation.W(23)
        /* loaded from: classes.dex */
        private static class b {
            private b() {
            }

            @androidx.annotation.W(23)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
        /* loaded from: classes.dex */
        private static class c {
            private c() {
            }

            @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z3) {
                bigPictureStyle.showBigPictureWhenCollapsed(z3);
            }
        }

        public d() {
        }

        @androidx.annotation.P
        private static IconCompat A(@androidx.annotation.P Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    return IconCompat.n((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.t((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @androidx.annotation.P
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat E(@androidx.annotation.P Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(C0.f11562S);
            if (parcelable != null) {
                return A(parcelable);
            }
            return A(bundle.getParcelable(C0.f11564T));
        }

        @androidx.annotation.N
        public d B(@androidx.annotation.P Bitmap bitmap) {
            IconCompat t3;
            if (bitmap == null) {
                t3 = null;
            } else {
                t3 = IconCompat.t(bitmap);
            }
            this.f11674f = t3;
            this.f11675g = true;
            return this;
        }

        @androidx.annotation.N
        public d C(@androidx.annotation.P Bitmap bitmap) {
            IconCompat t3;
            if (bitmap == null) {
                t3 = null;
            } else {
                t3 = IconCompat.t(bitmap);
            }
            this.f11673e = t3;
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
        public d D(@androidx.annotation.P Icon icon) {
            this.f11673e = IconCompat.n(icon);
            return this;
        }

        @androidx.annotation.N
        public d F(@androidx.annotation.P CharSequence charSequence) {
            this.f11801b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
        public d G(@androidx.annotation.P CharSequence charSequence) {
            this.f11676h = charSequence;
            return this;
        }

        @androidx.annotation.N
        public d H(@androidx.annotation.P CharSequence charSequence) {
            this.f11802c = g.A(charSequence);
            this.f11803d = true;
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
        public d I(boolean z3) {
            this.f11677i = z3;
            return this;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
            Context context;
            int i4 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC0662y.a()).setBigContentTitle(this.f11801b);
            IconCompat iconCompat = this.f11673e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i4 >= 31) {
                    if (interfaceC0662y instanceof Z0) {
                        context = ((Z0) interfaceC0662y).f();
                    } else {
                        context = null;
                    }
                    c.a(bigContentTitle, this.f11673e.M(context));
                } else if (iconCompat.D() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f11673e.z());
                }
            }
            if (this.f11675g) {
                if (this.f11674f == null) {
                    a.a(bigContentTitle, null);
                } else {
                    if (interfaceC0662y instanceof Z0) {
                        context2 = ((Z0) interfaceC0662y).f();
                    }
                    b.a(bigContentTitle, this.f11674f.M(context2));
                }
            }
            if (this.f11803d) {
                a.b(bigContentTitle, this.f11802c);
            }
            if (i4 >= 31) {
                c.c(bigContentTitle, this.f11677i);
                c.b(bigContentTitle, this.f11676h);
            }
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.N Bundle bundle) {
            super.g(bundle);
            bundle.remove(C0.f11546K);
            bundle.remove(C0.f11562S);
            bundle.remove(C0.f11564T);
            bundle.remove(C0.f11567V);
        }

        @Override // androidx.core.app.C0.q
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f11672j;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.N Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(C0.f11546K)) {
                this.f11674f = A(bundle.getParcelable(C0.f11546K));
                this.f11675g = true;
            }
            this.f11673e = E(bundle);
            this.f11677i = bundle.getBoolean(C0.f11567V);
        }

        public d(@androidx.annotation.P g gVar) {
            z(gVar);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends q {

        /* renamed from: f, reason: collision with root package name */
        private static final String f11678f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f11679e;

        public e() {
        }

        @androidx.annotation.N
        public e A(@androidx.annotation.P CharSequence charSequence) {
            this.f11679e = g.A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public e B(@androidx.annotation.P CharSequence charSequence) {
            this.f11801b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public e C(@androidx.annotation.P CharSequence charSequence) {
            this.f11802c = g.A(charSequence);
            this.f11803d = true;
            return this;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.N Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0662y.a()).setBigContentTitle(this.f11801b).bigText(this.f11679e);
            if (this.f11803d) {
                bigText.setSummaryText(this.f11802c);
            }
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.N Bundle bundle) {
            super.g(bundle);
            bundle.remove(C0.f11540H);
        }

        @Override // androidx.core.app.C0.q
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f11678f;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.N Bundle bundle) {
            super.y(bundle);
            this.f11679e = bundle.getCharSequence(C0.f11540H);
        }

        public e(@androidx.annotation.P g gVar) {
            z(gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: h, reason: collision with root package name */
        private static final int f11680h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f11681i = 2;

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f11682a;

        /* renamed from: b, reason: collision with root package name */
        private PendingIntent f11683b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f11684c;

        /* renamed from: d, reason: collision with root package name */
        private int f11685d;

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC0574q
        private int f11686e;

        /* renamed from: f, reason: collision with root package name */
        private int f11687f;

        /* renamed from: g, reason: collision with root package name */
        private String f11688g;

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @androidx.annotation.P
            @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
            static f a(@androidx.annotation.P Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c i4 = new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i4.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i4.e(bubbleMetadata.getDesiredHeightResId());
                }
                return i4.a();
            }

            @androidx.annotation.P
            @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
            static Notification.BubbleMetadata b(@androidx.annotation.P f fVar) {
                if (fVar == null || fVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(fVar.f().L()).setIntent(fVar.g()).setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    suppressNotification.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(fVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.W(30)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @androidx.annotation.P
            @androidx.annotation.W(30)
            static f a(@androidx.annotation.P Notification.BubbleMetadata bubbleMetadata) {
                c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    cVar = new c(bubbleMetadata.getShortcutId());
                } else {
                    cVar = new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon()));
                }
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @androidx.annotation.P
            @androidx.annotation.W(30)
            static Notification.BubbleMetadata b(@androidx.annotation.P f fVar) {
                Notification.BubbleMetadata.Builder builder;
                if (fVar == null) {
                    return null;
                }
                if (fVar.h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(fVar.h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(fVar.g(), fVar.f().L());
                }
                builder.setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    builder.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    builder.setDesiredHeightResId(fVar.e());
                }
                return builder.build();
            }
        }

        /* loaded from: classes.dex */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private PendingIntent f11689a;

            /* renamed from: b, reason: collision with root package name */
            private IconCompat f11690b;

            /* renamed from: c, reason: collision with root package name */
            private int f11691c;

            /* renamed from: d, reason: collision with root package name */
            @InterfaceC0574q
            private int f11692d;

            /* renamed from: e, reason: collision with root package name */
            private int f11693e;

            /* renamed from: f, reason: collision with root package name */
            private PendingIntent f11694f;

            /* renamed from: g, reason: collision with root package name */
            private String f11695g;

            @Deprecated
            public c() {
            }

            @androidx.annotation.N
            private c f(int i4, boolean z3) {
                if (z3) {
                    this.f11693e = i4 | this.f11693e;
                } else {
                    this.f11693e = (~i4) & this.f11693e;
                }
                return this;
            }

            @androidx.annotation.N
            @SuppressLint({"SyntheticAccessor"})
            public f a() {
                String str = this.f11695g;
                if (str == null && this.f11689a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f11690b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                f fVar = new f(this.f11689a, this.f11694f, this.f11690b, this.f11691c, this.f11692d, this.f11693e, str);
                fVar.j(this.f11693e);
                return fVar;
            }

            @androidx.annotation.N
            public c b(boolean z3) {
                f(1, z3);
                return this;
            }

            @androidx.annotation.N
            public c c(@androidx.annotation.P PendingIntent pendingIntent) {
                this.f11694f = pendingIntent;
                return this;
            }

            @androidx.annotation.N
            public c d(@androidx.annotation.r(unit = 0) int i4) {
                this.f11691c = Math.max(i4, 0);
                this.f11692d = 0;
                return this;
            }

            @androidx.annotation.N
            public c e(@InterfaceC0574q int i4) {
                this.f11692d = i4;
                this.f11691c = 0;
                return this;
            }

            @androidx.annotation.N
            public c g(@androidx.annotation.N IconCompat iconCompat) {
                if (this.f11695g == null) {
                    if (iconCompat != null) {
                        this.f11690b = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @androidx.annotation.N
            public c h(@androidx.annotation.N PendingIntent pendingIntent) {
                if (this.f11695g == null) {
                    if (pendingIntent != null) {
                        this.f11689a = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @androidx.annotation.N
            public c i(boolean z3) {
                f(2, z3);
                return this;
            }

            @androidx.annotation.W(30)
            public c(@androidx.annotation.N String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f11695g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public c(@androidx.annotation.N PendingIntent pendingIntent, @androidx.annotation.N IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f11689a = pendingIntent;
                    this.f11690b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @androidx.annotation.P
        public static f a(@androidx.annotation.P Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i4 != 29) {
                return null;
            }
            return a.a(bubbleMetadata);
        }

        @androidx.annotation.P
        public static Notification.BubbleMetadata k(@androidx.annotation.P f fVar) {
            if (fVar == null) {
                return null;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                return b.b(fVar);
            }
            if (i4 != 29) {
                return null;
            }
            return a.b(fVar);
        }

        public boolean b() {
            if ((this.f11687f & 1) != 0) {
                return true;
            }
            return false;
        }

        @androidx.annotation.P
        public PendingIntent c() {
            return this.f11683b;
        }

        @androidx.annotation.r(unit = 0)
        public int d() {
            return this.f11685d;
        }

        @InterfaceC0574q
        public int e() {
            return this.f11686e;
        }

        @androidx.annotation.P
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f11684c;
        }

        @androidx.annotation.P
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f11682a;
        }

        @androidx.annotation.P
        public String h() {
            return this.f11688g;
        }

        public boolean i() {
            if ((this.f11687f & 2) != 0) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void j(int i4) {
            this.f11687f = i4;
        }

        private f(@androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P PendingIntent pendingIntent2, @androidx.annotation.P IconCompat iconCompat, int i4, @InterfaceC0574q int i5, int i6, @androidx.annotation.P String str) {
            this.f11682a = pendingIntent;
            this.f11684c = iconCompat;
            this.f11685d = i4;
            this.f11686e = i5;
            this.f11683b = pendingIntent2;
            this.f11687f = i6;
            this.f11688g = str;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends q {

        /* renamed from: e, reason: collision with root package name */
        private static final String f11775e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f, reason: collision with root package name */
        private static final int f11776f = 3;

        private RemoteViews A(RemoteViews remoteViews, boolean z3) {
            int min;
            int i4 = 0;
            RemoteViews c4 = c(true, C2356a.g.f54973d, false);
            c4.removeAllViews(C2356a.e.f54908L);
            List<b> C3 = C(this.f11800a.f11722b);
            if (z3 && C3 != null && (min = Math.min(C3.size(), 3)) > 0) {
                for (int i5 = 0; i5 < min; i5++) {
                    c4.addView(C2356a.e.f54908L, B(C3.get(i5)));
                }
            } else {
                i4 = 8;
            }
            c4.setViewVisibility(C2356a.e.f54908L, i4);
            c4.setViewVisibility(C2356a.e.f54905I, i4);
            e(c4, remoteViews);
            return c4;
        }

        private RemoteViews B(b bVar) {
            boolean z3;
            int i4;
            if (bVar.f11647k == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String packageName = this.f11800a.f11721a.getPackageName();
            if (z3) {
                i4 = C2356a.g.f54972c;
            } else {
                i4 = C2356a.g.f54971b;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i4);
            IconCompat f4 = bVar.f();
            if (f4 != null) {
                remoteViews.setImageViewBitmap(C2356a.e.f54906J, o(f4, this.f11800a.f11721a.getResources().getColor(C2356a.b.f54861c)));
            }
            remoteViews.setTextViewText(C2356a.e.f54907K, bVar.f11646j);
            if (!z3) {
                remoteViews.setOnClickPendingIntent(C2356a.e.f54904H, bVar.f11647k);
            }
            remoteViews.setContentDescription(C2356a.e.f54904H, bVar.f11646j);
            return remoteViews;
        }

        private static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
            interfaceC0662y.a().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.C0.q
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f11775e;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(InterfaceC0662y interfaceC0662y) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        @androidx.annotation.N
        g a(@androidx.annotation.N g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface n {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface p {
    }

    /* loaded from: classes.dex */
    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected g f11800a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f11801b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f11802c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11803d = false;

        private int f() {
            Resources resources = this.f11800a.f11721a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C2356a.c.f54883u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C2356a.c.f54884v);
            float h4 = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h4) * dimensionPixelSize) + (h4 * dimensionPixelSize2));
        }

        private static float h(float f4, float f5, float f6) {
            return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
        }

        @androidx.annotation.P
        static q i(@androidx.annotation.P String str) {
            if (str != null) {
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c4 = 4;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        return new i();
                    case 1:
                        return new d();
                    case 2:
                        return new l();
                    case 3:
                        return new e();
                    case 4:
                        return new m();
                    default:
                        return null;
                }
            }
            return null;
        }

        @androidx.annotation.P
        private static q j(@androidx.annotation.P String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new m();
            }
            if (!str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return null;
            }
            return new i();
        }

        @androidx.annotation.P
        static q k(@androidx.annotation.N Bundle bundle) {
            q i4 = i(bundle.getString(C0.f11570Y));
            if (i4 != null) {
                return i4;
            }
            if (!bundle.containsKey(C0.f11581e0) && !bundle.containsKey(C0.f11583f0)) {
                if (!bundle.containsKey(C0.f11562S) && !bundle.containsKey(C0.f11564T)) {
                    if (bundle.containsKey(C0.f11540H)) {
                        return new e();
                    }
                    if (bundle.containsKey(C0.f11568W)) {
                        return new l();
                    }
                    return j(bundle.getString(C0.f11569X));
                }
                return new d();
            }
            return new m();
        }

        @androidx.annotation.P
        static q l(@androidx.annotation.N Bundle bundle) {
            q k4 = k(bundle);
            if (k4 == null) {
                return null;
            }
            try {
                k4.y(bundle);
                return k4;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i4, int i5, int i6) {
            return p(IconCompat.x(this.f11800a.f11721a, i4), i5, i6);
        }

        private Bitmap p(@androidx.annotation.N IconCompat iconCompat, int i4, int i5) {
            int i6;
            Drawable G3 = iconCompat.G(this.f11800a.f11721a);
            if (i5 == 0) {
                i6 = G3.getIntrinsicWidth();
            } else {
                i6 = i5;
            }
            if (i5 == 0) {
                i5 = G3.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i6, i5, Bitmap.Config.ARGB_8888);
            G3.setBounds(0, 0, i6, i5);
            if (i4 != 0) {
                G3.mutate().setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
            }
            G3.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap q(int i4, int i5, int i6, int i7) {
            int i8 = C2356a.d.f54892h;
            if (i7 == 0) {
                i7 = 0;
            }
            Bitmap n4 = n(i8, i7, i5);
            Canvas canvas = new Canvas(n4);
            Drawable mutate = this.f11800a.f11721a.getResources().getDrawable(i4).mutate();
            mutate.setFilterBitmap(true);
            int i9 = (i5 - i6) / 2;
            int i10 = i6 + i9;
            mutate.setBounds(i9, i9, i10, i10);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n4;
        }

        @androidx.annotation.P
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static q s(@androidx.annotation.N Notification notification) {
            Bundle n4 = C0.n(notification);
            if (n4 == null) {
                return null;
            }
            return l(n4);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C2356a.e.f54962t0, 8);
            remoteViews.setViewVisibility(C2356a.e.f54958r0, 8);
            remoteViews.setViewVisibility(C2356a.e.f54956q0, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.N Bundle bundle) {
            if (this.f11803d) {
                bundle.putCharSequence(C0.f11538G, this.f11802c);
            }
            CharSequence charSequence = this.f11801b;
            if (charSequence != null) {
                bundle.putCharSequence(C0.f11528B, charSequence);
            }
            String t3 = t();
            if (t3 != null) {
                bundle.putString(C0.f11570Y, t3);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
        @androidx.annotation.N
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0.q.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @androidx.annotation.P
        public Notification d() {
            g gVar = this.f11800a;
            if (gVar != null) {
                return gVar.h();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            remoteViews.removeAllViews(C2356a.e.f54922Z);
            remoteViews.addView(C2356a.e.f54922Z, remoteViews2.clone());
            remoteViews.setViewVisibility(C2356a.e.f54922Z, 0);
            remoteViews.setViewPadding(C2356a.e.f54924a0, 0, f(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.N Bundle bundle) {
            bundle.remove(C0.f11538G);
            bundle.remove(C0.f11528B);
            bundle.remove(C0.f11570Y);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i4, int i5) {
            return n(i4, i5, 0);
        }

        Bitmap o(@androidx.annotation.N IconCompat iconCompat, int i4) {
            return p(iconCompat, i4, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @androidx.annotation.P
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(InterfaceC0662y interfaceC0662y) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.N Bundle bundle) {
            if (bundle.containsKey(C0.f11538G)) {
                this.f11802c = bundle.getCharSequence(C0.f11538G);
                this.f11803d = true;
            }
            this.f11801b = bundle.getCharSequence(C0.f11528B);
        }

        public void z(@androidx.annotation.P g gVar) {
            if (this.f11800a != gVar) {
                this.f11800a = gVar;
                if (gVar != null) {
                    gVar.z0(this);
                }
            }
        }
    }

    @Deprecated
    public C0() {
    }

    @androidx.annotation.P
    public static String A(@androidx.annotation.N Notification notification) {
        String shortcutId;
        if (Build.VERSION.SDK_INT >= 26) {
            shortcutId = notification.getShortcutId();
            return shortcutId;
        }
        return null;
    }

    @androidx.annotation.W(19)
    public static boolean B(@androidx.annotation.N Notification notification) {
        return notification.extras.getBoolean(f11560R);
    }

    @androidx.annotation.P
    public static String C(@androidx.annotation.N Notification notification) {
        return notification.getSortKey();
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static CharSequence D(@androidx.annotation.N Notification notification) {
        return notification.extras.getCharSequence(f11532D);
    }

    public static long E(@androidx.annotation.N Notification notification) {
        long timeoutAfter;
        if (Build.VERSION.SDK_INT >= 26) {
            timeoutAfter = notification.getTimeoutAfter();
            return timeoutAfter;
        }
        return 0L;
    }

    @androidx.annotation.W(19)
    public static boolean F(@androidx.annotation.N Notification notification) {
        return notification.extras.getBoolean(f11554O);
    }

    public static int G(@androidx.annotation.N Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.P
    public static b a(@androidx.annotation.N Notification notification, int i4) {
        return b(notification.actions[i4]);
    }

    @androidx.annotation.N
    @androidx.annotation.W(20)
    static b b(@androidx.annotation.N Notification.Action action) {
        v1[] v1VarArr;
        int i4;
        int editChoicesBeforeSending;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean isContextual;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        boolean z5 = false;
        if (remoteInputs == null) {
            v1VarArr = null;
        } else {
            v1[] v1VarArr2 = new v1[remoteInputs.length];
            for (int i7 = 0; i7 < remoteInputs.length; i7++) {
                RemoteInput remoteInput = remoteInputs[i7];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                    i4 = editChoicesBeforeSending;
                } else {
                    i4 = 0;
                }
                v1VarArr2[i7] = new v1(resultKey, label, choices, allowFreeFormInput, i4, remoteInput.getExtras(), null);
            }
            v1VarArr = v1VarArr2;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (!action.getExtras().getBoolean("android.support.allowGeneratedReplies") && !action.getAllowGeneratedReplies()) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (i8 >= 28) {
            i5 = action.getSemanticAction();
        } else {
            i5 = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        int i9 = i5;
        if (i8 >= 29) {
            isContextual = action.isContextual();
            z4 = isContextual;
        } else {
            z4 = false;
        }
        if (i8 >= 31) {
            z5 = action.isAuthenticationRequired();
        }
        boolean z7 = z5;
        if (action.getIcon() == null && (i6 = action.icon) != 0) {
            return new b(i6, action.title, action.actionIntent, action.getExtras(), v1VarArr, (v1[]) null, z3, i9, z6, z4, z7);
        }
        if (action.getIcon() != null) {
            iconCompat = IconCompat.o(action.getIcon());
        }
        return new b(iconCompat, action.title, action.actionIntent, action.getExtras(), v1VarArr, (v1[]) null, z3, i9, z6, z4, z7);
    }

    public static int c(@androidx.annotation.N Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@androidx.annotation.N Notification notification) {
        boolean allowSystemGeneratedContextualActions;
        if (Build.VERSION.SDK_INT >= 29) {
            allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
            return allowSystemGeneratedContextualActions;
        }
        return false;
    }

    public static boolean e(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int f(@androidx.annotation.N Notification notification) {
        int badgeIconType;
        if (Build.VERSION.SDK_INT >= 26) {
            badgeIconType = notification.getBadgeIconType();
            return badgeIconType;
        }
        return 0;
    }

    @androidx.annotation.P
    public static f g(@androidx.annotation.N Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT >= 29) {
            bubbleMetadata = notification.getBubbleMetadata();
            return f.a(bubbleMetadata);
        }
        return null;
    }

    @androidx.annotation.P
    public static String h(@androidx.annotation.N Notification notification) {
        return notification.category;
    }

    @androidx.annotation.P
    public static String i(@androidx.annotation.N Notification notification) {
        String channelId;
        if (Build.VERSION.SDK_INT >= 26) {
            channelId = notification.getChannelId();
            return channelId;
        }
        return null;
    }

    public static int j(@androidx.annotation.N Notification notification) {
        return notification.color;
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static CharSequence k(@androidx.annotation.N Notification notification) {
        return notification.extras.getCharSequence(f11536F);
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static CharSequence l(@androidx.annotation.N Notification notification) {
        return notification.extras.getCharSequence(f11530C);
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static CharSequence m(@androidx.annotation.N Notification notification) {
        return notification.extras.getCharSequence(f11526A);
    }

    @androidx.annotation.P
    public static Bundle n(@androidx.annotation.N Notification notification) {
        return notification.extras;
    }

    @androidx.annotation.P
    public static String o(@androidx.annotation.N Notification notification) {
        return notification.getGroup();
    }

    public static int p(@androidx.annotation.N Notification notification) {
        int groupAlertBehavior;
        if (Build.VERSION.SDK_INT >= 26) {
            groupAlertBehavior = notification.getGroupAlertBehavior();
            return groupAlertBehavior;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static boolean q(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    @androidx.annotation.W(21)
    public static List<b> r(@androidx.annotation.N Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i4 = 0; i4 < bundle2.size(); i4++) {
                arrayList.add(b1.g(bundle2.getBundle(Integer.toString(i4))));
            }
        }
        return arrayList;
    }

    public static boolean s(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getLocusId();
     */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.content.E t(@androidx.annotation.N android.app.Notification r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L12
            android.content.LocusId r3 = androidx.core.app.C0663y0.a(r3)
            if (r3 != 0) goto Le
            goto L12
        Le:
            androidx.core.content.E r2 = androidx.core.content.E.d(r3)
        L12:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0.t(android.app.Notification):androidx.core.content.E");
    }

    @androidx.annotation.N
    static Notification[] u(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i4 = 0; i4 < parcelableArray.length; i4++) {
                notificationArr[i4] = (Notification) parcelableArray[i4];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    public static boolean v(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean w(@androidx.annotation.N Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    public static List<t1> x(@androidx.annotation.N Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f11573a0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(t1.a(C0649r0.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f11571Z);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new t1.c().g(str).a());
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.P
    public static Notification y(@androidx.annotation.N Notification notification) {
        return notification.publicVersion;
    }

    @androidx.annotation.P
    public static CharSequence z(@androidx.annotation.N Notification notification) {
        CharSequence settingsText;
        if (Build.VERSION.SDK_INT >= 26) {
            settingsText = notification.getSettingsText();
            return settingsText;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class h implements j {

        /* renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String f11747d = "android.car.EXTENSIONS";

        /* renamed from: e, reason: collision with root package name */
        private static final String f11748e = "large_icon";

        /* renamed from: f, reason: collision with root package name */
        private static final String f11749f = "car_conversation";

        /* renamed from: g, reason: collision with root package name */
        private static final String f11750g = "app_color";

        /* renamed from: h, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String f11751h = "invisible_actions";

        /* renamed from: i, reason: collision with root package name */
        private static final String f11752i = "author";

        /* renamed from: j, reason: collision with root package name */
        private static final String f11753j = "text";

        /* renamed from: k, reason: collision with root package name */
        private static final String f11754k = "messages";

        /* renamed from: l, reason: collision with root package name */
        private static final String f11755l = "remote_input";

        /* renamed from: m, reason: collision with root package name */
        private static final String f11756m = "on_reply";

        /* renamed from: n, reason: collision with root package name */
        private static final String f11757n = "on_read";

        /* renamed from: o, reason: collision with root package name */
        private static final String f11758o = "participants";

        /* renamed from: p, reason: collision with root package name */
        private static final String f11759p = "timestamp";

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f11760a;

        /* renamed from: b, reason: collision with root package name */
        private a f11761b;

        /* renamed from: c, reason: collision with root package name */
        private int f11762c;

        @Deprecated
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final String[] f11763a;

            /* renamed from: b, reason: collision with root package name */
            private final v1 f11764b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f11765c;

            /* renamed from: d, reason: collision with root package name */
            private final PendingIntent f11766d;

            /* renamed from: e, reason: collision with root package name */
            private final String[] f11767e;

            /* renamed from: f, reason: collision with root package name */
            private final long f11768f;

            /* renamed from: androidx.core.app.C0$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0074a {

                /* renamed from: a, reason: collision with root package name */
                private final List<String> f11769a = new ArrayList();

                /* renamed from: b, reason: collision with root package name */
                private final String f11770b;

                /* renamed from: c, reason: collision with root package name */
                private v1 f11771c;

                /* renamed from: d, reason: collision with root package name */
                private PendingIntent f11772d;

                /* renamed from: e, reason: collision with root package name */
                private PendingIntent f11773e;

                /* renamed from: f, reason: collision with root package name */
                private long f11774f;

                public C0074a(@androidx.annotation.N String str) {
                    this.f11770b = str;
                }

                @androidx.annotation.N
                public C0074a a(@androidx.annotation.P String str) {
                    if (str != null) {
                        this.f11769a.add(str);
                    }
                    return this;
                }

                @androidx.annotation.N
                public a b() {
                    List<String> list = this.f11769a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.f11771c, this.f11773e, this.f11772d, new String[]{this.f11770b}, this.f11774f);
                }

                @androidx.annotation.N
                public C0074a c(long j4) {
                    this.f11774f = j4;
                    return this;
                }

                @androidx.annotation.N
                public C0074a d(@androidx.annotation.P PendingIntent pendingIntent) {
                    this.f11772d = pendingIntent;
                    return this;
                }

                @androidx.annotation.N
                public C0074a e(@androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P v1 v1Var) {
                    this.f11771c = v1Var;
                    this.f11773e = pendingIntent;
                    return this;
                }
            }

            a(@androidx.annotation.P String[] strArr, @androidx.annotation.P v1 v1Var, @androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P PendingIntent pendingIntent2, @androidx.annotation.P String[] strArr2, long j4) {
                this.f11763a = strArr;
                this.f11764b = v1Var;
                this.f11766d = pendingIntent2;
                this.f11765c = pendingIntent;
                this.f11767e = strArr2;
                this.f11768f = j4;
            }

            public long a() {
                return this.f11768f;
            }

            @androidx.annotation.P
            public String[] b() {
                return this.f11763a;
            }

            @androidx.annotation.P
            public String c() {
                String[] strArr = this.f11767e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @androidx.annotation.P
            public String[] d() {
                return this.f11767e;
            }

            @androidx.annotation.P
            public PendingIntent e() {
                return this.f11766d;
            }

            @androidx.annotation.P
            public v1 f() {
                return this.f11764b;
            }

            @androidx.annotation.P
            public PendingIntent g() {
                return this.f11765c;
            }
        }

        public h() {
            this.f11762c = 0;
        }

        @androidx.annotation.W(21)
        private static Bundle b(@androidx.annotation.N a aVar) {
            String str;
            Bundle bundle = new Bundle();
            if (aVar.d() != null && aVar.d().length > 1) {
                str = aVar.d()[0];
            } else {
                str = null;
            }
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i4 = 0; i4 < length; i4++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(f11753j, aVar.b()[i4]);
                bundle2.putString(f11752i, str);
                parcelableArr[i4] = bundle2;
            }
            bundle.putParcelableArray(f11754k, parcelableArr);
            v1 f4 = aVar.f();
            if (f4 != null) {
                bundle.putParcelable(f11755l, new RemoteInput.Builder(f4.o()).setLabel(f4.n()).setChoices(f4.h()).setAllowFreeFormInput(f4.f()).addExtras(f4.m()).build());
            }
            bundle.putParcelable(f11756m, aVar.g());
            bundle.putParcelable(f11757n, aVar.e());
            bundle.putStringArray(f11758o, aVar.d());
            bundle.putLong(f11759p, aVar.a());
            return bundle;
        }

        @androidx.annotation.W(21)
        private static a f(@androidx.annotation.P Bundle bundle) {
            String[] strArr;
            v1 v1Var = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f11754k);
            int i4 = 0;
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    Parcelable parcelable = parcelableArray[i5];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString(f11753j);
                        strArr2[i5] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f11757n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f11756m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f11755l);
            String[] stringArray = bundle.getStringArray(f11758o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i4 = remoteInput.getEditChoicesBeforeSending();
                }
                v1Var = new v1(resultKey, label, choices, allowFreeFormInput, i4, remoteInput.getExtras(), null);
            }
            return new a(strArr, v1Var, pendingIntent2, pendingIntent, stringArray, bundle.getLong(f11759p));
        }

        @Override // androidx.core.app.C0.j
        @androidx.annotation.N
        public g a(@androidx.annotation.N g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f11760a;
            if (bitmap != null) {
                bundle.putParcelable(f11748e, bitmap);
            }
            int i4 = this.f11762c;
            if (i4 != 0) {
                bundle.putInt(f11750g, i4);
            }
            a aVar = this.f11761b;
            if (aVar != null) {
                bundle.putBundle(f11749f, b(aVar));
            }
            gVar.t().putBundle(f11747d, bundle);
            return gVar;
        }

        @InterfaceC0569l
        public int c() {
            return this.f11762c;
        }

        @androidx.annotation.P
        public Bitmap d() {
            return this.f11760a;
        }

        @androidx.annotation.P
        @Deprecated
        public a e() {
            return this.f11761b;
        }

        @androidx.annotation.N
        public h g(@InterfaceC0569l int i4) {
            this.f11762c = i4;
            return this;
        }

        @androidx.annotation.N
        public h h(@androidx.annotation.P Bitmap bitmap) {
            this.f11760a = bitmap;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public h i(@androidx.annotation.P a aVar) {
            this.f11761b = aVar;
            return this;
        }

        public h(@androidx.annotation.N Notification notification) {
            this.f11762c = 0;
            Bundle bundle = C0.n(notification) == null ? null : C0.n(notification).getBundle(f11747d);
            if (bundle != null) {
                this.f11760a = (Bitmap) bundle.getParcelable(f11748e);
                this.f11762c = bundle.getInt(f11750g, 0);
                this.f11761b = f(bundle.getBundle(f11749f));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l extends q {

        /* renamed from: f, reason: collision with root package name */
        private static final String f11777f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f11778e = new ArrayList<>();

        public l() {
        }

        @androidx.annotation.N
        public l A(@androidx.annotation.P CharSequence charSequence) {
            if (charSequence != null) {
                this.f11778e.add(g.A(charSequence));
            }
            return this;
        }

        @androidx.annotation.N
        public l B(@androidx.annotation.P CharSequence charSequence) {
            this.f11801b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public l C(@androidx.annotation.P CharSequence charSequence) {
            this.f11802c = g.A(charSequence);
            this.f11803d = true;
            return this;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0662y.a()).setBigContentTitle(this.f11801b);
            if (this.f11803d) {
                bigContentTitle.setSummaryText(this.f11802c);
            }
            Iterator<CharSequence> it = this.f11778e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.N Bundle bundle) {
            super.g(bundle);
            bundle.remove(C0.f11568W);
        }

        @Override // androidx.core.app.C0.q
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f11777f;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.N Bundle bundle) {
            super.y(bundle);
            this.f11778e.clear();
            if (bundle.containsKey(C0.f11568W)) {
                Collections.addAll(this.f11778e, bundle.getCharSequenceArray(C0.f11568W));
            }
        }

        public l(@androidx.annotation.P g gVar) {
            z(gVar);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends q {

        /* renamed from: j, reason: collision with root package name */
        private static final String f11779j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k, reason: collision with root package name */
        public static final int f11780k = 25;

        /* renamed from: e, reason: collision with root package name */
        private final List<a> f11781e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<a> f11782f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private t1 f11783g;

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.P
        private CharSequence f11784h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.annotation.P
        private Boolean f11785i;

        m() {
        }

        @androidx.annotation.P
        public static m E(@androidx.annotation.N Notification notification) {
            q s4 = q.s(notification);
            if (s4 instanceof m) {
                return (m) s4;
            }
            return null;
        }

        @androidx.annotation.P
        private a F() {
            for (int size = this.f11781e.size() - 1; size >= 0; size--) {
                a aVar = this.f11781e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().f())) {
                    return aVar;
                }
            }
            if (!this.f11781e.isEmpty()) {
                return this.f11781e.get(r0.size() - 1);
            }
            return null;
        }

        private boolean L() {
            for (int size = this.f11781e.size() - 1; size >= 0; size--) {
                a aVar = this.f11781e.get(size);
                if (aVar.g() != null && aVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @androidx.annotation.N
        private TextAppearanceSpan N(int i4) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i4), null);
        }

        private CharSequence O(@androidx.annotation.N a aVar) {
            CharSequence f4;
            C0753a c4 = C0753a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (aVar.g() == null) {
                f4 = "";
            } else {
                f4 = aVar.g().f();
            }
            boolean isEmpty = TextUtils.isEmpty(f4);
            int i4 = C0823k0.f13589t;
            if (isEmpty) {
                f4 = this.f11783g.f();
                if (this.f11800a.r() != 0) {
                    i4 = this.f11800a.r();
                }
            }
            CharSequence m4 = c4.m(f4);
            spannableStringBuilder.append(m4);
            spannableStringBuilder.setSpan(N(i4), spannableStringBuilder.length() - m4.length(), spannableStringBuilder.length(), 33);
            if (aVar.i() != null) {
                charSequence = aVar.i();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c4.m(charSequence));
            return spannableStringBuilder;
        }

        @androidx.annotation.N
        public m A(@androidx.annotation.P a aVar) {
            if (aVar != null) {
                this.f11782f.add(aVar);
                if (this.f11782f.size() > 25) {
                    this.f11782f.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.N
        public m B(@androidx.annotation.P a aVar) {
            if (aVar != null) {
                this.f11781e.add(aVar);
                if (this.f11781e.size() > 25) {
                    this.f11781e.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.N
        public m C(@androidx.annotation.P CharSequence charSequence, long j4, @androidx.annotation.P t1 t1Var) {
            B(new a(charSequence, j4, t1Var));
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public m D(@androidx.annotation.P CharSequence charSequence, long j4, @androidx.annotation.P CharSequence charSequence2) {
            this.f11781e.add(new a(charSequence, j4, new t1.c().f(charSequence2).a()));
            if (this.f11781e.size() > 25) {
                this.f11781e.remove(0);
            }
            return this;
        }

        @androidx.annotation.P
        public CharSequence G() {
            return this.f11784h;
        }

        @androidx.annotation.N
        public List<a> H() {
            return this.f11782f;
        }

        @androidx.annotation.N
        public List<a> I() {
            return this.f11781e;
        }

        @androidx.annotation.N
        public t1 J() {
            return this.f11783g;
        }

        @androidx.annotation.P
        @Deprecated
        public CharSequence K() {
            return this.f11783g.f();
        }

        public boolean M() {
            g gVar = this.f11800a;
            if (gVar != null && gVar.f11721a.getApplicationInfo().targetSdkVersion < 28 && this.f11785i == null) {
                if (this.f11784h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f11785i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        @androidx.annotation.N
        public m P(@androidx.annotation.P CharSequence charSequence) {
            this.f11784h = charSequence;
            return this;
        }

        @androidx.annotation.N
        public m Q(boolean z3) {
            this.f11785i = Boolean.valueOf(z3);
            return this;
        }

        @Override // androidx.core.app.C0.q
        public void a(@androidx.annotation.N Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(C0.f11581e0, this.f11783g.f());
            bundle.putBundle(C0.f11583f0, this.f11783g.m());
            bundle.putCharSequence(C0.f11593k0, this.f11784h);
            if (this.f11784h != null && this.f11785i.booleanValue()) {
                bundle.putCharSequence(C0.f11585g0, this.f11784h);
            }
            if (!this.f11781e.isEmpty()) {
                bundle.putParcelableArray(C0.f11587h0, a.a(this.f11781e));
            }
            if (!this.f11782f.isEmpty()) {
                bundle.putParcelableArray(C0.f11589i0, a.a(this.f11782f));
            }
            Boolean bool = this.f11785i;
            if (bool != null) {
                bundle.putBoolean(C0.f11591j0, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(InterfaceC0662y interfaceC0662y) {
            Notification.MessagingStyle messagingStyle;
            Q(M());
            if (Build.VERSION.SDK_INT >= 28) {
                G0.a();
                messagingStyle = F0.a(this.f11783g.k());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.f11783g.f());
            }
            Iterator<a> it = this.f11781e.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(it.next().l());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<a> it2 = this.f11782f.iterator();
                while (it2.hasNext()) {
                    messagingStyle.addHistoricMessage(it2.next().l());
                }
            }
            if (this.f11785i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f11784h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f11785i.booleanValue());
            }
            messagingStyle.setBuilder(interfaceC0662y.a());
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.N Bundle bundle) {
            super.g(bundle);
            bundle.remove(C0.f11583f0);
            bundle.remove(C0.f11581e0);
            bundle.remove(C0.f11585g0);
            bundle.remove(C0.f11593k0);
            bundle.remove(C0.f11587h0);
            bundle.remove(C0.f11589i0);
            bundle.remove(C0.f11591j0);
        }

        @Override // androidx.core.app.C0.q
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f11779j;
        }

        @Override // androidx.core.app.C0.q
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.N Bundle bundle) {
            super.y(bundle);
            this.f11781e.clear();
            if (bundle.containsKey(C0.f11583f0)) {
                this.f11783g = t1.b(bundle.getBundle(C0.f11583f0));
            } else {
                this.f11783g = new t1.c().f(bundle.getString(C0.f11581e0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(C0.f11585g0);
            this.f11784h = charSequence;
            if (charSequence == null) {
                this.f11784h = bundle.getCharSequence(C0.f11593k0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C0.f11587h0);
            if (parcelableArray != null) {
                this.f11781e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(C0.f11589i0);
            if (parcelableArray2 != null) {
                this.f11782f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey(C0.f11591j0)) {
                this.f11785i = Boolean.valueOf(bundle.getBoolean(C0.f11591j0));
            }
        }

        @Deprecated
        public m(@androidx.annotation.N CharSequence charSequence) {
            this.f11783g = new t1.c().f(charSequence).a();
        }

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: g, reason: collision with root package name */
            static final String f11786g = "text";

            /* renamed from: h, reason: collision with root package name */
            static final String f11787h = "time";

            /* renamed from: i, reason: collision with root package name */
            static final String f11788i = "sender";

            /* renamed from: j, reason: collision with root package name */
            static final String f11789j = "type";

            /* renamed from: k, reason: collision with root package name */
            static final String f11790k = "uri";

            /* renamed from: l, reason: collision with root package name */
            static final String f11791l = "extras";

            /* renamed from: m, reason: collision with root package name */
            static final String f11792m = "person";

            /* renamed from: n, reason: collision with root package name */
            static final String f11793n = "sender_person";

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f11794a;

            /* renamed from: b, reason: collision with root package name */
            private final long f11795b;

            /* renamed from: c, reason: collision with root package name */
            @androidx.annotation.P
            private final t1 f11796c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f11797d;

            /* renamed from: e, reason: collision with root package name */
            @androidx.annotation.P
            private String f11798e;

            /* renamed from: f, reason: collision with root package name */
            @androidx.annotation.P
            private Uri f11799f;

            public a(@androidx.annotation.P CharSequence charSequence, long j4, @androidx.annotation.P t1 t1Var) {
                this.f11797d = new Bundle();
                this.f11794a = charSequence;
                this.f11795b = j4;
                this.f11796c = t1Var;
            }

            @androidx.annotation.N
            static Bundle[] a(@androidx.annotation.N List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bundleArr[i4] = list.get(i4).m();
                }
                return bundleArr;
            }

            @androidx.annotation.P
            static a e(@androidx.annotation.N Bundle bundle) {
                t1 t1Var;
                try {
                    if (bundle.containsKey(f11786g) && bundle.containsKey(f11787h)) {
                        if (bundle.containsKey(f11792m)) {
                            t1Var = t1.b(bundle.getBundle(f11792m));
                        } else if (bundle.containsKey(f11793n) && Build.VERSION.SDK_INT >= 28) {
                            t1Var = t1.a(C0649r0.a(bundle.getParcelable(f11793n)));
                        } else if (bundle.containsKey(f11788i)) {
                            t1Var = new t1.c().f(bundle.getCharSequence(f11788i)).a();
                        } else {
                            t1Var = null;
                        }
                        a aVar = new a(bundle.getCharSequence(f11786g), bundle.getLong(f11787h), t1Var);
                        if (bundle.containsKey(f11789j) && bundle.containsKey(f11790k)) {
                            aVar.k(bundle.getString(f11789j), (Uri) bundle.getParcelable(f11790k));
                        }
                        if (bundle.containsKey(f11791l)) {
                            aVar.d().putAll(bundle.getBundle(f11791l));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @androidx.annotation.N
            static List<a> f(@androidx.annotation.N Parcelable[] parcelableArr) {
                a e4;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e4 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e4);
                    }
                }
                return arrayList;
            }

            @androidx.annotation.N
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f11794a;
                if (charSequence != null) {
                    bundle.putCharSequence(f11786g, charSequence);
                }
                bundle.putLong(f11787h, this.f11795b);
                t1 t1Var = this.f11796c;
                if (t1Var != null) {
                    bundle.putCharSequence(f11788i, t1Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f11793n, this.f11796c.k());
                    } else {
                        bundle.putBundle(f11792m, this.f11796c.m());
                    }
                }
                String str = this.f11798e;
                if (str != null) {
                    bundle.putString(f11789j, str);
                }
                Uri uri = this.f11799f;
                if (uri != null) {
                    bundle.putParcelable(f11790k, uri);
                }
                Bundle bundle2 = this.f11797d;
                if (bundle2 != null) {
                    bundle.putBundle(f11791l, bundle2);
                }
                return bundle;
            }

            @androidx.annotation.P
            public String b() {
                return this.f11798e;
            }

            @androidx.annotation.P
            public Uri c() {
                return this.f11799f;
            }

            @androidx.annotation.N
            public Bundle d() {
                return this.f11797d;
            }

            @androidx.annotation.P
            public t1 g() {
                return this.f11796c;
            }

            @androidx.annotation.P
            @Deprecated
            public CharSequence h() {
                t1 t1Var = this.f11796c;
                if (t1Var == null) {
                    return null;
                }
                return t1Var.f();
            }

            @androidx.annotation.P
            public CharSequence i() {
                return this.f11794a;
            }

            public long j() {
                return this.f11795b;
            }

            @androidx.annotation.N
            public a k(@androidx.annotation.P String str, @androidx.annotation.P Uri uri) {
                this.f11798e = str;
                this.f11799f = uri;
                return this;
            }

            @androidx.annotation.N
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.W(24)
            Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message message;
                t1 g4 = g();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    I0.a();
                    CharSequence i4 = i();
                    long j4 = j();
                    if (g4 != null) {
                        person = g4.k();
                    }
                    message = H0.a(i4, j4, person);
                } else {
                    CharSequence i5 = i();
                    long j5 = j();
                    if (g4 != null) {
                        charSequence = g4.f();
                    }
                    message = new Notification.MessagingStyle.Message(i5, j5, charSequence);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }

            @Deprecated
            public a(@androidx.annotation.P CharSequence charSequence, long j4, @androidx.annotation.P CharSequence charSequence2) {
                this(charSequence, j4, new t1.c().f(charSequence2).a());
            }
        }

        public m(@androidx.annotation.N t1 t1Var) {
            if (!TextUtils.isEmpty(t1Var.f())) {
                this.f11783g = t1Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* loaded from: classes.dex */
    public static final class r implements j {

        /* renamed from: A, reason: collision with root package name */
        private static final String f11804A = "displayIntent";

        /* renamed from: B, reason: collision with root package name */
        private static final String f11805B = "pages";

        /* renamed from: C, reason: collision with root package name */
        private static final String f11806C = "background";

        /* renamed from: D, reason: collision with root package name */
        private static final String f11807D = "contentIcon";

        /* renamed from: E, reason: collision with root package name */
        private static final String f11808E = "contentIconGravity";

        /* renamed from: F, reason: collision with root package name */
        private static final String f11809F = "contentActionIndex";

        /* renamed from: G, reason: collision with root package name */
        private static final String f11810G = "customSizePreset";

        /* renamed from: H, reason: collision with root package name */
        private static final String f11811H = "customContentHeight";

        /* renamed from: I, reason: collision with root package name */
        private static final String f11812I = "gravity";

        /* renamed from: J, reason: collision with root package name */
        private static final String f11813J = "hintScreenTimeout";

        /* renamed from: K, reason: collision with root package name */
        private static final String f11814K = "dismissalId";

        /* renamed from: L, reason: collision with root package name */
        private static final String f11815L = "bridgeTag";

        /* renamed from: M, reason: collision with root package name */
        private static final int f11816M = 1;

        /* renamed from: N, reason: collision with root package name */
        private static final int f11817N = 2;

        /* renamed from: O, reason: collision with root package name */
        private static final int f11818O = 4;

        /* renamed from: P, reason: collision with root package name */
        private static final int f11819P = 8;

        /* renamed from: Q, reason: collision with root package name */
        private static final int f11820Q = 16;

        /* renamed from: R, reason: collision with root package name */
        private static final int f11821R = 32;

        /* renamed from: S, reason: collision with root package name */
        private static final int f11822S = 64;

        /* renamed from: T, reason: collision with root package name */
        private static final int f11823T = 1;

        /* renamed from: U, reason: collision with root package name */
        private static final int f11824U = 8388613;

        /* renamed from: V, reason: collision with root package name */
        private static final int f11825V = 80;

        /* renamed from: o, reason: collision with root package name */
        public static final int f11826o = -1;

        /* renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f11827p = 0;

        /* renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f11828q = 1;

        /* renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f11829r = 2;

        /* renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f11830s = 3;

        /* renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f11831t = 4;

        /* renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f11832u = 5;

        /* renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f11833v = 0;

        /* renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f11834w = -1;

        /* renamed from: x, reason: collision with root package name */
        private static final String f11835x = "android.wearable.EXTENSIONS";

        /* renamed from: y, reason: collision with root package name */
        private static final String f11836y = "actions";

        /* renamed from: z, reason: collision with root package name */
        private static final String f11837z = "flags";

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<b> f11838a;

        /* renamed from: b, reason: collision with root package name */
        private int f11839b;

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f11840c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f11841d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f11842e;

        /* renamed from: f, reason: collision with root package name */
        private int f11843f;

        /* renamed from: g, reason: collision with root package name */
        private int f11844g;

        /* renamed from: h, reason: collision with root package name */
        private int f11845h;

        /* renamed from: i, reason: collision with root package name */
        private int f11846i;

        /* renamed from: j, reason: collision with root package name */
        private int f11847j;

        /* renamed from: k, reason: collision with root package name */
        private int f11848k;

        /* renamed from: l, reason: collision with root package name */
        private int f11849l;

        /* renamed from: m, reason: collision with root package name */
        private String f11850m;

        /* renamed from: n, reason: collision with root package name */
        private String f11851n;

        public r() {
            this.f11838a = new ArrayList<>();
            this.f11839b = 1;
            this.f11841d = new ArrayList<>();
            this.f11844g = 8388613;
            this.f11845h = -1;
            this.f11846i = 0;
            this.f11848k = f11825V;
        }

        private void N(int i4, boolean z3) {
            if (z3) {
                this.f11839b = i4 | this.f11839b;
            } else {
                this.f11839b = (~i4) & this.f11839b;
            }
        }

        @androidx.annotation.W(20)
        private static Notification.Action i(b bVar) {
            Icon L3;
            Bundle bundle;
            int i4 = Build.VERSION.SDK_INT;
            IconCompat f4 = bVar.f();
            if (f4 == null) {
                L3 = null;
            } else {
                L3 = f4.L();
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(L3, bVar.j(), bVar.a());
            if (bVar.d() != null) {
                bundle = new Bundle(bVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            builder.setAllowGeneratedReplies(bVar.b());
            if (i4 >= 31) {
                builder.setAuthenticationRequired(bVar.k());
            }
            builder.addExtras(bundle);
            v1[] g4 = bVar.g();
            if (g4 != null) {
                for (RemoteInput remoteInput : v1.d(g4)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        public boolean A() {
            if ((this.f11839b & 4) != 0) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        @Deprecated
        public List<Notification> B() {
            return this.f11841d;
        }

        public boolean C() {
            if ((this.f11839b & 8) != 0) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        @Deprecated
        public r D(@androidx.annotation.P Bitmap bitmap) {
            this.f11842e = bitmap;
            return this;
        }

        @androidx.annotation.N
        public r E(@androidx.annotation.P String str) {
            this.f11851n = str;
            return this;
        }

        @androidx.annotation.N
        public r F(int i4) {
            this.f11845h = i4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r G(int i4) {
            this.f11843f = i4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r H(int i4) {
            this.f11844g = i4;
            return this;
        }

        @androidx.annotation.N
        public r I(boolean z3) {
            N(1, z3);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r J(int i4) {
            this.f11847j = i4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r K(int i4) {
            this.f11846i = i4;
            return this;
        }

        @androidx.annotation.N
        public r L(@androidx.annotation.P String str) {
            this.f11850m = str;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r M(@androidx.annotation.P PendingIntent pendingIntent) {
            this.f11840c = pendingIntent;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r O(int i4) {
            this.f11848k = i4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r P(boolean z3) {
            N(32, z3);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r Q(boolean z3) {
            N(16, z3);
            return this;
        }

        @androidx.annotation.N
        public r R(boolean z3) {
            N(64, z3);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r S(boolean z3) {
            N(2, z3);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r T(int i4) {
            this.f11849l = i4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r U(boolean z3) {
            N(4, z3);
            return this;
        }

        @androidx.annotation.N
        public r V(boolean z3) {
            N(8, z3);
            return this;
        }

        @Override // androidx.core.app.C0.j
        @androidx.annotation.N
        public g a(@androidx.annotation.N g gVar) {
            Bundle bundle = new Bundle();
            if (!this.f11838a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f11838a.size());
                Iterator<b> it = this.f11838a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(f11836y, arrayList);
            }
            int i4 = this.f11839b;
            if (i4 != 1) {
                bundle.putInt(f11837z, i4);
            }
            PendingIntent pendingIntent = this.f11840c;
            if (pendingIntent != null) {
                bundle.putParcelable(f11804A, pendingIntent);
            }
            if (!this.f11841d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f11841d;
                bundle.putParcelableArray(f11805B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f11842e;
            if (bitmap != null) {
                bundle.putParcelable(f11806C, bitmap);
            }
            int i5 = this.f11843f;
            if (i5 != 0) {
                bundle.putInt(f11807D, i5);
            }
            int i6 = this.f11844g;
            if (i6 != 8388613) {
                bundle.putInt(f11808E, i6);
            }
            int i7 = this.f11845h;
            if (i7 != -1) {
                bundle.putInt(f11809F, i7);
            }
            int i8 = this.f11846i;
            if (i8 != 0) {
                bundle.putInt(f11810G, i8);
            }
            int i9 = this.f11847j;
            if (i9 != 0) {
                bundle.putInt(f11811H, i9);
            }
            int i10 = this.f11848k;
            if (i10 != f11825V) {
                bundle.putInt(f11812I, i10);
            }
            int i11 = this.f11849l;
            if (i11 != 0) {
                bundle.putInt(f11813J, i11);
            }
            String str = this.f11850m;
            if (str != null) {
                bundle.putString(f11814K, str);
            }
            String str2 = this.f11851n;
            if (str2 != null) {
                bundle.putString(f11815L, str2);
            }
            gVar.t().putBundle(f11835x, bundle);
            return gVar;
        }

        @androidx.annotation.N
        public r b(@androidx.annotation.N b bVar) {
            this.f11838a.add(bVar);
            return this;
        }

        @androidx.annotation.N
        public r c(@androidx.annotation.N List<b> list) {
            this.f11838a.addAll(list);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r d(@androidx.annotation.N Notification notification) {
            this.f11841d.add(notification);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r e(@androidx.annotation.N List<Notification> list) {
            this.f11841d.addAll(list);
            return this;
        }

        @androidx.annotation.N
        public r f() {
            this.f11838a.clear();
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public r g() {
            this.f11841d.clear();
            return this;
        }

        @androidx.annotation.N
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public r clone() {
            r rVar = new r();
            rVar.f11838a = new ArrayList<>(this.f11838a);
            rVar.f11839b = this.f11839b;
            rVar.f11840c = this.f11840c;
            rVar.f11841d = new ArrayList<>(this.f11841d);
            rVar.f11842e = this.f11842e;
            rVar.f11843f = this.f11843f;
            rVar.f11844g = this.f11844g;
            rVar.f11845h = this.f11845h;
            rVar.f11846i = this.f11846i;
            rVar.f11847j = this.f11847j;
            rVar.f11848k = this.f11848k;
            rVar.f11849l = this.f11849l;
            rVar.f11850m = this.f11850m;
            rVar.f11851n = this.f11851n;
            return rVar;
        }

        @androidx.annotation.N
        public List<b> j() {
            return this.f11838a;
        }

        @androidx.annotation.P
        @Deprecated
        public Bitmap k() {
            return this.f11842e;
        }

        @androidx.annotation.P
        public String l() {
            return this.f11851n;
        }

        public int m() {
            return this.f11845h;
        }

        @Deprecated
        public int n() {
            return this.f11843f;
        }

        @Deprecated
        public int o() {
            return this.f11844g;
        }

        public boolean p() {
            if ((this.f11839b & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int q() {
            return this.f11847j;
        }

        @Deprecated
        public int r() {
            return this.f11846i;
        }

        @androidx.annotation.P
        public String s() {
            return this.f11850m;
        }

        @androidx.annotation.P
        @Deprecated
        public PendingIntent t() {
            return this.f11840c;
        }

        @Deprecated
        public int u() {
            return this.f11848k;
        }

        @Deprecated
        public boolean v() {
            if ((this.f11839b & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean w() {
            if ((this.f11839b & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean x() {
            if ((this.f11839b & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean y() {
            if ((this.f11839b & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int z() {
            return this.f11849l;
        }

        public r(@androidx.annotation.N Notification notification) {
            this.f11838a = new ArrayList<>();
            this.f11839b = 1;
            this.f11841d = new ArrayList<>();
            this.f11844g = 8388613;
            this.f11845h = -1;
            this.f11846i = 0;
            this.f11848k = f11825V;
            Bundle n4 = C0.n(notification);
            Bundle bundle = n4 != null ? n4.getBundle(f11835x) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f11836y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        bVarArr[i4] = C0.b((Notification.Action) parcelableArrayList.get(i4));
                    }
                    Collections.addAll(this.f11838a, bVarArr);
                }
                this.f11839b = bundle.getInt(f11837z, 1);
                this.f11840c = (PendingIntent) bundle.getParcelable(f11804A);
                Notification[] u3 = C0.u(bundle, f11805B);
                if (u3 != null) {
                    Collections.addAll(this.f11841d, u3);
                }
                this.f11842e = (Bitmap) bundle.getParcelable(f11806C);
                this.f11843f = bundle.getInt(f11807D);
                this.f11844g = bundle.getInt(f11808E, 8388613);
                this.f11845h = bundle.getInt(f11809F, -1);
                this.f11846i = bundle.getInt(f11810G, 0);
                this.f11847j = bundle.getInt(f11811H);
                this.f11848k = bundle.getInt(f11812I, f11825V);
                this.f11849l = bundle.getInt(f11813J);
                this.f11850m = bundle.getString(f11814K);
                this.f11851n = bundle.getString(f11815L);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: Y, reason: collision with root package name */
        private static final int f11696Y = 5120;

        /* renamed from: A, reason: collision with root package name */
        boolean f11697A;

        /* renamed from: B, reason: collision with root package name */
        boolean f11698B;

        /* renamed from: C, reason: collision with root package name */
        boolean f11699C;

        /* renamed from: D, reason: collision with root package name */
        String f11700D;

        /* renamed from: E, reason: collision with root package name */
        Bundle f11701E;

        /* renamed from: F, reason: collision with root package name */
        int f11702F;

        /* renamed from: G, reason: collision with root package name */
        int f11703G;

        /* renamed from: H, reason: collision with root package name */
        Notification f11704H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f11705I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f11706J;

        /* renamed from: K, reason: collision with root package name */
        RemoteViews f11707K;

        /* renamed from: L, reason: collision with root package name */
        String f11708L;

        /* renamed from: M, reason: collision with root package name */
        int f11709M;

        /* renamed from: N, reason: collision with root package name */
        String f11710N;

        /* renamed from: O, reason: collision with root package name */
        androidx.core.content.E f11711O;

        /* renamed from: P, reason: collision with root package name */
        long f11712P;

        /* renamed from: Q, reason: collision with root package name */
        int f11713Q;

        /* renamed from: R, reason: collision with root package name */
        int f11714R;

        /* renamed from: S, reason: collision with root package name */
        boolean f11715S;

        /* renamed from: T, reason: collision with root package name */
        f f11716T;

        /* renamed from: U, reason: collision with root package name */
        Notification f11717U;

        /* renamed from: V, reason: collision with root package name */
        boolean f11718V;

        /* renamed from: W, reason: collision with root package name */
        Icon f11719W;

        /* renamed from: X, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f11720X;

        /* renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context f11721a;

        /* renamed from: b, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f11722b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<t1> f11723c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<b> f11724d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f11725e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f11726f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f11727g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f11728h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f11729i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f11730j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f11731k;

        /* renamed from: l, reason: collision with root package name */
        int f11732l;

        /* renamed from: m, reason: collision with root package name */
        int f11733m;

        /* renamed from: n, reason: collision with root package name */
        boolean f11734n;

        /* renamed from: o, reason: collision with root package name */
        boolean f11735o;

        /* renamed from: p, reason: collision with root package name */
        boolean f11736p;

        /* renamed from: q, reason: collision with root package name */
        q f11737q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f11738r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence f11739s;

        /* renamed from: t, reason: collision with root package name */
        CharSequence[] f11740t;

        /* renamed from: u, reason: collision with root package name */
        int f11741u;

        /* renamed from: v, reason: collision with root package name */
        int f11742v;

        /* renamed from: w, reason: collision with root package name */
        boolean f11743w;

        /* renamed from: x, reason: collision with root package name */
        String f11744x;

        /* renamed from: y, reason: collision with root package name */
        boolean f11745y;

        /* renamed from: z, reason: collision with root package name */
        String f11746z;

        @androidx.annotation.W(19)
        public g(@androidx.annotation.N Context context, @androidx.annotation.N Notification notification) {
            this(context, C0.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            q s4 = q.s(notification);
            P(C0.m(notification)).O(C0.l(notification)).M(C0.k(notification)).A0(C0.D(notification)).o0(C0.z(notification)).z0(s4).N(notification.contentIntent).Z(C0.o(notification)).b0(C0.H(notification)).f0(C0.t(notification)).H0(notification.when).r0(C0.B(notification)).E0(C0.F(notification)).D(C0.e(notification)).j0(C0.w(notification)).i0(C0.v(notification)).e0(C0.s(notification)).c0(notification.largeIcon).E(C0.f(notification)).G(C0.h(notification)).F(C0.g(notification)).h0(notification.number).B0(notification.tickerText).N(notification.contentIntent).U(notification.deleteIntent).Y(notification.fullScreenIntent, C0.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).T(notification.defaults).k0(notification.priority).J(C0.j(notification)).G0(C0.G(notification)).m0(C0.y(notification)).w0(C0.C(notification)).D0(C0.E(notification)).p0(C0.A(notification)).l0(bundle.getInt(C0.f11550M), bundle.getInt(C0.f11548L), bundle.getBoolean(C0.f11552N)).C(C0.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s4));
            this.f11719W = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r4 = C0.r(notification);
            if (!r4.isEmpty()) {
                Iterator<b> it = r4.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(C0.f11571Z);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(C0.f11573a0)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    f(t1.a(C0649r0.a(it2.next())));
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            if (bundle.containsKey(C0.f11556P)) {
                I(bundle.getBoolean(C0.f11556P));
            }
            if (i4 < 26 || !bundle.containsKey(C0.f11558Q)) {
                return;
            }
            K(bundle.getBoolean(C0.f11558Q));
        }

        @androidx.annotation.P
        protected static CharSequence A(@androidx.annotation.P CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > f11696Y) {
                return charSequence.subSequence(0, f11696Y);
            }
            return charSequence;
        }

        @androidx.annotation.P
        private Bitmap B(@androidx.annotation.P Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f11721a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C2356a.c.f54869g);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C2356a.c.f54868f);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private boolean I0() {
            q qVar = this.f11737q;
            if (qVar != null && qVar.r()) {
                return false;
            }
            return true;
        }

        private void W(int i4, boolean z3) {
            if (z3) {
                Notification notification = this.f11717U;
                notification.flags = i4 | notification.flags;
            } else {
                Notification notification2 = this.f11717U;
                notification2.flags = (~i4) & notification2.flags;
            }
        }

        @androidx.annotation.P
        @androidx.annotation.W(19)
        private static Bundle u(@androidx.annotation.N Notification notification, @androidx.annotation.P q qVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(C0.f11526A);
            bundle.remove(C0.f11530C);
            bundle.remove(C0.f11536F);
            bundle.remove(C0.f11532D);
            bundle.remove(C0.f11574b);
            bundle.remove(C0.f11576c);
            bundle.remove(C0.f11560R);
            bundle.remove(C0.f11548L);
            bundle.remove(C0.f11550M);
            bundle.remove(C0.f11552N);
            bundle.remove(C0.f11556P);
            bundle.remove(C0.f11558Q);
            bundle.remove(C0.f11573a0);
            bundle.remove(C0.f11571Z);
            bundle.remove(a1.f11871d);
            bundle.remove(a1.f11869b);
            bundle.remove(a1.f11870c);
            bundle.remove(a1.f11868a);
            bundle.remove(a1.f11872e);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (qVar != null) {
                qVar.g(bundle);
            }
            return bundle;
        }

        @androidx.annotation.N
        public g A0(@androidx.annotation.P CharSequence charSequence) {
            this.f11738r = A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public g B0(@androidx.annotation.P CharSequence charSequence) {
            this.f11717U.tickerText = A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public g C(boolean z3) {
            this.f11715S = z3;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public g C0(@androidx.annotation.P CharSequence charSequence, @androidx.annotation.P RemoteViews remoteViews) {
            this.f11717U.tickerText = A(charSequence);
            this.f11729i = remoteViews;
            return this;
        }

        @androidx.annotation.N
        public g D(boolean z3) {
            W(16, z3);
            return this;
        }

        @androidx.annotation.N
        public g D0(long j4) {
            this.f11712P = j4;
            return this;
        }

        @androidx.annotation.N
        public g E(int i4) {
            this.f11709M = i4;
            return this;
        }

        @androidx.annotation.N
        public g E0(boolean z3) {
            this.f11735o = z3;
            return this;
        }

        @androidx.annotation.N
        public g F(@androidx.annotation.P f fVar) {
            this.f11716T = fVar;
            return this;
        }

        @androidx.annotation.N
        public g F0(@androidx.annotation.P long[] jArr) {
            this.f11717U.vibrate = jArr;
            return this;
        }

        @androidx.annotation.N
        public g G(@androidx.annotation.P String str) {
            this.f11700D = str;
            return this;
        }

        @androidx.annotation.N
        public g G0(int i4) {
            this.f11703G = i4;
            return this;
        }

        @androidx.annotation.N
        public g H(@androidx.annotation.N String str) {
            this.f11708L = str;
            return this;
        }

        @androidx.annotation.N
        public g H0(long j4) {
            this.f11717U.when = j4;
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(24)
        public g I(boolean z3) {
            this.f11736p = z3;
            t().putBoolean(C0.f11556P, z3);
            return this;
        }

        @androidx.annotation.N
        public g J(@InterfaceC0569l int i4) {
            this.f11702F = i4;
            return this;
        }

        @androidx.annotation.N
        public g K(boolean z3) {
            this.f11698B = z3;
            this.f11699C = true;
            return this;
        }

        @androidx.annotation.N
        public g L(@androidx.annotation.P RemoteViews remoteViews) {
            this.f11717U.contentView = remoteViews;
            return this;
        }

        @androidx.annotation.N
        public g M(@androidx.annotation.P CharSequence charSequence) {
            this.f11731k = A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public g N(@androidx.annotation.P PendingIntent pendingIntent) {
            this.f11727g = pendingIntent;
            return this;
        }

        @androidx.annotation.N
        public g O(@androidx.annotation.P CharSequence charSequence) {
            this.f11726f = A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public g P(@androidx.annotation.P CharSequence charSequence) {
            this.f11725e = A(charSequence);
            return this;
        }

        @androidx.annotation.N
        public g Q(@androidx.annotation.P RemoteViews remoteViews) {
            this.f11706J = remoteViews;
            return this;
        }

        @androidx.annotation.N
        public g R(@androidx.annotation.P RemoteViews remoteViews) {
            this.f11705I = remoteViews;
            return this;
        }

        @androidx.annotation.N
        public g S(@androidx.annotation.P RemoteViews remoteViews) {
            this.f11707K = remoteViews;
            return this;
        }

        @androidx.annotation.N
        public g T(int i4) {
            Notification notification = this.f11717U;
            notification.defaults = i4;
            if ((i4 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @androidx.annotation.N
        public g U(@androidx.annotation.P PendingIntent pendingIntent) {
            this.f11717U.deleteIntent = pendingIntent;
            return this;
        }

        @androidx.annotation.N
        public g V(@androidx.annotation.P Bundle bundle) {
            this.f11701E = bundle;
            return this;
        }

        @androidx.annotation.N
        public g X(int i4) {
            this.f11714R = i4;
            return this;
        }

        @androidx.annotation.N
        public g Y(@androidx.annotation.P PendingIntent pendingIntent, boolean z3) {
            this.f11728h = pendingIntent;
            W(128, z3);
            return this;
        }

        @androidx.annotation.N
        public g Z(@androidx.annotation.P String str) {
            this.f11744x = str;
            return this;
        }

        @androidx.annotation.N
        public g a(int i4, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
            this.f11722b.add(new b(i4, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.N
        public g a0(int i4) {
            this.f11713Q = i4;
            return this;
        }

        @androidx.annotation.N
        public g b(@androidx.annotation.P b bVar) {
            if (bVar != null) {
                this.f11722b.add(bVar);
            }
            return this;
        }

        @androidx.annotation.N
        public g b0(boolean z3) {
            this.f11745y = z3;
            return this;
        }

        @androidx.annotation.N
        public g c(@androidx.annotation.P Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f11701E;
                if (bundle2 == null) {
                    this.f11701E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @androidx.annotation.N
        public g c0(@androidx.annotation.P Bitmap bitmap) {
            this.f11730j = B(bitmap);
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(21)
        public g d(int i4, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P PendingIntent pendingIntent) {
            this.f11724d.add(new b(i4, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.N
        public g d0(@InterfaceC0569l int i4, int i5, int i6) {
            int i7;
            Notification notification = this.f11717U;
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            if (i5 != 0 && i6 != 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            notification.flags = i7 | (notification.flags & (-2));
            return this;
        }

        @androidx.annotation.N
        @androidx.annotation.W(21)
        public g e(@androidx.annotation.P b bVar) {
            if (bVar != null) {
                this.f11724d.add(bVar);
            }
            return this;
        }

        @androidx.annotation.N
        public g e0(boolean z3) {
            this.f11697A = z3;
            return this;
        }

        @androidx.annotation.N
        public g f(@androidx.annotation.P t1 t1Var) {
            if (t1Var != null) {
                this.f11723c.add(t1Var);
            }
            return this;
        }

        @androidx.annotation.N
        public g f0(@androidx.annotation.P androidx.core.content.E e4) {
            this.f11711O = e4;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public g g(@androidx.annotation.P String str) {
            if (str != null && !str.isEmpty()) {
                this.f11720X.add(str);
            }
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public g g0() {
            this.f11718V = true;
            return this;
        }

        @androidx.annotation.N
        public Notification h() {
            return new Z0(this).c();
        }

        @androidx.annotation.N
        public g h0(int i4) {
            this.f11732l = i4;
            return this;
        }

        @androidx.annotation.N
        public g i() {
            this.f11722b.clear();
            return this;
        }

        @androidx.annotation.N
        public g i0(boolean z3) {
            W(2, z3);
            return this;
        }

        @androidx.annotation.N
        public g j() {
            this.f11724d.clear();
            Bundle bundle = this.f11701E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.f11701E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @androidx.annotation.N
        public g j0(boolean z3) {
            W(8, z3);
            return this;
        }

        @androidx.annotation.N
        public g k() {
            this.f11723c.clear();
            this.f11720X.clear();
            return this;
        }

        @androidx.annotation.N
        public g k0(int i4) {
            this.f11733m = i4;
            return this;
        }

        @androidx.annotation.P
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v3;
            if (this.f11706J != null && I0()) {
                return this.f11706J;
            }
            Z0 z02 = new Z0(this);
            q qVar = this.f11737q;
            if (qVar != null && (v3 = qVar.v(z02)) != null) {
                return v3;
            }
            return Notification.Builder.recoverBuilder(this.f11721a, z02.c()).createBigContentView();
        }

        @androidx.annotation.N
        public g l0(int i4, int i5, boolean z3) {
            this.f11741u = i4;
            this.f11742v = i5;
            this.f11743w = z3;
            return this;
        }

        @androidx.annotation.P
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w3;
            if (this.f11705I != null && I0()) {
                return this.f11705I;
            }
            Z0 z02 = new Z0(this);
            q qVar = this.f11737q;
            if (qVar != null && (w3 = qVar.w(z02)) != null) {
                return w3;
            }
            return Notification.Builder.recoverBuilder(this.f11721a, z02.c()).createContentView();
        }

        @androidx.annotation.N
        public g m0(@androidx.annotation.P Notification notification) {
            this.f11704H = notification;
            return this;
        }

        @androidx.annotation.P
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x3;
            if (this.f11707K != null && I0()) {
                return this.f11707K;
            }
            Z0 z02 = new Z0(this);
            q qVar = this.f11737q;
            if (qVar != null && (x3 = qVar.x(z02)) != null) {
                return x3;
            }
            return Notification.Builder.recoverBuilder(this.f11721a, z02.c()).createHeadsUpContentView();
        }

        @androidx.annotation.N
        public g n0(@androidx.annotation.P CharSequence[] charSequenceArr) {
            this.f11740t = charSequenceArr;
            return this;
        }

        @androidx.annotation.N
        public g o(@androidx.annotation.N j jVar) {
            jVar.a(this);
            return this;
        }

        @androidx.annotation.N
        public g o0(@androidx.annotation.P CharSequence charSequence) {
            this.f11739s = A(charSequence);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.f11706J;
        }

        @androidx.annotation.N
        public g p0(@androidx.annotation.P String str) {
            this.f11710N = str;
            return this;
        }

        @androidx.annotation.P
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public f q() {
            return this.f11716T;
        }

        @androidx.annotation.N
        public g q0(@androidx.annotation.P androidx.core.content.pm.Q q4) {
            if (q4 == null) {
                return this;
            }
            this.f11710N = q4.k();
            if (this.f11711O == null) {
                if (q4.o() != null) {
                    this.f11711O = q4.o();
                } else if (q4.k() != null) {
                    this.f11711O = new androidx.core.content.E(q4.k());
                }
            }
            if (this.f11725e == null) {
                P(q4.w());
            }
            return this;
        }

        @InterfaceC0569l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int r() {
            return this.f11702F;
        }

        @androidx.annotation.N
        public g r0(boolean z3) {
            this.f11734n = z3;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.f11705I;
        }

        @androidx.annotation.N
        public g s0(boolean z3) {
            this.f11718V = z3;
            return this;
        }

        @androidx.annotation.N
        public Bundle t() {
            if (this.f11701E == null) {
                this.f11701E = new Bundle();
            }
            return this.f11701E;
        }

        @androidx.annotation.N
        public g t0(int i4) {
            this.f11717U.icon = i4;
            return this;
        }

        @androidx.annotation.N
        public g u0(int i4, int i5) {
            Notification notification = this.f11717U;
            notification.icon = i4;
            notification.iconLevel = i5;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.f11714R;
        }

        @androidx.annotation.N
        @androidx.annotation.W(23)
        public g v0(@androidx.annotation.N IconCompat iconCompat) {
            this.f11719W = iconCompat.M(this.f11721a);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.f11707K;
        }

        @androidx.annotation.N
        public g w0(@androidx.annotation.P String str) {
            this.f11746z = str;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public Notification x() {
            return h();
        }

        @androidx.annotation.N
        public g x0(@androidx.annotation.P Uri uri) {
            Notification notification = this.f11717U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f11733m;
        }

        @androidx.annotation.N
        public g y0(@androidx.annotation.P Uri uri, int i4) {
            Notification notification = this.f11717U;
            notification.sound = uri;
            notification.audioStreamType = i4;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i4).build();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f11734n) {
                return this.f11717U.when;
            }
            return 0L;
        }

        @androidx.annotation.N
        public g z0(@androidx.annotation.P q qVar) {
            if (this.f11737q != qVar) {
                this.f11737q = qVar;
                if (qVar != null) {
                    qVar.z(this);
                }
            }
            return this;
        }

        public g(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
            this.f11722b = new ArrayList<>();
            this.f11723c = new ArrayList<>();
            this.f11724d = new ArrayList<>();
            this.f11734n = true;
            this.f11697A = false;
            this.f11702F = 0;
            this.f11703G = 0;
            this.f11709M = 0;
            this.f11713Q = 0;
            this.f11714R = 0;
            Notification notification = new Notification();
            this.f11717U = notification;
            this.f11721a = context;
            this.f11708L = str;
            notification.when = System.currentTimeMillis();
            this.f11717U.audioStreamType = -1;
            this.f11733m = 0;
            this.f11720X = new ArrayList<>();
            this.f11715S = true;
        }

        @Deprecated
        public g(@androidx.annotation.N Context context) {
            this(context, (String) null);
        }
    }
}
