package com.harman.jbl.partybox;

import android.content.Context;
import androidx.appcompat.app.ActivityC0587e;
import androidx.lifecycle.p0;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/lifecycle/p0;", "c", "()Landroidx/lifecycle/p0;"}, k = 3, mv = {1, 9, 0})
@U({"SMAP\nApplicationViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt$applicationViewModels$1\n*L\n1#1,83:1\n*E\n"})
/* loaded from: classes2.dex */
public final class ApplicationViewModelLazyKt$applicationViewModels$1 extends Lambda implements X2.a<p0> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ActivityC0587e f38229F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationViewModelLazyKt$applicationViewModels$1(ActivityC0587e activityC0587e) {
        super(0);
        this.f38229F = activityC0587e;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p0 n() {
        Context applicationContext = this.f38229F.getApplicationContext();
        F.n(applicationContext, "null cannot be cast to non-null type com.harman.jbl.partybox.BaseViewModelApplication");
        return ((d) applicationContext).getViewModelStore();
    }
}
