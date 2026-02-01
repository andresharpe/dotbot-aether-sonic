package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.text.util.c;
import androidx.core.util.s;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f12942a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<b> f12943b = new Comparator() { // from class: androidx.core.text.util.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o4;
            o4 = c.o((c.b) obj, (c.b) obj2);
            return o4;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @InterfaceC0577u
        static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        URLSpan f12944a;

        /* renamed from: b, reason: collision with root package name */
        String f12945b;

        /* renamed from: c, reason: collision with root package name */
        int f12946c;

        /* renamed from: d, reason: collision with root package name */
        int f12947d;

        b() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.text.util.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0102c {
    }

    private c() {
    }

    private static void b(@N TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void c(@N TextView textView, @N Pattern pattern, @P String str) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            e(textView, pattern, str, null, null, null);
        }
    }

    public static void d(@N TextView textView, @N Pattern pattern, @P String str, @P Linkify.MatchFilter matchFilter, @P Linkify.TransformFilter transformFilter) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            e(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void e(@N TextView textView, @N Pattern pattern, @P String str, @P String[] strArr, @P Linkify.MatchFilter matchFilter, @P Linkify.TransformFilter transformFilter) {
        if (r()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            b(textView);
        }
    }

    public static boolean f(@N Spannable spannable, int i4) {
        if (r()) {
            return Linkify.addLinks(spannable, i4);
        }
        if (i4 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i4 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            m(arrayList, spannable, s.f13051w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i4 & 2) != 0) {
            m(arrayList, spannable, s.f13027A, new String[]{androidx.core.net.c.f12705b}, null, null);
        }
        if ((i4 & 8) != 0) {
            n(arrayList, spannable);
        }
        q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f12944a == null) {
                k(bVar.f12945b, bVar.f12946c, bVar.f12947d, spannable);
            }
        }
        return true;
    }

    public static boolean g(@N Spannable spannable, @N Pattern pattern, @P String str) {
        if (r()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return i(spannable, pattern, str, null, null, null);
    }

    public static boolean h(@N Spannable spannable, @N Pattern pattern, @P String str, @P Linkify.MatchFilter matchFilter, @P Linkify.TransformFilter transformFilter) {
        if (r()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return i(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean i(@N Spannable spannable, @N Pattern pattern, @P String str, @P String[] strArr, @P Linkify.MatchFilter matchFilter, @P Linkify.TransformFilter transformFilter) {
        String lowerCase;
        if (r()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f12942a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i4 = 0;
        while (i4 < strArr.length) {
            String str2 = strArr[i4];
            i4++;
            if (str2 == null) {
                lowerCase = "";
            } else {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            }
            strArr2[i4] = lowerCase;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z3 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    k(p(group, strArr2, matcher, transformFilter), start, end, spannable);
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public static boolean j(@N TextView textView, int i4) {
        if (r()) {
            return Linkify.addLinks(textView, i4);
        }
        if (i4 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (f((Spannable) text, i4)) {
                b(textView);
                return true;
            }
        } else {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (f(valueOf, i4)) {
                b(textView);
                textView.setText(valueOf);
                return true;
            }
        }
        return false;
    }

    private static void k(String str, int i4, int i5, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i4, i5, 33);
    }

    private static String l(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return androidx.core.text.util.a.c(str);
    }

    private static void m(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.f12945b = p(group, strArr, matcher, transformFilter);
                    bVar.f12946c = start;
                    bVar.f12947d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void n(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i4 = 0;
        while (true) {
            try {
                String l4 = l(obj);
                if (l4 != null && (indexOf = obj.indexOf(l4)) >= 0) {
                    b bVar = new b();
                    int length = l4.length() + indexOf;
                    bVar.f12946c = indexOf + i4;
                    i4 += length;
                    bVar.f12947d = i4;
                    obj = obj.substring(length);
                    try {
                        bVar.f12945b = "geo:0,0?q=" + URLEncoder.encode(l4, "UTF-8");
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(b bVar, b bVar2) {
        int i4 = bVar.f12946c;
        int i5 = bVar2.f12946c;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return Integer.compare(bVar2.f12947d, bVar.f12947d);
    }

    private static String p(@N String str, @N String[] strArr, Matcher matcher, @P Linkify.TransformFilter transformFilter) {
        boolean z3;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                String str2 = strArr[i4];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z3 = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        str = str2 + str.substring(str2.length());
                    }
                } else {
                    i4++;
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (!z3 && strArr.length > 0) {
            return strArr[0] + str;
        }
        return str;
    }

    private static void q(ArrayList<b> arrayList, Spannable spannable) {
        int i4;
        int i5;
        int i6 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f12944a = uRLSpan;
            bVar.f12946c = spannable.getSpanStart(uRLSpan);
            bVar.f12947d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f12943b);
        int size = arrayList.size();
        while (i6 < size - 1) {
            b bVar2 = arrayList.get(i6);
            int i7 = i6 + 1;
            b bVar3 = arrayList.get(i7);
            int i8 = bVar2.f12946c;
            int i9 = bVar3.f12946c;
            if (i8 <= i9 && (i4 = bVar2.f12947d) > i9) {
                int i10 = bVar3.f12947d;
                if (i10 <= i4 || i4 - i8 > i10 - i9) {
                    i5 = i7;
                } else if (i4 - i8 < i10 - i9) {
                    i5 = i6;
                } else {
                    i5 = -1;
                }
                if (i5 != -1) {
                    Object obj = arrayList.get(i5).f12944a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i5);
                    size--;
                }
            }
            i6 = i7;
        }
    }

    private static boolean r() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
