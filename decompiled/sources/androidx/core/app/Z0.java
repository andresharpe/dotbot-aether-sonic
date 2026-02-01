package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Z0 implements InterfaceC0662y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11858a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f11859b;

    /* renamed from: c, reason: collision with root package name */
    private final C0.g f11860c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f11861d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f11862e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f11863f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f11864g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f11865h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f11866i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z0(C0.g gVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        List list;
        int i4;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        this.f11860c = gVar;
        this.f11858a = gVar.f11721a;
        if (Build.VERSION.SDK_INT >= 26) {
            P0.a();
            this.f11859b = O0.a(gVar.f11721a, gVar.f11708L);
        } else {
            this.f11859b = new Notification.Builder(gVar.f11721a);
        }
        Notification notification = gVar.f11717U;
        Notification.Builder lights = this.f11859b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.f11729i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z3);
        if ((notification.flags & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z4);
        if ((notification.flags & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z5).setDefaults(notification.defaults).setContentTitle(gVar.f11725e).setContentText(gVar.f11726f).setContentInfo(gVar.f11731k).setContentIntent(gVar.f11727g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = gVar.f11728h;
        if ((notification.flags & 128) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z6).setLargeIcon(gVar.f11730j).setNumber(gVar.f11732l).setProgress(gVar.f11741u, gVar.f11742v, gVar.f11743w);
        this.f11859b.setSubText(gVar.f11738r).setUsesChronometer(gVar.f11735o).setPriority(gVar.f11733m);
        Iterator<C0.b> it = gVar.f11722b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = gVar.f11701E;
        if (bundle != null) {
            this.f11864g.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f11861d = gVar.f11705I;
        this.f11862e = gVar.f11706J;
        this.f11859b.setShowWhen(gVar.f11734n);
        this.f11859b.setLocalOnly(gVar.f11697A).setGroup(gVar.f11744x).setGroupSummary(gVar.f11745y).setSortKey(gVar.f11746z);
        this.f11865h = gVar.f11713Q;
        this.f11859b.setCategory(gVar.f11700D).setColor(gVar.f11702F).setVisibility(gVar.f11703G).setPublicVersion(gVar.f11704H).setSound(notification.sound, notification.audioAttributes);
        if (i5 < 28) {
            list = e(g(gVar.f11723c), gVar.f11720X);
        } else {
            list = gVar.f11720X;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.f11859b.addPerson((String) it2.next());
            }
        }
        this.f11866i = gVar.f11707K;
        if (gVar.f11724d.size() > 0) {
            Bundle bundle2 = gVar.t().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i6 = 0; i6 < gVar.f11724d.size(); i6++) {
                bundle4.putBundle(Integer.toString(i6), b1.j(gVar.f11724d.get(i6)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            gVar.t().putBundle("android.car.EXTENSIONS", bundle2);
            this.f11864g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Icon icon = gVar.f11719W;
        if (icon != null) {
            this.f11859b.setSmallIcon(icon);
        }
        this.f11859b.setExtras(gVar.f11701E).setRemoteInputHistory(gVar.f11740t);
        RemoteViews remoteViews = gVar.f11705I;
        if (remoteViews != null) {
            this.f11859b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = gVar.f11706J;
        if (remoteViews2 != null) {
            this.f11859b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = gVar.f11707K;
        if (remoteViews3 != null) {
            this.f11859b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i7 >= 26) {
            badgeIconType = this.f11859b.setBadgeIconType(gVar.f11709M);
            settingsText = badgeIconType.setSettingsText(gVar.f11739s);
            shortcutId = settingsText.setShortcutId(gVar.f11710N);
            timeoutAfter = shortcutId.setTimeoutAfter(gVar.f11712P);
            timeoutAfter.setGroupAlertBehavior(gVar.f11713Q);
            if (gVar.f11699C) {
                this.f11859b.setColorized(gVar.f11698B);
            }
            if (!TextUtils.isEmpty(gVar.f11708L)) {
                this.f11859b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator<t1> it3 = gVar.f11723c.iterator();
            while (it3.hasNext()) {
                this.f11859b.addPerson(it3.next().k());
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            this.f11859b.setAllowSystemGeneratedContextualActions(gVar.f11715S);
            this.f11859b.setBubbleMetadata(C0.f.k(gVar.f11716T));
            androidx.core.content.E e4 = gVar.f11711O;
            if (e4 != null) {
                this.f11859b.setLocusId(e4.c());
            }
        }
        if (i8 >= 31 && (i4 = gVar.f11714R) != 0) {
            this.f11859b.setForegroundServiceBehavior(i4);
        }
        if (gVar.f11718V) {
            if (this.f11860c.f11745y) {
                this.f11865h = 2;
            } else {
                this.f11865h = 1;
            }
            this.f11859b.setVibrate(null);
            this.f11859b.setSound(null);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            this.f11859b.setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(this.f11860c.f11744x)) {
                    this.f11859b.setGroup(C0.f11559Q0);
                }
                this.f11859b.setGroupAlertBehavior(this.f11865h);
            }
        }
    }

    private void b(C0.b bVar) {
        Icon icon;
        Bundle bundle;
        IconCompat f4 = bVar.f();
        if (f4 != null) {
            icon = f4.L();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : v1.d(bVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i4 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        if (i4 >= 28) {
            builder.setSemanticAction(bVar.h());
        }
        if (i4 >= 29) {
            builder.setContextual(bVar.l());
        }
        if (i4 >= 31) {
            builder.setAuthenticationRequired(bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        builder.addExtras(bundle);
        this.f11859b.addAction(builder.build());
    }

    @androidx.annotation.P
    private static List<String> e(@androidx.annotation.P List<String> list, @androidx.annotation.P List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.c cVar = new androidx.collection.c(list.size() + list2.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    @androidx.annotation.P
    private static List<String> g(@androidx.annotation.P List<t1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<t1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.InterfaceC0662y
    public Notification.Builder a() {
        return this.f11859b;
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle n4;
        RemoteViews x3;
        RemoteViews v3;
        C0.q qVar = this.f11860c.f11737q;
        if (qVar != null) {
            qVar.b(this);
        }
        if (qVar != null) {
            remoteViews = qVar.w(this);
        } else {
            remoteViews = null;
        }
        Notification d4 = d();
        if (remoteViews != null) {
            d4.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f11860c.f11705I;
            if (remoteViews2 != null) {
                d4.contentView = remoteViews2;
            }
        }
        if (qVar != null && (v3 = qVar.v(this)) != null) {
            d4.bigContentView = v3;
        }
        if (qVar != null && (x3 = this.f11860c.f11737q.x(this)) != null) {
            d4.headsUpContentView = x3;
        }
        if (qVar != null && (n4 = C0.n(d4)) != null) {
            qVar.a(n4);
        }
        return d4;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f11859b.build();
        }
        Notification build = this.f11859b.build();
        if (this.f11865h != 0) {
            if (build.getGroup() != null && (build.flags & 512) != 0 && this.f11865h == 2) {
                h(build);
            }
            if (build.getGroup() != null && (build.flags & 512) == 0 && this.f11865h == 1) {
                h(build);
            }
        }
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f11858a;
    }
}
