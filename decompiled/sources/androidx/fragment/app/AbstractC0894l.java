package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0617b;
import androidx.core.content.C0669d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0894l<E> extends AbstractC0891i {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    private final Activity f15317E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    private final Context f15318F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    private final Handler f15319G;

    /* renamed from: H, reason: collision with root package name */
    private final int f15320H;

    /* renamed from: I, reason: collision with root package name */
    final FragmentManager f15321I;

    public AbstractC0894l(@androidx.annotation.N Context context, @androidx.annotation.N Handler handler, int i4) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i4);
    }

    @Override // androidx.fragment.app.AbstractC0891i
    @androidx.annotation.P
    public View c(int i4) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0891i
    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Activity f() {
        return this.f15317E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public Context g() {
        return this.f15318F;
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Handler h() {
        return this.f15319G;
    }

    public void i(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
    }

    @androidx.annotation.P
    public abstract E j();

    @androidx.annotation.N
    public LayoutInflater k() {
        return LayoutInflater.from(this.f15318F);
    }

    public int l() {
        return this.f15320H;
    }

    public boolean m() {
        return true;
    }

    @Deprecated
    public void n(@androidx.annotation.N Fragment fragment, @androidx.annotation.N String[] strArr, int i4) {
    }

    public boolean p(@androidx.annotation.N Fragment fragment) {
        return true;
    }

    public boolean q(@androidx.annotation.N String str) {
        return false;
    }

    public void r(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        s(fragment, intent, i4, null);
    }

    public void s(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        if (i4 == -1) {
            C0669d.w(this.f15318F, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void t(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.P Intent intent, int i5, int i6, int i7, @androidx.annotation.P Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            C0617b.R(this.f15317E, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0894l(@androidx.annotation.N ActivityC0889g activityC0889g) {
        this(activityC0889g, activityC0889g, new Handler(), 0);
    }

    AbstractC0894l(@androidx.annotation.P Activity activity, @androidx.annotation.N Context context, @androidx.annotation.N Handler handler, int i4) {
        this.f15321I = new r();
        this.f15317E = activity;
        this.f15318F = (Context) androidx.core.util.u.m(context, "context == null");
        this.f15319G = (Handler) androidx.core.util.u.m(handler, "handler == null");
        this.f15320H = i4;
    }
}
