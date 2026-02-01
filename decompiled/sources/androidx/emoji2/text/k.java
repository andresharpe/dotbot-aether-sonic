package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.emoji2.text.g;
import androidx.emoji2.text.q;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC0561d
@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    private static final int f14498f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f14499g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f14500h = 3;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final g.l f14501a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final q f14502b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private g.e f14503c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14504d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final int[] f14505e;

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f14506a = -1;

        private a() {
        }

        static int a(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    i4--;
                    if (i4 < 0) {
                        if (z3) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z3) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z3 = true;
                    }
                }
                return i4;
            }
        }

        static int b(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    if (i4 >= length) {
                        if (z3) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z3) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                        i4++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                        i4++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i4++;
                        z3 = true;
                    }
                }
                return i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i, reason: collision with root package name */
        private static final int f14507i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f14508j = 2;

        /* renamed from: a, reason: collision with root package name */
        private int f14509a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final q.a f14510b;

        /* renamed from: c, reason: collision with root package name */
        private q.a f14511c;

        /* renamed from: d, reason: collision with root package name */
        private q.a f14512d;

        /* renamed from: e, reason: collision with root package name */
        private int f14513e;

        /* renamed from: f, reason: collision with root package name */
        private int f14514f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f14515g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f14516h;

        b(q.a aVar, boolean z3, int[] iArr) {
            this.f14510b = aVar;
            this.f14511c = aVar;
            this.f14515g = z3;
            this.f14516h = iArr;
        }

        private static boolean d(int i4) {
            return i4 == 65039;
        }

        private static boolean f(int i4) {
            return i4 == 65038;
        }

        private int g() {
            this.f14509a = 1;
            this.f14511c = this.f14510b;
            this.f14514f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f14511c.b().l() || d(this.f14513e)) {
                return true;
            }
            if (this.f14515g) {
                if (this.f14516h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f14516h, this.f14511c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i4) {
            q.a a4 = this.f14511c.a(i4);
            int i5 = 2;
            if (this.f14509a != 2) {
                if (a4 == null) {
                    i5 = g();
                } else {
                    this.f14509a = 2;
                    this.f14511c = a4;
                    this.f14514f = 1;
                }
            } else if (a4 != null) {
                this.f14511c = a4;
                this.f14514f++;
            } else if (f(i4)) {
                i5 = g();
            } else if (!d(i4)) {
                if (this.f14511c.b() != null) {
                    i5 = 3;
                    if (this.f14514f == 1) {
                        if (h()) {
                            this.f14512d = this.f14511c;
                            g();
                        } else {
                            i5 = g();
                        }
                    } else {
                        this.f14512d = this.f14511c;
                        g();
                    }
                } else {
                    i5 = g();
                }
            }
            this.f14513e = i4;
            return i5;
        }

        j b() {
            return this.f14511c.b();
        }

        j c() {
            return this.f14512d.b();
        }

        boolean e() {
            if (this.f14509a == 2 && this.f14511c.b() != null && (this.f14514f > 1 || h())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(@N q qVar, @N g.l lVar, @N g.e eVar, boolean z3, @P int[] iArr) {
        this.f14501a = lVar;
        this.f14502b = qVar;
        this.f14503c = eVar;
        this.f14504d = z3;
        this.f14505e = iArr;
    }

    private void a(@N Spannable spannable, j jVar, int i4, int i5) {
        spannable.setSpan(this.f14501a.a(jVar), i4, i5, 33);
    }

    private static boolean b(@N Editable editable, @N KeyEvent keyEvent, boolean z3) {
        l[] lVarArr;
        if (i(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!h(selectionStart, selectionEnd) && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(@N InputConnection inputConnection, @N Editable editable, @F(from = 0) int i4, @F(from = 0) int i5, boolean z3) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (h(selectionStart, selectionEnd)) {
                return false;
            }
            if (z3) {
                max = a.a(editable, selectionStart, Math.max(i4, 0));
                min = a.b(editable, selectionEnd, Math.max(i5, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i4, 0);
                min = Math.min(selectionEnd + i5, editable.length());
            }
            l[] lVarArr = (l[]) editable.getSpans(max, min, l.class);
            if (lVarArr != null && lVarArr.length > 0) {
                for (l lVar : lVarArr) {
                    int spanStart = editable.getSpanStart(lVar);
                    int spanEnd = editable.getSpanEnd(lVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(@N Editable editable, int i4, @N KeyEvent keyEvent) {
        boolean b4;
        if (i4 != 67) {
            if (i4 == 112) {
                b4 = b(editable, keyEvent, true);
            }
            return false;
        }
        b4 = b(editable, keyEvent, false);
        if (b4) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean g(CharSequence charSequence, int i4, int i5, j jVar) {
        if (jVar.e() == 0) {
            jVar.n(this.f14503c.a(charSequence, i4, i5, jVar.i()));
        }
        if (jVar.e() == 2) {
            return true;
        }
        return false;
    }

    private static boolean h(int i4, int i5) {
        return i4 == -1 || i5 == -1 || i4 != i5;
    }

    private static boolean i(@N KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(@N CharSequence charSequence) {
        return d(charSequence, this.f14502b.h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(@N CharSequence charSequence, int i4) {
        b bVar = new b(this.f14502b.i(), this.f14504d, this.f14505e);
        int length = charSequence.length();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int codePointAt = Character.codePointAt(charSequence, i5);
            int a4 = bVar.a(codePointAt);
            j b4 = bVar.b();
            if (a4 != 1) {
                if (a4 != 2) {
                    if (a4 == 3) {
                        b4 = bVar.c();
                        if (b4.d() <= i4) {
                            i6++;
                        }
                    }
                } else {
                    i5 += Character.charCount(codePointAt);
                }
            } else {
                i5 += Character.charCount(codePointAt);
                i7 = 0;
            }
            if (b4 != null && b4.d() <= i4) {
                i7++;
            }
        }
        if (i6 != 0) {
            return 2;
        }
        if (bVar.e() && bVar.b().d() <= i4) {
            return 1;
        }
        if (i7 == 0) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:100:0x000e, B:103:0x0013, B:105:0x0017, B:107:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:99:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:100:0x000e, B:103:0x0013, B:105:0x0017, B:107:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:99:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:100:0x000e, B:103:0x0013, B:105:0x0017, B:107:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:99:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence j(@androidx.annotation.N java.lang.CharSequence r11, @androidx.annotation.F(from = 0) int r12, @androidx.annotation.F(from = 0) int r13, @androidx.annotation.F(from = 0) int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.k.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
