package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;

/* renamed from: com.blankj.utilcode.util.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110u {
    private C1110u() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((ClipboardManager) E0.a().getSystemService("clipboard")).addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    public static void b() {
        ((ClipboardManager) E0.a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, ""));
    }

    public static void c(CharSequence charSequence) {
        ((ClipboardManager) E0.a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(E0.a().getPackageName(), charSequence));
    }

    public static void d(CharSequence charSequence, CharSequence charSequence2) {
        ((ClipboardManager) E0.a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }

    public static CharSequence e() {
        CharSequence label;
        ClipDescription primaryClipDescription = ((ClipboardManager) E0.a().getSystemService("clipboard")).getPrimaryClipDescription();
        if (primaryClipDescription == null || (label = primaryClipDescription.getLabel()) == null) {
            return "";
        }
        return label;
    }

    public static CharSequence f() {
        CharSequence coerceToText;
        ClipData primaryClip = ((ClipboardManager) E0.a().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && (coerceToText = primaryClip.getItemAt(0).coerceToText(E0.a())) != null) {
            return coerceToText;
        }
        return "";
    }

    public static void g(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        ((ClipboardManager) E0.a().getSystemService("clipboard")).removePrimaryClipChangedListener(onPrimaryClipChangedListener);
    }
}
