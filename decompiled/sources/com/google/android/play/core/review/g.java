package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private final l f34419a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34420b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l lVar) {
        this.f34419a = lVar;
    }

    @Override // com.google.android.play.core.review.b
    @N
    public final AbstractC1770k<Void> a(@N Activity activity, @N a aVar) {
        if (aVar.b()) {
            return C1773n.g(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C1771l c1771l = new C1771l();
        intent.putExtra("result_receiver", new f(this, this.f34420b, c1771l));
        activity.startActivity(intent);
        return c1771l.a();
    }

    @Override // com.google.android.play.core.review.b
    @N
    public final AbstractC1770k<a> b() {
        return this.f34419a.a();
    }
}
