package com.harman.jbl.partybox.ui.freestyle;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0669d;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partybox.h;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.SoloPattern;
import com.harman.sdk.utils.SoloPatternMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.F;
import z2.i;

/* loaded from: classes2.dex */
public final class f extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<List<Drawable>> f43723H = new P<>();

    public final void u(@l3.e HmDevice hmDevice, @l3.d SoloPattern pattern, int i4) {
        F.p(pattern, "pattern");
        SoloPatternMode soloPatternMode = SoloPatternMode.OFF;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    soloPatternMode = SoloPatternMode.TAP_AND_HOLD;
                }
            } else {
                soloPatternMode = SoloPatternMode.TAP;
            }
        }
        if (hmDevice != null) {
            T1.a.a("BLE_LOG FreeStyleView, Connected Device = " + hmDevice + " pattern = " + pattern + " operation = " + i4);
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.W(hmDevice, pattern, soloPatternMode, null);
            }
        }
    }

    @l3.d
    public final P<List<Drawable>> v() {
        return this.f43723H;
    }

    public final void w(@l3.e Integer num) {
        ArrayList arrayList = new ArrayList();
        Application a4 = E0.a();
        if ((num == null || num.intValue() != 8029) && ((num == null || num.intValue() != 8290) && (num == null || num.intValue() != 8291))) {
            if (num != null && num.intValue() == 8031) {
                arrayList.add(0, C0669d.i(a4, j.f.k8));
                arrayList.add(1, C0669d.i(a4, j.f.v8));
                arrayList.add(2, C0669d.i(a4, j.f.l8));
                arrayList.add(3, C0669d.i(a4, j.f.x8));
                arrayList.add(4, C0669d.i(a4, j.f.y8));
                arrayList.add(5, C0669d.i(a4, j.f.z8));
                arrayList.add(6, C0669d.i(a4, j.f.A8));
                arrayList.add(7, C0669d.i(a4, j.f.B8));
                arrayList.add(8, C0669d.i(a4, j.f.m8));
            } else if (num != null && num.intValue() == 8033) {
                arrayList.add(0, C0669d.i(a4, j.f.k8));
                arrayList.add(1, C0669d.i(a4, j.f.v8));
                arrayList.add(2, C0669d.i(a4, j.f.N8));
                arrayList.add(3, C0669d.i(a4, j.f.O8));
                arrayList.add(4, C0669d.i(a4, j.f.y8));
                arrayList.add(5, C0669d.i(a4, j.f.z8));
                arrayList.add(6, C0669d.i(a4, j.f.P8));
                arrayList.add(7, C0669d.i(a4, j.f.Q8));
                arrayList.add(8, C0669d.i(a4, j.f.R8));
            }
        } else {
            arrayList.add(0, C0669d.i(a4, j.f.u8));
            arrayList.add(1, C0669d.i(a4, j.f.v8));
            arrayList.add(2, C0669d.i(a4, j.f.w8));
            arrayList.add(3, C0669d.i(a4, j.f.x8));
            arrayList.add(4, C0669d.i(a4, j.f.y8));
            arrayList.add(5, C0669d.i(a4, j.f.z8));
            arrayList.add(6, C0669d.i(a4, j.f.A8));
            arrayList.add(7, C0669d.i(a4, j.f.B8));
            arrayList.add(8, C0669d.i(a4, j.f.C8));
        }
        h.f40556a.b(this.f43723H, arrayList);
    }
}
