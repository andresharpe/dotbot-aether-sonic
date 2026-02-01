package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.util.u;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13511a = 16777216;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13512b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f13513c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    private static final String f13514d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e, reason: collision with root package name */
    private static final String f13515e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f, reason: collision with root package name */
    private static final String f13516f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g, reason: collision with root package name */
    private static final String f13517g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h, reason: collision with root package name */
    private static final String f13518h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* renamed from: i, reason: collision with root package name */
    @i0
    static final int f13519i = 2048;

    /* renamed from: j, reason: collision with root package name */
    @i0
    static final int f13520j = 1024;

    /* JADX INFO: Access modifiers changed from: private */
    @W(30)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        static CharSequence a(@N EditorInfo editorInfo, int i4) {
            return editorInfo.getInitialSelectedText(i4);
        }

        static CharSequence b(@N EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextAfterCursor(i4, i5);
        }

        static CharSequence c(@N EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextBeforeCursor(i4, i5);
        }

        static void d(@N EditorInfo editorInfo, CharSequence charSequence, int i4) {
            editorInfo.setInitialSurroundingSubText(charSequence, i4);
        }
    }

    @Deprecated
    public c() {
    }

    @N
    public static String[] a(@N EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                return f13513c;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f13513c;
        }
        String[] stringArray = bundle.getStringArray(f13514d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f13515e);
        }
        if (stringArray == null) {
            return f13513c;
        }
        return stringArray;
    }

    @P
    public static CharSequence b(@N EditorInfo editorInfo, int i4) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i4);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i5 = editorInfo.extras.getInt(f13517g);
        int i6 = editorInfo.extras.getInt(f13518h);
        int i7 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i6 - i5 != i7 || (charSequence = editorInfo.extras.getCharSequence(f13516f)) == null) {
            return null;
        }
        if ((i4 & 1) != 0) {
            return charSequence.subSequence(i5, i6);
        }
        return TextUtils.substring(charSequence, i5, i6);
    }

    @P
    public static CharSequence c(@N EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f13516f)) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt(f13518h);
        int min = Math.min(i4, charSequence.length() - i6);
        if ((i5 & 1) != 0) {
            return charSequence.subSequence(i6, min + i6);
        }
        return TextUtils.substring(charSequence, i6, min + i6);
    }

    @P
    public static CharSequence d(@N EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f13516f)) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt(f13517g);
        int min = Math.min(i4, i6);
        if ((i5 & 1) != 0) {
            return charSequence.subSequence(i6 - min, i6);
        }
        return TextUtils.substring(charSequence, i6 - min, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(f13514d);
        boolean containsKey2 = editorInfo.extras.containsKey(f13515e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (!containsKey2) {
            return 0;
        }
        return 2;
    }

    private static boolean f(CharSequence charSequence, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i4));
        }
        return Character.isLowSurrogate(charSequence.charAt(i4));
    }

    private static boolean g(int i4) {
        int i5 = i4 & 4095;
        return i5 == 129 || i5 == 225 || i5 == 18;
    }

    public static void h(@N EditorInfo editorInfo, @P String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f13514d, strArr);
        editorInfo.extras.putStringArray(f13515e, strArr);
    }

    public static void i(@N EditorInfo editorInfo, @N CharSequence charSequence, int i4) {
        int i5;
        int i6;
        u.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i4);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        if (i7 > i8) {
            i5 = i8 - i4;
        } else {
            i5 = i7 - i4;
        }
        if (i7 > i8) {
            i6 = i7 - i4;
        } else {
            i6 = i8 - i4;
        }
        int length = charSequence.length();
        if (i4 >= 0 && i5 >= 0 && i6 <= length) {
            if (g(editorInfo.inputType)) {
                k(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                k(editorInfo, charSequence, i5, i6);
                return;
            } else {
                l(editorInfo, charSequence, i5, i6);
                return;
            }
        }
        k(editorInfo, null, 0, 0);
    }

    public static void j(@N EditorInfo editorInfo, @N CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    private static void k(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence(f13516f, spannableStringBuilder);
        editorInfo.extras.putInt(f13517g, i4);
        editorInfo.extras.putInt(f13518h, i5);
    }

    private static void l(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        int i6;
        CharSequence subSequence;
        int i7 = i5 - i4;
        if (i7 > 1024) {
            i6 = 0;
        } else {
            i6 = i7;
        }
        int i8 = 2048 - i6;
        int min = Math.min(charSequence.length() - i5, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (f(charSequence, i9, 0)) {
            i9++;
            min2--;
        }
        if (f(charSequence, (i5 + min) - 1, 1)) {
            min--;
        }
        int i10 = min2 + i6 + min;
        if (i6 != i7) {
            subSequence = TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i5, min + i5));
        } else {
            subSequence = charSequence.subSequence(i9, i10 + i9);
        }
        k(editorInfo, subSequence, min2, i6 + min2);
    }
}
