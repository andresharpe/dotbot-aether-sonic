package androidx.fragment.app.strictmode;

import androidx.exifinterface.media.a;
import androidx.fragment.app.Fragment;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/Fragment;", a.U4, "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "fragment", "", "violationMessage", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: E, reason: collision with root package name */
    @d
    private final Fragment f15348E;

    public /* synthetic */ Violation(Fragment fragment, String str, int i4, C2197u c2197u) {
        this(fragment, (i4 & 2) != 0 ? null : str);
    }

    @d
    public final Fragment a() {
        return this.f15348E;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(@d Fragment fragment, @e String str) {
        super(str);
        F.p(fragment, "fragment");
        this.f15348E = fragment;
    }
}
