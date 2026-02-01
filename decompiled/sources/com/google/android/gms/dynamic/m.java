package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
final class m implements View.OnClickListener {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Context f29060E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Intent f29061F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, Intent intent) {
        this.f29060E = context;
        this.f29061F = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f29060E.startActivity(this.f29061F);
        } catch (ActivityNotFoundException e4) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e4);
        }
    }
}
