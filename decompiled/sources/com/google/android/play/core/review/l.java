package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.play.core.review.internal.t;
import com.google.android.play.core.review.internal.v;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.play.core.review.internal.i f34459c = new com.google.android.play.core.review.internal.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    @P
    @i0
    t f34460a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34461b;

    public l(Context context) {
        this.f34461b = context.getPackageName();
        if (v.a(context)) {
            this.f34460a = new t(context, f34459c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), h.f34421a, null, null);
        }
    }

    public final AbstractC1770k a() {
        com.google.android.play.core.review.internal.i iVar = f34459c;
        iVar.d("requestInAppReview (%s)", this.f34461b);
        if (this.f34460a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return C1773n.f(new ReviewException(-1));
        }
        C1771l c1771l = new C1771l();
        this.f34460a.p(new i(this, c1771l, c1771l), c1771l);
        return c1771l.a();
    }
}
