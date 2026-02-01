package com.harman.sdk.device;

import com.harman.jbl.partylight.lib.core.PLGroup;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/harman/sdk/device/PartyLightDevice;", "Lcom/harman/sdk/device/HmDevice;", "Lcom/harman/jbl/partylight/lib/core/PLGroup;", "R0", "Lcom/harman/jbl/partylight/lib/core/PLGroup;", "N0", "()Lcom/harman/jbl/partylight/lib/core/PLGroup;", "O0", "(Lcom/harman/jbl/partylight/lib/core/PLGroup;)V", "plGroup", "<init>", "()V", "2_utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyLightDevice extends HmDevice {

    /* renamed from: R0, reason: collision with root package name */
    public PLGroup f47866R0;

    @d
    public final PLGroup N0() {
        PLGroup pLGroup = this.f47866R0;
        if (pLGroup != null) {
            return pLGroup;
        }
        F.S("plGroup");
        return null;
    }

    public final void O0(@d PLGroup pLGroup) {
        F.p(pLGroup, "<set-?>");
        this.f47866R0 = pLGroup;
    }
}
