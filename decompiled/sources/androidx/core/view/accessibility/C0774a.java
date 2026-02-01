package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.accessibility.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774a extends ClickableSpan {

    /* renamed from: H, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String f13418H = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: E, reason: collision with root package name */
    private final int f13419E;

    /* renamed from: F, reason: collision with root package name */
    private final M f13420F;

    /* renamed from: G, reason: collision with root package name */
    private final int f13421G;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0774a(int i4, @androidx.annotation.N M m4, int i5) {
        this.f13419E = i4;
        this.f13420F = m4;
        this.f13421G = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@androidx.annotation.N View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f13418H, this.f13419E);
        this.f13420F.K0(this.f13421G, bundle);
    }
}
