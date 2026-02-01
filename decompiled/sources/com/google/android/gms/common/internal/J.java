package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

@I0.a
/* loaded from: classes.dex */
public class J {
    private J() {
    }

    @androidx.annotation.P
    @I0.a
    public static String a(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet, boolean z3, boolean z4, @androidx.annotation.N String str3) {
        String attributeValue;
        if (attributeSet == null) {
            attributeValue = null;
        } else {
            attributeValue = attributeSet.getAttributeValue(str, str2);
        }
        if (attributeValue != null && attributeValue.startsWith("@string/") && z3) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                context.getResources().getValue(packageName + ":string/" + substring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
                Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                Log.w(str3, "Resource " + str2 + " was not a string: " + typedValue.toString());
            }
        }
        if (z4 && attributeValue == null) {
            Log.w(str3, "Required XML attribute \"" + str2 + "\" missing");
        }
        return attributeValue;
    }
}
