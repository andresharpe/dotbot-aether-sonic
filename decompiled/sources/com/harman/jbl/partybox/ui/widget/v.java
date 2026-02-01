package com.harman.jbl.partybox.ui.widget;

import android.content.res.TypedArray;
import android.util.TypedValue;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class v {
    @l3.e
    public static final TypedValue a(@l3.d TypedArray typedArray, @l3.d TypedValue typedValue, int i4) {
        F.p(typedArray, "<this>");
        F.p(typedValue, "typedValue");
        if (!typedArray.getValue(i4, typedValue)) {
            return null;
        }
        return typedValue;
    }
}
