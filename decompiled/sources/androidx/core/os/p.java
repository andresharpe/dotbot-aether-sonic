package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.P;
import androidx.annotation.W;
import java.util.Locale;

@W(24)
/* loaded from: classes.dex */
final class p implements InterfaceC0752o {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f12752a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Object obj) {
        this.f12752a = (LocaleList) obj;
    }

    @Override // androidx.core.os.InterfaceC0752o
    public int a(Locale locale) {
        return this.f12752a.indexOf(locale);
    }

    @Override // androidx.core.os.InterfaceC0752o
    public String b() {
        return this.f12752a.toLanguageTags();
    }

    @Override // androidx.core.os.InterfaceC0752o
    public Object c() {
        return this.f12752a;
    }

    @Override // androidx.core.os.InterfaceC0752o
    @P
    public Locale d(@androidx.annotation.N String[] strArr) {
        return this.f12752a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f12752a.equals(((InterfaceC0752o) obj).c());
    }

    @Override // androidx.core.os.InterfaceC0752o
    public Locale get(int i4) {
        return this.f12752a.get(i4);
    }

    public int hashCode() {
        return this.f12752a.hashCode();
    }

    @Override // androidx.core.os.InterfaceC0752o
    public boolean isEmpty() {
        return this.f12752a.isEmpty();
    }

    @Override // androidx.core.os.InterfaceC0752o
    public int size() {
        return this.f12752a.size();
    }

    public String toString() {
        return this.f12752a.toString();
    }
}
