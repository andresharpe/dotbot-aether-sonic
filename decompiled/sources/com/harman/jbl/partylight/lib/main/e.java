package com.harman.jbl.partylight.lib.main;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import com.blankj.utilcode.util.C1078a;
import java.util.List;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nPartyLightViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyLightViewModel.kt\ncom/harman/jbl/partylight/lib/main/PartyLightViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1855#2,2:40\n*S KotlinDebug\n*F\n+ 1 PartyLightViewModel.kt\ncom/harman/jbl/partylight/lib/main/PartyLightViewModelKt\n*L\n26#1:40,2\n*E\n"})
/* loaded from: classes2.dex */
public final class e {
    @l3.e
    public static final d a(@l3.d Fragment fragment) {
        PartyLightActivity partyLightActivity;
        F.p(fragment, "<this>");
        ActivityC0889g requireActivity = fragment.requireActivity();
        if (requireActivity instanceof PartyLightActivity) {
            partyLightActivity = (PartyLightActivity) requireActivity;
        } else {
            partyLightActivity = null;
        }
        if (partyLightActivity == null) {
            return null;
        }
        return (d) new m0(partyLightActivity).a(d.class);
    }

    @l3.e
    public static final d b(@l3.d j0 j0Var) {
        F.p(j0Var, "<this>");
        List<Activity> D3 = C1078a.D();
        F.o(D3, "getActivityList(...)");
        for (ComponentCallbacks2 componentCallbacks2 : D3) {
            if (componentCallbacks2 instanceof PartyLightActivity) {
                return (d) new m0((q0) componentCallbacks2).a(d.class);
            }
        }
        return null;
    }
}
