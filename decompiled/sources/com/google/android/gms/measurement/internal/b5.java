package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.C1821f;

/* loaded from: classes2.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    private final C1638f2 f30554a;

    public b5(C1638f2 c1638f2) {
        this.f30554a = c1638f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void a(String str, Bundle bundle) {
        String uri;
        this.f30554a.a().f();
        if (!this.f30554a.m()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = kotlinx.coroutines.W.f52989c;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f30554a.D().f30267u.b(uri);
                this.f30554a.D().f30268v.b(this.f30554a.zzav().a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void b() {
        String str;
        this.f30554a.a().f();
        if (!d()) {
            return;
        }
        if (e()) {
            this.f30554a.D().f30267u.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f30554a.G().s(kotlinx.coroutines.W.f52989c, "_cmpx", bundle);
        } else {
            String a4 = this.f30554a.D().f30267u.a();
            if (TextUtils.isEmpty(a4)) {
                this.f30554a.b().r().a("Cache still valid but referrer not found");
            } else {
                long a5 = ((this.f30554a.D().f30268v.a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(a4);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", a5);
                Object obj = pair.first;
                if (obj == null) {
                    str = com.spotify.android.appremote.internal.l.f48821i;
                } else {
                    str = (String) obj;
                }
                this.f30554a.G().s(str, C1821f.C0339f.f36999l, (Bundle) pair.second);
            }
            this.f30554a.D().f30267u.b(null);
        }
        this.f30554a.D().f30268v.b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f30554a.D().f30267u.b(null);
        }
    }

    final boolean d() {
        if (this.f30554a.D().f30268v.a() > 0) {
            return true;
        }
        return false;
    }

    final boolean e() {
        if (!d() || this.f30554a.zzav().a() - this.f30554a.D().f30268v.a() <= this.f30554a.x().p(null, C1643g1.f30690S)) {
            return false;
        }
        return true;
    }
}
